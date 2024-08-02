package eventHandling;

import java.awt.*;
import java.awt.event.*;

public class airthmeticOperation  {
	TextField one;
	TextField two;
	Label output;
	
	public airthmeticOperation(){
		Frame f =new Frame("Calculation of two numbers ");
		f.setSize(500,500);
		
		Label lone=new Label();
		lone.setText("Number1:");
		lone.setBounds(40,40,100,30);
		
		Label ltwo=new Label("Number2:");
		 ltwo.setBounds(40,80,100,50);
		 
		one=new TextField();
		two=new TextField();
		one.setBounds(190,40,200,30); 
        two.setBounds(190,80,200,30);
		

		
		output=new Label();
		output.setBounds(150,300,200,100); 

		
		f.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e ) {
				   calculateSum();
			}
		
		
			public void mouseReleased(MouseEvent e ) {
				   calculateDifference();
			}
		});		
		
		
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				f.dispose();
			}
		});
		
		f.add(lone);
		f.add(one);
		f.add(ltwo);
		f.add(two);
		f.add(output);
		
		f.setLayout(null);
		f.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		airthmeticOperation a=new airthmeticOperation();
	}

	public void calculateSum() {
		  double num1 = Double.parseDouble(one.getText());
          double num2 = Double.parseDouble(two.getText());
          double sum=num1+num2;
          output.setText("Sum:" +sum);
		
	}
	
	public void calculateDifference() {
		double num1 = Double.parseDouble(one.getText());
        double num2 = Double.parseDouble(two.getText());
        double diff=num1-num2;
        output.setText("Difference:" +diff);
		
	}

}
