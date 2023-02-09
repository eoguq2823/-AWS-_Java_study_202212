package j25_소켓.multiSocket.Client;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class clientSend extends Thread {

	private final Socket socket;
	
	
	@Override
	public void run() {
		try {
			OutputStream outputStream = socket.getOutputStream();
			PrintWriter writer = new PrintWriter(outputStream, true);
			Scanner scanner = new Scanner(System.in);
			
			while(true) {
					writer.println(scanner.nextLine());
				}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
