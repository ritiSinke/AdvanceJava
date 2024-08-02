package awtFolder;

import java.awt.BorderLayout;
import awtFolder.pizza;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;


public class pizaaFirst  extends Frame {  
	
	 TextArea descTxtArea;
	List<pizza> pizas = new ArrayList<>();

	pizaaFirst() {
       setTitle("Rocky Woodfired Pizzas Management System");
       setVisible(true);
       setSize(800, 800);
       setLayout(new BorderLayout());
       
       Label titleLbl = new Label("Rocky Wood Pizzas Maangement System");
       Panel firstPanel = new Panel(new FlowLayout(FlowLayout.CENTER, 10, 10));
       Panel secondPanel = new Panel(new FlowLayout(FlowLayout.CENTER, 10, 10));
       Panel thirdPanel = new Panel(new FlowLayout(FlowLayout.CENTER, 10, 10));
       Panel lastPanel = new Panel(new FlowLayout(FlowLayout.CENTER, 10, 10));
       
       Panel gridPanel = new Panel(new GridLayout(3, 1));
       
       Font font = titleLbl.getFont();
       titleLbl.setFont(new Font(null, Font.BOLD, 18));
       firstPanel.add(titleLbl);
       
       Label namelbl = new Label("Customer Name");
       TextField name = new TextField();
       name.setPreferredSize(new Dimension(300, 20));
       
       secondPanel.add(namelbl);
       secondPanel.add(name);
       
       Label toppingsLbl = new Label("Number of Toppings");
       TextField toppingsTxt = new TextField();
       toppingsTxt.setPreferredSize(new Dimension(300, 20));
       
       CheckboxGroup chkgrp = new CheckboxGroup();
       Checkbox smallChk = new Checkbox("Small", chkgrp, false);
       Checkbox mediumChk = new Checkbox("Medium", chkgrp, false);
       Checkbox largeChk = new Checkbox("Large", chkgrp, false);
       
       thirdPanel.add(toppingsLbl);
       thirdPanel.add(toppingsTxt);
       thirdPanel.add(smallChk);
       thirdPanel.add(mediumChk);
       thirdPanel.add(largeChk);
       
       gridPanel.add(firstPanel);
       gridPanel.add(secondPanel);
       gridPanel.add(thirdPanel);
       
       
       TextArea descTxtArea = new TextArea();
       descTxtArea.setRows(5);
       
       Button enterBtn = new Button("Enter");
       Button displayAllBtn = new Button("Display All");
       Button searchBtn = new Button("Search");
       Button exitBtn = new Button("Exit");
       
       lastPanel.add(enterBtn);
       lastPanel.add(displayAllBtn);
       lastPanel.add(searchBtn);
       lastPanel.add(exitBtn);

       
       add(gridPanel, BorderLayout.NORTH);
       add(descTxtArea, BorderLayout.CENTER);
       add(lastPanel, BorderLayout.SOUTH);
       
       
       enterBtn.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
        	   
               String customerName = name.getText();

               int numberOfToppings = Integer.parseInt(toppingsTxt.getText());
            

               String size = chkgrp.getSelectedCheckbox() != null ? chkgrp.getSelectedCheckbox().getLabel() : null;
               if (size == null) {
                   descTxtArea.setText("Please select a size.");
                   return;
               }

               pizza pizaa = new pizza(customerName, numberOfToppings, size);
               pizas.add(pizaa);

               updateDisplay();
           }

	
       });
       
       addWindowListener(new WindowAdapter() {
           public void windowClosing(WindowEvent event) {
               dispose();
           }
       });
	}
   
	private void updateDisplay() {
	    StringBuilder displayText = new StringBuilder();
	    displayText.append(String.format("%-20s %-10s %-10s\n", "Customer Name", "Toppings", "Size"));
	    displayText.append("-------------------------------------------\n");
	    for (pizza pizza : pizas) {
	        displayText.append(pizza.toString()).append("\n");
	    }
	    descTxtArea.setText(displayText.toString());
	}

   
   public static void main(String args[]) {
	   pizaaFirst lab = new pizaaFirst();
   }
}


 


