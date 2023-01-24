package student1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Simran
 * comments on 24th jan
 * this comment will bw used for rollback
 */
import java.util.Scanner;
/*author simran**/

public class ReverseWord {
    public static void main(String args[]){
       /* char[]=myWord=new char[7];
        myWord[0]=s;
        myWord[1]=t;
        myWord[2]=u;
        myWord[3]=d;
        myWord[4]=e;
        myWord[5]=n;
        myWord[6]=t;
        
        for(int i=0;i<myWord.length;i++){
            System.out.println(myWord.[i]);
        }*/
       Scanner sc=new Scanner(System.in);
       System.out.println("enter word");
       String word=sc.nextLine();
       char[] myLetters=new char[word.length()];
       for(int i=0;i<myLetters.length;i++){
           myLetters[i]=word.charAt(i);
           System.out.println(myLetters[i]);
           
       }  
       
       for(int i=myLetters.length-1;i>=0;i--){
           myLetters[i]=word.charAt(i);
           System.out.println(myLetters[i]);
       }
        
        
    }
    
}
