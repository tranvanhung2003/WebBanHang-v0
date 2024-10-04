package DiamondShop.Dao;

import org.springframework.stereotype.Repository;

import DiamondShop.Entity.BillDetails;
import DiamondShop.Entity.Bills;

@Repository
public class BillsDao extends BaseDao {
	public int AddBills(Bills bills) {
		StringBuffer sql = new StringBuffer();
		sql.append("INSERT INTO bills ");
		sql.append("( ");
//		sql.append("    `user`, `phone`, `display_name`, `address`, `total`, `quantity`, `note` ");
		sql.append("    user, phone, display_name, address, total, quantity, note ");
		sql.append(") ");
		sql.append("VALUES ");
		sql.append("( ");
		sql.append("    '" + bills.getUser() + "', ");
		sql.append("    '" + bills.getPhone() + "', ");
		sql.append("    '" + bills.getDisplay_name() + "', ");
		sql.append("    '" + bills.getAddress() + "', ");
		sql.append("    " + bills.getTotal() + ", ");
		sql.append("    " + bills.getQuantity() + ", ");
		sql.append("    '" + bills.getNote() + "' ");
		sql.append(") ");
		int insert = _jdbcTemplate.update(sql.toString());
		return insert;
	}

	public long GetIDLastBills() {
		StringBuffer sql = new StringBuffer();
		sql.append("SELECT MAX(id) FROM bills ");
		long id = _jdbcTemplate.queryForObject(sql.toString(), new Object[] {}, Long.class);
		return id;
	}

	public int AddBillDetails(BillDetails billDetails) {
		StringBuffer sql = new StringBuffer();
		sql.append("INSERT INTO billdetails ");
		sql.append("( ");
		sql.append("    id_product, id_bills, quantity, total ");
		sql.append(") ");
		sql.append("VALUES ");
		sql.append("( ");
		sql.append("    " + billDetails.getId_product() + ", ");
		sql.append("    " + billDetails.getId_bill() + ", ");
		sql.append("    " + billDetails.getQuantity() + ", ");
		sql.append("    " + billDetails.getTotal() + " ");
		sql.append(") ");
		int insert = _jdbcTemplate.update(sql.toString());
		return insert;
	}
}
