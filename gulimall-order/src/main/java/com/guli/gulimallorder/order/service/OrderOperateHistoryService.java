package com.guli.gulimallorder.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.guli.common.utils.PageUtils;
import com.guli.gulimallorder.order.entity.OrderOperateHistoryEntity;

import java.util.Map;

/**
 * 订单操作历史记录
 *
 * @author jgf
 * @email 1186967953@gmail.com
 * @date 2024-06-03 16:16:09
 */
public interface OrderOperateHistoryService extends IService<OrderOperateHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

