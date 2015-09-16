/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.Scanner;

/**
 *
 * @author MCENDROWSKI
 * During this exercise I realized (however my thoughts may
 * be wrong) that I may move a property to the super class only when: 
 * 1. property exists in all subclasses, and has to be used in any new, potential
 * sub classes 
 * 2. if I create a property which is not used by at least one sub
 * class, the program will not crash but this sub class will inherit a redundant
 * property 
 * 3. also, a private property in a super class requires concrete
 * getter and setter methods, otherwise sub classes have no access to the
 * property, an issue appears if some subclasses don't need those methods
 * because then they inherit it 
 * 4. as a consequence of 3. I can move to the super class only a property which has the same getters and setters in all
 * subclasses 
 * 
 * In the result none of the properties was moved to a super class.
 * As an improvement I suggest:
 * standardization all methods, e.g. all setCourseNumbers might have a check if any number was input, like it is in IntroToProgrammingCourse,
 * extending some classes with missing methods, e.g. AdvancedJavaCourse with getCredits, getCourseName, setCourseName in IntroJavaCourse,
 * then courseName,courseNumber and credits could be moved to the super class,
 * then all six getters and setters for those properties mentioned above, might be moved to super class as concrete methods, and made final,
 * 
 * 
 * 
 * StartUp presents two static methods which show how the way you create instances of the courses affects functionality.
 * showNumbersOfCourses method is an example of instances based on full functionality of each object.
 * This is why we can show number of programming courses, which method is different for different sub classes, and which method does not exist in super class.
 * But showCourseNames uses abstract layer of ProgrammingCourses, in order to perform one method common to all of the sub classes and super class: getCourseNumber.
 * The method realizes Liskov Substitution principle, by choosing super class structure, and then all the different courses become ProgrammingCourse objects (polymorphism),
 * and thus they can be uploaded to one array, which otherwise wouldn't be possible for different course classes.
 *
 */
public class StartUp {

    public static void main(String[] args) {
showNumbersOfCourses();
showCourseNames();
//lab2();

    }
    
    public static void showNumbersOfCourses(){

        AdvancedJavaCourse ajc = new AdvancedJavaCourse("Advanced Java","1234");        
        IntroJavaCourse ijc = new IntroJavaCourse("Intro Java","1235");        
        IntroToProgrammingCourse itpc = new IntroToProgrammingCourse("Intro to Programming","1236");        
        
        System.out.println("All number of programming courses:");
        System.out.println(ajc.getCourseNumber());
        System.out.println(ijc.getCourseNumber());
        System.out.println(itpc.getCourseNumber());
        System.out.println("---------------------------------------------------");
    }
    
    
    // why order of number and name is different in ProgrammingCourse?
    public static void showCourseNames(){
        ProgrammingCourse[] courses = new ProgrammingCourse[3];

        courses[0] = new AdvancedJavaCourse("1234", "Advanced Java");
        courses[1] = new IntroJavaCourse("1235", "Intro Java");
        courses[2] = new IntroToProgrammingCourse("1236", "Intro to Programming");
        System.out.println("All names of programming courses:");
        for (ProgrammingCourse course : courses) {
            System.out.println(course.getCourseNumber());
        }
    }
    
    public static void lab2(){
               String courseNumber;
        ProgrammingCourse[] courses = new ProgrammingCourse[3];
    

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
        
        
        System.out.println("First course:\t"+advJava.getCourseName()+"\t"+advJava.getCourseNumber()+"\t"+4+"\t"+advJava.getPrerequisites());
        System.out.println("Second course:\t"+"NO ACCESS"+"\t"+introJava.getCourseNumber()+"\t"+introJava.getCredits()+"\t"+introJava.getPrerequisites());
        System.out.println("Third course:\t"+"Intro To Programming"+"\t"+"NO ACCESS"+"\t"+introToProg.getCredits()+"\t"+"NO PREREQUISITES");

   courses[0] = new AdvancedJavaCourse(advJava.getCourseName(),advJava.getCourseNumber());
   courses[1] = new IntroJavaCourse("Intro Java",introJava.getCourseNumber());
   courses[1] = new IntroToProgrammingCourse("Intro To Programming",introToProg.getCourseNumber());
   
        for (ProgrammingCourse course : courses) {
            course.getCourseNumber();
        }
    }
}
