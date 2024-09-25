//import the class Scanner from util package 
import java.util.Scanner;

//declares the class Country
public class Country{
  //instance variables
  private String name; 
  private int gdp;
  private int calConsumedYearly;
  private int childMortalityRate;
  private int population;
  private String continent;
  //static variables for the class
  private static int countryAmnt = 0;

  //default constructor
  public Country(String continent, String name){
    this(continent, name, 0, 0, 0,0);
  }

  //constructor with neccessary parameters
  public Country(String continent, String name, int population,int gdp,int childMortalityRate, int calConsumedYearly){
    //assigning variables to the right data type
    this.name = name;
    this.population = population;
    this.gdp = gdp;
    this.childMortalityRate = childMortalityRate;
    this.calConsumedYearly = calConsumedYearly;
    this.continent = continent;
    //adding the country to the list of countries
    World.addCountry(this);
    //adding one to the number of countries
    countryAmnt++;
  }

  //getters
  //getter for name
  public String getName() {
    return name;
  }

  //geetter for population
  public int getPopulation() {
    return population;
  }

  //getter for gdp
  public int getGdp() {
    return gdp;
  }

  //getter for childMortalityRate
  public int getChildMortalityRate() {
    return childMortalityRate;
  }

  //getter for calConsumedYearly
  public int getCalConsumedYearly() {
    return calConsumedYearly;
  }

  //getter for Country Amount
  public static int getCountryAmnt() {
    return countryAmnt;
  }

  //getter for Continent
  public String getContinent() {
    return continent;
  }

  //setters
  //setter for population
  public void setPopulation(int population) {
    this.population = population;
  }

  //setter for gdp
  public void setGdp(int gdp) {
    this.gdp = gdp;
  }

  //setter for childMortalityRate
  public void setChildMortalityRate(int childMortalityRate){
    this.childMortalityRate = childMortalityRate;
  }

  //setter for calConsumedYearly
  public void setCalConsumedYearly(int calConsumedYearly){
    this.calConsumedYearly = calConsumedYearly;
  }

  //method to print out the data fields
  public String toString(){
    //returning all the recquired data of the country
    return "\nName: " + name.substring(0, 1).toUpperCase() + name.substring(1) + "\nContinent: " + continent.substring(0, 1).toUpperCase() + continent.substring(1) + "\nPopulation: " + population + "\nGDP: $" + gdp + "\nChild Mortality Rate: " + childMortalityRate +"/100 Kids Born"+ "\nCal Consumed Yearly: " + calConsumedYearly+"/KCal";
  }

  //method to update the country
  public void update(){
    //initializing the scanner
    Scanner input = new Scanner(System.in);
    //asking user what they want to update
    int x = 1;
    int val;
    //while loop to keep asking user what they want to update
    while(x > 0 && x < 5){
      //printing out the list of options
      System.out.println("\nWhat do you want to update?");
      System.out.println("1 - Population");
      System.out.println("2 - GDP");
      System.out.println("3 - Child Mortality Rate");
      System.out.println("4 - Cal Consumed Yearly");
      System.out.println("-1 - Exit");
      //asking user what they want to update
      System.out.print("\nPlease enter a number to choose an update option:  ");
      x = input.nextInt();
      if(x == -1){
        break;
      }
      //asking user what they want to update the value to
      System.out.print("\nPlease enter the new value: ");
      val = input.nextInt();
      //if else statement to update the value of the respected options
      if(x == 1){
        population = val;
      } else if(x== 2){
        gdp = val;
      } else if(x == 3){
        childMortalityRate = val;
      } else if(x == 4){
        calConsumedYearly = val;
      } else{
        break;
      }
    }
    //printing out a thank you message
    System.out.println(this.toString());
    System.out.println("\nThanks for your update!");
  }
}