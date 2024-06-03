package com.guli.gulimallware.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.guli.common.utils.PageUtils;
import com.guli.gulimallware.ware.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author jgf
 * @email 1186967953@gmail.com
 * @date 2024-06-03 16:22:20
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

