package lab3.calculator;

public class LogicalOp {
    public int checkBiggerNumber(int a, int b) {
        if (a > b) {
            return a;
        } else if (b > a) {
            return b;
        } else {
            return b;
        }
    }

    public String checkText(String GoodJob, String FastTrackIT) {
        if (GoodJob.equals(FastTrackIT)) {
            return ("Learning text comparison");
        } else {
            return ("Got to try some more");
        }
    }

    //5. Creati o metoda de tip String, care sa primeasca un parametru
    // de tip String, si un parametru de tip int. Daca textul primit ca si
    // parametru este egal cu “FastTrackIT”, si numarul primit ca si parametru
    // este mai mic sau egal cu 3, returnati textul si numarul, in ordinea asta.
    // Daca textul nu este “FastTrackIT” si numarul este mai mare sau egal cu 4,
    // returnati numarul si textul, in ordinea asta. Apelati metoda in main() pentru a verifica daca functioneaza.
    public String check(String text, String FastTrackIT) {
        int x = 9;
        int y = 3;
        int z = 4;
        if (text.equals(FastTrackIT) && (x <= y)) {
            return text + x;
        } else if (!text.equals(FastTrackIT) && (x >= z)) {
            return x + text;
        } else {
            return x + text;
        }
    }
//6. Creati o metoda de tip String, care sa primeasca un parametru de tip int.
// Daca numarul primit este mai mare de 8, SAU egal cu 6, atunci sa se returneze
// “The amount of snow this winter was(cm): “ si numarul. Daca nu, sa printeze
// “The forecast snow is(cm):” si numarul. Apelati metoda in main() pentru a verifica daca functioneaza.

    public String snow() {
        int x = 15;


        if ((x > 8 || (x == 6))) {
            return "The amount of snow this winter was(cm): " + x;
        } else {
            return "The forecast snow is(cm): " + x;

        }
    }
//7. Creati o metoda de tip String, care sa primeasca un parametru de tip numar.
// Daca numarul e mai mare decat 3, SI nu egal cu 4,
// returnati “The number is greater than 3 and not equal to 4”.
// Daca numarul este egal cu 4, returnati “The number is equal to 4”,
// iar daca numarul este mai mic de 3 returnati “The number is lower than 3”.
// Apelati metoda in main() pentru a verifica daca functioneaza.


    public String big() {
        int x = 99;
        if ((x > 3) && (x != 4)) {
            return "The number is greater than 3 and not equal to 4";
        } else if (x == 4) {
            return "The number is equal to 4";
        } else if (x < 3) {
            return "The number is lower than 3";
        } else {
            return "The number is lower than 3";

        }
    }
//8. Creati o metoda care primeste un numar ca si parametru si sa afiseze ce numar a primit.
// Folosind constructia Switch-Case, verificati ce numar s-a primit si afisati textul
// "The number is:  x !" unde x trebuie sa reprezinte numarul apasat. Pentru exemplul
// de fata sa nu se foloseasca concatenarea stringului "The number is:" cu numarul de la parametru,
// ci sa se scrie intreg textul cu tot cu numar pentru fiecare caz din Switch-Case.
// Apelati metoda in main() pentru a verifica daca functioneaza.


    public int number(int x) {

        switch (x) {
            case 1:
                System.out.println("The number is: 1");
                break;
            case 2:
                System.out.println("The number is: 2");
                break;
            case 3:
                System.out.println("The number is: 3");
                break;
            case 4:
                System.out.println("The number is: 4");
                break;
            case 5:
                System.out.println("The number is: 5");
                break;
        }
        return x;
    }


//9. Creati o metoda care sa se numeasca isNumberEven.
// Metoda trebuie sa primeasca ca parametru un numar, si sa returneze adevarat sau fals.
// Daca numarul e par sa returneze true iar daca e impar sa returnese false.
// Apelati metoda in main() pentru a verifica daca functioneaza.

    public boolean isNumberEven() {
        int x = 5;
        if (x % 2 == 0) {
            return true;
        } else {
            return false;
        }


    }


    public boolean isEligibleToVote() {
        int x = 16;
        if (x >= 18) {
            return true;
        } else {
            return false;
        }

    }

//11. Creati o metoda care sa primeasca 3 numere ca si parametrii si sa returneze cel mai mare numar.
// Apelati metoda in main() pentru a verifica daca functioneaza.

    public int bigger() {
        int x = 5;
        int y = 99;
        int z = 15;
        if (x > y) {
            if (x > z) {
                return x;
            } else {
                return y;
            }
        } else if (y > x) {
            if (y > z) {
                return y;

            }
            } else {

            }return z;}}