package DiamondShop.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperSanPham implements RowMapper<SanPham> {

	@Override
	public SanPham mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		SanPham sanpham = new SanPham();
		sanpham.setId(rs.getInt("id"));
		sanpham.setName(rs.getString("name"));
		sanpham.setPrice(rs.getDouble("price"));
		return sanpham;
	}

}
