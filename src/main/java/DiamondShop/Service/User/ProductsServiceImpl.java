package DiamondShop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DiamondShop.Dao.ProductsDao;
import DiamondShop.Dto.ProductsDto;

@Service
public class ProductsServiceImpl implements IProductsService {
	@Autowired
	private ProductsDao productsDao;

	@Override
	public ProductsDto GetProductById(long id) {
		// TODO Auto-generated method stub
		List<ProductsDto> listProducts = productsDao.GetProductById(id);
		return listProducts.get(0);
	}

	@Override
	public List<ProductsDto> GetProductsByIdCategorys(int id) {
		// TODO Auto-generated method stub
		return productsDao.GetAllProductsById(id);
	}

}
