package cn.bin.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import cn.bin.model.Product;
import cn.bin.respository.ProductRespository;
import cn.bin.service.ProductService;

/**
 * @author ezfanbi
 *
 */
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRespository respository;
	
	@Override
	public Product findOne(String productId) {
		return respository.findByProductId(productId);
	}

	@Override
	public Page<Product> findAll(Pageable pageable, String categoryId) {
		
		return null;
	}

	@Override
	public Product save(Product Product) {
		// TODO Auto-generated method stub
		return null;
	}

}
