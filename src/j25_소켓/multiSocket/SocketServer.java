package j25_소켓.multiSocket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

//클라이언트					  쓰래드
public class SocketServer extends Thread {

	public static List<SocketServer> clientList = new ArrayList<>();
	private  Socket socket;
	private InputStream inputStream;
	private OutputStream outputStream;
	
	private static int autoIncrement = 1;
	private String name;
	
	//해당 클라이언트랑만 소통한다.
	public SocketServer(Socket socket) {
		this.socket = socket;
		name = "user" + autoIncrement++;
		clientList.add(this);
	}
	
	@Override
	public void run() {
		System.out.println("[연결된 클라이언트 정보]");
		System.out.println("IP: " + socket.getInetAddress()); //실제 클라이언트의 iP주소를 가져다 준다.
		
		try {
			inputStream = socket.getInputStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
			
			//브로드 캐스팅 (모든 클라이언트들한테 동시에 데이터를쏴줄때 사용한다)
			sendToAll(name + "님이 접속하였습니다.");
			
			while(true) {
				// 메세지가 들어 올때 까지 대기
				String message = reader.readLine();
				if(message == null) {
					break;
				}
				 sendToAll(message);
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		
		} finally {
			try {
				inputStream.close();
				outputStream.close();
				socket.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	//메세지를 받고 소캣서버를 하나꺼낸다 클라이언트리스트에서 
	//첫번째 담당자를 불러서 아웃풋준비하라고한다(클라이언트한테)
	private void sendToAll(String message) throws IOException {
		for(SocketServer socketServer : clientList) {
			outputStream = socketServer.socket.getOutputStream();
			PrintWriter writer = new PrintWriter(outputStream, true);
			//name = 자기자신
			writer.println(name + ": " + message);
		}
	}
}
