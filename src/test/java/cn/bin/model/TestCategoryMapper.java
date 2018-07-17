package cn.bin.model;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import cn.bin.respository.CategoryRespository;
import cn.bin.model.Category;

@RunWith(SpringRunner.class)
@SpringBootTest()
public class TestCategoryMapper {
	
	@Autowired
	private CategoryRespository repository;
	
//    @Test
    public void findOneTest() {
    	Category category = null;
    	try {
    		category = repository.findOne("2");
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
        System.out.println(category.toString());
    }
    
    @Test
//    @Transactional
    public void saveTest() {
    	Category category = repository.findOne("1");
    	System.out.println(category.toString());
    	category.setCategoryType(1);
    	
    	repository.save(category);
    	category = repository.findOne("1");
    	System.out.println(category.toString());
    }
	
}
