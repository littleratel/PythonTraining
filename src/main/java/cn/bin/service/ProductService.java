package cn.bin.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import cn.bin.model.Product;

public interface ProductService {

	// 根据 productId 查看商品详情
	Product findOne(String productId);

	// 根据 categoryId 查询所有在架商品, 分页查询
	Page<Product> findAll(Pageable pageable, String categoryId);
	
	// 保存商品
	Product save(Product Product);

	// 用户取消订单，加库存
	// void increaseStock(List<CartDTO> cartDTOList);

	// 用户提交订单，减库存
	// void decreaseStock(List<CartDTO> cartDTOList);

	// 上架
//	Product onSale(String productId);

	// 下架
//	Product offSale(String productId);

}
