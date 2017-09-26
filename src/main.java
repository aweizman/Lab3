import java.util.Scanner;
public class main {
    public static void main(String args[]) {
        Scanner scnr = new Scanner(System.in);


        try {
            System.out.println("Enter your car’s MPG rating (miles/gallon) as a positive integer: ");
            int userMPG;
            userMPG = scnr.nextInt();
            if (userMPG <= 0) {
                throw new Exception("ERROR: ONLY POSITIVE INTEGERS ARE ACCEPTED FOR MPG!!!");
            }
            System.out.println("Enter your car’s tank capacity (gallons) as a positive decimal number: ");
            double userTankCap = scnr.nextDouble();
            if (userTankCap <= 0) {
                throw new Exception("ERROR: ONLY POSITIVE DECIMAL NUMBERS ACCEPTED FOR TANK CAPACITY!!!");
            }
            System.out.println("Enter the percentage of the gas tank that is currently filled (from 0-100%): ");
            double userTankPct = scnr.nextDouble();
            if (userTankPct <= 0 || userTankPct > 100) {
                throw new Exception("ERROR: PERCENTAGE MUST BE A DECIMAL NUMBER IN THE RANGE OF 0-100 (INCLUSIVE)!!!");
            }

            double rawRange = userMPG * userTankCap * (userTankPct * 0.01);
            int range = (int)rawRange;
            if (rawRange <= 25) {
                System.out.println("Attention! Your current estimated range is running low: " + range + " miles left!");
            }
            else {
                System.out.println("Keep driving! Your current estimated range is: " + range + " miles!");
            }

        }
        catch (Exception excpt) {
            System.out.println(excpt.getMessage());

        }

    }
}
