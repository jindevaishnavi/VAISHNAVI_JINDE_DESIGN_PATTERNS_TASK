
public class GetSubscriberPlan {
	  public SubscriberPlan getPlan(String planType){  
          if(planType == null){  
           return null;  
          }  
        if(planType.equalsIgnoreCase("WEEKLYPLAN")) {  
               return new WeeklyPlan();  
             }   
         else if(planType.equalsIgnoreCase("MONTHLYPLAN")){  
              return new MonthlyPlan();  
          }   
        else if(planType.equalsIgnoreCase("YEARLYPLAN")) {  
              return new YearlyPlan();  
        }  
    return null;  
 }  
}
