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
    }
}