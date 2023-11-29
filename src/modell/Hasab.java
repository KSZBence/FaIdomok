/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modell;

/**
 *
 * @author Kun-SzékelyBence(SZF
 */
public class Hasab extends FaIdom{
    private double a;
    private double b;
    private double m;

    public Hasab(double a, double b, double m) {
        this.a = a;
        this.b = b;
        this.m = m;
    }
    
    public double  terfogat(){
        return a*b*m;
    }

    @Override
    public String toString() {
        return "Hasab{" + "a=" + a + ", b=" + b + ", m=" + m + '}';
    }
}
