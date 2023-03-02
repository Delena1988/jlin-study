package cn.joinhealth.socket;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author linjian
 * @date 2022/9/14 11:38
 */
@Slf4j
public class SocketThread extends Thread{
    private ServerSocket serverSocket = null;

    public SocketThread(ServerSocket serverScoket) {
        try {
            if (null == serverSocket) {
                serverSocket = new ServerSocket(8888);
                log.info("socket start-------------------------------");
            }
        } catch (Exception e) {
            log.info("SocketThread创建socket服务出错");
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        while (true) {
            //线程池
            ExecutorService executor = Executors.newFixedThreadPool(10);
            try {
                if (serverSocket == null) {
                    break;
                } else if (serverSocket.isClosed()) {
                    break;
                }
                Socket socket = serverSocket.accept();
                if (null != socket && !socket.isClosed()) {
                    //处理接受的数据
                    executor.submit(new ServerHandler(socket));
                } else {
                    break;
                }
            } catch (Exception e) {
                log.info("SocketThread创建socket服务出错");
            }
        }
    }

    public void closeSocketServer() {
        try {
            if (null != serverSocket && !serverSocket.isClosed()) {
                serverSocket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
