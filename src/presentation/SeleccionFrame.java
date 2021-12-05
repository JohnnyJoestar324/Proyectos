package presentation;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import colors.Blue;
import colors.Bluee_and_White;
import colors.Fuchsia;
import colors.Green;
import data.Data;

import java.awt.event.MouseListener;

import presentation.Inter.DataInterface;

public class SeleccionFrame extends Frame implements DataInterface {
	
	private Button button1, button2,button3,button4,button5;
	private Frame Fr;
		
		public SeleccionFrame(){
			Elements();
			Fr = this;
	}

	@Override
	public void Elements() {
		setLayout(null);
		button1 = new Button("Azul");button1.setBounds(80, 50, 100, 31);add(button1);
		button2 = new Button("Azul y blanco");button2.setBounds(200,50,100,31);add(button2);
		button3 = new Button("Verde");button3.setBounds(80,100,100,31);add(button3);
		button4 = new Button("Fuchsia");button4.setBounds(200,100,100,31);add(button4);
		button5 = new Button("Cálculos");button5.setBounds(150,160,100,31);add(button5);

		setSize(400,250);
		this.setResizable(false);
		
		addWindowListener (new WindowAdapter() {
		public void windowClosing (WindowEvent a) { 
			System.exit(0);
			}
			
		});
		
		button1.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent a) {	

			Blue b = new Blue(Fr);
			b.setVisible(true);
		
			}
		});
		
		button2.addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent a) {
				Bluee_and_White w = new Bluee_and_White(Fr);
				w.setVisible(true);
			}
			
		});
		
		button3.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent a) {
				Green g = new Green(Fr);
				g.setVisible(true);
			}
		});
		
		button4.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent a) {
				Fuchsia f = new Fuchsia(Fr);
				f.setVisible(true);
			}
		});
		
		button5.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent a) {
			
				Data d = new Data(Fr);
				d.setVisible(true);
				
				
			}
			
		}); 
		
		
	}

	@Override
	public void Execution() {
		setVisible(true);
		setLocationRelativeTo(null);
		toFront();

	}

}
