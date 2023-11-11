package Exercise4;

public class Student {
    private final String name;
    private final int grade;
    private static int sumOfGrades = 0;
    private static int numberOfStudents = 0;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        sumOfGrades += grade;
        numberOfStudents++;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public static double calculateAverageGrade() {
        return (double) sumOfGrades / numberOfStudents;
    }
}