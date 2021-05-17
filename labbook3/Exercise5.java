package labbook3;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String input=sc.nextLine();
		int wordCount=0;
		int lineCount=0;
		int characterCount=0;
		String[] sentences=input.split("[!?.:]+");
		lineCount=sentences.length;
		for(int i=0;i<lineCount;i++) {
				String[] words=sentences[i].trim().split(" ");
				int b=words.length;
				wordCount+=b;
				for(int j=0;j<b;j++) {
					for(int k=0;k<words[j].length();k++) {
						if(words[j].charAt(k)>='a'||words[j].charAt(k)<='z')
							characterCount++;
					}
			}
		}
				
				System.out.println("Total word count = " + wordCount);
				System.out.println("Total number of sentences = " + lineCount);
				System.out.println("Total number of characters = " + characterCount);
				sc.close();
			}
	}

