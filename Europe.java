//import the class Random from util package 
import java.util.Random;

//declares the class Europe that is inherited from the class Continent
public class Europe extends Continent{

  //defines the method randomFacts() that returns a String
  //@Override
  public String randomFacts(){
    //list that holds all the facts about food insecurity in Europe
    String[] factList = new String[]{"In 2022, 1he prevalence of moderate or sever food insecurity in Europe was 8% of the population.","Nearly 2.5% of the population faces hunger.", "The annual inflation rate went from 8.6% in 2022 to 14.1% in 2023 due to Russia's invasion of Ukranie."}; 
    //creates an object of the class Random
    Random rand = new Random();
    //prints out a random fact from the list
    System.out.println("\nRandom facts about the continent: ");
    return "\nRandom facts about the continent: " + factList[rand.nextInt(factList.length)];
  }
}