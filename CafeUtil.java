import java.util.Date;
import java.util.ArrayList;


public class CafeUtil {
    
    public int getStreakGoal() {
        int counter = 0;
        for(int i = 0; i < 10; i++){
            counter ++;
        }
        return counter;
    }

    double getOrderTotal(double[] prices){
        int sum = 0;
        for(int i = 0; i< prices.length; i++){
            sum += (prices[i]);
        }
        return sum;
    }

    void displayMenu(ArrayList<String> menuItems){
        for(int i = 0; i< menuItems.size() ; i++){
            String item = menuItems.get(i);
            System.out.println(item);
        }
    }
    void addCustomer(ArrayList<String> costumers){
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println("Hello " + userName);
        costumers.add(userName);
        System.out.println("There are " + costumers.size() + " in front of you");
        for(int i = 0; i<costumers.size(); i++){
            String costumersName = costumers.get(i);
            System.out.println(costumersName);
        }

    }
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

