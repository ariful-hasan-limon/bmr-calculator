import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;


public class BMIlis implements ActionListener{
	BMI bmi;
	
	public BMIlis(){
		
	}
	public BMIlis(BMI bm){
		this.bmi=bm;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj=e.getSource();
		JButton source=(JButton)obj;
		if(source.equals(this.bmi.btn1)){
			String weight=this.bmi.txt1.getText();
			String height=this.bmi.txt2.getText();
			
			double a,b,c;
			a=Double.valueOf(weight);
			b=Double.valueOf(height);
			
			c=(a/((b*0.3048)*(b*0.3048)));
			this.bmi.txt3.setText(String.valueOf(c));
			
			if(c<18.5){
				String ab=" you have to increase body weight by taking adequate food";
				this.bmi.txt4.setText(ab);
			
			}
			else if(c>=18.5 & c<=24.9){
				String ab="Ideal scale for good health";
				this.bmi.txt4.setText(ab);
				
			}
			else if(c>=25 &c<= 29.9){
				String ab="Your weight is over necessary to decrease body weight by physical exercise";
				
				this.bmi.txt4.setText(ab);
				
			}
			else if(c>=30 & c<= 34.9){
				String ab="First step of obesity. Physical work and selection of food is necessary";
				
				this.bmi.txt4.setText(ab);
				
			}
			else if(c>=35 & c<=39.9){
				String ab="Second stage of obesity. Balanced diet  and physical exercise is necessary";
				
				this.bmi.txt4.setText(ab);
				
			}
			else if(c>=40){
				String ab="The extreme stage of obesity, Possibility of death risk, doctor’s advice is necessary";
				this.bmi.txt4.setText(ab);
				
			}
		}
		
		
	}

}
