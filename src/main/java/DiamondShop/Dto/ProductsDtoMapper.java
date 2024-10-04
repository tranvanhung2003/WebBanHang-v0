package DiamondShop.Dto;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ProductsDtoMapper implements RowMapper<ProductsDto> {

	@Override
	public ProductsDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		ProductsDto productsDto = new ProductsDto();
		productsDto.setId_product(rs.getLong("id_product"));
		productsDto.setId_category(rs.getInt("id_category"));
		productsDto.setSizes(rs.getString("sizes"));
		productsDto.setName(rs.getString("name"));
		productsDto.setPrice(rs.getDouble("price"));
		productsDto.setSale(rs.getInt("sale"));
		productsDto.setTitle(rs.getString("title"));
		productsDto.setHighlight(rs.getBoolean("highlight"));
		productsDto.setNew_product(rs.getBoolean("new_product"));
		productsDto.setDetails(rs.getString("details"));
		productsDto.setId_color(rs.getLong("id_color"));
		productsDto.setName_color(rs.getString("name_color"));
		productsDto.setCode_color(rs.getString("code_color"));
		productsDto.setImg(rs.getString("img"));
		productsDto.setCreated_at(rs.getDate("created_at"));
		productsDto.setUpdated_at(rs.getDate("updated_at"));
		return productsDto;
	}

}
