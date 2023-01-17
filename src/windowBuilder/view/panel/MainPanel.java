package windowBuilder.view.panel;

import java.awt.CardLayout;

import javax.swing.JPanel;

import lombok.Data;

//메인 패널 안에서 화면이 전환되기 때문에 가장 중요하다.
//어떠한 객체에서든 전부다 접근이 가능하게 싱글톤으로 만들어야한다.

@Data
public class MainPanel extends InitPanel{

	private static final long serialVersionUID = 1L;
	private CardLayout mainCard;
	private static MainPanel instance;
	
	public static MainPanel getInstance() {
		if(instance == null) {
			instance = new MainPanel();
		}
		return instance;
	}
	
	private MainPanel() {
		mainCard = new CardLayout(); // 0,0안잡아줘도 0,0임
		setLayout(mainCard); //화면이 쌓인다 그 쌓인 화면 중에서 어떤패널을 위에 올릴거냐 , 생성후에 set (객체)사용
		
	}	
	
	public void init() {
		LoginPanel loginPanel = new LoginPanel();
		add(loginPanel, "loginPanel");
		
		RegisterPanel registerPanel = new RegisterPanel();
		add(registerPanel, "registerPanel");
	}

}
