// Name: Mavis Marfo
// Lecturer: Daniel Addo
// Topic: Ashesi Premier League
// Date: 22/09/2025


import java.util.Scanner;
public class PlayerSelection {
    public static void main (String[] args){
        Scanner details= new Scanner(System.in);

        System.out.println("Please input the players name");
        String name=details.nextLine();

        System.out.println("Enter age");
        int age=details.nextInt();

        System.out.println("Enter height in meters (m)");
        double height=details.nextDouble();

        System.out.println("Enter weight in pounds");
        double weight=details.nextDouble();

        System.out.println("Enter the Jersey number of the player");
        int jerseyNumber=details.nextInt();

        final double POUND_TO_KG = 0.45359237;
        final int METER_TO_CM = 100;

        double weightKg = weight * POUND_TO_KG;
        int weightInInteger= (int) weightKg;
        double heightCm = height * METER_TO_CM;

        String position;
        switch (jerseyNumber) {
            case 1: position="Goalkeeper";
                break;
            case 2:
            case 3:
            case 4:
            case 5: position = "Defender";
                break;
            case 6: position = "Defensive Midfielder";
                break;
            case 7: position = "Winger";
                break;
            case 8: position ="Central Midfielder";
                break;
            case 9: position = "9 is Striker";
                break;
            case 10: position = "Attacking Midfielder";
                break;
            case 11: position = "Winger";
                break;
            default: position = "Player position not known";
        }
        boolean attacker = (jerseyNumber==7|| jerseyNumber == 9 ||  jerseyNumber == 10 || jerseyNumber == 11);
        boolean eligible= (age>= 18 && age <= 35 && weightInInteger<90 );
        boolean primePlayer= (age>=20 && age <=30);

        System.out.println("Player : [" + name+ "]");
        if (age< 20){
            System.out.println("Age : [ "+ age + " ] ([Rising Star])");
        }else if (age >=20 && age <= 30){
            System.out.println("Age : [ "+ age + " ] ([Prime Player])");
        }else{
            System.out.println("Age : [ "+ age + " ] ([Veteran])");
        }
        System.out.println("Height [" + heightCm + "cm" + "]");
        System.out.println("weight [" + weightInInteger + "kg" +"]");
        System.out.println("Jersey number [" + jerseyNumber + "]");
        System.out.println("Position : [" + position + "]");
        if(attacker){
            System.out.println("Attacker jersey : [Yes] ");
        } else{
            System.out.println("Attacker jersey : [No]");
        }
        if(eligible){
            System.out.println("Eligibility : [Eligible] ");
        }else {
            System.out.println("Eligibility : [Not eligible]");
        }
        if (primePlayer) {
            if (weightInInteger < 80) {
                System.out.println("Lineup Decision : Line up");
            } else {
                System.out.println("Lineup Decision : [Bench]");
            }
        }else{
            System.out.println("Lineup Decision : [Bench]");
        }
        String decision = (eligible)? "Final Decision : [Play]" : "Final Decision: [Rest]";
        System.out.println(decision);







}
}
