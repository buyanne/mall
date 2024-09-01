package com.buyanne.mall.order.dao;

import com.buyanne.mall.order.entity.OrderSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 * 
 * @author wxd
 * @email sunlightcs@gmail.com
 * @date 2024-09-01 21:24:47
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {
	
}
