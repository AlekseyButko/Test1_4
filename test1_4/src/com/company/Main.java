package com.company;

public class Main {

    public static void main(String[] args) {
	int N = 20;
    System.out.print(countBinaries(N));
    }
    static int countBinaries(int N)
    {
        int ctr = 1;
        int ans = 0;
        while (N > 0)
        {


            if (N % 10 == 1)
            {
                ans += Math.pow(2, ctr - 1);
            }


            else if (N % 10 > 1)
            {
                ans = (int) (Math.pow(2, ctr) - 1);
            }
            ctr++;
            N /= 10;
        }
        return ans;
    }
}
