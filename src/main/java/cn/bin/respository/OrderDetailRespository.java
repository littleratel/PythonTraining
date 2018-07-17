package cn.bin.respository;

import org.apache.ibatis.annotations.Insert;

import cn.bin.model.OrderDetail;

public interface OrderDetailRespository {

	/**
	 * tb_order_detail 与tb_product 的元素有相同的部门，防止tb_product的数据被删除时，订单详情中找不到对应的product
	 * 
	 * */
//    `detail_id` varchar(32) not null,
//    `order_id` varchar(32) not null,
//    `product_id` varchar(32) not null,
//    `product_name` varchar(64) not null comment '商品名称',
//    `product_price` decimal(8,2) not null comment '当前价格,单位分',
//    `product_quantity` int not null comment '数量',
//    `product_icon` varchar(512) comment '小图',
	
	@Insert("insert into tb_order_detail(detail_id,order_id,product_id,product_name,product_price,product_quantity,product_icon) "
			+ "values(#{detailId},#{orderId},#{productId},#{productName},#{productPrice},#{productQuantity}，#{product_icon})")
	public int addOrderDetail(OrderDetail orderDetail);
	

}
