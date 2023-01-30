package com.practice1;

public class practiceloop 
{
    public static void main(String[] args)
    {
            int n=5;
            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=n;j++)
                {
                    if(i+j==7&&j==2)
                    System.out.print("  ");
                    else if(i+j==7&&j>3)
                    System.out.print("  ");
                    else if(i+j==9&&j==n)
                    System.out.print("  ");
                    else if(j==1||i+j==n||i+j==7||i+j==9)
                    System.out.print("* ");
                    else
                    System.out.print("  ");
                }
                System.out.println();
        }
    }
}
//note:
//j = coloumn & i = row
//top row == 1
//bot row == n
//left col == 1
//right col == n 
//mid row & col == n/2+1
//right diagonal: i==j
//left diagonal: i+j==n+1