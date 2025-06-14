import java.net.*;
import java.io.*;

class receiveThread extends Thread {
    private Socket sock;

    public receiveThread(Socket sock) {
        this.sock = sock;
    }

    public void run() {
        try {
            InputStream is = sock.getInputStream();
            int i;
            while ((i = is.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

public class NetClient {
    static public void main(String args[]) {
        try {
            Socket sock = new Socket(args[0], 1100);
            System.out.println("Connect:" + sock.getInetAddress() + ":" + sock.getPort() +
                    "\nFrom   :" + sock.getLocalAddress() + ":" + sock.getLocalPort());

            // 受信用スレッド
            receiveThread receiveThread = new receiveThread(sock);
            receiveThread.start();

            // 送信処理
            BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter out = new PrintWriter(sock.getOutputStream(), true);

            String userInput;
            while ((userInput = keyboard.readLine()) != null) {
                if (userInput.isEmpty()) {
                    break;
                } else {
                    out.println(userInput);
                }
            }

            sock.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}