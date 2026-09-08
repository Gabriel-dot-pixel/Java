package com.gabriel.cursojava.aula10;

public class Variaveis {
    
    public static void main(String[] args) {
        
        //convenção Java
        int idade = 20;
        String nome = "Gabriel";
        String nomeCachorro = "Baruc";
        String ano2026;
        
        //aceito, mas não utilizado
        int _idade;
        int $idade;
        
        //não é convenção Java
        String nome_do_meu_cachorro;
        String NomeDoMeuCachorro;
        String nomeDoMeuCachorro;
        
        idade = 25;
        
        System.out.println("Idade = " + idade);
        System.out.println("Nome = " + nome);
        
        //má pratica
        int a = 10;
        String b = "Gabiel";
    }
}
