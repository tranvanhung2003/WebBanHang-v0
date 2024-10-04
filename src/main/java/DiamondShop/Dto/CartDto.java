package DiamondShop.Dto;

public class CartDto {
	private int quantity;
	private double totalPrice;
	private ProductsDto product;

	public CartDto() {
		super();
	}

	public CartDto(int quantity, double totalPrice, ProductsDto product) {
		super();
		this.quantity = quantity;
		this.totalPrice = totalPrice;
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public ProductsDto getProduct() {
		return product;
	}

	public void setProduct(ProductsDto product) {
		this.product = product;
	}
}
