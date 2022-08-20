package cn.joinhealth.job;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Random;

/**
 * @author linjian
 * @date 2022/8/15 09:09
 */
@Slf4j
@EnableScheduling
@Component
public class Job1 {

    //    @Async
//    @Scheduled(cron = "0/5 * * * * ?")
//    public void task1() throws InterruptedException {
//        log.info("className:{} taskName:{} start!!!", this.getClass().getName(), Thread.currentThread().getStackTrace()[1].getMethodName());
//        Thread.sleep(10 * 1000);
//        log.info("className:{} taskName:{} stop!!!", this.getClass().getName(), Thread.currentThread().getStackTrace()[1].getMethodName());
//    }

    //    @Async
//    @Scheduled(cron = "0/7 * * * * ?")
//    public void task2() throws InterruptedException {
//        log.info("className:{} taskName:{} start!!!", this.getClass().getName(), Thread.currentThread().getStackTrace()[1].getMethodName());
//        Thread.sleep(10 * 1000);
//        log.info("className:{} taskName:{} stop!!!", this.getClass().getName(), Thread.currentThread().getStackTrace()[1].getMethodName());
//    }

//    @Scheduled(fixedDelay = 5 * 1000)
//    public void task3() throws InterruptedException {
//        log.info("className:{} taskName:{} start!!!", this.getClass().getName(), Thread.currentThread().getStackTrace()[1].getMethodName());
//        Thread.sleep(10 * 1000);
//        log.info("className:{} taskName:{} stop!!!", this.getClass().getName(), Thread.currentThread().getStackTrace()[1].getMethodName());
//    }

//    @Async
    @Scheduled(fixedRate = 5 * 1000)
    public void task4() throws InterruptedException {
        log.info("className:{} taskName:{} start!!!", this.getClass().getName(), Thread.currentThread().getStackTrace()[1].getMethodName());
        int i = new Random().nextInt(10);
        log.info("sleep: {}", i);
        Thread.sleep(i * 1000);
        log.info("className:{} taskName:{} stop!!!", this.getClass().getName(), Thread.currentThread().getStackTrace()[1].getMethodName());
    }
}