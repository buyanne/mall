package com.buyanne.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.buyanne.common.utils.PageUtils;
import com.buyanne.mall.coupon.entity.SpuBoundsEntity;

import java.util.Map;

/**
 * 商品spu积分设置
 *
 * @author wxd
 * @email sunlightcs@gmail.com
 * @date 2024-09-01 21:10:32
 */
public interface SpuBoundsService extends IService<SpuBoundsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

