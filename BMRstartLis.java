
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;



public class BMRstartLis implements ActionListener {
	BMRstart st;
	public BMRstartLis(){
		
	}
	public BMRstartLis(BMRstart s){
		this.st=s;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj= e.getSource();
		
		JButton source = (JButton) obj;
		if(source.equals(this.st.btn1)){
			BMR bm=new BMR();
			bm.setVisible(true);
			//this.setVisible(false);
			
			
		}
		else if(source.equals(this.st.btn2)){
			BMI bm=new BMI();
			bm.setVisible(true);
			
			
				
			
			
		}
		
		
	}

}