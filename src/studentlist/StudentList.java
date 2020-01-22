/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentlist;

import java.util.Scanner;

/**
 *
 * @author brianbae
 */
public class StudentList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i;
        System.out.print("Please enter a word: ");
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        int L = word.length();
        char [] letters = new char[L];
        // have a loop to populate the array
        for(i = 0; i < L; i++){
            letters[i]  = word.charAt(i);
        }
        
        System.out.print("\nHere is the word from the array:");
        
        // print out the word
        for (char letter: letters){
            System.out.print(letter);
        }
        
        // print out the word in reverse
        System.out.print("\n\nHere is the word backward:");
        for (i = L - 1; i >= 0; i--){
            System.out.print(letters[i]);
        }
        System.out.println("\n");
        
        Student [] studentList = new Student[3];
        for (i = 0; i < studentList.length; i++){
            System.out.print("Enter the student name: ");
            String name = input.nextLine();
            Student student = new Student(name);
            studentList[i] = student;
        }
        
        System.out.println("\nNow, we print them out");
        for(Student student: studentList)
            System.out.println(student.getName());
    }
    
}
