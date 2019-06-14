/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author James
 */
public class Polisi extends Synalagi {
    private float aksiaPolisis;
    
    public Polisi(String h, int t, Metoxi m, float a){
        super(h,t,m);
        this.aksiaPolisis=a;
    }
    
    @Override
    public double transaction(int temaxia, double upoloipo){
        upoloipo += temaxia*this.aksiaPolisis;
        return upoloipo;
    }
    
    @Override
    public String toString(){
        return super.toString()+" Αξία Πωλησης : "+this.aksiaPolisis;
    }
}
