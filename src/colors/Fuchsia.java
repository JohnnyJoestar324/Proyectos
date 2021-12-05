package colors;

import java.awt.Color;
import java.awt.Frame;

import presentation.PrincipalFrame;

public class Fuchsia extends PrincipalFrame {

	public Fuchsia(Frame JFrame) {
		super(JFrame);
		Elements();
	}
	
	public void Elements() {
		
		Color fucsia = new Color(250,0,255);
		setBackground(fucsia);
		setSize(300,300);
	}
	

}
