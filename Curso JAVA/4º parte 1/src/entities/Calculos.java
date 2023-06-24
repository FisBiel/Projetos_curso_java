package entities;

public class Calculos {

    public final double pi = 3.14;

    public double calCircun(double raio){
        return 2 * pi * raio;
    }
    public double calVolume(double raio){
        return 4 * pi * raio * raio * raio / 3;
    }
    
}
