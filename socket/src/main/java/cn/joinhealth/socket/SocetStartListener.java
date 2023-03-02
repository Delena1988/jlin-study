package cn.joinhealth.socket;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @author linjian
 * @date 2022/9/14 11:33
 */
@WebListener
@Slf4j
public class SocetStartListener implements ServletContextListener {
    private SocketThread socketThread;

    @Override
    public void contextDestroyed(ServletContextEvent arg) {
        if (null != socketThread && !socketThread.isInterrupted()) {
            socketThread.closeSocketServer();
            socketThread.interrupt();
        }
    }

    @Override
    public void contextInitialized(ServletContextEvent arg) {
        if (null == socketThread) {
            //新建线程类
            socketThread = new SocketThread(null);
            //启动线程
            socketThread.start();
            log.info("socket服务端启动成功！！！");
        }
    }
}
