package DiamondShop.Service.User;

import org.springframework.stereotype.Service;

import DiamondShop.Entity.Users;

@Service
public interface IAccountService {
	public int AddAccount(Users user);

	public Users CheckAccount(Users user);
}
