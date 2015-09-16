package lab1;

/**
 * IntroJavaCourse class has four properties (no property was moved to the
 * superclass
 *
 * @author Mariusz Cendrowski
 * @version 1.00
 */
public class IntroJavaCourse extends ProgrammingCourse {

    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

    public IntroJavaCourse(String courseName, String courseNumber) {
        this.courseName = courseName;
//        setCourseNumber(courseNumber); // the code is simplified below
        this.courseNumber = courseNumber;
    }

    @Override
    public String getCourseNumber() {
        return courseNumber;
    }

    @Override
    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public double getCredits() {
        return credits;
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

    @Override
    public void setCredits(double credits) {
//        if(credits < 0 || credits > 5.0) { // correction accordingly to error description
        if (credits < 0.5 || credits > 4.0) {
            System.out.println(
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
//        this.setCredits(credits); // recursive relation
        this.credits = credits;
    }

}
