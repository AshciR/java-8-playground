import java.util.*;

public class FindPerson {

  public static void main(String[] args){
    System.out.println("Hello World");

    List<String> names = Arrays.asList("Richie", "Lemmy", "Steven", "Kashane", "Jhev");
    findPerson(names, "Richie");
  }

  /**
    Helper function to find a person in a list.
  **/
  private static void findPerson(List<String> persons, String name){

    boolean found = false;

    for(String person : persons){

      if(person.equals(name)){
        found = true;
        break;
      }

    }

    // Alert the user of the results
    if(found){
      System.out.println("Found " + name);
    }
    else {
      System.out.println("Sorry, " + name + " is not in the list.");
    }

  }

}
