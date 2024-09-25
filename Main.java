//import all packages that are needed
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.text.DecimalFormat;

//declares the Main class
public class Main {
  //initializing Main methods 
  public static void main(String[] args) {

    //delcare and initiate Scanner object 
    Scanner input = new Scanner(System.in);

    Asia asia = new Asia();
    Africa africa = new Africa();
    Europe europe = new Europe();
    NorthAmerica northAmerica = new NorthAmerica();
    Oceania oceania = new Oceania();
    SouthAmerica southAmerica = new SouthAmerica();
    //try and catch for file not found exception
    try {
      //initiallizing the Scanner class
      Scanner fileInput = new Scanner(new File("Countries.txt"));
      //running a while loop until the file is empty
      while(fileInput.hasNext()){
        //taking the data from the text line
        String name = fileInput.nextLine().toLowerCase();
        int gdp = Integer.parseInt(fileInput.nextLine());
        int calCounsumedYearly = Integer.parseInt(fileInput.nextLine());
        int childMortalityRate = Integer.parseInt(fileInput.nextLine());
        int population = Integer.parseInt(fileInput.nextLine());
        String continent = fileInput.nextLine().toLowerCase();
        //creating the object of the class Country
        Country country1 = new Country(continent, name, population, gdp, childMortalityRate, calCounsumedYearly);
        //using a switch statement to add the country to the appropriate continent
        switch (continent){
          case "asia":
            asia.addCountry(country1);
            break;
          case "africa":
            africa.addCountry(country1);
            break;
          case "north america":
            northAmerica.addCountry(country1);
            break;
          case "south america":
            southAmerica.addCountry(country1);
            break;
          case "oceania":
            oceania.addCountry(country1);
            break;
          case "europe":
            europe.addCountry(country1);
            break;
        }
      }
      //closing the file.
      fileInput.close();
    } catch(IOException e){
      //outputting an error message
      System.out.println("ERROR IN A TXT FILE!");            
      System.out.println(e);
    }

    //print statement about what the code is about
    System.out.println("The goal of this program is to raise awareness about Food Security in the world. This program will provide information about food security and provide a list of resources to help you learn more about the issue.");

    //print menu
    menu();

    //gets user input on menu option
    System.out.print("Please enter a number to choose an option:  ");
    int user = input.nextInt();
    input.nextLine();

    //checks if the user has exit the menu
    while(user!=-1){

      //repromts the user when the user is taken back to main menu
      if (user==0){
        //prints the menu again
        menu();
        //repromts the user for input
        System.out.print("Please enter a number to choose an option: ");
        user = input.nextInt();
        input.nextLine();
      } 

      //repromts the user when the input is invalid
      else if(user<-1||user>6){
        //prints that the user's input is invalid 
        System.out.println("\nInvalid Option! Try Again!");
        //prints the menu again
        menu(); 
        //repromts the user for input
        System.out.print("\nPlease enter a number to choose an option: ");
        user = input.nextInt();
        input.nextLine();
      }

      //when user enters a valid option, the program will run the corresponding method
      switch(user){
        //if user enters 1, the program will give the users options to learn about food security
        case 1:
          System.out.println("\nYou have chosen to learn about Food Security!");

          //prints the info menu
          infoMenu(); 

          //gets user input on info menu option
          System.out.print("Please enter a number to choose an option: ");
          int infoUser = input.nextInt();
          input.nextLine();

          //checks if the user has exit the info menu
          while (infoUser!=-1){

            //repromts the user when the user is taken back to info menu
            if (infoUser==0){
              //prints the info menu again
              infoMenu();
              //repromts the user for input
              System.out.print("Please enter a number to choose an option: ");
              infoUser = input.nextInt();
              input.nextLine();
            } 

            //repromts the user when the input is invalid
            else if (infoUser<-1||infoUser>6){
              //prints that the user's input is invalid
              System.out.println("\nInvalid Option! Try Again!");
              //prints the info menu again
              infoMenu();
              //repromts the user for input
              System.out.print("Please enter a number to choose an option: ");
              infoUser = input.nextInt();
              input.nextLine();
            } 

            //when user enters a valid option, the program will run the corresponding method

            //gives the users information about general world food insecrity
            else if (infoUser==1){
              System.out.println(Info.WorldFacts());
              //takes user back to info menu
              infoUser = 0; 
            } 
            //gives the users information about gender food insecrity
            else if (infoUser==2){
              System.out.println(Info.GenderFacts());
              //takes user back to info menu
              infoUser = 0; 
            } 
            //gives the users information about children food insecrity
            else if (infoUser==3){
              System.out.println(Info.ChildrenFacts());
              //takes user back to info menu
              infoUser = 0; 
            } 
            //gives the users information about reasons for food insecrity
            else if (infoUser==4){
              System.out.println(Info.Reasons()); 
              //takes user back to info menu
              infoUser = 0; 
            } 
            //gives the users information about different terms related to food insecrity
            else if (infoUser==5){
              System.out.println(Info.Terms());
              //takes user back to info menu
              infoUser = 0; 
            } 
            //gives the users information about different help services to help with food insecrity
            else if (infoUser==6){
              System.out.println(Info.HelpSevices());
              //takes user back to info menu
              infoUser = 0; 
            }
          }
          //takes user back to main menu
          user = 0;
          break;
        //if user enters 2, the program will allow the user to learn more about a continent and its food insecurity 
        case 2:
          //prints the list of continents
          System.out.println("\nYou have Chosen to learn about Food Security in specific Continents\n\nHere is the list of continents: \n-Africa\n-Asia\n-Europe\n-North America\n-Oceania\n-South America");
          //prompts the user to enter a continent
          System.out.print("\nSelect a Continent: ");
          //asks the user to enter a continent
          String continent = input.nextLine().toLowerCase();

          //running a while loop to ensure that the continent exists
          while(!continent.equals("asia")&& !continent.equals("africa")&&! continent.equals("north america")&&! continent.equals("south america")&& !continent.equals("oceania")&& !continent.equals("europe")){
            System.out.println("\nInvalid Option! Try Again!");
            //reprompts the user to enter a valid continent
            System.out.println("\nHere is the list of continents: \n-Africa\n-Asia\n-Europe\n-North America\n-Oceania\n-South America");
            System.out.print("\nSelect a Continent:  ");
            continent = input.nextLine().toLowerCase();
          }
          //creating a new object of the class Continent
          Continent cont;
          if(continent.equals("africa")){
            cont = africa;
          } else if(continent.equals("asia")){
            cont = asia;
          } else if(continent.equals("europe")){
            cont = europe;
          } else if(continent.equals("north america")){
            cont = northAmerica;
          } else if(continent.equals("south america")){
            cont = southAmerica;
          } else{
            cont = oceania;
          }
          //prints the continent menue
          continentMenu();
          //asks the user to enter a number to choose an option
          System.out.print("\nPlease enter a number to choose an option: ");
          int continentUser = input.nextInt();
          while(continentUser != -1){
            //makes sure the number is in the appropriate range
            while(continentUser < 0 || continentUser > 8){
              System.out.println("\nInvalid Option! Try Again!");
              //prints the continent menue
              continentMenu();
              //reprompts the user for a valid option
              System.out.print("\nPlease enter a number to choose an option: ");
              continentUser = input.nextInt();
              if(continentUser == -1){
                break;
              }
            }
            //resets the user input
            if(continentUser == 0){
              //prints the continent menu
              continentMenu();
              //reprompts the user for a option
              System.out.print("\nPlease enter a number to choose an option: ");
              continentUser = input.nextInt();
            }

            DecimalFormat df = new DecimalFormat(".00");
          //does the appropriate action regarding the chosen option
          if(continentUser == 1){
            //printing the random facts about the continent
            System.out.println(cont.randomFacts());
            continentUser = 0;
          } else if(continentUser == 2){
            //prints the average population of the continent
            System.out.println("\nAverage Population: "+ df.format(cont.averagePopulation()) + " Million");
            continentUser = 0;
          } else if(continentUser == 3){
            //prints the average gdp of the continet
            System.out.println("\nAverage GDP: $" + df.format(cont.averageGdp()));
            continentUser = 0;
          } else if(continentUser == 4){
            //prints the average child mortality rate of the continent
            System.out.println("\nAverage Child Mortality Rate: " + df.format(cont.averageChildMortalityRate()) + "/100 Child Born");
            continentUser = 0;
          } else if(continentUser == 5){
            //prints the average calories consumed yearly of the continent
            System.out.println("\nAverage Calories Consumed Yearly: " + df.format(cont.averageCalConsumedYearly()) + "/kCal");
            continentUser = 0;
          } else if(continentUser == 6){
            //asks the user to enter a country name
            System.out.print("\nPlease enter a country name: ");
            String countryName = input.next();
            //makes sure the country exists
            Country countryObject = cont.search(countryName);
            //prints an error message if the country does not exists
            if(countryObject == null){
              System.out.println("\nSorry, we could not find the country you are looking for in this continet. ");
            } else{
              //prints the country's information
              System.out.println(countryObject.toString());
              //asking the user if they want to update the country's information
              System.out.print("\nDo you want to update the country? (y/n) ");
              String updateOpt = input.next();
              input.nextLine();
              //reprompts the user if the input is invalid
              while(updateOpt.toLowerCase().charAt(0)!= 'y' && updateOpt.toLowerCase().charAt(0)!= 'n'){
                System.out.print("\nInvalid option. Please enter a valid option. Do you want to update the country? (y/n) ");
                updateOpt = input.next();
                input.nextLine();
              }
              //if the user wants to update the country, the program will allow the user to update the country's information
              if (updateOpt.toLowerCase().charAt(0) == 'y'){
                  countryObject.update();
              } 
            }
            continentUser = 0;
          } else if(continentUser == 7){
            //asks the user for the way they want to sort the system
            System.out.println("\nHere are your options: \n-GDP\n-Child Mortality Rate\n-Calories Consumed Yearly\n-Population\n-Name\n-Exit");
            System.out.print("\nPlease enter the way you want to sort the countries(e.g. by population): ");
            //gets the user input, makes sure it's lowercase
            input.nextLine();
            String var = input.nextLine().toLowerCase();
            //making sure the user enters a valid option 
            while(!var.equals("population") && !var.equals("gdp") && !var.equals("child mortality rate") && !var.equals("calories consumed yearly") && !var.equals("name") && !var.equals("exit")){
              System.out.println("Invalid option.");
              //reprompts the user for a valid option
              System.out.println("Here are your options: \n-GDP\n-Child Mortality Rate\n-Calories Consumed Yearly\n-Population\n-Name\n-Exit");
              System.out.print("Please enter a valid way to sort the countries(e.g. by population): ");
              var = input.next().toLowerCase();
            }
            //the user exits the option 
            if(var.equals("exit")){
              continentUser = 0;
              continue;
            }
            //sorts the list
            cont.sort(var);
            //asking the user if they want to see the sorted list.
            System.out.print("\nDo you want to see the sorted list? (y/n): ");
            String answer = input.next().toLowerCase();
            while(answer.charAt(0)!= 'y' && answer.charAt(0)!= 'n'){
              System.out.print("\nInvalid option. Please enter a valid option. Do you want to see the sorted list? (y/n): ");
              answer = input.next().toLowerCase();
            }
            //printing the list if the user says yes
            if(answer.charAt(0) == 'y'){
              cont.printList();
            }
            continentUser = 0;
          } else if(continentUser == 8){
            //outputting a reminder that advanced search is done between all countries not continet wise
            System.out.println("\nJust a reminder that this part of the program searches the whole country list, not specified to a continent.");
            //asking for a valid input from the user
            advancedMenu();
            System.out.print("\nPlease enter the advanced search option:  ");
            int option = input.nextInt();
            //makes sure the user enters a valid option
            while(option < 1 || option > 4){
              advancedMenu();
              System.out.print("\nInvalid Option. Please enter a valid advanced search option:  ");
              option = input.nextInt();
            }
            //asks for the minimum amount and maximum amount
            System.out.print("\nEnter the minimum amount: ");
            int min = input.nextInt();
            System.out.print("Enter the maximum amount: ");
            int max = input.nextInt();
            //doing the advanced search based on what the user has inputed.
            ArrayList<Country> list;
            if(option == 1){
              list = World.advCalSearch(max, min);
            } else if(option == 2){
              list = World.advGdpSearch(max, min);
            } else if(option == 3){
              list = World.advChildMortalityRate(max, min);
            } else{
              list = World.advPopulation(max, min);
            }
            //outputs the items of the list.
            if(list.size() == 0){
                System.out.println("\nThere was no match found.");
            }
            for(int item = 0; item < list.size();item++){
              System.out.println(list.get(item).toString()+"\n");
            }
            continentUser = 0;
          }  
          }
          //takes user back to main menu
          user = 0;
          break;

        //if user enters 3, the program will allow the user to learn more about a country and its food insecurity 
        case 3:
          //propmts the user to enter a country name
          System.out.print("\nYou have Chosen to learn about Food Security in specific Country.\n\nSearch a Country: ");
          String countryName = input.nextLine();
          Country country = World.search(countryName);
          //reprompts the user if the country is not found
          while(country == null){
            System.out.println("\nSorry, we could not find the country you are looking for! Check the name and try again!");
            System.out.print("\nSearch a Country:  ");
            countryName = input.nextLine();
            //creates the object for the country the user searched for
            country = World.search(countryName);
          }
          //prints the info of the country the user searched for
          System.out.println(country.toString()); 
          //prompts the user if they want to update the country's information
          System.out.print("\nDo you want to update the country? (y/n): "); 
          String updateOpt = input.next();
          input.nextLine();
          //reprompts the user if the input is invalid
          while(updateOpt.toLowerCase().charAt(0)!= 'y' && updateOpt.toLowerCase().charAt(0)!= 'n'){
            System.out.print("\nInvalid option. Please enter a valid option. Do you want to update the country? (y/n) ");
            updateOpt = input.next();
            input.nextLine();
          }
          //if the user wants to update the country, the program will allow the user to update the country's information
          if (updateOpt.toLowerCase().charAt(0) == 'y'){
            country.update();
          }
          //takes user back to main menu
          user = 0;
          break;

        //if user enters 4, the program will allow the user to learn more about different help services to help with food insecurity
        case 4:
          //gives the users information about different help services to help with food insecrity
          System.out.println("\nYou have chosen to learn about different help services to help with food insecurity.");
          System.out.println(Info.HelpSevices());
          //takes user back to main menu
          user = 0;
          break;

        //if user enters 5, the program will allow the user to update a country
        case 5:
          //prompts the user to enter a country name that they want to update
          System.out.print("\nSearch the Country that you would Like to Update:  ");
          String updateName = input.next().toLowerCase();
          //creates the object for the country the user searched for
          Country updateCountry = World.search(updateName);
          //running a while loop to ensure that the country does not exist
          while(updateCountry == null){
            System.out.print("\nInvalid Option. Please Search for a valid Country that you would Like to Update:  ");
            updateCountry = World.search(input.next().toLowerCase());
          }
          //gives the options to update in the country object and changes
          updateCountry.update();
          //takes user back to main menu
          user = 0;
          break;

        //if user enters 6, the program will allow the user to add a country
        case 6:
          //prompts the user to enter the name of the country
          System.out.print("\nYou have chosen to add a country\nPlease enter the name of the country you would like to add: ");
          String addName = input.nextLine();
          //running a while loop to ensure that the country does not exist
          while(World.search(addName) != null){
            System.out.println("This country exists! Please choose a different country, or update the information of the country you already have.");
            System.out.print("\nInvalid Option. Please enter the valid name of the country you would like to add: ");
            addName = input.nextLine();
          }
          //prompts the user to enter the population of the country
          System.out.print("Enter the population: ");
          int addPop = input.nextInt();
          //prompts the user to enter the GDP of the country
          System.out.print("Enter the GDP: ");
          int addGDP = input.nextInt();
          //prompts the user to enter the child mortality rate of the country
          System.out.print("Enter the child mortality rate: ");
          int addChildMortalityRate = input.nextInt();
          //prompts the user to enter the calorie consumed yearly of the country
          System.out.print("Enter the calorie consumed yearly: ");
          int addCalConsumedYearly = input.nextInt();
          //prompts the user to enter the continent of the country
          System.out.print("Enter the continent: ");
          input.nextLine();
          String addContinent = input.nextLine().toLowerCase();
          //running a while loop to ensure that the continent exists
          while(!addContinent.equals("asia")&& !addContinent.equals("africa")&&! addContinent.equals("north america")&&! addContinent.equals("south america")&& !addContinent.equals("oceania")&& !addContinent.equals("europe")){
            System.out.println("\nInvalid Option! Try Again!");
            System.out.print("\nSelect a Continent:");
            addContinent = input.nextLine().toLowerCase();
          }

          //creates the Country
          Country country2 = new Country(addContinent, addName, addPop, addGDP, addChildMortalityRate, addCalConsumedYearly);
          //adding the country to the appropriate continent.
          if(addContinent.equals("asia")){
              asia.addCountry(country2);
          } else if(addContinent.equals("africa")){
              africa.addCountry(country2);
          } else if(addContinent.equals("north america")){
              northAmerica.addCountry(country2);
          } else if(addContinent.equals("south america")){
              southAmerica.addCountry(country2);
          } else if(addContinent.equals("oceania")){
              oceania.addCountry(country2);
          } else if(addContinent.equals("europe")){
              europe.addCountry(country2);
          }
          System.out.println(country2.toString());
          System.out.println("\nThe country is made!");
          //try and catch for file not found exception
          try{
            //creating the writer object to write to the file
            BufferedWriter writer = new BufferedWriter(new FileWriter("NewCountry.txt", true));
            //writes the added country info into the file NewCountry.txt
            writer.write(addName + "\n"+ addPop+"\n"+ addGDP + "\n"+ addChildMortalityRate +"\n"+ addCalConsumedYearly + "\n" +addContinent);
            writer.write("\n");
            writer.flush();

          } catch (IOException e){
            System.out.println("Error:" + e);
          } finally {
            if (writer != null){
              writer.close(); //Ensure the writer is closed
            }
          } catch (IOException e){
            System.out.println("Error closing writer: " + e);
          }
          //takes user back to main menu
          user = 0;
          break;
      }
    }
    //Thank you message
    System.out.println("\nThank you for using the Food Security Database!");
    input.close();
 }

  //method for menu
  public static void menu(){
    System.out.println("\nMAIN MENU"); 
    System.out.println("1 - Food Security Info");
    System.out.println("2 - Continents");
    System.out.println("3 - Country");
    System.out.println("4 - Help Services"); 
    System.out.println("5 - Country Update Status"); 
    System.out.println("6 - Add a Country");
    System.out.println("-1 - Exit\n"); 
  }

  //method for info menu 
  public static void infoMenu(){    
    System.out.println("\nINFO MENU"); 
    System.out.println("1 - World Info on Food Security");
    System.out.println("2 - Gender Info on Food Security");
    System.out.println("3 - Children Info on Food Security");
    System.out.println("4 - Reaoning for Food Security");
    System.out.println("5 - Terms Related to Food Security");
    System.out.println("6 - Help Services"); 
    System.out.println("-1 - Exit\n"); 
  }

  //method for continent menu 
  public static void continentMenu(){
    System.out.println("\nCONTINENT MENU: ");
    System.out.println("1 - Random Facts about the continent");
    System.out.println("2 - Average Population of the continent");
    System.out.println("3 - Average GDP of the continent");
    System.out.println("4 - Average Child Mortality Rate of the continent");
    System.out.println("5 - Average Calories Consumed Yearly of the continent");
    System.out.println("6 - Search for a Country Inside the Continent");
    System.out.println("7 - Sort the Country by a factor");
    System.out.println("8 - Advaced Search of the Countries");
    System.out.println("-1 - Exit");
  }

  //method for advance search menu
  public static void advancedMenu(){
    System.out.println("\nADVANCED SEARCH MENU: ");
    System.out.println("1 - Calorie Consumed Yearly");
    System.out.println("2 - GDP");
    System.out.println("3 - Child Mortality Rate");
    System.out.println("4 - Population");
  }
}