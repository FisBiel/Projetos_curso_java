package entities;

public class Calculos {

    public static final double pi = 3.14;

    public static double calCircun(double raio){
        return 2 * pi * raio;
    }
    public static double calVolume(double raio){
        return 4 * pi * raio * raio * raio / 3;
    }
    
}
