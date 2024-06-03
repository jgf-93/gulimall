package com.guli.gulimallorder.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.guli.common.utils.PageUtils;
import com.guli.gulimallorder.order.entity.PaymentInfoEntity;

import java.util.Map;

/**
 * 支付信息表
 *
 * @author jgf
 * @email 1186967953@gmail.com
 * @date 2024-06-03 16:16:09
 */
public interface PaymentInfoService extends IService<PaymentInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

