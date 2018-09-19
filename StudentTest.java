package lab1;

import java.util.Random;

public class StudentTest {
    private int[] studentIDs = new int[10];
    private int nextID = 0;
    
    private String[] studentLastNames = new String[10];
    private int[] studentLastNamesPicked = {15, 15, 15, 15, 15, 15, 15, 15, 15, 15};
    private int nextPosition = 0;
    
    private String[] coursesNames = {"CNT", "CTS", "COP", "CGS"}; 
    private int[] courseNumbersCNT = new int[3];
    private int[] courseNumbersCTS = new int[3];
    private int[] courseNumbersCOP = new int[3];
    private int[] courseNumbersCGS = new int[3];
    
    StudentTest(){
        String[] studentLastNames = {"May", "Jay", "Trump", "Barnes", "Rogers", "Stark", "Banner", "Fury", "Bucky", "Thanos"};
        this.studentLastNames = studentLastNames;
        courseMaker();
    }
    
    //Method that creates specialized IDs for students
    private String createStudentID(){
        
        Random number = new Random();
        Boolean same = true;
        int counter = 0;
        int studentID;
        String studentIDToString;
        
        do{
            counter = 0;
            studentID = number.nextInt(9999)+1;
            for (int i = 0; i < studentIDs.length; i++){
                    if (studentID != studentIDs[i]){
                        counter++;
                    }
                    if(counter == 10){
                    same = false;
                    }            
            }
            if (same = false){
                    studentIDs[nextID] = studentID;
                    nextID++;
            }
                
                
           }while (same == true);
           studentIDToString = Integer.valueOf(studentID).toString();
           
           if(studentID < 1000){
               if(studentID < 10){
                        studentIDToString = "000"+ Integer.valueOf(studentID).toString();
               }else if(studentID < 100){
                        studentIDToString = "000"+ Integer.valueOf(studentID).toString();
               }else{
                        studentIDToString = "0" + Integer.valueOf(studentID).toString();
               }
               
               
            }
           return studentIDToString;
               
        
    }
    
    //Method gets students individual last name
    
    private String studentLastName(){
            
            String lastName = null;
            Random number = new Random();
            int lastNamePosition;
            int counter = 0;
            boolean lastNameHasntBeenPicked = true;
            
            do{
                    counter = 0;
                    lastNamePosition = number.nextInt(10);
                    
                    for(int i = 0; i < studentLastNamesPicked.length; i++){
                            if(lastNamePosition != studentLastNamesPicked[i]){
                                    counter++;
                            }
                    }
                    if (counter == 10){
                            lastNameHasntBeenPicked = false;
                    }
                    if (lastNameHasntBeenPicked == false){
                            studentLastNamesPicked[nextPosition] = lastNamePosition;
                            studentIDs[nextPosition] = lastNamePosition;
                            nextPosition++;
                            
                        
                    }
                                 
            }while(lastNameHasntBeenPicked == true);
            
            lastName = studentLastNames[lastNamePosition];
            
            return lastName;           
    }
    
    private void courseMaker(){
            Random number = new Random();
            int time = 1;
            int courseNumber1;
            int courseNumber2;
            int courseNumber3;
            
            for(int i = 0; i < 4; i++){
                    courseNumber1 = number.nextInt(8999);
                    courseNumber2 = number.nextInt(8999);
                    courseNumber3 = number.nextInt(8999);
                    
                    courseNumber1 += 1000;
                    courseNumber2 += 1000;
                    courseNumber3 += 1000;
                    if (courseNumber1 != courseNumber2 && courseNumber2 != courseNumber3){
                    
                            if(time == 1){
                                    courseNumbersCNT[0] = courseNumber1;
                                    courseNumbersCNT[1] = courseNumber2;
                                    courseNumbersCNT[2] = courseNumber3;
                                
                            }else if(time ==2 ){
                                    courseNumbersCTS[0] = courseNumber1;
                                    courseNumbersCTS[1] = courseNumber2;
                                    courseNumbersCTS[2] = courseNumber3;                          
                            }else if(time == 3){
                                
                                    courseNumbersCOP[0] = courseNumber1;
                                    courseNumbersCOP[1] = courseNumber2;
                                    courseNumbersCOP[2] = courseNumber3;
                            }else if(time == 4) {
                                    courseNumbersCGS[0] = courseNumber1;
                                    courseNumbersCGS[1] = courseNumber2;
                                    courseNumbersCGS[2] = courseNumber3;
                                
                                
                            }
                            time++;
                    
                        
                        
                        
                    }else{
                            i--;
                    }               
            }                        
    }
    
    //Method Gets course Name
    //Method assigns courses to students
    
    private String[] courseGiverName(){
            String[] coursesNamesArray = new String[3];
            Random number = new Random();
            int courseNamePosition;
            String courseName;
            
            for(int i = 0; i < 3; i++){
                    courseNamePosition = number.nextInt(4);
                    courseName = coursesNames[courseNamePosition];
                    
                    coursesNamesArray[i] = courseName;
                
                    if(i == 1){
                            if(coursesNamesArray[i].equals(coursesNamesArray[0])){
                                    i--;
                            }
                        
                    }else if(i == 2){
                            if(coursesNamesArray[i].equals(coursesNamesArray[0]) || coursesNamesArray[i].equals(coursesNamesArray[1])){
                                
                                    i--;
                            }
                        
                    }
            }
            return coursesNamesArray;
        
    }
    
    //Method gets the course Number connected to the name
    private int[] courseGiverNumber(String[] courseNamesArray){
            int[] courseNumber = new int[3];
            Random number = new Random();
            int courseNumberPosition;
            int currentCourseNumber = 0;
            
            for(int i = 0; i < 3; i++){
                    
                    courseNumberPosition = number.nextInt(3);
                    
                    if(courseNamesArray[i].equals("CNT")){
                            currentCourseNumber = courseNumbersCNT[courseNumberPosition];
                    }else if (courseNamesArray[i].equals("CTS")){
				currentCourseNumber = courseNumbersCTS[courseNumberPosition];
		    }else if(courseNamesArray[i].equals("COP")){
				currentCourseNumber = courseNumbersCOP[courseNumberPosition];
		    }else if(courseNamesArray[i].equals("CGS")){
				currentCourseNumber = courseNumbersCGS[courseNumberPosition];
	            }
		    courseNumber[i] = currentCourseNumber;
			
		    if(i == 1){
				if(courseNumber[i] == courseNumber[0]){
					i--;
				}
		    }else if(i == 2){
				if(courseNumber[i] == courseNumber[0] || courseNumber[i] == courseNumber[1]){
					i--;
				}
		    }
             
            }
            return courseNumber;
                       
    }
    
    //Method will create the student
    public Student makeAStudent(){
        
        String studentID = createStudentID();
        String lastName = studentLastName();
        String[] coursesName = courseGiverName();
        int[] coursesNumber = courseGiverNumber(coursesName);
        Student student = new Student(studentID, lastName, coursesName, coursesNumber);
        
        return student;
    }  
}