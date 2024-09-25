//import the ArrayList class from util package 
import java.util.ArrayList;

//declares the abstract class Continent
public abstract class Continent{
  //declares the ArrayList with all the Country objects 
  protected ArrayList<Country> countryList = new ArrayList<Country>();
  //instance variable holding number of countries
  protected int countryCount;

  //empty constructor
  public Continent(){}

  //getters
  //getter for countryList
  public ArrayList<Country> getCountryList() {
    return countryList;
  }

  //getter for country Count
  public int countrynCount() {
    return countryCount;
  }

  //method to add a country to the list
  public void addCountry(Country country){
    countryList.add(country);
    //incriminating the country count
    countryCount++;
  }

  //average of the things in country
  public double averagePopulation(){
    //starting with a zero amount
    double total = 0;
    //for loop to add all the population of the countries in the list
    for(int item = 0; item < countryList.size(); item++){
      total += countryList.get(item).getPopulation() / 1000000;
    }
    //returning the average
    return total/countryCount;
  }

  public double averageGdp(){
    //starting with a zero amount
    double total = 0;
    //for loop to add all the gdp of the countries in the list
    for(int item = 0; item < countryList.size(); item++){
      total += countryList.get(item).getGdp();
    }
    //returning the average
    return total/countryCount;
  }

  public double averageChildMortalityRate(){
    //starting with a zero amount
    double total = 0;
    //for loop to add all the child mortality rate of the countries in the list
    for(int item = 0; item < countryList.size(); item++){
      total+= countryList.get(item).getChildMortalityRate();
    }
    //returning the average
    return total/countryCount;
  }

  public double averageCalConsumedYearly(){
    //starting with a zero amount
    double total = 0;
    //for loop to add all the calories consumed yearly of the countries in the list
    for(int item = 0; item < countryList.size(); item++){
      total+= countryList.get(item).getCalConsumedYearly();
    }
    //returning the average
    return total/countryCount;
  }

  //random facts about the continent
  public abstract String randomFacts();

  //search 
  public Country search(String name){
    //for loop to search for the country
    for(int item = 0; item < countryList.size(); item++){
      if(countryList.get(item).getName().equals(name)){
        return countryList.get(item);
      }
    }
    //returning null in case the country is not found
    return null;
  }

  //sort method for the countries
  public void sort(String var){
    Country change;
    int index;
    //running an insertion sort algorithm for population
    if (var.equals("population")){
      //running a for loop to go through the list
      for(int item = 1; item < countryList.size(); item++){
          index = item;
        //while loop to check if the country is greater than the country before it
          while(countryList.get(index-1).getPopulation() > countryList.get(index).getPopulation()){
              change = countryList.get(index);
              countryList.set(index, countryList.get(index-1));
              countryList.set(index-1, change);
              index--;
              if(index == 0){
                  break;
              }
          }
      }
    //running an insertion sort algorithm for gdp
    } else if(var.equals("gdp")){
      //running a for loop to go through the list
      for(int item = 1; item < countryList.size(); item++){
        index = item;
        //while loop to check if the country is greater than the country before it
        while(countryList.get(index-1).getGdp() > countryList.get(index).getGdp()){
            change = countryList.get(index);
            countryList.set(index, countryList.get(index-1));
            countryList.set(index-1, change);
            index--;
            if(index == 0){
                break;
            }
          }
      }
      //running an insertion sort algorithm for child mortality rate
    } else if(var.equals("child mortality rate")){
      //running a for loop to go through the list
      for(int item = 1; item < countryList.size(); item++){
        index = item;
        //while loop to check if the country is greater than the country before it
        while(countryList.get(index-1).getChildMortalityRate() > countryList.get(index).getChildMortalityRate()){
            change = countryList.get(index);
            countryList.set(index, countryList.get(index-1));
            countryList.set(index-1, change);
            index--;
            if(index == 0){
                break;
            }
          }
      }
    //running an insertion sort algorithm for calories consumed yearly
    } else if(var.equals("cal consumed yearly")){
      //running a for loop to go through the list
      for(int item = 1; item < countryList.size(); item++){
        index = item;
        //while loop to check if the country is greater than the country before it
        while(countryList.get(index-1).getCalConsumedYearly() > countryList.get(index).getCalConsumedYearly()){
            change = countryList.get(index);
            countryList.set(index, countryList.get(index-1));
            countryList.set(index-1, change);
            index--;
            if(index == 0){
                break;
            }
        }
      }
    //running an insertion sort algorithm for name
    } else if(var.equals("name")){
      //running a for loop to go through the list
      for(int item = 1; item < countryList.size(); item++){
        index = item;
        //while loop to check if the country is greater than the country before it
        while(countryList.get(index-1).getName().compareTo(countryList.get(index).getName()) > 0){
            change = countryList.get(index);
            countryList.set(index, countryList.get(index-1));
            countryList.set(index-1, change);
            index--;
            if(index == 0){
                break;
            }
        }
      }
    }
  }

  //a printList method to print out the list of countries
  public void printList(){
    //goes through each country in the list and running the to string method for them
    for(int item = 0; item < countryList.size(); item++){
      System.out.println(countryList.get(item).toString());
    }
  }
}