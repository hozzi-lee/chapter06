package echo.ex01;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Client {
	public static void main(String[] args) throws IOException {

		// create Socket instance
		Socket socket = new Socket();

		System.out.println("=== CLIENT START ===");
		System.out.println("[Request ... a connection to the server ...]");
//		System.out.println("... ... ... ... ...");
		System.out.println();

		socket.connect( new InetSocketAddress( "192.168.35.135", 10001 ) );
		System.out.println("[Connected to server]");

		socket.close();
	}

}
