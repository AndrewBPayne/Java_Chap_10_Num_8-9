package collegecourse;

/**
 *
 * @author AndrewPayne
 */
public class LabCourse extends CollegeCourse {

    public LabCourse(String department, int courseNumber, int creditHours) {
        super(department, courseNumber, creditHours);
        
        this.fee = (creditHours * 120) + 50;
    }

    
    
    @Override
    void display(){
        System.out.println("This is your LabCourse");
        System.out.println("Department: " + this.department);
        System.out.println("Course Number: " + this.courseNumber);
        System.out.println("Credits: " + this.creditHours);
        System.out.println("Total Amount: " + this.fee);
    }
}