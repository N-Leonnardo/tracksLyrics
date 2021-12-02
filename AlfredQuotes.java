import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        return "Hello " + name + " Good to see you";
    }
    
    public String dateAnnouncement() {
    Date date = new Date();
    return "Today is " + (date.toString());
    }
    
    public String respondBeforeAlexis(String conversation) {
        String answer = "hi";
        if(conversation == "Alexis! Play some low-fi beats."){
            answer = "Right away, sir. She certainly isn't sophisticated enough for that.";
        }
        if(conversation == "I can't find my yo-yo. Maybe Alfred will know where it is."){
            answer = "At your service. As you wish, naturally.";
        }
        return answer;
    }
    
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

