package cn.bin.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cn.bin.model.Category;

@Service
public interface CategoryService {
    
	// 根据 sellerId 查询所有Category
    List<Category> findAll(String sellerId);
	
	// 根据categoryId
	Category findOne(String categoryId);
	
    // 保存
    Category save(Category category);
}
