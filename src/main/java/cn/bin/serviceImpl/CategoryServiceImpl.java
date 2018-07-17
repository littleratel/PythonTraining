package cn.bin.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cn.bin.respository.CategoryRespository;
import cn.bin.model.Category;
import cn.bin.service.CategoryService;

public class CategoryServiceImpl implements CategoryService{
	
	@Autowired
	private CategoryRespository respository;
	
	@Override
	public List<Category> findAll(String sellerId) {
		return respository.findByShopId(sellerId);
	}

	@Override
	public Category findOne(String categoryId) {
		return respository.findOne(categoryId);
	}

	@Override
	public Category save(Category category) {
		return respository.save(category);
	}

}
