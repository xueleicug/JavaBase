package c10k.server;

import java.io.IOException;
import java.net.Socket;

public class C10KClient {

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 50000; ++i) {
            Socket socket = null;
            try {
                socket = new Socket("localhost", 9999);
                socket.setSendBufferSize(Integer.MAX_VALUE);
                socket.setReceiveBufferSize(Integer.MAX_VALUE);
                System.out.println(i + 1);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(999999999L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
