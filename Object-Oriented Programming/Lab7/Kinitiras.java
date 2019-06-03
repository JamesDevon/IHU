public abstract class Kinitiras {
    
    private int ippodynami;
    private float katanalwsi;
    
    public Kinitiras (int ippodynami, float katanalwsi) {
        this.ippodynami = ippodynami;
        this.katanalwsi = 0;
    }
    
    public String toString() {
        return ("hp: " + ippodynami + " Κατανάλωση: " + katanalwsi);
    }
    
    public float getIppodunami(){
        return ippodynami;
    }
    
    public void seLeitourgia(){
        System.out.println("με κινητήρα "+this.getClass().getName()+" μπήκε σε λειτουργία");
    }
    
    public void katanalwnei(float posostoKatanalwsis , float apostasi){
            
    }
    
}