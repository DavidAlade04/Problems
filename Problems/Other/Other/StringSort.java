package Other.Other;
import java.util.Arrays;

public class StringSort {
/*Write a Java program which takes in an array of Strings and prints
them out ordered according to their size, with the shortest Strings being printed first. 
If two Strings have the same size, then they should be printed out in alphabetical order. */


    public static String [] stringSort(String [] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            for(int j = 0; j < array.length - 1; j++)
            {
                
                if(array[j].length() > array[j+1].length())
                {
                    String temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    
                }
            }
        }   
            return array;
    }

        public static void main(String[] args) {
            String [] input = {"a","moon","strawberry","hi","encyclopedia","cat","transformation","ok","zephyr","xylophone"};

            stringSort(input);
            System.out.println(Arrays.toString(input));

        }
}
