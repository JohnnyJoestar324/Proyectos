package colors;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

import presentation.PrincipalFrame;

public class Bluee_and_White extends PrincipalFrame {
	Panel p = new Panel();
	public Bluee_and_White(Frame JFrame) {
		super(JFrame);
		Elements();
	}
	
	public void Elements() {
		setLayout(null);
		setSize(300,300);
		setResizable(false);
		p.setLayout(null);
		p.setBounds(0,0,150,300);
		p.setBackground(Color.blue);
		add(p);
		
		
	}

}
