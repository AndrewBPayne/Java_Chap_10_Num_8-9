package collegecourse;
import java.util.Scanner;
/**
 *
 * @author AndewPayne
 */
public class UseCourse {
    
       
        
        final String[] departmentArray = new String[] {"BIO","CHM","CIS","PHY"};
        int courseNumber;
        int creditHours;
        
        Scanner scann = new Scanner(System.in);
        
 
        void getInfo(){
            
            System.out.println("Please enter the 3 leter code for your class");
            Boolean lab = false;
            
            
            
            String dep = scann.nextLine();
            
        for(String s : departmentArray){
            
            if (dep.equals(s)) 
            {
                
            createLabCourse(s);    
                lab = true;
                break;
                
            }
        }
        if(lab == false){
            CreateCollegeCourse(dep);
            
        }
    }
        
        void getInformation(){
            System.out.println("Enter course number");
            courseNumber = scann.nextInt();
            
            System.out.println("Enter creditHours");
            creditHours = scann.nextInt();
        }
             
    
        void createLabCourse(String department){
           getInformation();
           LabCourse l = new LabCourse(department, courseNumber, creditHours);
            
           l.display();
           scann.close();
            
    }
      
       void CreateCollegeCourse(String department) {
           getInformation();
           CollegeCourse c = new CollegeCourse(department, courseNumber, creditHours);
           
           c.display();
           scann.close();
           
    }
}