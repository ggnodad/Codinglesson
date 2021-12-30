import java.util.Scanner;

public class Ifstatement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        boolean biggerThan = x > 100;
        boolean minustal = x < 0;
        boolean smallerThan = x < 10;


        if (x < 0) {
            System.out.println("X er et minus tal");
        } else if (x < 10) {
            System.out.println("X er et lille tal");
        } else if (x > 100) {
            System.out.println("X er et stort tal");
        }

        System.out.println("Indtast alder");
        int age = scanner.nextInt();
        if (age > 100) {
            System.out.println("Du burde være død");
        } else if (age > 60) {
            System.out.println("Tid til pension");
        } else if (age > 18) {
            System.out.println("Nu du voksen");
        } else{
            System.out.println("Du er stadig et barn");
        }


        double z = 25;
        int imput = scanner.nextInt();
        if (imput != 0) {
            System.out.println(z / imput);
        }
        if (imput == 0) {
            System.out.println("Kan det ikke regnes");
        }




    }
}
/* Opgave 4.1
Definere en variable kaldet age med typen int og sæt den til brugerinputtet  (værdien af scanner.nextInt())
hvis age er større end 100 så print ud "Du burde være død"
ellers så hvis age er større end 60 så print ud "Tid til pension"
Ellers så hvis age er større end 18 så print ud "Nu du voksen"
I alle andre tilfælde så print ud "Du er stadig et barn"

Opgave 4.2
Gå tilbage til opgave 4.0 ændre nu sådan at den max printer en ting ud i stedet for 2(i tilfælde tallet man skriver er i minus)
OBS/hint man må selv bestemme rækkefølgen man checker i

Opgave 4.3:
Definere en variable kaldet z med typen double og initialisere(sæt) den til 25
Definere en variable kaldet input med typen int og initialisere(sæt) den til værdien af scanner.nextInt();
print ud hvad z dividerede med input giver(hint du dividere via / tegnet)
prøv at skriv input ind som 0 - hvad sker der? og hvordan kan i fixe det(det er ikke tilladt at dividere med 0!)?

 */

/*opgave 4.0:
        Opret en scanner som set her -> Scanner scanner = new Scanner(System.in);
        definere en variable x med typen int og initialisere den til scanner.nextInt();

        Hvis x er mindre end 10 så print ud "X er et lille tal"
        Hvis x er mindre end 0 så print ud "X er et minus tal"
        Hvis x er større end 100 så print ud "X er et minus tal"
 */