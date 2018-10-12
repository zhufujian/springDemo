package com.study.spring.ioc.step04;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/***
 * 浅析Spring IoC源码（四）分析BeanPostProcessor(1)
 * @author zhufj
 *
 */
public class ChangeTeacherSmokingBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		/**
		 * 只处理该bean的类型是Teacher的
		 */
		if(bean instanceof Teacher){
			Teacher teacher = (Teacher)bean;
			/**
			 * 实例化之前，要吧所有抽烟的都改成不抽烟的
			 */
			if(teacher.isSmoking()){
				((Teacher)bean).setTempSmoking(false);
			}
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		return bean;
	}

}
