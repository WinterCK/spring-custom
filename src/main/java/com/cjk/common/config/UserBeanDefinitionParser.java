package com.cjk.common.config;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

import com.cjk.common.bean.User;

public class UserBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {

    protected Class getBeanClass(Element element) {
        return User.class;
    }

    protected void doParse(Element element, BeanDefinitionBuilder bean) {
        String userName = element.getAttribute("userName");
        String email = element.getAttribute("email");
        // 将提取的数据放入到BeanDefinitionBuilder中， 待到
        // 完成所有bean的解析后 统一注册到beanFactory中

        if(StringUtils.hasText(userName)) {
            bean.addPropertyValue("userName", userName);
        }
        if(StringUtils.hasText(email)) {
            bean.addPropertyValue("email", email);
        }
    }
}
