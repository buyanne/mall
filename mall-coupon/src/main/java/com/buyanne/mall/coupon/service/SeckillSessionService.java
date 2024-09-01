package com.buyanne.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.buyanne.common.utils.PageUtils;
import com.buyanne.mall.coupon.entity.SeckillSessionEntity;

import java.util.Map;

/**
 * 秒杀活动场次
 *
 * @author wxd
 * @email sunlightcs@gmail.com
 * @date 2024-09-01 21:10:32
 */
public interface SeckillSessionService extends IService<SeckillSessionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

