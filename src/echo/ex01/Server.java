package echo.ex01;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) throws IOException {

		// create ServerSocket instance
		ServerSocket serverSocket = new ServerSocket();

		// ServerSocket bind
		serverSocket.bind( new InetSocketAddress( "192.168.35.135", 10001 ) ); // ip, port

		System.out.println("=== SERVER START ===");
		System.out.println("[Waiting ... for a connection ...]");
//		System.out.println("... ... ... ... ...");
		System.out.println();

		Socket socket = serverSocket.accept();
		System.out.println("[The client has been connected]");

		serverSocket.close();

	}
}
