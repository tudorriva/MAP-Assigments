public class UniversityGrading {

    public int[] getFailingGrades(int[] grades) {
        int count = 0;
        for(int grade : grades) {
            if (grade < 40)
                count++;
        }

        int[] failingGrades = new int[count];
        int index = 0;
        for (int grade:grades) {
            if(grade < 40) {
                failingGrades[index] = grade;
                index++;
            }
        }
        return failingGrades;
    }
}
