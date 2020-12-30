import java.util.Scanner;
import java.lang.Math;
class Email{
  private String firstName;
  private String lastName;
  private String email;
  private int departamentChoice;
  private String departament;
  private boolean departamentWhile = true;
  private int length = 8;
  private int capacity = 50;
  private char[] password = new char[length];

  public void greeting(){
    System.out.println("\n-^-^-^-^-^-^-^-^-^-^-^-^-^-^-^-^-^-^-^-^-^\n"+
    "\tWelcome to Email project!\n-v-v-v-v-v-v-v-v-v-v-v-v-v-v-v-v-v-v-v-v-v\n");
  }

  public void makeEmail(){
    System.out.println("Go through a quick registration and get your own Email!");

    Scanner firstNameCheck = new Scanner(System.in);
    System.out.print("Please enter your first name: ");
    firstName = firstNameCheck.nextLine();

    Scanner lastNameCheck = new Scanner(System.in);
    System.out.print("Please enter your last name: ");
    lastName = lastNameCheck.nextLine();

    while(departamentWhile){
      System.out.println("\nSelect your departament:\n\tType 1 - Sales\n\t"+
      "Type 2 - Development\n\tType 3 - Accounting\n\tType 4 - None\n\tType 5 - Exit");
      Scanner departamentCheck = new Scanner(System.in);
      System.out.print("Your choice: ");
      departamentChoice = departamentCheck.nextInt();

      switch(departamentChoice){
        case 1:
          departament = "sales.";
          departamentWhile = false;
          break;
        case 2:
          departament = "develop.";
          departamentWhile = false;
          break;
        case 3:
          departament = "account.";
          departamentWhile = false;
          break;
        case 4:
          departament = "";
          departamentWhile = false;
          break;
        case 5:
          System.out.println("See you later!");
          departamentWhile = false;
          System.exit(0);
          break;
        default:
          System.out.println("Sorry, I can't read your choice! Try again or exit.");
      }
    }

    firstName = firstName.toLowerCase().replaceAll("\\s+", "");
    lastName = lastName.toLowerCase().replaceAll("\\s+", "");

    email = firstName + "_" + lastName + "@" + departament +
    "company.com";
    System.out.println("\nYOUR EMAIL: "+ email);
  }

  public void makePassword(){
    String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ12345678";
    for (int i = 0; i < length; i++){
      int rand = (int)(Math.random() * passwordSet.length());
      password[i] = passwordSet.charAt(rand);
    }
    System.out.println("YOUR PASSWORD: "+ new String (password));
  }

  public void menu(){
    boolean login = true;
    while(login){
      System.out.println("\nSelect info:\n\tType 1 - Check email\n\t"+
      "Type 2 - Check Password\n\tType 3 - Check email capacity\n\tType 4 - Exit");

      Scanner infoCheck = new Scanner(System.in);
      System.out.print("Choice: ");
      int info = infoCheck.nextInt();

      if (info == 1){
        System.out.println(email);
      }else if (info == 2){
        System.out.println(new String(password));
      }else if (info == 3){
        System.out.println("Your email capacity "+ capacity +" mb");
      }else{
        login = false;
        System.exit(0);
      }
    }
  }
}
