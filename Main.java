/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author Pedro
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // this class allow us to make the basics for what a student needs
        
            StudentTest studentTest = new StudentTest();
            
            //here we are making students from the information we made using the student test class
                Student student1 = studentTest.makeAStudent();
		Student student2 = studentTest.makeAStudent();
		Student student3 = studentTest.makeAStudent();
		Student student4 = studentTest.makeAStudent();
		Student student5 = studentTest.makeAStudent();
		Student student6 = studentTest.makeAStudent();
		Student student7 = studentTest.makeAStudent();
		Student student8 = studentTest.makeAStudent();
		Student student9 = studentTest.makeAStudent();
		Student student10 = studentTest.makeAStudent();
                
                
                //here we will create the sorting object which will be responsible for sorting the students by alphbetical order
		SortStudents sort = new SortStudents();
		//here we are adding the students to the sorting object
		sort.addStudentsToSort(student1);
		sort.addStudentsToSort(student2);
		sort.addStudentsToSort(student3);
		sort.addStudentsToSort(student4);
		sort.addStudentsToSort(student5);
		sort.addStudentsToSort(student6);
		sort.addStudentsToSort(student7);
		sort.addStudentsToSort(student8);
		sort.addStudentsToSort(student9);
		sort.addStudentsToSort(student10);
		//here we are telling the sorting object to start sorting
		sort.sortStudents();
    }
    
}
