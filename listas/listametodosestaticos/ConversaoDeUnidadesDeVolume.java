package listametodosestaticos;

public class ConversaoDeUnidadesDeVolume {

    public static double converterLitrosCentimetros(double litros) {
        return litros * 1000;
    }
    
    public static double converterMetrosLitros(double metros) {
        return metros * 1000;
    }
    
    public static double converterMetrosPes(double metros) {
        return metros * 35.32;
    }
    
    public static double converterGaloesPolegadas(double galoes) {
        return galoes * 231;
    }
    
    public static double converterGaloesLitros(double galoes) {
        return galoes * 3.785;
    }
}
