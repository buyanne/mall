package com.buyanne.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.buyanne.common.utils.PageUtils;
import com.buyanne.mall.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author wxd
 * @email sunlightcs@gmail.com
 * @date 2024-09-01 21:27:07
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

