/*
Write a program that defines four variables named score1, score2, 
score3, and score4 — one for each of a student's four test scores. 
Assign appropriate values to the variables. Define another variable 
named average in the program. Have the program calculate the average 
of the test scores and assign the result to the variable:
*/

public class StudentScores {
  public static void main(String[] args) {
    int score1 = 15, score2 = 3, score3 = 8, score4 = 16;
    double average = (score1 + score2 + score3 + score4) / 4.0;


    System.out.println("Score 1: " + score1);
    System.out.println("Score 2: " + score2);
    System.out.println("Score 3: " + score3);
    System.out.println("Score 4: " + score4);
    System.out.println("Average: " + average);
    
  }
}