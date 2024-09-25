//import the class Random from util package 
import java.util.Random;

//declares the class Oceania that is inherited from the class Continent
public class Oceania extends Continent{

  //defines the method randomFacts() that returns a String
  //@Override
  public String randomFacts(){
    //list that holds all the facts about food insecurity in Oceania
    String[] factList = new String[]{"In 2022, 1he prevalence of moderate or sever food insecurity in Oceania was 13% of the population.", "Nearly 7% of the population faces hunger.", "In 2019, 9.9% of infants in Oceania had a low weight at birth."};
    //creates an object of the class Random
    Random rand = new Random();
    //prints out a random fact from the list
    return "\nRandom facts about the continent: " + factList[rand.nextInt(factList.length)];
  }
}