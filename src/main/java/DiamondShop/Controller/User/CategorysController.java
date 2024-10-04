package DiamondShop.Controller.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import DiamondShop.Dto.PaginatesDto;
import DiamondShop.Service.User.CategorysServiceImpl;
import DiamondShop.Service.User.PaginatesServiceImpl;

@Controller
public class CategorysController extends BaseController {
	@Autowired
	private CategorysServiceImpl categorysService;
	@Autowired
	private PaginatesServiceImpl paginatesService;
	private int totalProductsPage = 9;

	@RequestMapping(value = "/san-pham/{id}")
	public ModelAndView Products(@PathVariable String id) {
		_mvShare.setViewName("user/products/categorys");
		int totalData = categorysService.GetAllProductsById(Integer.parseInt(id)).size();
		PaginatesDto paginateInfo = paginatesService.GetInfoPaginates(totalData, totalProductsPage, 1);
		_mvShare.addObject("idCategorys", id);
		_mvShare.addObject("paginateInfo", paginateInfo);
		_mvShare.addObject("productsPaginates", categorysService.GetDataProductsPaginates(Integer.parseInt(id),
				paginateInfo.getStart(), totalProductsPage));
		return _mvShare;
	}

	@RequestMapping(value = "/san-pham/{id}/{currentPage}")
	public ModelAndView Products(@PathVariable String id, @PathVariable String currentPage) {
		_mvShare.setViewName("user/products/categorys");
		int totalData = categorysService.GetAllProductsById(Integer.parseInt(id)).size();
		PaginatesDto paginateInfo = paginatesService.GetInfoPaginates(totalData, totalProductsPage,
				Integer.parseInt(currentPage));
		_mvShare.addObject("idCategorys", id);
		_mvShare.addObject("paginateInfo", paginateInfo);
		_mvShare.addObject("productsPaginates", categorysService.GetDataProductsPaginates(Integer.parseInt(id),
				paginateInfo.getStart(), totalProductsPage));
		return _mvShare;
	}
}
