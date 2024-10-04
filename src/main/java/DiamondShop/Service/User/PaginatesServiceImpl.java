package DiamondShop.Service.User;

import org.springframework.stereotype.Service;

import DiamondShop.Dto.PaginatesDto;

@Service
public class PaginatesServiceImpl implements IPaginatesService {

	@Override
	public PaginatesDto GetInfoPaginates(int totalData, int limit, int currentPage) {
		// TODO Auto-generated method stub
		PaginatesDto paginates = new PaginatesDto();
		paginates.setLimit(limit);
		paginates.setTotalPage(SetInfoPaginates(totalData, limit));
		paginates.setCurrentPage(CheckCurrentPage(currentPage, paginates.getTotalPage()));
		int start = FindStart(paginates.getCurrentPage(), limit);
		paginates.setStart(start);
		int end = FindEnd(paginates.getStart(), limit, totalData);
		paginates.setEnd(end);
		return paginates;
	}

	private int FindEnd(int start, int limit, int totalData) {
		// TODO Auto-generated method stub

		return start + limit > totalData ? totalData : (start + limit) - 1;
	}

	private int FindStart(int currentPage, int limit) {
		// TODO Auto-generated method stub
		return ((currentPage - 1) * limit) + 1;
	}

	private int SetInfoPaginates(int totalData, int limit) {
		// TODO Auto-generated method stub
		int totalPage = 0;
		totalPage = totalData / limit;
		totalPage = totalPage * limit < totalData ? totalPage + 1 : totalPage;
		return totalPage;
	}

	private int CheckCurrentPage(int currentPage, int totalPage) {
		// TODO Auto-generated method stub
		if (currentPage < 1) {
			return 1;
		}
		if (currentPage > totalPage) {
			return totalPage;
		}
		return currentPage;
	}
}
