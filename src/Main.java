public class Main {
    public static void main(String[] args) {
        PrintFigures("*", 10, true);
        PrintFigures("*", 10, true);

        PrintFigures("*", 4, false);
        PrintFigures(" ", 5, false);
        PrintFigures("*", 5, true);

        PrintFigures("*", 4, false);
        PrintFigures(" ", 5, false);
        PrintFigures("*", 5, true);

        PrintFigures("*", 10, true);
        PrintFigures("*", 10, true);

        PrintFigures("*", 4, false);
        PrintFigures(" ", 5, false);
        PrintFigures("*", 5, true);

        PrintFigures("*", 4, false);
        PrintFigures(" ", 5, false);
        PrintFigures("*", 5, true);

        PrintFigures("*", 10, true);
        PrintFigures("*", 10, true);
    }

    public static void PrintFigures(String figure, int amount, boolean breakLine) {
        for (int i = 0; i < amount; i++) {
            System.out.print(figure);
        }

        if (breakLine) {
            System.out.println();
        }
    }
}

/*
*
* **********
* **********
* ****     *****
* ****     *****
* **********
* **********
* ****     *****
* ****     *****
* **********
* **********

* */