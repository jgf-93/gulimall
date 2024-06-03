package com.guli.gulimallproduct.product.dao;

import com.guli.gulimallproduct.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author jgf
 * @email 1186967953@gmail.com
 * @date 2024-06-03 15:22:23
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
