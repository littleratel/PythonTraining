package cn.bin.model;

import java.math.BigDecimal;
import javax.persistence.Id;

import cn.bin.enums.ProductStatusEnum;
import lombok.Data;

@Data
public class Product {
	@Id
	private String productId;
	private String productName;
	private BigDecimal productPrice;
	private String productDes;
	private String productIcon;
	private Integer stock;
	// 商品状态，0:上架，1:下架
	private Integer productStatus=ProductStatusEnum.UP.getCode();
	// 一个Product对应一个category
	private String categoryId;
}
