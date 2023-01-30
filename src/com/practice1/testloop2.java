package com.practice1;

import java.util.Scanner;

public class testloop2 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in))
        {
            int N,i=1;
            System.out.print("Masukkan nilai N = ");
            N=scan.nextInt();
            do
            {
                System.out.print(i*2+" ");
                i++;
            }while(i<=N);
        }
    }
}
