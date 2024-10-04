package DiamondShop.Service.User;

import org.springframework.stereotype.Service;

import DiamondShop.Dto.PaginatesDto;

@Service
public interface IPaginatesService {
	public PaginatesDto GetInfoPaginates(int totalData, int limit, int currentPage);
}
