import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;




public class BMR extends JFrame implements ActionListener{
	JTextField age,weight,height,result,type,result2;
	JButton male,female,total;
	JLabel jlb1,jlb2,jlb3,jlb4,jlb5,jlb6,jlb7,jlb8,jlb9,jlb10,jlb11,jlb12;
public BMR(){
		
		this.setSize(1000,600);
		this.setLocation(150,50);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.initialize();
		this.addcomp();
		this.setMyFameLayout();
		this.addcompToFrameNoLayout();
		this.addButtonLis();
		this.setTitle("BMR");
		
		
		
	}
public void initialize(){
	jlb1=new JLabel("BMR(Basic Metabolic Rate) CALCULATOR");
	jlb2=new JLabel("Enter Your Weight (kg)");
	jlb3=new JLabel("Enter your Height (foot)");
	jlb4=new JLabel("Enter your age");
	jlb5=new JLabel("Your BMR is (calories)");
	
	jlb6=new JLabel("# Select one from below");
	jlb7=new JLabel("1.If you Not working type  1.2");
	jlb8=new JLabel("3.If you Light working Playing 2-3 days in a week type 1.375");
	jlb9=new JLabel("3.If you Working, sufficient playing 2-3 days in a week type 1.55");
	jlb10=new JLabel("4.If you Working, playing everyday in a week  type 1.725");
	jlb11=new JLabel("5.If you Hard working, sufficient jumping, running and playing type 1.9");
	jlb12=new JLabel("Your Total Calories Demand");
	

	
	
	age=new JTextField("");
	weight=new JTextField("");
	height=new JTextField("");
	result=new JTextField("");
	type=new JTextField("");
	result2=new JTextField("");
	
	male=new JButton("Male");
	female=new JButton("FeMale");
	
	
}
public void addcomp(){
	this.add(this.jlb1);
	this.add(this.jlb2);
	this.add(this.jlb3);
	this.add(this.jlb4);
	this.add(this.jlb5);
	
	this.add(this.jlb6);
	this.add(this.jlb7);
	this.add(this.jlb8);
	this.add(this.jlb9);
	this.add(this.jlb10);
	this.add(this.jlb11);
	this.add(this.jlb12);
	
	
	this.add(this.age);
	this.add(this.height);
	this.add(this.weight);
	this.add(this.result);
	this.add(this.type);
	this.add(this.result2);
	
	this.add(this.male);
	this.add(this.female);
	
	
}
public void addcompToFrameNoLayout(){
	this.jlb1.setBounds(100, 40, 300, 10);
	this.jlb2.setBounds(100, 70, 400, 40);
	this.jlb3.setBounds(100,150, 300, 40);
	this.jlb4.setBounds(100, 230, 400, 40);
	this.jlb5.setBounds(100, 380, 400, 40);
	
	this.jlb6.setBounds(500, 40, 300, 10);
	this.jlb7.setBounds(500, 70, 300, 15);
	this.jlb8.setBounds(500, 110, 400, 15);
	this.jlb9.setBounds(500, 150, 400, 15);
	this.jlb10.setBounds(500, 200, 400, 15);
	this.jlb11.setBounds(500, 250, 400, 15);
	this.jlb12.setBounds(500, 370, 400, 15);
	
	
	
	this.weight.setBounds(100, 110, 200, 40);
	this.height.setBounds(100, 190, 200, 40);
	this.age.setBounds(100, 270, 200, 40);
	this.result.setBounds(100, 420, 200, 40);
	this.type.setBounds(500,300,100,40);
	this.result2.setBounds(500,420,200,40);
	
	this.male.setBounds(100, 330, 90, 50);
	this.female.setBounds(250, 330, 90, 50);
	
	
}
private void setMyFameLayout() {

	
	this.setLayout(null);
	
}
public void addButtonLis(){
	
	BMRlis lis=new BMRlis(this);
	
	this.male.addActionListener(lis);
	this.female.addActionListener(lis);
	
}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}

}
