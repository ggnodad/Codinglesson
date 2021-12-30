import java.util.Scanner;

public class ScopeExercice {
    public static void main(String[] args) {
        int x;
        { // scopet må ikke rykkes
            Scanner scanner = new Scanner(System.in);//scanneren skal forblive inde i scopet
            System.out.println("Indtast et tal");
            x = scanner.nextInt();
        } // scopet må ikke eyries
        System.out.println(x); //Denne linje må ikke rykkes!
    }
}
