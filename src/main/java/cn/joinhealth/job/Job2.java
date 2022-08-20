package cn.joinhealth.job;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;

/**
 * @author linjian
 * @date 2022/8/15 09:09
 */
@Slf4j
@EnableScheduling
@Component
public class Job2 {

//    @Scheduled(cron = "0/5 * * * * ?")
//    public void task3() throws InterruptedException {
//        log.info("className:{} taskName:{} start!!!", this.getClass().getName(), Thread.currentThread().getStackTrace()[1].getMethodName());
//        Thread.sleep(10 * 1000);
//        log.info("className:{} taskName:{} stop!!!", this.getClass().getName(), Thread.currentThread().getStackTrace()[1].getMethodName());
//    }

//    @Scheduled(cron = "0/5 * * * * ?")
//    public void task4() throws InterruptedException {
//        log.info("className:{} taskName:{} start!!!", this.getClass().getName(), Thread.currentThread().getStackTrace()[1].getMethodName());
//        Thread.sleep(10 * 1000);
//        log.info("className:{} taskName:{} stop!!!", this.getClass().getName(), Thread.currentThread().getStackTrace()[1].getMethodName());
//    }

}
