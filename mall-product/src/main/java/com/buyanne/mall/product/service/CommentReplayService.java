package com.buyanne.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.buyanne.common.utils.PageUtils;
import com.buyanne.mall.product.entity.CommentReplayEntity;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author wxd
 * @email sunlightcs@gmail.com
 * @date 2024-09-01 19:11:45
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

