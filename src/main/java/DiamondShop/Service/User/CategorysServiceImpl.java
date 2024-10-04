package DiamondShop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DiamondShop.Dao.ProductsDao;
import DiamondShop.Dto.ProductsDto;

@Service
public class CategorysServiceImpl implements ICategorysService {
	@Autowired
	private ProductsDao productsDao;

	@Override
	public List<ProductsDto> GetAllProductsById(int id) {
		// TODO Auto-generated method stub
		return productsDao.GetAllProductsById(id);
	}

	@Override
	public List<ProductsDto> GetDataProductsPaginates(int id, int start, int totalPage) {
		// TODO Auto-generated method stub
		return productsDao.GetDataProductsPaginates(id, start, totalPage);
	}
}
