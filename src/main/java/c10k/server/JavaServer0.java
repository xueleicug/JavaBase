package c10k.server;


import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class JavaServer0 {

    public static void main(String[] args) {
        ServerSocket serverSokcet = null;
        try {
            serverSokcet = new ServerSocket(9999);
            serverSokcet.setReceiveBufferSize(Integer.MAX_VALUE);
            System.out.println("Listening 9999:");
            // 实现最基本的并发
            while(true) {
                final Socket socket = serverSokcet.accept();
                Thread thread = new Thread() {
                    @Override
                    public void run() {
                        Handler.process(socket);
                    }
                };
                thread.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
