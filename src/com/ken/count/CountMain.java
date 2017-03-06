package com.ken.count;

import java.util.Arrays;
import java.util.Scanner;

public class CountMain {

    public static int countWords(String str)
    {
    	int j=0,l=0;
    	
    	String[] parts = str.split("(\\.)|(\\!)|(\\?)");
    	int k = parts.length;
    	System.out.println("The Entered string has "+k+" sentences.");
    	for (j=1; j<k; j++)
    	{
    		String sent= parts[j];
    		int count = 0;
    			for (int i=0;i<=sent.length()-1;i++)
    				{
    					if (sent.charAt(i) == ' ' && sent.charAt(i+1)!=' ')
    					{
    						count++;
    					}
    				}
    			if (count>l)
    				{
    					l=count;
    				}
    	}
		return l;
        
    }
    
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = in.nextLine();
        System.out.print("From the given string, the maximum number of words in the sentence is : " + countWords(sentence));
    }

}
