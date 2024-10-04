package DiamondShop.Service.User;

import java.util.List;

import org.springframework.stereotype.Service;

import DiamondShop.Dto.ProductsDto;

@Service
public interface ICategorysService {
	public List<ProductsDto> GetAllProductsById(int id);

	public List<ProductsDto> GetDataProductsPaginates(int id, int start, int totalPage);
}