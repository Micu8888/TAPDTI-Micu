package com.TAPDTI;

public class TAPDTI {
    public static void main(String[] args) 
    {
        int n=6;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=5;j++)
            {
                if(j==5)
                System.out.print("  ");
                else if(j==1||j==4||i==1||i==n)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            for(int j=1;j<=5;j++)
            {
                if(j==5)
                System.out.print("  ");
                else if(j==4||i==4||j+i==5)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            for(int j=1;j<=5;j++)
            {
                if(j+i==4&&j==3)
                System.out.print("  ");
                else if(j==1||j==5||j+i==4||j+i==6&&i<4)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
