package employeemanagement.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Inventory {

	int invId;
	String userId;
	int productId;
	int productQuantity;
	float productPrice;
}
