    
public abstract class SubscriberPlan {
  
	         protected double rate;  
	         abstract void getRate();  
	   
	         public void calculateBill(int units){  
	              System.out.println(units*rate);  
	          }  

	}

