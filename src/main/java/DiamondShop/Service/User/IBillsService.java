package DiamondShop.Service.User;

import java.util.HashMap;

import org.springframework.stereotype.Service;

import DiamondShop.Dto.CartDto;
import DiamondShop.Entity.Bills;

@Service
public interface IBillsService {
	public int AddBills(Bills bills);

	public void AddBillDetails(HashMap<Long, CartDto> carts);
}
