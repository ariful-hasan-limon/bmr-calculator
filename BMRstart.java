
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;



public class BMRstart extends JFrame implements ActionListener {
	
	JButton btn1,btn2;
	
	public BMRstart(){
		this.setSize(300,300);
		this.setLocation(150,50);
	
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.init();
		this.setMyFameLayout();
		this.addButtonLis();
		this.setTitle("MAIN PAGE");
		
	
	

	
	
		
	}
	public void init(){
		
		btn1=new JButton("BMR");
		btn2=new JButton("BMI");
		
		
		this.add(this.btn1);
		this.add(this.btn2);
		this.btn1.setBounds(100, 50, 100, 50);
		this.btn2.setBounds(100, 150, 100, 50);
		
		
	}
	
	private void setMyFameLayout() {

		
		this.setLayout(null);
	}
	public void addButtonLis(){
	
		BMRstartLis lis=new BMRstartLis(this);
		
		this.btn1.addActionListener(lis);
		this.btn2.addActionListener(lis);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}

