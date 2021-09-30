package employeemanagement.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Orders {
	
	int orderId;
	String userId;
	int productId;
	int invId;
	int productQuantity;
	float totalPrice;
	float grandTotalPrice;

}
