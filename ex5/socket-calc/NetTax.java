// NetTax.java (Receiver)

import java.net.*;
import java.io.*;

public class NetTax {
	static public void main(String args[]) {
		double taxRate = 0.05;

		try {
			ServerSocket ss = new ServerSocket(1100);
			System.out.println("Waiting for Connection!  " + InetAddress.getLocalHost());

			Socket sock = ss.accept();
			System.out.println("Connect:" + sock.getInetAddress() + ":" + sock.getPort() +
					"\nFrom   :" + sock.getLocalAddress() + ":" + sock.getLocalPort());

			InputStream is = sock.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader in = new BufferedReader(isr);
			String input;
			while ((input = in.readLine()) != null) {
				int price = Integer.parseInt(input);
				System.out.println("受信: " + price + "円");

				double resultPrice = price * (1 + taxRate);
				System.out.println("計算結果: " + resultPrice + "円（5%税込み）");
			}

			sock.close();
			ss.close();
			System.out.println("通信終了");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}