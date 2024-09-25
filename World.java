//import the class ArrayList from util package 
import java.util.ArrayList;

//declares the class World 
public abstract class World{
  //initializing the static variables
  private static String[][] totalFacts = new String[6][3];
  //assining the facts to the continents.
  static{
  //facts 0 to Africa
  totalFacts[0] = new String[]{"Nearly 24% of the population faces hunger, the highest globally.","2.4 million more people in Northern Africa, 4.8 million more in Middle Africa, 1.1 million more in Southern Africa, and 3.6 million more in Western Africa facing severe food insecurity in 2022 compared to 2021.", "In 2022, 1he prevalence of moderate or sever food insecurity in Africa was 61% of the population." };
  //facts 1 to Asia
  totalFacts[1] = new String[]{"Nearly 8.5% of the population faces hunger.", "In 2022, 1he prevalence of moderate or sever food insecurity in Asia was 24% of the population.","As of 2022, over 1.1 billion people in Asia are food insecure." };
  //facts 2 to Europe
  totalFacts[2] = new String[]{"In 2022, 1he prevalence of moderate or sever food insecurity in Europe was 8% of the population.","Nearly 2.5% of the population faces hunger.", "The annual inflation rate went from 8.6% in 2022 to 14.1% in 2023 due to Russia's invasion of Ukranie."};
  //facts 3 to North America
  totalFacts[3] = new String[]{"In 2022, 1he prevalence of moderate or sever food insecurity in North America was 8% of the population.", "Nearly 2.5% of the population faces hunger.", "In 2022, 56% of the Indigenous Peoples in North America are food insecure."};
  //facts 4 to Oceania
  totalFacts[4] = new String[]{"In 2022, 1he prevalence of moderate or sever food insecurity in Oceania was 13% of the population.", "Nearly 7% of the population faces hunger.", "In 2019, 9.9% of infants in Oceania had a low weight at birth."};
  //facts 5 to South America
  totalFacts[5] = new String[]{"In 2022, 1he prevalence of moderate or sever food insecurity in South America was 38% of the population.", "Nearly 6.5% of the population faces hunger.", "In 2022, 22.5% of South American population cannot afford a healthy diet."};
  }
  //declares the ArrayList that holds all the countries 
  private static ArrayList<Country> totalCountryList = new ArrayList<Country>();
  private static int countryCount;

  //getter for totalCountryList
  public static ArrayList<Country> getTotalCountryList(){
    return totalCountryList;
  }

  //getter for countryCount
  public static int getCountryCount(){
    return countryCount;
  }

  //getter for the totalFacts
  public static String[][] getTotalFacts(){
    return totalFacts;
  }

  //method to add a country to the totalCountryList
  public static void addCountry(Country country){
    totalCountryList.add(country);
  }

  //searching algorithm to find a country in the totalCountryList
  public static Country search(String name){
    //looking between all the countries
    for(int item = 0; item < totalCountryList.size(); item++){
      if(totalCountryList.get(item).getName().equals(name)){
        return totalCountryList.get(item);
      }
    }
    //returning null if nothing is found
    return null;
  }

  //recursice sorting method for population
  public static Country[] recursiveSort(Country[] list){
      Country change; // Temporary variable for swapping
      int swap = 0; // Variable to keep track of swaps

      // Loop through the array to perform one pass of bubble sort
      for (int item = 0; item <= list.length - 2; item++) {
          // If the current element is greater than the next element, swap them
          if (list[item].getPopulation() > list[item + 1].getPopulation()) {
              change = list[item]; // Store the current element in the temporary variable
              list[item] = list[item + 1]; // Replace the current element with the next element
              list[item + 1] = change; // Replace the next element with the stored current element
              swap++; // Increment the swap count
          }
      }

      // If no swaps were made, the array is already sorted
      if (swap == 0) {
          return list; // Return the sorted array
      } else {
          // If swaps were made, recursively call the sort method to continue sorting
          return recursiveSort(list);
      }
  }

  //sorting algorithm to sort the totalCountryList the way that the user wants
  public static void sort(String var){
    //creating local variables change and index
    Country change;
    int index;
    //if the user wants to sort by population
    if (var.equals("population")){
      //sorting the list by insertion sort
      for(int item = 1; item < totalCountryList.size(); item++){
          index = item;
          while(totalCountryList.get(index-1).getPopulation() > totalCountryList.get(index).getPopulation()){
            //swapping the countries
            change = totalCountryList.get(index);
            totalCountryList.set(index, totalCountryList.get(index-1));
            totalCountryList.set(index-1, change);
            index--;
            if(index == 0){
                break;
            }
          }
      }
    } else if(var.equals("gdp")){
      //sorting the gdp list by insertion sort
      for(int item = 1; item < totalCountryList.size(); item++){
          index = item;
          while(totalCountryList.get(index-1).getGdp() > totalCountryList.get(index).getGdp()){
            //swapping the countries
            change = totalCountryList.get(index);
            totalCountryList.set(index, totalCountryList.get(index-1));
            totalCountryList.set(index-1, change);
            index--;
            if(index == 0){
                break;
            }
          }
      } 
    } else if(var.equals("child mortality rate")){
      //sorting the child mortality rate list by insertion sort
      for(int item = 1; item < totalCountryList.size(); item++){
          index = item;
          while(totalCountryList.get(index-1).getChildMortalityRate() > totalCountryList.get(index).getChildMortalityRate()){
            //swapping the countries
            change = totalCountryList.get(index);
            totalCountryList.set(index, totalCountryList.get(index-1));
            totalCountryList.set(index-1, change);
            index--;
            if(index == 0){
                break;
            }
          }
      }
    } else if(var.equals("cal consumed yearly")){
      //sorting the calories consumed yearly list by insertion sort
      for(int item = 1; item < totalCountryList.size(); item++){
          index = item;
          while(totalCountryList.get(index-1).getCalConsumedYearly() > totalCountryList.get(index).getCalConsumedYearly()){
            //swapping the countries
            change = totalCountryList.get(index);
            totalCountryList.set(index, totalCountryList.get(index-1));
            totalCountryList.set(index-1, change);
            index--;
            if(index == 0){
                break;
            }
          }
      }
    } else if(var.equals("name")){
      //sorting the name list by insertion sort
      for(int item = 1; item < totalCountryList.size(); item++){
          index = item;
          while(totalCountryList.get(index-1).getName().compareTo(totalCountryList.get(index).getName()) > 0){
            //swapping the countries
            change = totalCountryList.get(index);
            totalCountryList.set(index, totalCountryList.get(index-1));
            totalCountryList.set(index-1, change);
            index--;
            if(index == 0){
                break;
            }
          }
      }
    }
  }
  //method that identify the number of countries that are between specified values
  public static ArrayList<Country> advCalSearch(int high, int low){
    //creating an arrayList
    ArrayList<Country> list = new ArrayList<Country>();
    //running a for loop to find the countries
    for(int item = 0; item < totalCountryList.size(); item++){
      //if the country is between the specified values it is added to the list
      if(totalCountryList.get(item).getCalConsumedYearly() < high && totalCountryList.get(item).getCalConsumedYearly() > low){
        list.add(totalCountryList.get(item));
      }
    }
    //returning the list
    return list;
  }

  //method that identify the number of countries that are between specified values for population
  public static ArrayList<Country> advPopulation(int high, int low){
    //creating an arrayList
    ArrayList<Country> list = new ArrayList<Country>();
    //running a for loop to find the countries
    for(int item = 0; item < totalCountryList.size(); item++){
      //if the country is between the specified values it is added to the list
      if(totalCountryList.get(item).getPopulation() < high && totalCountryList.get(item).getPopulation() > low){
        list.add(totalCountryList.get(item));
      }
    }
    //returning the list
    return list;
  }

  //method that identify the number of countries that are between specified values for gdp
  public static ArrayList<Country> advGdpSearch(int high, int low){
    //creating an arrayList
    ArrayList<Country> list = new ArrayList<Country>();
    //running a for loop to find the countries
    for(int item = 0; item < totalCountryList.size(); item++){
      //if the country is between the specified values it is added to the list
      if(totalCountryList.get(item).getGdp() < high && totalCountryList.get(item).getGdp() > low){
        list.add(totalCountryList.get(item));
      }
    }
    //returning the list
    return list;
  }

  //method that identify the number of countries that are between specified values for child mortality rate
  public static ArrayList<Country> advChildMortalityRate(int high, int low){
    //creating an arrayList
    ArrayList<Country> list = new ArrayList<Country>();
    //running a for loop to find the countries
    for(int item = 0; item < totalCountryList.size(); item++){
      //if the country is between the specified values it is added to the list
      if(totalCountryList.get(item).getChildMortalityRate() < high && totalCountryList.get(item).getChildMortalityRate() > low){
        list.add(totalCountryList.get(item));
      }
    }
    //returning the list
    return list;
  }

  //a method to print out the list of countries in the continet
  public static void printList(){
    System.out.println("\nHere is the list");
    //runnning a loop and printing out the countries information
    for(int item = 0; item < totalCountryList.size(); item++){
      System.out.println(totalCountryList.get(item).toString());
    }
  }
}