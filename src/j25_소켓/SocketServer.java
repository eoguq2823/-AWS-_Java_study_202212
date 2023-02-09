package j25_소켓;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class SocketServer {
	
	public static final int PORT = 9090;
	
	public static void main(String[] args) {
		List<Socket> clients = new ArrayList<>();
		
		//가정먼저 해야할것
		try {
			ServerSocket serverSocket = new ServerSocket(PORT);
			while(true) { // 서버는 계속 열려있어야 하기때문에 무한루프 while문을 써야한다.
			System.out.println("클라이언트의 접속을 기다리는 중입니다.");
			Socket socket = serverSocket.accept(); //클라이언트의 접속을 기다리는것 접속을 받아야지만 accept가 넘어간다.
			clients.add(socket);
			System.out.println("클라이언트가 연결되었습니다.");
			System.out.println(clients);
			OutputStream outputStream = socket.getOutputStream(); //OutputSTream
			PrintWriter out = new PrintWriter(outputStream, true); //PrintWriter프린트라는것들이 들어있다 / 문자열을 전송할때 사용한다.
			out.println("___서버에 접속한 것을 환영합니다.");
			}
			
		} catch (IOException e) { // IOException 필수
			e.printStackTrace();
		}
			
	}
}
