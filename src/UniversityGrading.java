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

    public double calculateAverage(int[] grades) {
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }

        return sum / grades.length;
    }

    public int[] roundGrades(int[] grades) {
        int[] roundedGrades = new int[grades.length];
        for(int i = 0; i< grades.length; i++)
        {
            int grade = grades[i];
            if( grade < 38) {
                roundedGrades[i] = grade;
            } else {
                int nextMultipleOfFive = ((grade / 5) + 1) * 5;
                if(nextMultipleOfFive - grade < 3) {
                    roundedGrades[i] = nextMultipleOfFive;
                }
                else {
                    roundedGrades[i] = grade;
                }
            }
        }

        return roundedGrades;
    }
}
