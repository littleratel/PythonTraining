package cn.bin.respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cn.bin.model.Category;

@Repository
public interface CategoryRespository extends JpaRepository<Category,String>{
	
	List<Category> findByShopId(String shopId);
	
}
