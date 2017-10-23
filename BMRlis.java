import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;


public class BMRlis implements ActionListener {
	BMR bmr;
	public BMRlis(){
		
	}
	public BMRlis(BMR bm){
		this.bmr=bm;
	}
	
		
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj= e.getSource();
		
		JButton source = (JButton) obj;
		
		if(source.equals(this.bmr.male)){
			
			String weight = this.bmr.weight.getText();
			String height = this.bmr.height.getText();
			String age = this.bmr.age.getText();
			
			String typ=this.bmr.type.getText();
			
			double a,b,c,d,result,total;
			a=Double.valueOf(weight);
			b=Double.valueOf(height);
			c=Double.valueOf(age);
			
			d=Double.valueOf(typ);
			
			
			result=(66+(13.75*a)+(5*(b*30.48))-(6.8*c));
			total=(result*d);
			
			
			
			
			this.bmr.result.setText(String.valueOf(result));
			
			this.bmr.result2.setText(String.valueOf(total));
			
			
			
			
			
		}
		else if(source.equals(this.bmr.female)){
			String weight = this.bmr.weight.getText();
			String height = this.bmr.height.getText();
			String age = this.bmr.age.getText();
			
			String typ=this.bmr.type.getText();
			
			double a,b,c,d,result,total;
			a=Double.valueOf(weight);
			b=Double.valueOf(height);
			c=Double.valueOf(age);
			
			d=Double.valueOf(typ);
			
			result=(655+(9.6*a)+(1.8*(b*30.48))-(4.7*c));
			
			total=(result*d);
			
			this.bmr.result.setText(String.valueOf(result));
			
			this.bmr.result2.setText(String.valueOf(total));
			
		
		}
		
		
		
		
	}


}
