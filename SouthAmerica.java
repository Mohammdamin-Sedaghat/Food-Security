//import the class Random from util package 
import java.util.Random;

//declares the class South America that is inherited from the class Continent
public class SouthAmerica extends Continent{

  //defines the method randomFacts() that returns a String
  //@Override
  public String randomFacts(){
    //list that holds all the facts about food insecurity in South America
    String[] factList = new String[]{"In 2022, 1he prevalence of moderate or sever food insecurity in South America was 38% of the population.", "Nearly 6.5% of the population faces hunger.", "In 2022, 22.5% of South American population cannot afford a healthy diet."};
    //creates an object of the class Random
    Random rand = new Random();
    //prints out a random fact from the list
    return "\nRandom facts about the continent: " + factList[rand.nextInt(factList.length)];
  }
}