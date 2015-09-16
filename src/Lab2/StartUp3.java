/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2;

import java.util.Scanner;

/**
 *
 * @author MCENDROWSKI
 */
public class StartUp3 {
      public static void main(String[] args) {
        
        String courseNumber;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Input number of Advanced Java Course:");
        courseNumber = keyboard.nextLine();        
        AdvancedJavaCourse advJava = new AdvancedJavaCourse("Advance Java",courseNumber);
        advJava.setCredits(4);
        advJava.setPrerequisites("Yes");
        
        System.out.println("Input number of Intro Java Course:");
        courseNumber = keyboard.nextLine();        
        IntroJavaCourse introJava = new IntroJavaCourse("Intro Java",courseNumber);
        introJava.setCredits(4);
        introJava.setPrerequisites("Yes");
        
        System.out.println("Input number of Intro To Programming Course:");
        courseNumber = keyboard.nextLine();        
        IntroToProgrammingCourse introToProg = new IntroToProgrammingCourse("Intro To Programming",courseNumber);
        introToProg.setCredits(3);
        
        
        System.out.println("First course:\t"+advJava.getCourseName()+"\t"+advJava.getCourseNumber()+"\t"+advJava.getCredits()+"\t"+advJava.getPrerequisites());
        System.out.println("Second course:\t"+"NO ACCESS"+"\t"+introJava.getCourseNumber()+"\t"+introJava.getCredits()+"\t"+introJava.getPrerequisites());
        System.out.println("Third course:\t"+introToProg.getCourseName()+"\t"+"NO ACCESS"+"\t"+introToProg.getCredits()+"\t"+"NO PREREQUISITES");

    }

    
}
