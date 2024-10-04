package DiamondShop.Service.User;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DiamondShop.Dao.CartDao;
import DiamondShop.Dto.CartDto;

@Service
public class CartServiceImpl implements ICartService {
	@Autowired
	private CartDao cartDao;

	@Override
	public HashMap<Long, CartDto> AddCart(long id, HashMap<Long, CartDto> cart) {
		// TODO Auto-generated method stub
		return cartDao.AddCart(id, cart);
	}

	@Override
	public HashMap<Long, CartDto> EditCart(long id, int quantity, HashMap<Long, CartDto> cart) {
		// TODO Auto-generated method stub
		return cartDao.EditCart(id, quantity, cart);
	}

	@Override
	public HashMap<Long, CartDto> DeleteCart(long id, HashMap<Long, CartDto> cart) {
		// TODO Auto-generated method stub
		return cartDao.DeleteCart(id, cart);
	}

	@Override
	public int TotalQuantity(HashMap<Long, CartDto> cart) {
		// TODO Auto-generated method stub
		return cartDao.TotalQuantity(cart);
	}

	@Override
	public double TotalPrice(HashMap<Long, CartDto> cart) {
		// TODO Auto-generated method stub
		return cartDao.TotalPrice(cart);
	}
}
