package DiamondShop.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import DiamondShop.Dto.ProductsDto;
import DiamondShop.Dto.ProductsDtoMapper;

@Repository
public class ProductsDao extends BaseDao {
	private final boolean YES = true;
	private final boolean NO = false;

	private StringBuffer SqlString() {
		StringBuffer varname1 = new StringBuffer();
		varname1.append("SELECT ");
		varname1.append("    p.id as id_product, ");
		varname1.append("    p.id_category, ");
		varname1.append("    p.sizes, ");
		varname1.append("    p.name, ");
		varname1.append("    p.price, ");
		varname1.append("    p.sale, ");
		varname1.append("    p.title, ");
		varname1.append("    p.highlight, ");
		varname1.append("    p.new_product, ");
		varname1.append("    p.details, ");
		varname1.append("    c.id as id_color, ");
		varname1.append("    c.name as name_color, ");
		varname1.append("    c.code as code_color, ");
		varname1.append("    c.img, ");
		varname1.append("    p.created_at, ");
		varname1.append("    p.updated_at ");
		varname1.append("FROM ");
		varname1.append("    products AS p ");
		varname1.append("INNER JOIN ");
		varname1.append("    colors AS c ");
		varname1.append("ON ");
		varname1.append("    p.id = c.id_product ");
		return varname1;
	}

	private String SqlProducts(boolean newProduct, boolean highLight) {
		StringBuffer varname1 = SqlString();
		varname1.append("WHERE 1 = 1 ");
		if (highLight) {
			varname1.append("AND p.highlight = true ");
		}
		if (newProduct) {
			varname1.append("AND p.new_product = true ");
		}
		varname1.append("GROUP BY ");
		varname1.append("    p.id, c.id_product ");
//		varname1.append("ORDER BY RAND() ");
		if (highLight) {
			varname1.append("LIMIT 9 ");
		}
		if (newProduct) {
			varname1.append("LIMIT 12 ");
		}
		return varname1.toString();
	}

	private StringBuffer SqlProductsById(int id) {
		StringBuffer varname1 = SqlString();
		varname1.append("WHERE 1 = 1 ");
		varname1.append("AND id_category = " + id + " ");
		varname1.append("GROUP BY ");
		varname1.append("    p.id, c.id_product ");
		return varname1;
	}

	private String SqlProductsPaginates(int id, int start, int totalPage) {
		StringBuffer varname1 = SqlProductsById(id);
//		varname1.append("GROUP BY ");
//		varname1.append("    p.id, c.id_product ");
		varname1.append("LIMIT " + (start - 1) + ", " + totalPage + " ");
		return varname1.toString();
	}

	public List<ProductsDto> GetDataProducts() {
		String sql = SqlProducts(YES, NO);
		List<ProductsDto> listProducts = _jdbcTemplate.query(sql, new ProductsDtoMapper());
		return listProducts;
	}

	public List<ProductsDto> GetAllProductsById(int id) {
		String sql = SqlProductsById(id).toString();
		List<ProductsDto> listProducts = _jdbcTemplate.query(sql, new ProductsDtoMapper());
		return listProducts;
	}

	public List<ProductsDto> GetDataProductsPaginates(int id, int start, int totalPage) {
		StringBuffer sqlGetDataById = SqlProductsById(id);
		List<ProductsDto> listProductsById = _jdbcTemplate.query(sqlGetDataById.toString(), new ProductsDtoMapper());
		List<ProductsDto> listProducts = new ArrayList<ProductsDto>();
		if (listProductsById.size() > 0) {
			String sql = SqlProductsPaginates(id, start, totalPage);
			listProducts = _jdbcTemplate.query(sql, new ProductsDtoMapper());
		}

		return listProducts;
	}

	private String SqlProductById(long id) {
		StringBuffer varname1 = SqlString();
		varname1.append("WHERE 1 = 1 ");
		varname1.append("AND p.id = " + id + " ");
		varname1.append("LIMIT 1 ");
//		varname1.append("GROUP BY ");
//		varname1.append("    p.id, c.id_product ");
		return varname1.toString();
	}

	public List<ProductsDto> GetProductById(long id) {
		// TODO Auto-generated method stub
		String sql = SqlProductById(id);
		List<ProductsDto> listProducts = _jdbcTemplate.query(sql, new ProductsDtoMapper());
		return listProducts;
	}

	public ProductsDto FindProductById(long id) {
		// TODO Auto-generated method stub
		String sql = SqlProductById(id);
		ProductsDto product = _jdbcTemplate.queryForObject(sql, new ProductsDtoMapper());
		return product;
	}
}
