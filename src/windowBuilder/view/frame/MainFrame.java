package windowBuilder.view.frame;

import javax.swing.JFrame;

import windowBuilder.view.panel.MainPanel;


public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(700, 300, 600, 500); //  x y 가로 세로
		
		MainPanel mainPanel = MainPanel.getInstance();
		mainPanel.init(); 
		setContentPane(mainPanel);
	}
}
