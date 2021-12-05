package colors;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowListener;

import presentation.PrincipalFrame;
public class Blue extends PrincipalFrame{

	public Blue(Frame JFrame) {
		super(JFrame);
		Elements();
	}
	
	public void Elements() {
		setBackground(Color.blue);
		setSize(300,300);
		
	}
	

}
