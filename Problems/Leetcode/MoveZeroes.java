package Leetcode;

public class MoveZeroes {
    



    public static void moveZeroes(int [] num)
    {

        //Start at index 0

        //If Not Zero keep moving 

        //If Zero do nothing but insertPos remains the previous value and gets swapped with num after Zero
        int insertPos = 0;

        for(int i = 0; i < num.length; i++)
        {
            if(num[i] != 0)
            {
                num[insertPos] = num[i];
                insertPos++;
            }
        }

        //Fill in remaining elements with Zero
        while(insertPos<num.length)
        {
            num[insertPos] = 0;
            insertPos++;
        }
    }
}
