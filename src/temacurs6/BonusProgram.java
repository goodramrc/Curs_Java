package temacurs6;

import java.util.Scanner;

public class BonusProgram {

    public static void main(String[] args) {
        int aniVechime;
        int valoareVanzari;
        String lunaVanzari;

        Scanner scan = new Scanner(System.in);

        System.out.println("Introduceti anul de vechime în firmă: ");
        aniVechime = scan.nextInt();

        System.out.println("Introduceti valoarea vânzărilor efectuate: ");
        valoareVanzari = scan.nextInt();

        System.out.println("Introduceti luna în care s-au efectuat vânzările: ");
        scan.nextLine();
        lunaVanzari = scan.nextLine();

        String[] numeLuniVanzare = {"Ianuarie", "Februarie", "Martie", "Aprilie", "Mai", "Iunie", "Iulie", "August", "Septembrie", "Octombrie", "Noiembrie", "Decembrie"};

        int bonus = 0;
        boolean lunaValida = false;

        switch (aniVechime) {
            case 1:
                bonus = 100;
                break;
            case 2:
                bonus = 200;
                break;
            case 3:
                if (valoareVanzari <= 5000) {
                    bonus = 600;
                } else if (valoareVanzari <= 10000) {
                    for (String luna : numeLuniVanzare) {
                        if (luna.equals(lunaVanzari)) {
                            lunaValida = true;
                            break;
                        }
                    }
                } else {
                    bonus = 1200;
                }
                break;
            default:
                System.out.println("Anul introdus este mai mare ca 3. An invalid");
                break;
        }

        if (aniVechime > 3) {
            lunaValida = true; 
        }

        if (!lunaValida) {
            System.out.println("Luna introdusa nu este valida. Nu se acordă niciun bonus.");
        } else {
            if (aniVechime <= 3) {
                switch (lunaVanzari) {
                    case "Decembrie":
                        bonus = 900;
                        System.out.println("In decembrie se vand singure!");
                        break;
                    case "Ianuarie":
                    case "Februarie":
                    case "Martie":
                    case "Aprilie":
                    case "Mai":
                    case "Iunie":
                        bonus = 800;
                        break;
                    default:
                        bonus = 1000;
                        break;
                }
            } else {
                bonus = 0;
            }

            System.out.println("Vei primi un bonus de: " + bonus);
        }

        scan.close();
    }
}