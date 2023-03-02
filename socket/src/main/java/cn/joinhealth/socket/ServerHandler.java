package cn.joinhealth.socket;

import lombok.extern.slf4j.Slf4j;

import java.io.*;
import java.net.Socket;

/**
 * @author linjian
 * @date 2022/9/14 11:41
 * 处理请求
 */
@Slf4j
public class ServerHandler implements Runnable {
    private Socket socket;
    private final String HOSP_CODE = "590708446";

    public ServerHandler(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        {
            InputStream inputStream = null;
            OutputStream outputStream = null;
            if (socket != null && !socket.isClosed()) {
                try {
                    //1, 打开输入流，准备读取数据
                    inputStream = socket.getInputStream();
                    //2，创建 bufferedreader, 接收读取的数据
                    BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
                    String str = "";
                    //3，读取数据
                    while ((str = reader.readLine()) != null) {
                        log.info("这里是服务器端，客户端发来：" + str);
                    }
                    //4，关闭输入流
                    socket.shutdownInput();

                    //5，打开输出流，准备写入数据
                    outputStream = socket.getOutputStream();
                    PrintWriter printWriter = new PrintWriter(outputStream);
                    printWriter.write("你好客户端，这是服务器端，感谢发来消息。");
                    printWriter.flush();

                    socket.shutdownOutput();


                    printWriter.close();
                    reader.close();
                    inputStream.close();
                    outputStream.close();
                } catch (Exception e) {
                    log.error("handler message error!", e);
                }
            }
        }
    }
}
