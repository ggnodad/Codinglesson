import java.util.Scanner;

public class ForExerice {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        for (int x=15; x>0; x=-1) {
            System.out.println(x);
        }
        System.out.println("Indtast tallet her");
        int imput = scanner.nextInt();
        for(int y=imput; y>0; y=y-1){
        System.out.println(y);
        }

        while (true) {
            int R=scanner.nextInt();
            if (R==25) {
                break;
            }else{
                System.out.println(R);
            }
        }


    }
}


/* Opgave 6.4:
Lav et while loop der køre forevigt "while (true)"
Inde i loopet skal du tage imod brugerinput og gemme det i en int variable, du bestemmer selv navnet på variablen
Hvis brugerinputtet er 25 så break ud af loopet.
hvis brugerinputtet ikke er 25 så print inputtet ud
Kan du nøjes med at bruge en if statement?
 */

/* Opgave 6.1:

Lav et for loop der definere en variable x og initialisere den til 15
for loopet skal køre så længe x er større end 0, hver gang loopet har kørt rundt skal du trække 1 fra x
Inde i loopet skal du printe x

Opgave 6.2:

Print en besked ud hvor du spørger efter et bruger input
Lav et for loop der definere en variable y og initialisere den til et brugerinput
for loopet skal køre så længe y er større end 0, hver gang loopet har kørt rundt skal du trække en fra y
inde i loopet skal du printe y ud.

Opgave 6.3(valgfri):
Lav et program ved hjælp af 2 for loops der printer følgende ud:
1
22
333
4444
55555

 */