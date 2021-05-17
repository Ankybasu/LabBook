package javaprograms;

import java.util.regex.*;
import java.util.ArrayList;
import java.util.Scanner;    
public class Email{  
    public static void main(String args[]){  
        ArrayList<String> emails = new ArrayList<String>();  
        Scanner sc=new Scanner(System.in);
        String e=sc.nextLine();
        emails.add(e);
        //Regular Expression   
        String regex = "^(.+)@(.+)$";  
        //Compile regular expression to get the pattern  
        Pattern pattern = Pattern.compile(regex);  
        //Iterate emails array list  
        for(String email : emails){  
            //Create instance of matcher   
            Matcher matcher = pattern.matcher(email);  
            System.out.println(email +" : "+ matcher.matches()+"\n");  
        }  
        sc.close();
    }  
}  
