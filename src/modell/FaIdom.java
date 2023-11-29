/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modell;

/**
 *
 * @author Kun-SzékelyBence(SZF
 */
public abstract class FaIdom {
    private static double fajsuly = 0.8;
    
    public abstract double terfogat();
    public double suly(){
        return terfogat()*fajsuly;
    }

    @Override
    public String toString() {
        return "Faidom, "+"fajsuly: "+fajsuly;
    }
    
}
