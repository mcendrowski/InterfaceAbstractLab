/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author MCENDROWSKI During this exercise I realized (however my thoughts may
 * be wrong) that I may move a property to the super class only when: 1.
 * property exists in all subclasses, and has to be used in any new, potential
 * sub classes 2. if I create a property which is not used by at least one sub
 * class, the program will not crash but this sub class will inherit a redundant
 * property 3. also, a private property in a super class requires concrete
 * getter and setter methods, otherwise sub classes have no access to the
 * property, an issue appears if some subclasses don't need those methods
 * because then they inherit it 4. as a consequence of 3. I can move to the
 * super class only a property that has the same getters and setters in all
 * subclasses 5. as this is not the case for any of the properties methoif I
 * consider overriding concrete methods as a bad programming practice (which I
 * do here), I cannot move any property to th
 */
public abstract class ProgrammingCourse {

//    private String courseName; // cannot be moved to the super class as IntroJavaCourse class has no its getters and setters and other classes do
//    private String courseNumber; // cannot be moved as setCourseNumber method in IntroToProgrammingCours is different than in the other sub clases
//    private double credits; // cannot be moved as setCredits method in IntroToProgrammingCours is different than in the other sub clases
//    private String prerequisites; // cannot be moved it does not exist in IntroToProgrammingCourse class
    
// as there is no properties, no constructor can be implemented:
    
//     public ProgrammingCourse(String courseName, String courseNumber) {
//        this.courseName = courseName;
//        this.courseNumber = courseNumber;
//    }
    
//    public final String getCourseNumber() { //is exactly the same in all sub classes
//        return this.courseNumber;
//    }
    
//  as there is no properties, all methods have to be abstract
//    only three methods below exist in all sub classes:
    public abstract String getCourseNumber(); //this method is required in all classes

    public abstract void setCourseNumber(String courseNumber); //this method is required in all classes

    public abstract void setCredits(double credits); //this method is required in all classes

}
