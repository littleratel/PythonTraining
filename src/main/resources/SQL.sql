数据库表设计

-- 卖家(商铺)
create table `tb_seller` (
    `shop_id` varchar(32) not null,
    `shop_name` varchar(32) not null comment '店铺名称',
    `shop_info` varchar(128) not null comment '店铺经营描述',
    `shop_address` varchar(128) not null comment '商家地址',
    `seller_phone` varchar(32) not null comment '商家手机号',
    `seller_pwd` varchar(32) not null,
    `seller_openid` varchar(64) not null comment '商家微信',
    `create_time` timestamp not null default current_timestamp,
    `update_time` timestamp not null default current_timestamp on update current_timestamp,
    primary key (`shop_id`)
    unique key `uqe_seller_phone` (`seller_phone`)
) comment '卖家信息表';

-- 类目、分类
create table `tb_category` (
    `category_id` varchar(32) not null,
    `shop_id` varchar(32) not null comment '店铺id',
    `category_name` varchar(64) not null comment '类目名字',
    `category_type` int not null comment '类目编号',
    `create_time` timestamp not null default current_timestamp,
    `update_time` timestamp not null default current_timestamp on update current_timestamp,
    primary key (`category_id`)
)comment '类别表';

-- 商品
create table `tb_product` (
    `product_id` varchar(32) not null,
    `category_id` varchar(32) not null comment '所属类目id',
    `product_name` varchar(64) not null comment '商品名称',
    `product_price` decimal(8,2) not null comment '单价',
    `product_des` varchar(64) comment '描述',
    `product_icon` varchar(512) comment '图片',
    `product_stock` int not null comment '库存',
    `product_status` tinyint(3) DEFAULT '0' COMMENT '商品状态,0正常1下架',
    `create_time` timestamp not null default current_timestamp,
    `update_time` timestamp not null default current_timestamp on update current_timestamp,
    primary key (`product_id`)
)comment '商品表';

-- 订单
create table `tb_order` (
    `order_id` varchar(32) not null,
    `buyer_name` varchar(32) not null comment '买家名字',
    `buyer_phone` varchar(32) not null comment '买家电话',
    `buyer_openid` varchar(64) not null comment '买家微信号',
    -- `buyer_address` varchar(128) not null comment '买家地址',
    `buyer_notes` varchar(512) comment '买家备注',
    `order_amount` decimal(8,2) not null comment '订单总金额',
    `pay_status` tinyint(3) not null default '0' comment '支付状态, 默认未支付',
    `order_status` tinyint(3) not null default '0' comment '订单状态, 默认为新下单',
    -- `shop_id` varchar(32) not null comment '店铺id',
    `reserve_time` timestamp comment '预定时间',
    `reserve_ratio` tinyint(3) not null default 100 comment '定金占比率', 
    `create_time` timestamp not null default current_timestamp,
    `update_time` timestamp not null default current_timestamp on update current_timestamp,
    primary key (`order_id`),
    key `idx_buyer_openid` (`buyer_openid`)
)comment '订单表';

-- 订单详情
create table `tb_order_detail` (
    `detail_id` varchar(32) not null,
    `order_id` varchar(32) not null,
    `product_id` varchar(32) not null,
    `product_name` varchar(64) not null comment '商品名称',
    `product_price` decimal(8,2) not null comment '当前价格,单位分',
    `product_quantity` int not null comment '数量',
    primary key (`detail_id`),
    key `idx_order_id` (`order_id`)
)comment '订单详情表';

