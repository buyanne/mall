package com.buyanne.mall.coupon;

import org.assertj.core.util.Maps;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class TimeCostBeanPostProcessor implements BeanPostProcessor {
	private Map<String,Long > costMap=new ConcurrentHashMap<>();
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		costMap.put(beanName,System.currentTimeMillis());
		return bean;
	}

	@Override
	public  Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if(costMap.containsKey(beanName)){
			Long start=costMap.get(beanName);
			Long cost=System.currentTimeMillis()-start;
			if(cost>0){
				costMap.put(beanName,cost);
				System.out.println("bean"+beanName+"\t time:"+cost  );
			}
		}


		return bean;
	}
}
