package cn.joinhealth.socket;

import java.io.*;
import java.net.Socket;

/**
 * @author linjian
 * @date 2022/9/14 13:52
 */
public class SocketClient {

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 8888);
        InputStream input = socket.getInputStream();
        OutputStream out = socket.getOutputStream();
        String str = "MSH|^~\\&|HIS||EAI||20150921141824||MFN^M01|47385790|P|2.4|||AL|AL|CHN" +
                "\rMFI|Employee^人员^HIS||UPD|20150921141824|20150921141824|AL" +
                "\rMFE|MUP|||002670|CE" +
                "\rZ02|002670|杨美|F|20150921125851|40|11||362203199010042621|1087^B4(西)小儿外科|1080|N|0|1|0|YM|SU|001248|20150921141824|18758228888|222@163.com";
        out.write(str.getBytes("UTF-8"));
        out.flush();

        BufferedReader reader = new BufferedReader(new InputStreamReader(input));
        char[] aa = new char[2048];
        int i = reader.read(aa);
        String ret = new String(aa, 0, i);
        System.out.println("服务器端返回过来的是: " + ret);
        out.close();
    }
}
