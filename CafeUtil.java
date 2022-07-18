import java.util.ArrayList;

public class CafeUtil{


    //1
    int getStreakGoal( int numWeeks){
        int sum = 0 ;
         for(int i = 1 ; i <= numWeeks ; i++){
             sum = sum+i ;
         }
         return sum;
    }


    //2
    double getOrderTotal(double[] prices){
        double total=0;
        for (double price:prices){
            total=total+price;
        }
        return total;
    }
    //3
    void displayMenu(ArrayList<String> menuItems){
        for (int i = 0 ; i< menuItems.size(); i++){
            System.out.println( i +" "+ menuItems.get(i));
        }
        
    }

    //4
    void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println("Hello " + userName);
        System.out.printf( "There are %x people in front of you",customers.size());
        customers.add(userName);
        System.out.println("["+ customers.get(0));
        for(int i=1;i< customers.size();i++){  
        System.out.println(","+customers.get(i));
        }
        System.out.println("]");

       
    }





}