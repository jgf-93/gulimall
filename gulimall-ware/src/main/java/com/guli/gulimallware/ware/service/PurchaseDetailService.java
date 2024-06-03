package com.guli.gulimallware.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.guli.common.utils.PageUtils;
import com.guli.gulimallware.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author jgf
 * @email 1186967953@gmail.com
 * @date 2024-06-03 16:22:21
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

