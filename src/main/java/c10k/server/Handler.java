package c10k.server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Handler {

    public static void process(Socket socket) {
        try (InputStream in = socket.getInputStream();
             OutputStream out = socket.getOutputStream();){

            int ch;
            while((ch = in.read()) != -1) {
                if(Character.isAlphabetic(ch)) {
                    ch ^= ' ';
                }
                out.write(ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
