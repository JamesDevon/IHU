/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author James
 */
public class Agora extends Synalagi {
    private float aksiaAgoras;
    
    public Agora(String h, int t, Metoxi m, float a){
        super(h,t,m);
        this.aksiaAgoras=a;
    }
    
    @Override
    public double transaction(int temaxia, double upoloipo){
        upoloipo -= temaxia*this.aksiaAgoras;
        return upoloipo;
    }
    
    @Override
    public String toString(){
        return super.toString()+" Αξία Αγοράς : "+this.aksiaAgoras;
    }
}
