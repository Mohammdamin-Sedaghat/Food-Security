//import the class Random from util package 
import java.util.Random;

//declares the class Africa that is inherited from the class Continent
public class Africa extends Continent{

    //defines the method randomFacts() that returns a String
    //@Override
    public String randomFacts(){
        //list that holds all the facts about food insecurity in Africa
        String[] factList = new String[]{"Nearly 24% of the population faces hunger, the highest globally.","2.4 million more people in Northern Africa, 4.8 million more in Middle Africa, 1.1 million more in Southern Africa, and 3.6 million more in Western Africa facing severe food insecurity in 2022 compared to 2021.", "In 2022, 1he prevalence of moderate or sever food insecurity in Africa was 61% of the population." };
        //creates an object of the class Random
        Random rand = new Random();
        //prints out a random fact from the list
        return "\nRandom facts about the continent: " + factList[rand.nextInt(factList.length)];
  }
}