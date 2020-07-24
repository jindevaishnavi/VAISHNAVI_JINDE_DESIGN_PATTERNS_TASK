import java.io.*;
public class FactoryMethod {

	public static void main(String args[]) throws IOException{  
	      GetSubscriberPlan planFactory = new GetSubscriberPlan();  
	        
	      System.out.print("Enter the name of plan for which the amount to be calculated : ");  
	      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
	  
	      String planName=br.readLine();  
	      System.out.print("Enter the number of weeks/months/years for bill will be calculated: ");  
	      int duration =Integer.parseInt(br.readLine());  
	  
	      SubscriberPlan p = planFactory.getPlan(planName);  	  
	       System.out.print("Bill amount for "+planName+" is: ");  
	           p.getRate();  
	           p.calculateBill(duration);  
	            }  
}
