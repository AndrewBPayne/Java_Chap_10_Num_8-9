package collegecourse;



/**
 *
 * @author AndrewPayne
 */
public class CollegeCourse {

        String department;
        int courseNumber; 
        int creditHours;
        int fee;
        
       CollegeCourse(String department, int courseNumber, int creditHours){
        this.department = department;
        this.courseNumber = courseNumber;
        this.creditHours = creditHours;
        
        this.fee = creditHours * 120;
    }
    
    void display(){
        System.out.println("This is your course");
        System.out.println("Department: " + this.department);
        System.out.println("Course Number: " + this.courseNumber);
        System.out.println("Credits: " + this.creditHours);
        System.out.println("Total Amount: " + this.fee);
    }
    
    
    
    
    
    
}