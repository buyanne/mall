package com.buyanne.mall.member.feign;

import com.buyanne.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
@FeignClient(name = "mall-coupon")
public interface CouponFeignService {
	@RequestMapping("/coupon/coupon/member/list")
	public R membercoupons();
}
