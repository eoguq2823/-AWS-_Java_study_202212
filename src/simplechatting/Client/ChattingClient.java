package simplechatting.Client;

import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ConnectException;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class ChattingClient extends JFrame {

	private Socket socket; //소켓 전역변수
	private String username;
	private JTextArea contenView;
	
	private JPanel contentPane;
	private JTextField ipInput;
	private JTextField portInput;
	private final JScrollPane contentScroll = new JScrollPane();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChattingClient frame = new ChattingClient();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ChattingClient() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 783, 520);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ipInput = new JTextField();
		ipInput.setBounds(461, 11, 116, 21);
		contentPane.add(ipInput);
		ipInput.setColumns(10);
		
		portInput = new JTextField();
		portInput.setBounds(588, 11, 58, 21);
		contentPane.add(portInput);
		portInput.setColumns(10);
		
		JButton connectButton = new JButton("연결");
		connectButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String ip = null;
				int port = 0;
				
				ip = ipInput.getText(); //아이피인풋에서 가져옴
				port = Integer.parseInt(portInput.getText()); //getText를 인트값으로 형변환
				
				try {
					socket = new Socket(ip, port);//소켓생성 필수
					
					JOptionPane.showMessageDialog(null, 
							socket.getInetAddress() + "서버접속", 
							"접속성공", 
							JOptionPane.INFORMATION_MESSAGE);
					InputStream inputStream = socket.getInputStream();
					BufferedReader in = new BufferedReader(new InputStreamReader(inputStream));
					if(in.readLine().equals("join")) {
						username = JOptionPane.showInputDialog(null, "사용자이름을 입력하세요", JOptionPane.INFORMATION_MESSAGE);
						
						OutputStream outputStream = socket.getOutputStream();
						PrintWriter out = new PrintWriter(outputStream, true);
						
						out.println(username + "님이 접속하였습니다.");
						
						String welcomeMessge =  in.readLine();
						contenView.append(welcomeMessge);
					}
					
				} catch (UnknownHostException e1) {
					
					JOptionPane.showMessageDialog(null, 
							"서버접속 실패", 
							"접속실패", 
							JOptionPane.ERROR_MESSAGE);
					
				} catch (ConnectException e1) {
					
					JOptionPane.showMessageDialog(null, 
							"서버접속 실패", 
							"접속실패", 
							JOptionPane.ERROR_MESSAGE);
					
				}catch (IOException e1) {
					e1.printStackTrace();
				} 
			}
		});
		connectButton.setBounds(658, 10, 97, 23);
		contentPane.add(connectButton);
		contentScroll.setBounds(12, 10, 357, 404);
		contentPane.add(contentScroll);
		
		contenView = new JTextArea();
		contentScroll.setViewportView(contenView);
		
		JScrollPane userListScroll = new JScrollPane();
		userListScroll.setBounds(380, 42, 375, 372);
		contentPane.add(userListScroll);
		
		JList userList = new JList();
		userListScroll.setViewportView(userList);
		
		JScrollPane massageScroll = new JScrollPane();
		massageScroll.setBounds(12, 427, 669, 44);
		contentPane.add(massageScroll);
		
		JTextArea massageInput = new JTextArea();
		massageScroll.setViewportView(massageInput);
		
		JButton sendButton = new JButton("전송");
		sendButton.setBounds(693, 427, 62, 44);
		contentPane.add(sendButton);
	}
}
