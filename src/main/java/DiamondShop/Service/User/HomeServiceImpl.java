package DiamondShop.Service.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import DiamondShop.Dao.CategorysDao;
import DiamondShop.Dao.MenusDao;
import DiamondShop.Dao.ProductsDao;
import DiamondShop.Dao.SlidesDao;
import DiamondShop.Dto.ProductsDto;
import DiamondShop.Entity.Categorys;
import DiamondShop.Entity.Menus;
import DiamondShop.Entity.Slides;

@Service
public class HomeServiceImpl implements IHomeService {
	@Autowired
	private SlidesDao slidesDao;
	@Autowired
	private CategorysDao categorysDao;
	@Autowired
	private MenusDao menusDao;
	@Autowired
	private ProductsDao productsDao;

	@Override
	public List<Slides> GetDataSlides() {
		// TODO Auto-generated method stub
		return slidesDao.GetDataSlides();
	}

	@Override
	public List<Categorys> GetDataCategorys() {
		// TODO Auto-generated method stub
		return categorysDao.GetDataCategorys();
	}

	@Override
	public List<Menus> GetDataMenus() {
		// TODO Auto-generated method stub
		return menusDao.GetDataMenus();
	}

	@Override
	public List<ProductsDto> GetDataProducts() {
		// TODO Auto-generated method stub
		return productsDao.GetDataProducts();
	}
}