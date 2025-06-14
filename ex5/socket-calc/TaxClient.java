// TaxClient.java (Sender)

import java.net.*;
import java.io.*;

public class TaxClient {
    public static void main(String[] args) {
        int[] prices = { 100, 200, 300, 400, 500 };

        try {
            Socket socket = new Socket(args[0], 1100);
            System.out.println("Connect:" + socket.getInetAddress() + ":" + socket.getPort() +
                    "\nFrom   :" + socket.getLocalAddress() + ":" + socket.getLocalPort());

            OutputStream os = socket.getOutputStream();
            PrintWriter pw = new PrintWriter(os);

            for (int price : prices) {
                Thread.sleep((int) (Math.random() * 1000));

                pw.println(price);
                pw.flush();

                System.out.println("送信: " + price + "円");
            }

            socket.close();
            System.out.println("通信終了");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
