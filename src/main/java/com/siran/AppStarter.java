package com.siran;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 启动quartz任务
 */
public class AppStarter {
    private final static Logger LOGGER = LoggerFactory.getLogger(AppStarter.class);
    public static void main(String[] args) throws Exception {

        LOGGER.info("启动quartz任务");
        // Creating scheduler factory and scheduler
        final ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring-Quartz.xml");
        LOGGER.info("启动quartz任务 成功 ");

    }
}
