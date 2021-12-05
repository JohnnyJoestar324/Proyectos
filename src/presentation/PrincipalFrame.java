package presentation;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import presentation.Inter.DataInterface;

public class PrincipalFrame extends Frame implements DataInterface {
	
		Frame JFrame;
	public PrincipalFrame(Frame JFrame) {
		this.JFrame = JFrame;
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				if(JFrame!=null) {
					JFrame.setVisible(true);
				}
				dispose();
			}
		});
	}

	@Override
	public void Elements() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Execution() {
		if(JFrame!=null) {
				JFrame.setVisible(false);
		setVisible(true);
		setLocationRelativeTo(null);
		toFront();
			
		}
		
	}

}
