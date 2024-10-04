package DiamondShop.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperCategorys implements RowMapper<Categorys> {

	@Override
	public Categorys mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Categorys categorys = new Categorys();
		categorys.setId(rs.getInt("id"));
		categorys.setName(rs.getString("name"));
		categorys.setDescription(rs.getString("description"));
		return categorys;
	}
}
