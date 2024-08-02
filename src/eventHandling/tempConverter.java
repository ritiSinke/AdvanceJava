package eventHandling;

import java.awt.*;
import java.awt.event.*;

public class tempConverter {

	TextField celcius;
	TextField farenheit;
	
	public tempConverter() {
		Frame f =new Frame("Celcius to Frenheit Converter");
		f.setSize(300,300);
		GridLayout gl=new GridLayout(2,2);
		f.setLayout(gl);
		
		Label lcelcius=new Label("Celcius");
		
		celcius=new TextField();
		celcius.addKeyListener(new KeyAdapter() {
			public void keyReleased(KeyEvent e ) {
				double c=Double.parseDouble(celcius.getText());
				double f=(c *18/10) + 32;
				
				farenheit.setText(Double.toString(f));
			}
		});
		
		Label farenheitt=new Label("Farenheit");
		
		farenheit =new TextField();
		farenheit.setEditable(false);
		
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e ) {
				f.dispose();
			}
		});
		
		f.add(lcelcius);
		f.add(celcius);
		f.add(farenheitt);
		f.add(farenheit);
		
		f.setVisible(true);
		
		
		
	}
	
	public static void main(String[] args) {
		tempConverter t=new tempConverter();
	}
}
