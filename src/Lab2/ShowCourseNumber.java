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
public class ShowCourseNumber {
    private ProgrammingCourse course;
    
    public ShowCourseNumber(ProgrammingCourse course){
        this.course=course;
    }
    
    public String showCourseNumber(){
        return this.course.getCourseNumber();
    }
}
