package com.guli.gulimallproduct.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.guli.common.utils.PageUtils;
import com.guli.gulimallproduct.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author jgf
 * @email 1186967953@gmail.com
 * @date 2024-06-03 15:22:23
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

