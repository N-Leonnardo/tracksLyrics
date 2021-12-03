import java.util.Date;
import java.util.ArrayList;
import java.util.Random;

public class RandomDice {
    
    public int getStreakGoal() {
        int counter = 0;
        for(int i = 0; i < 10; i++){
            counter ++;
        }
        return counter;
    }

    int getRandom(int upperbound){
        Random rand = new Random(); //instance of random class
        //generate random values from 0-24
        int int_random = rand.nextInt(upperbound); 
        return int_random;
    }

}

