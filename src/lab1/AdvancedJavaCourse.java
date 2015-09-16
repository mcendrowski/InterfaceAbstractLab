package lab1;

import javax.swing.JOptionPane;

/**
 * Class AdvancedJavaCourse stores 4 properties and no property could be moved
 * to the super class
 *
 * @author Mariusz Cendrowski
 * @version 1.00
 */
public class AdvancedJavaCourse extends ProgrammingCourse {

    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

//    public AdvancedJavaCourse(String courseName, String courseNumber) {
//        this.setCourseName(courseName);
//        this.setCourseNumber(courseNumber);
//    } // better version of constructor is below
    public AdvancedJavaCourse(String courseName, String courseNumber) {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
    }

//    public String getCapitalizedCourseName() {
//        return this.getCourseName().toUpperCase(); // code may be simplified as below
//    }
    public String getCapitalizedCourseName() {
        return this.courseName.toUpperCase();
    }

    public String getPrerequisites() {
        return this.prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        if (prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }

    @Override
    public void setCredits(double credits) {
        if (credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
//        this.setCredits(credits); // recursive relation
        this.credits = credits;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String getCourseNumber() {
        return courseNumber;
    }

    @Override
    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

}
