package com.guli.gulimallmember.member.dao;

import com.guli.gulimallmember.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author jgf
 * @email 1186967953@gmail.com
 * @date 2024-06-03 16:10:11
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
