package DiamondShop.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import DiamondShop.Entity.Categorys;
import DiamondShop.Entity.MapperCategorys;

@Repository
public class CategorysDao extends BaseDao {
	public List<Categorys> GetDataCategorys() {
		List<Categorys> list = new ArrayList<Categorys>();
		String sql = "SELECT * FROM categorys";
		list = _jdbcTemplate.query(sql, new MapperCategorys());
		return list;
	}

	public void AddCategorys(Categorys categorys) {
		String sql = "INSERT INTO categorys (name, description) VALUES (?, ?)";
		_jdbcTemplate.update(sql, categorys.getName(), categorys.getDescription());
	}

	public void EditCategorys(int id, String name, String description) {
		String sql = "UPDATE categorys SET name = ?, description = ? WHERE id = ?";
		_jdbcTemplate.update(sql, name, description, id);
	}

	public void DeleteCategorys(int id) {
		String sql = "DELETE FROM categorys WHERE id = ?";
		_jdbcTemplate.update(sql, id);
	}
}