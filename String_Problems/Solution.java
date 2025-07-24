package String_Problems;


import java.util.*;
public class Solution {
    public static void main(String[] args) {
       String[][] scores = {
              {"jerry", "75"},
              {"bob", "91"},
              {"jerry", "98"},
               {"bob", "81"},
              {"Eric", "83"}
       };
       String bestStudent = findBestAverage(scores);
       System.out.println("Best student: " + bestStudent);
    }

    private static String findBestAverage(String[][] scores) {
        String bestStudent = "";
        double bestAverage = 0.0;
        Map<String, int[]> studentScores = new HashMap<>();

        for (String[] score : scores) {
            String student = score[0];
            int marks = Integer.parseInt(score[1]);

            //studentScores.putIfAbsent(student, new int[]{0, 0}); // {totalMarks, count}
            if(!studentScores.containsKey(student)) {
                studentScores.put(student, new int[]{0, 0}); // {totalMarks, count}
            }
            int[] currentScores = studentScores.get(student);
            currentScores[0] += marks; // totalMarks
            currentScores[1]++; // count
        }

        for (Map.Entry<String, int[]> entry : studentScores.entrySet()) {
            String student = entry.getKey();
            int[] scoresData = entry.getValue();
            double average = (double) scoresData[0] / scoresData[1];
            //bestAverage = Math.max(bestAverage, average);
            System.out.println("Student: " + student + ", Average: " + average);
            bestStudent = student;
            if (average > bestAverage) {
                bestAverage = average;
                bestStudent = student;
            }
        }

        return bestStudent;
    }
}
