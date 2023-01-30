package com.practice1;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        try (Scanner a = new Scanner(System.in)) {
            int n,angka,max=0;
            System.out.print("Masukkan jumlah angka yang ingin Anda masukkan = ");
            n=a.nextInt();
            for (int i=0;i<n;i++)
                {
                    System.out.print("Masukkan angka ke "+(i+1)+" = ");
                    angka=a.nextInt();
                    if (angka>max)
                        {
                            max=angka;
                        }
                }System.out.println("Nilai terbesar Anda adalah = "+max);
        }
    }
}
