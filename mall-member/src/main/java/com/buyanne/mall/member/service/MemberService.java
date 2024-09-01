package com.buyanne.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.buyanne.common.utils.PageUtils;
import com.buyanne.mall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author wxd
 * @email sunlightcs@gmail.com
 * @date 2024-09-01 21:21:11
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

