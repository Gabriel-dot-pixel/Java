package com.gabriel.cursojava.listaarrays;

public class Fatorial {

    public static void main(String[] args) {
        
        int[] A = new int[15];
        int[] B = new int[15];
        
        for (int i=0; i<15; i++) {
            A[i] = i+1;
        }
        
        for (int i=0; i<15; i++) {
            int f = 1;
            for (int j=A[i]; j>0; j--) {
                f *= j;
            }
            B[i] = f;
        }
        
        for (int i=0; i<15; i++) {
            System.out.println("B[" + i + "] = " + B[i]);
        }
    }
}
