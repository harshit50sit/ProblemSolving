package String_Problems;

import java.util.*;

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    // Ensure proper comparison in Map keys
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Student)) return false;
        Student other = (Student) obj;
        return Objects.equals(this.name, other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return name;
    }
}

public class MaxAverageStudents {
    public static void main(String[] args) {
        Map<Student, List<Integer>> scores = new HashMap<>();

        scores.put(new Student("Jerry"), Arrays.asList(75, 98));
        scores.put(new Student("Bob"), Arrays.asList(91, 81));
        scores.put(new Student("Eric"), Arrays.asList(83));

        Student bestStudent = findBestAverage(scores);
        System.out.println("Best student: " + bestStudent);
    }

    private static Student findBestAverage(Map<Student, List<Integer>> scores) {
        Student bestStudent = null;
        double bestAverage = 0.0;

        for (Map.Entry<Student, List<Integer>> entry : scores.entrySet()) {
            Student student = entry.getKey();
            List<Integer> marks = entry.getValue();

            double average = marks.stream().mapToInt(Integer::intValue).average().orElse(0.0);
            /*
            int sum = 0;
            for (int mark : marks) {
                sum += mark;
            }

            double average = (double) sum / marks.size();
            System.out.println("Student: " + student + ", Average: " + average);
             */
            System.out.println("Student: " + student + ", Average: " + average);

            if (bestStudent == null || average > bestAverage) {
                bestAverage = average;
                bestStudent = student;
            }
        }

        return bestStudent;
    }
}

