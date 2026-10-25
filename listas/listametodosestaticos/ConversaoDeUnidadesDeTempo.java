package listametodosestaticos;

public class ConversaoDeUnidadesDeTempo {

    public static double converterMinutosSegundos(double minutos) {
        return minutos * 60;
    }
    
    public static double converterHorasMinutos(double horas) {
        return horas * 60;
    }
    
    public static double converterDiasHoras(double dias) {
        return dias * 24;
    }
    
    public static double converterSemanasDias(double semanas) {
        return semanas * 7;
    }
    
    public static double converterMesesDias(double meses) {
        return meses * 30;
    }
    
    public static double converterAnosDias(double anos) {
        return anos * 365.25;
    }
}
