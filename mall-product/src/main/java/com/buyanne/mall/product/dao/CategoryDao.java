package com.buyanne.mall.product.dao;

import com.buyanne.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author wxd
 * @email sunlightcs@gmail.com
 * @date 2024-09-01 19:11:45
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
