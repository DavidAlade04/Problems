package Leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LargestPalindrome {
    //Write a Java program to print out the largest palindromic number made from the product of two 3-digit numbers



    public static boolean isPalindrome(int x)
    {
        int temp = x;
        int reverse = 0;
        {
        while(temp!= 0)
        {
            reverse = (reverse*10) + (temp%10);
            temp = temp/10;
        }
        return(x==reverse);
        }
    }

    public static void main(String[] args) {
        int multiple = 0;
        List <Integer> values = new ArrayList<>();
        for(int i = 999; i > 0; i--)
        {
            for(int j = 999; j > 0; j--)
            {
                multiple = i * j;
                if(isPalindrome(multiple))
                {
                    values.add(multiple);
                    
                }
                
            }
        }
        System.out.println(Collections.max(values));
        
    }
}
