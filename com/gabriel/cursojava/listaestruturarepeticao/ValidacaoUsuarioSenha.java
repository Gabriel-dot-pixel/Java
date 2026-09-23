package com.gabriel.cursojava.listaestruturarepeticao;

import java.util.Scanner;

public class ValidacaoUsuarioSenha {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite seu usuário: ");
        String usuario = ler.next();

        System.out.print("Digite sua senha: ");
        String senha = ler.next();

        while (senha.equals(usuario)) {
            System.out.println("ERROR! Senha igual ao usuário");
            System.out.print("Digite a senha novamente: ");
            senha = ler.next();
        }

        ler.close();
    }
}
