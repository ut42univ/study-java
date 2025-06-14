import java.net.*;
import java.io.*;

public class NetTest {
    static public void main(String args[]) {
        try {
            ServerSocket ss = new ServerSocket(1100);
            System.out.println("Waiting for Connection!  " + InetAddress.getLocalHost());
            Socket sock = ss.accept();
            System.out.println("Connect:" + sock.getInetAddress() + ":" + sock.getPort() +
                    "\nFrom   :" + sock.getLocalAddress() + ":" + sock.getLocalPort());

            BufferedReader in = new BufferedReader(new InputStreamReader(sock.getInputStream()));

            String clientInput;
            while ((clientInput = in.readLine()) != null) {
                System.out.println("received: " + clientInput);
            }
            sock.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}