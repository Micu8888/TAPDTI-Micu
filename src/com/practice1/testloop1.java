package com.practice1;

import java.util.Scanner;

public class testloop1
{
    public static void main(String[] args)
    {

        try (Scanner scan = new Scanner(System.in))
        {
            int N,x=0,i=1;
            System.out.print("Masukkan angka yang Anda inginkan = ");
            N=scan.nextInt();
            while (i<=N)
            {
                x=i*i;
                System.out.print(x+ " ");
                i++;
            }
        }
        
    }
    
}
