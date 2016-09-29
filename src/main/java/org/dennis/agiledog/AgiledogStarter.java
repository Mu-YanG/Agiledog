package org.dennis.agiledog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * 应用启动器
 *
 * @author deng.zhang
 * @since 1.0.0
 * Created on 2016-09-28 19:53
 */
@SpringBootApplication
@ImportResource("classpath*:spring*.xml")
public class AgiledogStarter {
    /**
     * logger
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(AgiledogStarter.class);

    public static void main(String[] args) {
        LOGGER.info("Agiledog starting...");
        SpringApplication.run(AgiledogStarter.class, args);
        LOGGER.info("Agiledog started!");
    }
}
