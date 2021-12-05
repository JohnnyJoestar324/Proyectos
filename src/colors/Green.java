package colors;

import java.awt.Color;
import java.awt.Frame;

import presentation.PrincipalFrame;

public class Green extends PrincipalFrame {

	public Green(Frame JFrame) {
		super(JFrame);
		Elements();
		
	}
		public void Elements() {
			setBackground(Color.green);
			setSize(300,300);
		}
	
}
