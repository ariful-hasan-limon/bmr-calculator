import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class BMI extends JFrame implements ActionListener {
	JTextField txt1,txt2,txt3,txt4;
	JButton btn1;
	JLabel jlb1,jlb2,jlb3,jlb4;
	
	public BMI(){
		this.setSize(400, 550);
		this.setLocation(300, 50);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.initialize();
		this.setFrameLayout();
		this.setTitle("BMI");
		this.addbuttonlis();
	}
	public void initialize(){
		
		txt1=new JTextField("");
		txt2=new JTextField("");
		txt3=new JTextField("");
		txt4=new JTextField("");
		
		btn1=new JButton("CALCULATE");
		
		jlb1=new JLabel("Enter Your weight");
		jlb2=new JLabel("Enter Your height");
		jlb3=new JLabel("YOUR  BMI IS");
		jlb4=new JLabel("Comment");
		
		
		this.add(btn1);
		
		this.add(txt1);
		this.add(txt2);
		this.add(txt3);
		this.add(txt4);
		
		this.add(jlb1);
		this.add(jlb2);
		this.add(jlb3);
		this.add(jlb4);
		
		
		this.jlb1.setBounds(100, 40, 160, 35);
		this.txt1.setBounds(100, 80, 160, 35);
		
		this.jlb2.setBounds(100, 120, 160, 35);
		this.txt2.setBounds(100, 160, 160, 35);
		
		this.btn1.setBounds(100, 220, 160, 40);
		
		this.jlb3.setBounds(100, 270, 260, 35);
		this.txt3.setBounds(100, 310, 160, 35);
		
		this.jlb4.setBounds(100, 360, 260, 35);
		
		this.txt4.setBounds(20, 410, 360, 70);
		
		
	}
	public void setFrameLayout(){
		this.setLayout(null);
	}

	public void addbuttonlis(){
		BMIlis lis=new BMIlis(this);
		
		this.btn1.addActionListener(lis);
	}
	@Override
	public void actionPerformed(ActionEvent e) {


		
	}

}
