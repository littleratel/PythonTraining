package cn.bin.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="tb_category")
@Data
public class Category {
	
	@Id
	private String categoryId;
	private String sellerId;
	private String categoryName;
	private Integer categoryType;
	
	public Category() {}
	
	public Category(String categoryName, Integer categoryType){
		this.categoryName= categoryName;
		this.categoryType = categoryType;
	}
	
	@Override
	public String toString() {
		return "categoryId: " + categoryId + "\r\n" 
				+ "categoryName: " + categoryName + "\r\n" 
				+ "categoryType: " + categoryType + "\r\n";
	}
}
