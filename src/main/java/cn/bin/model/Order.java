package cn.bin.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Id;
import lombok.Data;

@Data
public class Order {
	@Id
	private String orderId;
	private String buyNerame;
	private String buyerPhone;
	private String buyerAddress;
	
	//买家备注信息
	private String buyerNotes;
	
	private BigDecimal orderAmount;
	private Integer payStatus;
	private Integer orderStatus;
	
	// 买家和商家都能查询属于他们的order
	private String buyeraOpenid;
	private String sellerId;
	
	// 可考虑做
	// 买家预定取货时间
	private Date startTime;
	private Date endTime;
}
