import java.util.Scanner;

public class LommeregnerExercices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int input = -1;
        while (input == -1) {
            System.out.println("Vil du plus(1), minus(2), gange(3), dividere(4) eller afslut programmet(0)");


        }







    }
}
/* Lommeregner tid!

I skal nu lave en lommeregner

Lommeregneren fungere ved at der bliver først spurgt om følgende
"Vil du plus(1), minus(2), gange(3), dividere(4) eller afslut programmet(0)"
Hvorefter du indlæser et tal fra brugeren og gemmer det i en int variable kaldet action

Spørg herefter brugeren om at indtaste x(int)
indlæs et brugerinput fra brugeren og indsæt det i en int variable kaldet x
Spørg herefter brugeren om at indtaste y(int)
indlæs et brugerinput fra brugeren og initialisere det i en int variable kaldet y

Udfra hvad action er lav den korrekte udregning og print resultatet af den udregning

Forsæt med at spørger om input indtil man indtaster 0 - du må selv bestemme hvilket loop du bruger

Hvis brugeren prøver at dividere med 0 skal han få en fejl besked!

 */