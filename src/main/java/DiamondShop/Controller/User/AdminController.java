package DiamondShop.Controller.User;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import DiamondShop.Dao.CategorysDao;
import DiamondShop.Dao.SanPhamDao;
import DiamondShop.Entity.Categorys;
import DiamondShop.Entity.SanPham;

@Controller
@RequestMapping("/admin")
public class AdminController extends BaseController {
	@Autowired
	SanPhamDao sanPhamDao;
	@Autowired
	CategorysDao categorysDao;

	@RequestMapping(value = "/products", method = RequestMethod.GET)
	public ModelAndView AdminProducts() {
		_mvShare.addObject("themsanpham", new SanPham());
		_mvShare.addObject("sanpham", sanPhamDao.GetDataProducts());
		_mvShare.setViewName("admin/products");
		return _mvShare;
	}

	@RequestMapping(value = "/AddProduct", method = RequestMethod.POST)
	public String AddProduct(HttpServletRequest request, @ModelAttribute("themsanpham") SanPham sanPham) {
		sanPhamDao.AddProduct(sanPham);
		return "redirect:" + request.getHeader("Referer");
	}

	@RequestMapping(value = "/EditProduct/{id}/{name}/{price}")
	public String EditProduct(HttpServletRequest request, @PathVariable int id, @PathVariable String name,
			@PathVariable double price) {
		sanPhamDao.EditProduct(id, name, price);
		return "redirect:" + request.getHeader("Referer");
	}

	@RequestMapping(value = "/DeleteProduct/{id}")
	public String DeleteProduct(HttpServletRequest request, @PathVariable int id) {
		sanPhamDao.DeleteProduct(id);
		return "redirect:" + request.getHeader("Referer");
	}

	@RequestMapping(value = "/categorys", method = RequestMethod.GET)
	public ModelAndView AdminCategorys() {
		_mvShare.addObject("themloaihang", new Categorys());
		_mvShare.addObject("categorys", _homeService.GetDataCategorys());
		_mvShare.setViewName("admin/categorys");
		return _mvShare;
	}

	@RequestMapping(value = "/AddCategory", method = RequestMethod.POST)
	public String AddCategory(HttpServletRequest request, @ModelAttribute("themloaihang") Categorys categorys) {
		categorysDao.AddCategorys(categorys);
		return "redirect:" + request.getHeader("Referer");
	}

	@RequestMapping(value = "/EditCategory/{id}/{name}/{description}")
	public String EditCategory(HttpServletRequest request, @PathVariable int id, @PathVariable String name,
			@PathVariable String description) {
		categorysDao.EditCategorys(id, name, description);
		return "redirect:" + request.getHeader("Referer");
	}

	@RequestMapping(value = "/DeleteCategory/{id}")
	public String DeleteCategory(HttpServletRequest request, @PathVariable int id) {
		categorysDao.DeleteCategorys(id);
		return "redirect:" + request.getHeader("Referer");
	}
}
