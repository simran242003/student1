/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 Date:24 jan 2023 for pull command
 */
package student1;

public class StudentList {
    public static void main(String args[]){
      //  student1 s1=new student1("s1","Ronak");
      Student1[] studentList=new Student1[3];
      studentList[0]=new Student1("s1","ronak");
       studentList[1]=new Student1("s1","xyz");
        studentList[2]=new Student1("s1","abc");
        for(int i=0;i<studentList.length;i++){
            System.out.println(studentList[i].getStudentName());
        }
    }
      
    
}
