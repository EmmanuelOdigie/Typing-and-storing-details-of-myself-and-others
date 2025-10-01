import java.util.Scanner;

// created a private modifier
public class PersonalDetails { // variables declared & initialize
    private String name = " ";
    private int age = 0;
    private String address = " ";

/*
public PersonalDetails()  {
    name = " ";
    age = 0;
    address = " ";
}
*/

// Constructor created with arguments
public PersonalDetails(String name, int age, String address) {// set the variables in the class to work with same variables in the constructor
    this.name = name;
    this.age = age;
    this.address = address;
    
}

// created setters and getters
public void setName(String name) {
    this.name = name;
}

public String getName() {
    return name;
}

public void setAge(int age) {
    this.age = age;
}

public int getAge() {
    return age;
}

public void setAddress(String address) {
    this.address = address;
}

public String getAddress() {
    return address;
}

  public static void main(String args[]) {

// input values for parameterized constructors and displayed them 
// created a constructor called personaldetails
 PersonalDetails personaldetails = new PersonalDetails("Emmanuel", 26, "7 Riverbluetool");
 System.out.println("Displaying Details: ");
 
 // displayed details using the getter method
 System.out.println("\nName: " + personaldetails.getName());
 System.out.println("Age: " + personaldetails.getAge());
 System.out.println("Address: " + personaldetails.getAddress());

try{ //Try catch block to catch any errors and let me know
System.out.println("\nPlease input your own details: ");
Scanner input = new Scanner(System.in);

// askin name, age and address, allowing keyboard use for me to type the information in
System.out.print("Name: ");
personaldetails.setName(input.nextLine());
System.out.print("Age: ");
personaldetails.setAge(input.nextInt());
input.nextLine();
System.out.print("Address: ");
personaldetails.setAddress(input.nextLine());

//Display text storing information and below displaying information
System.out.println("\nStoring information...");
System.out.println("Name: " + personaldetails.getName());
System.out.println("Age: " + personaldetails.getAge());
System.out.println("Address: " + personaldetails.getAddress());
}catch (Exception e) {
    System.out.println("An error was made, please try again ");
}

  }
}