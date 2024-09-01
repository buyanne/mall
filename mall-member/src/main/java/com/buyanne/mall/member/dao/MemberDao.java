package com.buyanne.mall.member.dao;

import com.buyanne.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author wxd
 * @email sunlightcs@gmail.com
 * @date 2024-09-01 21:21:11
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
