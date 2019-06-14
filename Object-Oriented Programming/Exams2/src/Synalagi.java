/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author James
 */
public abstract class Synalagi {
    private String hmera;
    private int temaxia;
    private Metoxi metoxi;
    
    public Synalagi(String h, int t, Metoxi m){
        this.hmera=h;
        this.temaxia=t;
        this.metoxi=m;
    }
    
    abstract double transaction(int temaxia, double upoloipoPelati);
    @Override
    public String toString(){
        return "Μετοχή : "+this.metoxi.getMetoxi()+" Τεμάχια : "+this.temaxia;
    }
}
