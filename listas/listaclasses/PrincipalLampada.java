package listaclasses;

import java.util.Scanner;

public class PrincipalLampada {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        Lampada lampada = new Lampada(1, 50);
        
        boolean acender = lampada.ligar();
        
        if (acender) {
            System.out.println("A lampada " + lampada.getId() + " esta ligada");
        }
        
        System.out.print("Digite um valor para a intensidade luminosa da lampada " + lampada.getId() + ": ");
        double valor = ler.nextDouble();
        
        while (valor < 0 || valor > 100) {
            System.out.print("Valor invalido| Digite novamente: ");
            valor = ler.nextDouble();
        }
        
        boolean intensidade = lampada.ajustarIntensidade(valor);
        
        if (intensidade) {
            System.out.println("A intensidade luminosa da lampada " + lampada.getId() + " agora e " + lampada.getIntensidadeLuminosa());
        }
        
        System.out.println("Caracteristicas da lampada " + lampada.getId() + ":");
        lampada.mostrarInfo();
        
        System.out.print("Digite quantas horas a lampada " + lampada.getId() + " vai ficar ligada: ");
        int horas = ler.nextInt();
        
        double consumo = lampada.calcularConsumo(horas);
        
        System.out.println("A lampada " + lampada.getId() + " vai consumir " + consumo + "kWh");
    }
}
