package listamatriz;

import java.util.Scanner;

public class Calendario {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        String[][][] calendario = new String[12][30][8];
        
        boolean lFlag = false;
        int opc;
        while (!lFlag) {
            System.out.println("==== Agenda ====");
            System.out.println("1 - Agendar um compromisso");
            System.out.println("2 - Pesquisar um compromisso");
            System.out.println("0 - Sair");
            System.out.print("Digite uma das opcoes: ");
            opc = ler.nextInt();
            
            if (opc == 1) {
                int mes;
                int dia;
                int hora;
                do {
                    System.out.print("Digite o mes que voce quer marcar o compromisso (entre 1 e 12): ");
                    mes = ler.nextInt();
                    
                    if (mes < 1 || mes > 12) {
                        System.out.println("Valor invalido!");
                    }
                } while (mes < 1 || mes > 12);
                
                do {
                    System.out.print("Digite o dia que voce quer marcar o compromisso (entre 1 e 31): ");
                    dia = ler.nextInt();
                    
                    if (dia < 1 || dia > 31) {
                        System.out.println("Valor invalido!");
                    }
                } while (dia < 1 || dia > 31);
                
                do {
                    System.out.print("Digite o horario que voce quer marcar o compromisso (entre 0 e 23): ");
                    hora = ler.nextInt();
                    ler.nextLine();
                    
                    if (hora < 0 || hora > 23) {
                        System.out.println("Valor invalido!");
                    }
                } while (hora < 0 || hora > 23);
                
                System.out.print("Digite o compromisso que voce quer marcar: ");
                calendario[mes-1][dia-1][hora] = ler.nextLine();
                
                System.out.println("Compromisso agendado com sucesso!");
            }
            
            if (opc == 2) {
                int mes;
                int dia;
                int hora;
                do {
                    System.out.print("Digite o mes do compromisso: ");
                    mes = ler.nextInt();
                    
                    if (mes < 1 || mes > 12) {
                        System.out.println("Valor invalido!");
                    }
                } while (mes < 1 || mes > 12);
                
                do {
                    System.out.print("Digite o dia do compromisso: ");
                    dia = ler.nextInt();
                    
                    if (dia < 1 || dia > 31) {
                        System.out.println("Valor invalido!");
                    }
                } while (dia < 1 || dia > 31);
                
                do {
                    System.out.print("Digite o horario do compromisso: ");
                    hora = ler.nextInt();
                    
                    if (hora < 0 || hora > 23) {
                        System.out.println("Valor invalido!");
                    }
                } while (hora < 0 || hora > 23);
                
                if (calendario[mes-1][dia-1][hora] != null) {
                    System.out.println("Compromisso: " + calendario[mes-1][dia-1][hora]);
                } else {
                    System.out.println("Compromisso nao existe");
                }
            }
            
            if (opc == 0) {
                System.out.println("Saindo...");
                lFlag = true;
            }
            
            if (opc < 0 || opc > 2) {
                System.out.println("Opcao invalida!");
            }
        }
    }
}
