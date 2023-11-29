/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;
    
import java.util.ArrayList;
import modell.FaIdom;
import modell.Gomb;
import modell.Hasab;
/**
 *
 * @author Kun-SzékelyBence(SZF
 */
public class FaIdomok {
    private ArrayList<FaIdom> idomok;
    public FaIdomok() {
        this.idomok = new ArrayList<>();
    }
    
    public static void main(String[] args) {
        new FaIdomok().run();
    }
    
    public void run(){
        Gomb g1 = new Gomb(2);
        Hasab h1 = new Hasab(2, 2, 1);
        idomok.add(g1);
        idomok.add(h1);
        System.out.println("összsuly: "+osszSuly());
        System.out.println("ossz gömb suly: "+osszGombSuly());
        System.out.println("minimum térfogat: "+minV());
        System.out.println("maximum térfogat: "+maxV());
    }
    
    public double osszSuly(){
        double osszsuly = 0;
        for (FaIdom faIdom : idomok) {
            osszsuly += faIdom.suly();
        }
        return osszsuly;
    }
    
    public double osszGombSuly(){
        double osszsuly = 0;
        for (FaIdom faIdom : idomok) {
            if (faIdom instanceof Gomb) {
                osszsuly += faIdom.suly();
            }
        }
        return osszsuly;
    }
    
    public FaIdom minV(){
        FaIdom minI = idomok.get(0);
        for (FaIdom faIdom : idomok) {
            if (faIdom.terfogat() < minI.terfogat()) {
                minI = faIdom;
            }
        }
        return minI;
    }
    
    public FaIdom maxV(){
        FaIdom maxI = idomok.get(0);
        for (FaIdom faIdom : idomok) {
            if (faIdom.terfogat() > maxI.terfogat()) {
                maxI = faIdom;
            }
        }
        return maxI;
    }
    
}
