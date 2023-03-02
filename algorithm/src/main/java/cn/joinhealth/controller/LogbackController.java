package cn.joinhealth.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StopWatch;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author linjian
 * @date 2022/9/28 14:51
 */
@Slf4j
@RestController
@RequestMapping(value = "/logback")
public class LogbackController {

    @RequestMapping(value = "/log")
    public String log() {
        StopWatch stopWatch = new StopWatch();
        for (int i = 0; i < 5000; i++) {
            stopWatch.start(String.valueOf(i));
            log.info("this is info message {}", i);
            stopWatch.stop();
        }
        log.info(stopWatch.shortSummary());
        log.info(String.valueOf(stopWatch.getTotalTimeSeconds()));
        return String.valueOf(stopWatch.getTotalTimeSeconds());
    }

}
