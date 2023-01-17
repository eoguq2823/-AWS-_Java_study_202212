package usermanagement.frame;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class UserManagementFrame extends JFrame {
	
	private CardLayout mainCard;
	private JPanel mainPanel;
	private JTextField usernameField;
	private JPasswordField passwordField;
	private JTextField RegisterUsernameField;
	private JPasswordField RegisterPasswordField;
	private JTextField RegisterNameField;
	private JTextField RegisterEmailField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserManagementFrame frame = new UserManagementFrame();
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
	public UserManagementFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 500);
		mainPanel = new JPanel();
		mainPanel.setBackground(new Color(255, 255, 255));
		mainPanel.setBorder(null);

		setContentPane(mainPanel);
		mainCard = new CardLayout();
		mainPanel.setLayout(mainCard);
		
		JPanel loginPanel = new JPanel();
		loginPanel.setBackground(new Color(255, 0, 0));
 		
		mainPanel.add(loginPanel, "loginPanel");
		loginPanel.setLayout(null);
		
		JLabel logoText = new JLabel("UserManagement");
		logoText.setFont(new Font("휴먼아미체", Font.BOLD, 50));
		logoText.setHorizontalAlignment(SwingConstants.CENTER);
		logoText.setBounds(12, 10, 360, 61);
		loginPanel.add(logoText);
		
		JLabel loginText = new JLabel("Login");
		loginText.setFont(new Font("굴림", Font.PLAIN, 40));
		loginText.setHorizontalAlignment(SwingConstants.CENTER);
		loginText.setBounds(12, 59, 360, 47);
		loginPanel.add(loginText);
		
		usernameField = new JTextField();
		usernameField.setBounds(83, 309, 158, 21);
		loginPanel.add(usernameField);
		usernameField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(83, 341, 158, 21);
		loginPanel.add(passwordField);
		
		JButton loginButton = new JButton("Login");
		loginButton.setBackground(new Color(255, 153, 255));
		loginButton.setFont(new Font("굴림", Font.PLAIN, 14));
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		loginButton.setBounds(253, 309, 70, 53);
		loginPanel.add(loginButton);
		
		JLabel usernameLabel = new JLabel("Username  or  email");
		usernameLabel.setFont(new Font("HY견고딕", Font.PLAIN, 10));
		usernameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		usernameLabel.setBounds(83, 297, 158, 15);
		loginPanel.add(usernameLabel);
		
		JLabel passwordLabel = new JLabel("password");
		passwordLabel.setHorizontalAlignment(SwingConstants.CENTER);
		passwordLabel.setFont(new Font("HY견고딕", Font.PLAIN, 10));
		passwordLabel.setBounds(83, 329, 158, 15);
		loginPanel.add(passwordLabel);
		
		JLabel signupDesc = new JLabel("Don't hava an account?");
		signupDesc.setFont(new Font("굴림체", Font.PLAIN, 12));
		signupDesc.setBackground(new Color(255, 255, 255));
		signupDesc.setHorizontalAlignment(SwingConstants.CENTER);
		signupDesc.setBounds(83, 368, 158, 21);
		loginPanel.add(signupDesc);
		
		JLabel signupLink = new JLabel("sign up");
		signupLink.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mainCard.show(mainPanel, "registerPanel");
			}
		});
		signupLink.setHorizontalAlignment(SwingConstants.CENTER);
		signupLink.setForeground(new Color(0, 0, 255));
		signupLink.setBounds(137, 388, 57, 15);
		loginPanel.add(signupLink);
		
		JLabel forgotPasswordLink = new JLabel("for get you'r password?");
		forgotPasswordLink.setForeground(new Color(0, 0, 255));
		forgotPasswordLink.setHorizontalAlignment(SwingConstants.CENTER);
		forgotPasswordLink.setBounds(93, 408, 148, 15);
		loginPanel.add(forgotPasswordLink);
		
		JPanel registerPanel = new JPanel();
		registerPanel.setBackground(new Color(255, 102, 0));
		mainPanel.add(registerPanel, "registerPanel");
		registerPanel.setLayout(null);
		
		JLabel signinLink = new JLabel("sign in");
		signinLink.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mainCard.show(mainPanel, "loginPanel");
			}
		});
		signinLink.setHorizontalAlignment(SwingConstants.CENTER);
		signinLink.setFont(new Font("굴림체", Font.PLAIN, 12));
		signinLink.setForeground(new Color(0, 0, 255));
		signinLink.setBounds(125, 400, 110, 23);
		registerPanel.add(signinLink);
		loginText.setBounds(12, 61, 360, 47);
		
		JLabel RegisterLogo = new JLabel("Register");
		RegisterLogo.setHorizontalAlignment(SwingConstants.CENTER);
		RegisterLogo.setFont(new Font("굴림", Font.PLAIN, 40));
		RegisterLogo.setBounds(12, 61, 360, 47);
		registerPanel.add(RegisterLogo);
		
		JLabel RegisterLogoText = new JLabel("UserManagement");
		RegisterLogoText.setHorizontalAlignment(SwingConstants.CENTER);
		RegisterLogoText.setFont(new Font("휴먼아미체", Font.BOLD, 50));
		RegisterLogoText.setBounds(12, 10, 360, 61);
		registerPanel.add(RegisterLogoText);
		
		RegisterUsernameField = new JTextField();
		RegisterUsernameField.setColumns(10);
		RegisterUsernameField.setBounds(105, 130, 158, 21);
		registerPanel.add(RegisterUsernameField);
		
		RegisterPasswordField = new JPasswordField();
		RegisterPasswordField.setBounds(105, 162, 158, 21);
		registerPanel.add(RegisterPasswordField);
		
		JLabel RegisterUsernameLabel = new JLabel("Username ");
		RegisterUsernameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		RegisterUsernameLabel.setFont(new Font("HY견고딕", Font.PLAIN, 10));
		RegisterUsernameLabel.setBounds(105, 118, 158, 15);
		registerPanel.add(RegisterUsernameLabel);
		
		JLabel RegisterPasswordLabel = new JLabel("password");
		RegisterPasswordLabel.setHorizontalAlignment(SwingConstants.CENTER);
		RegisterPasswordLabel.setFont(new Font("HY견고딕", Font.PLAIN, 10));
		RegisterPasswordLabel.setBounds(105, 150, 158, 15);
		registerPanel.add(RegisterPasswordLabel);
		
		RegisterNameField = new JTextField();
		RegisterNameField.setColumns(10);
		RegisterNameField.setBounds(105, 205, 158, 21);
		registerPanel.add(RegisterNameField);
		
		JLabel RegisterNameLabel = new JLabel("name");
		RegisterNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		RegisterNameLabel.setFont(new Font("HY견고딕", Font.PLAIN, 10));
		RegisterNameLabel.setBounds(105, 193, 158, 15);
		registerPanel.add(RegisterNameLabel);
		
		JLabel RegisterEmailLabel = new JLabel("email");
		RegisterEmailLabel.setHorizontalAlignment(SwingConstants.CENTER);
		RegisterEmailLabel.setFont(new Font("HY견고딕", Font.PLAIN, 10));
		RegisterEmailLabel.setBounds(105, 225, 158, 15);
		registerPanel.add(RegisterEmailLabel);
		
		RegisterEmailField = new JTextField();
		RegisterEmailField.setColumns(10);
		RegisterEmailField.setBounds(105, 236, 158, 21);
		registerPanel.add(RegisterEmailField);
		
		JButton registerButton = new JButton("Register");
		registerButton.setBounds(105, 267, 158, 23);
		registerPanel.add(registerButton);
		
		JCheckBox RegisterCheckBox = new JCheckBox("개인 약관 동의");
		RegisterCheckBox.setHorizontalAlignment(SwingConstants.CENTER);
		RegisterCheckBox.setBackground(new Color(255, 255, 255));
		RegisterCheckBox.setBounds(105, 296, 158, 23);
		registerPanel.add(RegisterCheckBox);
	}
}
