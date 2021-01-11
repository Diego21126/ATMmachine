package atm.machine;
import java.util.Scanner;
/**
 *
 * @author despinosa
 */
class Main
{
    private static Scanner in = new Scanner(System.in);
    private static final String USERNAME = "user";
    private static final int PIN = 1234;
    public static void main(String[] args) 
    {
      System.out.println("Login:\n Username:" + USERNAME + "\n Pin" + PIN);
      System.out.println("Warning: You must enter the correct data or risk locking out.");
      System.out.print("Username: ");
      String user = in.nextLine();
      if (user.equals(USERNAME))
      {
        System.out.println("Pin: ");
      } 
      else 
      {
        System.out.println("Sorry, wrong username or pin");
        System.exit(0);
      }
      int p1n = in.nextInt();
      if (p1n == PIN)
    {
        System.out.println("Welcome " + USERNAME);
    }
      else
      {
        System.out.println("Sorry, wrong username or pin");
        System.exit(0);
      }
      System.out.println("What would you like to do today?");
      System.out.println("1) ");
      System.out.println("2) ");
      System.out.println("3) ");
      System.out.println("4) ");

    }
}