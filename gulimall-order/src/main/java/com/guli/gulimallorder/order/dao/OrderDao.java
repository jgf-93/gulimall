package com.guli.gulimallorder.order.dao;

import com.guli.gulimallorder.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author jgf
 * @email 1186967953@gmail.com
 * @date 2024-06-03 16:16:09
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
