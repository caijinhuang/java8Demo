package com.service.api;

import org.apache.log4j.Logger;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import static org.junit.Assert.*;

public class FeatureServiceTest {

    Logger logger = Logger.getLogger(FeatureServiceTest.class);

    @Test
    public void dateApi() throws Exception {
        //计算时间差
        Instant start = new Date().toInstant();//date转instant（格林尼治时间）
        logger.info(start);
        // runAlgorithm();
        Instant end = Instant.now();//instant获取格林尼治时间
        Duration timeElapsed = Duration.between(start, end);//计算持续时间，时间差，结果为毫秒，需要除以1000
        long millis = timeElapsed.toMillis();
        logger.info("耗时："+millis/1000);

        LocalDate localDate = LocalDate.now();//当前日期 结果以2018-02-24的形式
        LocalTime localTime = LocalTime.now();//当前时间
        LocalDate localDate1 = LocalDate.of(2018, Month.JULY,9);//自定义日期
        logger.info(localDate);
        logger.info(localDate1);
        logger.info(localTime.withNano(0));//清除纳秒数
    }

    public void runAlgorithm() {
        for (int i = 10000; i < 100000; i++) {
            logger.info(i);
        }
    }

    @Test
    public void staticApi() throws Exception {

    }

    @Test
    public void lambdaApi() throws Exception {
    }

    @Test
    public void otherApi() throws Exception {
    }

}