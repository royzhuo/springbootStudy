package com.webstudy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

//1.springboot 默认使用日志是slf4j，其底层实现是log-back
//2.每个框架底层所使用到日志框架可能都不一样，如果要统一项目使用框架，虽删除掉其日志框架，换上项目想要使用都日志框架
//如：spring底层使用都框架是common-logging，jul(java.util.logging),项目想要用slf4j，就必须去掉common-loggin这个日志框架，
//换上log4j-to-slf4j这种中转框架，类还是原来common-loging，只是底层实现换成类slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestLogging {

    private final Logger logger= LoggerFactory.getLogger(getClass());

    /**
     * 1.级别从低到高:trace<debug<info<warn<error
     * 2.springboot默认级别：info
     * 3.指定哪个级别，系统会输入该级别以及以上都日志信息
     * 4.指定级别:
     * #logging.level.root=trace 整个系统
       logging.level.com.webstudy=trace 可以指定到那个包下
     */
    @Test
    public void testLog(){
        logger.trace("haha");//级别相当于system.out.println（）；
        logger.debug("debug.....");
        logger.info("info.....");
        logger.warn("warn.....");
        logger.error("error.....");
    }
}
