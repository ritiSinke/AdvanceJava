package mouseEvent;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;

public class Question1  implements MouseListener{
	Frame  f ;
	Label info;

	public Question1() {
	 f =new Frame("JavaMouseEvent Handling");
	f.setSize(200,200);
	 info=new Label("hello");
	 info.setBounds(40,40,100,20);
	 f.add(info);
	f.addMouseListener(this);
	f.setLayout(null);
	f.setVisible(true);
	
	f.addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent e ) {
			f.dispose();
		}
	});

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		Date d=new Date ();
		info.setText("Mouse Clicked:" +d );
	}






	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		info.setText("MousePressed");
	}



	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		info.setText("Mouse Released");
	}









	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		info.setText("Mouse Entered");
	}



	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		info.setText("Mouseexited");
	}




public static void main(String[] args ) {
	Question1 q=new Question1();
}
}

