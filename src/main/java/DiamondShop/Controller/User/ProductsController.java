package DiamondShop.Controller.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import DiamondShop.Service.User.ProductsServiceImpl;

@Controller
public class ProductsController extends BaseController {
	@Autowired
	private ProductsServiceImpl _productsService;

	@RequestMapping(value = { "/chi-tiet-san-pham/{id}" })
	public ModelAndView Index(@PathVariable long id) {
		_mvShare.setViewName("user/products/product");
		_mvShare.addObject("product", _productsService.GetProductById(id));
		_mvShare.addObject("categorys", _homeService.GetDataCategorys());
		int idCategory = _productsService.GetProductById(id).getId_category();
		_mvShare.addObject("productByIdCategorys", _productsService.GetProductsByIdCategorys(idCategory));
		return _mvShare;
	}
}