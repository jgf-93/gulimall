package com.guli.gulimallcoupon.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.guli.common.utils.PageUtils;
import com.guli.gulimallcoupon.coupon.entity.MemberLevelEntity;

import java.util.Map;

/**
 * 会员等级
 *
 * @author jgf
 * @email 1186967953@gmail.com
 * @date 2024-06-03 10:28:54
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

