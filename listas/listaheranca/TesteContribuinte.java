package listaheranca;

public class TesteContribuinte {

    public static void main(String[] args) {
        
        PessoaJuridica pj1 = new PessoaJuridica("43.729.535/0001-00", "Jose", 2500);
        PessoaJuridica pj2 = new PessoaJuridica("85.970.144/0001-23", "Marcos", 3000);
        PessoaJuridica pj3 = new PessoaJuridica("27.194.807/0001-69", "Daniel", 3500);
        PessoaFisica pf1 = new PessoaFisica("133.359.780-05", "Pamela", 1400);
        PessoaFisica pf2 = new PessoaFisica("657.891.240-11", "Selina", 2800);
        PessoaFisica pf3 = new PessoaFisica("381.751.050-03", "Barbara", 3700);
        Contribuinte[] contribuintes = new Contribuinte[6];
        
        contribuintes[0] = pj1;
        contribuintes[1] = pj2;
        contribuintes[2] = pj3;
        contribuintes[3] = pf1;
        contribuintes[4] = pf2;
        contribuintes[5] = pf3;
        
        System.out.println("--------------------");
        for (Contribuinte c: contribuintes) {
            System.out.println(c);
            System.out.println("--------------------");
        }
    }
}
