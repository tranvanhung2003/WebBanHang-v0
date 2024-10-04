package DiamondShop.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import DiamondShop.Entity.MapperSanPham;
import DiamondShop.Entity.SanPham;

@Repository
public class SanPhamDao extends BaseDao {
	public List<SanPham> GetDataProducts() {
		List<SanPham> list = new ArrayList<SanPham>();
		String sql = "SELECT id, name, price FROM products";
		list = _jdbcTemplate.query(sql, new MapperSanPham());
		return list;
	}

	public void EditProduct(int id, String name, double price) {
		String sql = "UPDATE products SET name = ?, price = ? WHERE id = ?";
		_jdbcTemplate.update(sql, name, price, id);
	}

	public void DeleteProduct(int id) {
		String sql = "DELETE FROM products WHERE id = ?";
		_jdbcTemplate.update(sql, id);
	}

	public void AddProduct(SanPham sanPham) {
		String sql = "INSERT INTO products (name, price) VALUES (?, ?)";
		_jdbcTemplate.update(sql, sanPham.getName(), sanPham.getPrice());
	}
}
