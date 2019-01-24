package pillbox;

import java.util.Scanner;

/**
 *
 * @author Mohit
 */
public class algorithm {

/**A class to take in a word from the user
 * and print reverse of the word using array
 * @param args
 * **/
    
    public static void main(String[] args){
    
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter a word");
        String word=sc.nextLine();
        
        //create array
        char c[]=new char[word.length()];
        
        //Populate array c
        for(int i=0;i<word.length();i++)
        {
            c[i]=word.charAt(i);
        }
        
        for(int i=c.length-1;i>=0;i--)
        {
            System.out.println(c[i]);
        }
        
    }
    
    
}
