package com.gabriel.cursojava.aula13;

public class OperadoresAritimeticos {
    
    public static void main(String[] args) {
        
        int resultado = 1 + 2;
        System.out.println(resultado);
        
        resultado = resultado - 1;
        System.out.println(resultado);
        
        resultado = resultado * 2;
        System.out.println(resultado);
        
        resultado = resultado / 2;
        System.out.println(resultado);
        
        resultado = resultado + 8;
        System.out.println(resultado);
        
        resultado = resultado % 7;
        System.out.println(resultado);
        
        String primeiraParte = "Esta e";
        String segundaParte = " uma String concatenada";
        String terceiraParte = primeiraParte + segundaParte;
        System.out.println(terceiraParte);
        
        resultado++;
        System.out.println(resultado);
        
        System.out.println(resultado++);
        /*
        mesma coisa que
        System.out.println(resultado);
        resultado = resultado + 1;
        resultado += 1;
        */
        System.out.println(++resultado);
        /*
        mesma coisa que
        resultado += 1;
        System.out.println(resultado);
        */
        
        resultado--;
        System.out.println(resultado);
        
        System.out.println(resultado--);
        System.out.println(--resultado);
    }
}
