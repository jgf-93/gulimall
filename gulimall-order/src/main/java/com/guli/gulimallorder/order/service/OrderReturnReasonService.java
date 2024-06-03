package com.guli.gulimallorder.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.guli.common.utils.PageUtils;
import com.guli.gulimallorder.order.entity.OrderReturnReasonEntity;

import java.util.Map;

/**
 * 退货原因
 *
 * @author jgf
 * @email 1186967953@gmail.com
 * @date 2024-06-03 16:16:09
 */
public interface OrderReturnReasonService extends IService<OrderReturnReasonEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

