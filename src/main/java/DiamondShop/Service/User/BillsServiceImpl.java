package DiamondShop.Service.User;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DiamondShop.Dao.BillsDao;
import DiamondShop.Dto.CartDto;
import DiamondShop.Entity.BillDetails;
import DiamondShop.Entity.Bills;

@Service
public class BillsServiceImpl implements IBillsService {
	@Autowired
	private BillsDao billsDao;

	@Override
	public int AddBills(Bills bills) {
		// TODO Auto-generated method stub
		return billsDao.AddBills(bills);
	}

	@Override
	public void AddBillDetails(HashMap<Long, CartDto> carts) {
		// TODO Auto-generated method stub
		long idBills = billsDao.GetIDLastBills();
		for (Map.Entry<Long, CartDto> itemCart : carts.entrySet()) {
			BillDetails billDetails = new BillDetails();
			billDetails.setId_bill(idBills);
			billDetails.setId_product(itemCart.getValue().getProduct().getId_product());
			billDetails.setQuantity(itemCart.getValue().getQuantity());
			billDetails.setTotal(itemCart.getValue().getTotalPrice());
			billsDao.AddBillDetails(billDetails);
		}
	}

}
