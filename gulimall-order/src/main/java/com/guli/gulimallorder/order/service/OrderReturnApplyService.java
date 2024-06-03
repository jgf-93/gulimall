package com.guli.gulimallorder.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.guli.common.utils.PageUtils;
import com.guli.gulimallorder.order.entity.OrderReturnApplyEntity;

import java.util.Map;

/**
 * 订单退货申请
 *
 * @author jgf
 * @email 1186967953@gmail.com
 * @date 2024-06-03 16:16:09
 */
public interface OrderReturnApplyService extends IService<OrderReturnApplyEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

