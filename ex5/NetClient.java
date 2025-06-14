import java.net.*;
import java.io.*;

public class NetClient {
    static public void main(String args[]) {
        try {
            Socket sock = new Socket(args[0], 1100);
            System.out.println("Connect:" + sock.getInetAddress() + ":" + sock.getPort() +
                    "\nFrom   :" + sock.getLocalAddress() + ":" + sock.getLocalPort());

            InputStream is = sock.getInputStream();
            int i;
            while ((i = is.read()) != -1) {
                System.out.print((char) i);
            }
            sock.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}