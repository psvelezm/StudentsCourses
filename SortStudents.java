
package lab1;

import java.util.ArrayList;
import java.util.Arrays;

public class SortStudents {
        ArrayList<Student> students = new ArrayList<Student>();
	ArrayList<Student> newStudents = new ArrayList<Student>();
	ArrayList<Student> finalStudents = new ArrayList<Student>();
	String[] studentsNameArray = new String[10];
        
        SortStudents(){
            
        }
        public void addStudentsToSort(Student student){
                students.add(student);
              
        }
        private void sortStudentsNames(){
            
                for(int i = 0; i < 10; i++){
                        studentsNameArray[i] = students.get(i).getLastName();
		}
		Arrays.sort(studentsNameArray);
		
		for(int i = 0; i < students.size(); i++){
			for(int k = 0; k < 10; k++){
				if(studentsNameArray[i].equals(students.get(k).getLastName())){
					newStudents.add(students.get(k));
				}
			}
		}
        }
        
        //this method will be presenting the students arranged by names
        public void presentSortedStudetns(){
                for(int i = 0; i < 10; i++){
                        System.out.println(newStudents.get(i).getStudentID() + " " + newStudents.get(i).getLastName() + "\t" + newStudents.get(i).getCourseList(1) + ", " + newStudents.get(i).getCourseList(2) + ", " + newStudents.get(i).getCourseList(3));
                }
            
        }
        //runs the show
        
        public void sortStudents(){
                sortStudentsNames();
                //sortStudentsClasses();
                
            
        }
}
