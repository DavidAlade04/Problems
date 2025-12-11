package Leetcode;

import java.util.Arrays;

public class CountPrimes {
    public int countPrimes(int n) {

        if(n == 1 || n == 0)
        {
            return 0;
        }
        boolean [] prime = new boolean[n];
        int count = 0;

        Arrays.fill(prime,true);

        for(int i = 2; i < Math.sqrt(n); i++)
        {
            if(prime[i])
            {
                for(int j = i * i; j <n; j+=i)
                {
                    prime[j] = false;
                }
            }
        }
            for(int l = 2; l < n; l++)
            {
                if(prime[l])
                {
                    count++;
                }
            }
            return count;


    }
}
