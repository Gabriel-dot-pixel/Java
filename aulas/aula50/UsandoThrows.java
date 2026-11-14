package aula50;

import java.util.Scanner;

public class UsandoThrows {
    
    public static void main(String[] args) {
        
        System.out.print("Digite um numero decimal: ");
        try {
            double num = lerNumero();
            System.out.println("Voce digitou " + num);
        } catch (Exception ex) {
            System.out.println("Entrada invalida");
            ex.printStackTrace();
        }
    }
    
    public static double lerNumero() throws Exception {
        Scanner ler = new Scanner(System.in);
        
        double num = ler.nextDouble();
        
        return num;
    }
}
