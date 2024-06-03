package com.guli.gulimallorder.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.guli.common.utils.PageUtils;
import com.guli.gulimallorder.order.entity.RefundInfoEntity;

import java.util.Map;

/**
 * 退款信息
 *
 * @author jgf
 * @email 1186967953@gmail.com
 * @date 2024-06-03 16:16:09
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

