package listainterface;

public class TesteFiguraGeometrica {

    public static void main(String[] args) {
        
        Quadrado f1 = new Quadrado(2);
        Circulo f2 = new Circulo(2);
        Triangulo f3 = new Triangulo(2, 3);
        Cubo f4 = new Cubo(3);
        Cilindro f5 = new Cilindro(2, 3);
        Piramide f6 = new Piramide(2, 3, 4, f1, 4);
        FiguraGeometrica[] figuras = new FiguraGeometrica[6];
        
        f1.setNome("Quadrado");
        f1.setCor("Azul");
        
        f2.setNome("Circulo");
        f2.setCor("Vermelho");
        
        f3.setNome("Triangulo");
        f3.setCor("Amarelo");
        
        f4.setNome("Cubo");
        f4.setCor("Verde");
        
        f5.setNome("Cilindro");
        f5.setCor("Laranja");
        
        f6.setNome("Piramide");
        f6.setCor("Roxo");
        
        figuras[0] = f1;
        figuras[1] = f2;
        figuras[2] = f3;
        figuras[3] = f4;
        figuras[4] = f5;
        figuras[5] = f6;
        
        System.out.println("---------------------------");
        for (FiguraGeometrica f: figuras) {
            System.out.println(f.getNome());
            
            if (f instanceof Figura2D) {
                Figura2D f2d = (Figura2D) f;
                System.out.println("Area: " + f2d.calcularArea());
            }
            
            if (f instanceof Figura3D) {
                Figura3D f3d = (Figura3D) f;
                System.out.println("Area: " + f3d.calcularArea());
                System.out.println("Volume: " + f3d.calcularVolume());
            }
            
            System.out.println("---------------------------");
        }
    }
}
