package DiamondShop.Service.User;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DiamondShop.Dao.UserDao;
import DiamondShop.Entity.Users;

@Service
public class AccountServiceImpl implements IAccountService {
	@Autowired
	UserDao userDao;

	@Override
	public int AddAccount(Users user) {
		// TODO Auto-generated method stub
		user.setPassword(BCrypt.hashpw(user.getPassword(), BCrypt.gensalt(12)));
		return userDao.AddAccount(user);
	}

	@Override
	public Users CheckAccount(Users user) {
		// TODO Auto-generated method stub
		String pass = user.getPassword();
		user = userDao.GetUserByAcc(user);
		if (user != null) {
			if (BCrypt.checkpw(pass, user.getPassword())) {
				return user;
			} else {
				return null;
			}
		}
		return null;
	}

}
