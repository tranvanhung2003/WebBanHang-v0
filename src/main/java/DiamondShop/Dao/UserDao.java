package DiamondShop.Dao;

import org.springframework.stereotype.Repository;

import DiamondShop.Entity.MapperUsers;
import DiamondShop.Entity.Users;

@Repository
public class UserDao extends BaseDao {
	public int AddAccount(Users user) {
		StringBuffer varname1 = new StringBuffer();
		varname1.append("INSERT INTO users ");
		varname1.append("( ");
		varname1.append("    user, ");
		varname1.append("    password, ");
		varname1.append("    display_name, ");
		varname1.append("    address ");
		varname1.append(") ");
		varname1.append("VALUES ");
		varname1.append("( ");
		varname1.append("    '" + user.getUser() + "', ");
		varname1.append("    '" + user.getPassword() + "', ");
		varname1.append("    '" + user.getDisplay_name() + "', ");
		varname1.append("    '" + user.getAddress() + "' ");
		varname1.append(") ");
		int insert = _jdbcTemplate.update(varname1.toString());
		return insert;
	}

	public Users GetUserByAcc(Users user) {
		String sql = "SELECT * FROM users WHERE user = '" + user.getUser() + "'";
		Users result = _jdbcTemplate.queryForObject(sql, new MapperUsers());
		return result;
	}
}
