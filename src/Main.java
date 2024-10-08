import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Aufgabe 1
        UniversityGrading gradingSystem = new UniversityGrading();
        int[] grades = {15, 39, 40, 41, 84, 99, 55};

        int[] failingGrades = gradingSystem.getFailingGrades(grades);
        System.out.println("Nicht asureichende Noten: " + Arrays.toString(failingGrades));
        System.out.println("Durschnittswert: " + gradingSystem.calculateAverage(grades));
        System.out.println("Abgerundete Noten: " + Arrays.toString(gradingSystem.roundGrades(grades)));
    }
}