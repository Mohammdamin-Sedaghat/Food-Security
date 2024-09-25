//import the class Random from util package 
import java.util.Random;

//declares the class Asia that is inherited from the class Continent
public class Asia extends Continent{

  //defines the method randomFacts() that returns a String
  //@Override
  public String randomFacts(){
    //list that holds all the facts about food insecurity in Asia
    String[] factList = new String[]{"Nearly 8.5% of the population faces hunger.", "In 2022, 1he prevalence of moderate or sever food insecurity in Asia was 24% of the population.","As of 2022, over 1.1 billion people in Asia are food insecure." };
    //creates an object of the class Random
    Random rand = new Random();
    //prints out a random fact from the list
    return "\nRandom facts about the continent: " + factList[rand.nextInt(factList.length)];
  }
}