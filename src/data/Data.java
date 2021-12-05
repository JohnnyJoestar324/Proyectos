package data;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import presentation.PrincipalFrame;
public class Data extends PrincipalFrame{

	private static final long serialVersionUID = 1L;
	
	private Label lab1;
	private Label lab2;
	private Label lab3;
	private	TextField t1;
	private TextField t2;
	private TextField t3;
	private Checkbox ch1;
	private Checkbox ch2;
	private Checkbox ch3;
	private Checkbox ch4;
	private Button button1;
	private Button button2;
	private CheckboxGroup group1;
	
	
	public Data(Frame JFrame) {
		super(JFrame);
		 Elements();
		
	}
	
	public void Elements() {
		setLayout(null);
		lab1 = new Label("Número 1");lab1.setBounds(20, 50, 100, 32);add(lab1);
		t1 = new TextField("");t1.setBounds(122, 50, 250, 32);add(t1);
		lab2 = new Label("Numero 2");lab2.setBounds(20,84,100,32);add(lab2);
		t2 = new TextField("");t2.setBounds(122,84,250,32);add(t2);
		lab3 = new Label("Resultado");lab3.setBounds(20, 118, 100, 32);add(lab3);
		t3 = new TextField("");t3.setBounds(122, 118, 250, 32);
		t3.setEnabled(false);add(t3);
		
		
		group1 = new CheckboxGroup();
		ch1 = new Checkbox("Suma", group1, false);ch1.setBounds(380, 50,100, 24);add(ch1);
		ch2 = new Checkbox("Resta", group1, false);ch2.setBounds(380, 75, 100, 24);add(ch2);
		ch3= new Checkbox("Multiplicación", group1, false);ch3.setBounds(380, 100, 100, 24);add(ch3);
		ch4 = new Checkbox("División", group1, false);ch4.setBounds(380, 125,100,24);add(ch4);
		
		button1 = new Button("borrar");button1.setBounds(20, 175, 100, 32);add(button1);
		button2 = new Button("Calcular");button2.setBounds(370, 175, 100, 32);add(button2);
		
		
		
			button1.addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent e) {
					t1.setText("");
					t2.setText("");
					t3.setText("");
				}
			
		});
		
		
		ch1.addMouseListener(new MouseAdapter() {
			public void mousePressed (MouseEvent a) {
				button2.addMouseListener(new MouseAdapter() {
					public void mousePressed(MouseEvent e) {
						double op1 = Double.parseDouble(t1.getText());
						double op2 = Double.parseDouble(t2.getText());
						double result = op1 + op2;
						t3.setText(String.valueOf(result));
					}
					
				});
			}
		});
		
		ch2.addMouseListener(new MouseAdapter() {
			public void mousePressed (MouseEvent a) {
				button2.addMouseListener(new MouseAdapter() {
					public void mousePressed(MouseEvent e) {
						double op1 = Double.parseDouble(t1.getText());
						double op2 = Double.parseDouble(t2.getText());
						double result = op1 - op2;
						t3.setText(String.valueOf(result));
					}
					
				});
			}
		});
		
		ch3.addMouseListener(new MouseAdapter() {
			public void mousePressed (MouseEvent a) {
				button2.addMouseListener(new MouseAdapter() {
					public void mousePressed(MouseEvent e) {
						double op1 = Double.parseDouble(t1.getText());
						double op2 = Double.parseDouble(t2.getText());
						double result = op1 * op2;
						t3.setText(String.valueOf(result));
					}
					
				});
			}
		});
		
		ch4.addMouseListener(new MouseAdapter() {
			public void mousePressed (MouseEvent a) {
				button2.addMouseListener(new MouseAdapter() {
					public void mousePressed(MouseEvent e) {
						double op1 = Double.parseDouble(t1.getText());
						double op2 = Double.parseDouble(t2.getText());
						double result = op1 / op2;
						t3.setText(String.valueOf(result));
					}
					
				});
			}
		});
		
	
		
		
		setTitle("Operaciones de Matemática");
		setSize(500,250);
		
		
	}
	
	
	
	
	

	
	

}
