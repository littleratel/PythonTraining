package cn.bin.respository;

import org.apache.ibatis.annotations.Insert;

import cn.bin.model.Seller;

public interface SellerRespository {
	
	@Insert("insert into tb_product(seller_id,seller_name,seller_pwd,seller_openid,shop_name,shop_phone,shop_address) "
			+ "values(#{sellerId},#{sellerName},#{sellerPwd},#{sellerOpenid},#{shopName},#{shopAhone},#{productStatus})")
	public int addSeller(Seller seller);

}
