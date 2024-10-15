import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Aufgabe 1
        UniversityGrading gradingSystem = new UniversityGrading();
        int[] grades = {29, 37, 38, 41, 84, 67};

        int[] failingGrades = gradingSystem.getFailingGrades(grades);
        System.out.println("Nicht asureichende Noten: " + Arrays.toString(failingGrades));
        System.out.println("Durschnittswert: " + gradingSystem.calculateAverage(grades));
        System.out.println("Abgerundete Noten: " + Arrays.toString(gradingSystem.roundGrades(grades)));
        System.out.println("Maximale abgerundete Note: " + gradingSystem.maxRoundedGrade(grades));

        // Aufgabe 2
        ArrayOperations arrayOperations = new ArrayOperations();
        int[] numbers = {4, 8, 3, 10, 17};

        System.out.println("Maximale Zahl: " + arrayOperations.findMax(numbers));
        System.out.println("Minimale Zahl: " + arrayOperations.findMin(numbers));
        System.out.println("Maximale Summe: " + arrayOperations.findMaxSum(numbers));
        System.out.println("Minimale Summe: " + arrayOperations.findMinSum(numbers));

        // Aufgabe 3
        LargeNumberOperations largeNumberOperations = new LargeNumberOperations();
        int[] num1 = {1, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] num2 = {8, 7, 0, 0, 0, 0, 0, 0, 0};
        int[] num3 = {8, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] num4 = {5, 4, 0, 0, 0, 0, 0, 0, 0};
        int[] num5 = {2, 3, 6, 0, 0, 0, 0, 0, 0};
        System.out.println("Addition von num1 und num2: " + Arrays.toString(largeNumberOperations.add(num1, num2)));
        System.out.println("Subtraktion von num3 und num4: " + Arrays.toString(largeNumberOperations.subtract(num3, num4)));
        System.out.println("Multipilkation von num5 mit 2: " + Arrays.toString(largeNumberOperations.multiply(num5, 2)));
        System.out.println("Division von num5 durch 2: " + Arrays.toString(largeNumberOperations.divide(num5, 2)));

        // Aufgabe 4
        Shopping shopping = new Shopping();
        int[] keyboards = {40, 35, 70, 15, 45};
        int[] keyboards2 = {15, 20, 10, 35};
        int[] usbs = {20, 15, 40, 15};
        int[] usbs2 = {15, 45, 20};
        int budget = 30;
        int budget2 = 60;
        int[] keyboards3 = {40, 50, 60};
        int[] usbs3 = {8, 12};
        int budget3 = 60;
        int[] keyboards4 = {60};
        int[] usbs4 = {8, 12};
        int budget4 = 60;
        int[] keyboards5 = {40, 60};
        int[] usbs5 = {8, 12};
        System.out.println("Billigste Tastatur: " + shopping.findCheapestKeyboard(keyboards));
        System.out.println("Teuerster Gegenstand: " + shopping.findMostExpensiveItem(keyboards2, usbs));
        System.out.println("Teuerstes USB-Laufwerk innerhalb des Budgets: " + shopping.findMostExpensiveUSBWithinBudget(usbs2, budget));
        System.out.println("Maximaler Geldbetrag: " + shopping.findMaxSpent(budget2, keyboards3, usbs3));
        System.out.println("Maximaler Geldbetrag: " + shopping.findMaxSpent(budget3, keyboards4, usbs4));
        System.out.println("Maximaler Geldbetrag: " + shopping.findMaxSpent(budget4, keyboards5, usbs5));
    }
}