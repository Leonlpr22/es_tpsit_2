package lopreiato.it;

public class Cestino {

    int valore;
    
    public Cestino(int i){
        valore = i;
    }
    
    public int getValore() {
            return valore;
        }

    synchronized public void aggiungiMoneta(){ //synchronized = possono entrare uno alla volta
        int appo = valore + 1;
        valore = appo;
    }

}
