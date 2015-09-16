/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab2;

/**
 *
 * @author MCENDROWSKI
 */
public interface ProgrammingCourse {
    
    public abstract String getCourseNumber(); //this method is required in all classes

    public abstract void setCourseNumber(String courseNumber); //this method is required in all classes

    public abstract void setCredits(double credits); //this method is required in all classes
    
}
