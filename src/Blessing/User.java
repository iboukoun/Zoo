package Blessing;

import java.util.Scanner;

public class User {
        public static void main( String[] args) {
            Scanner sc = new Scanner(System.in);

            boolean valid = false;
            String choice;
            int numd = 0;
           // String strDoubled;
            while(!valid) {
                System.out.println("\n Please choose option:\n"
                        + "1)Lion\n"
                        + "2)Cobra\n"
                        + "3)Zebra");

                // enter value d condition

                choice = sc.nextLine();
                    try {
                        numd = Integer.parseInt(choice);
                        valid = true;
                        if (!(0<numd && numd<=3)){
                            System.out.println("invalid choice please select between 1 , 2 or 3");
                            valid = false;

                        }
                    } catch (NumberFormatException ex) {
                        System.out.println("error -enter a number");
                    }
                }



                switch (numd) {
                    case 1:
                        System.out.println(" you choose the Lion");
                        Lion lion = new Lion();
                        lion.lionType();

                        break;
                    case 2:
                        System.out.println(" You choose the Cobra");
                        Cobra cobra = new Cobra();
                        cobra.typeOfCobra();
                        break;
                    case 3:
                        System.out.println("You choose the Zebra");
                        Zebra zebra = new Zebra();
                        zebra.typeOfZebra();
                }
            }
        }

