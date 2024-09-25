//import the class Random from util package 
import java.util.Random;

//declares the class North America that is inherited from the class Continent
public class NorthAmerica extends Continent{

  //defines the method randomFacts() that returns a String
  //@Override
  public String randomFacts(){
    //list that holds all the facts about food insecurity in North America
    String[] factList = new String[]{"In 2022, 1he prevalence of moderate or sever food insecurity in North America was 8% of the population.", "Nearly 2.5% of the population faces hunger.", "In 2022, 56% of the Indigenous Peoples in North America are food insecure."};
    //creates an object of the class Random
    Random rand = new Random();
    //prints out a random fact from the list
    return "\nRandom facts about the continent: " + factList[rand.nextInt(factList.length)];
  }
}