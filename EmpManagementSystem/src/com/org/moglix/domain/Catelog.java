package com.org.moglix.domain;

import lombok.Data;

@Data
public class Catelog {
	private Long productId;
	private Long categoryId;
	private String productName;
	private String productDescription;
	private String productImage;

}
