package com.buyanne.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.buyanne.common.utils.PageUtils;
import com.buyanne.mall.product.entity.CategoryEntity;

import java.util.Map;

/**
 * 商品三级分类
 *
 * @author wxd
 * @email sunlightcs@gmail.com
 * @date 2024-09-01 19:11:45
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

