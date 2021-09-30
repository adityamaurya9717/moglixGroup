package employeemanagement.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cart {
	int cartId;
	String userId;
	int invId;
	int productId;
	int productQuantity;
	float totalPrice;

	
	

}
