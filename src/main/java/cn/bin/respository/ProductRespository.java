package cn.bin.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import cn.bin.model.Product;

public interface ProductRespository extends JpaRepository<Product,String>{

	// 根据商品状态查询所有商品
	List<Product> findByProductStatus(Integer productStatus);
	
	// 根据 productId 查询商品
	Product findByProductId(String productId);
	
	// 根据类目查询所有商品
	List<Product> findByCategoryId(String categoryId);
	
}
