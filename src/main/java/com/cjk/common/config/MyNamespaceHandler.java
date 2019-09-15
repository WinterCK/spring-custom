package com.cjk.common.config;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * 此handler处理器会将组件注册到Spring容齐
 */
public class MyNamespaceHandler extends NamespaceHandlerSupport {
    @Override
    public void init() {
        registerBeanDefinitionParser("user", new UserBeanDefinitionParser());
    }

}
