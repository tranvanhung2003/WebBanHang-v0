package DiamondShop.Service.User;

import java.util.List;

import org.springframework.stereotype.Service;

import DiamondShop.Dto.ProductsDto;

@Service
public interface IProductsService {
	public ProductsDto GetProductById(long id);

	public List<ProductsDto> GetProductsByIdCategorys(int id);
}