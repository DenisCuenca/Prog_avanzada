package hillos;

/**
 *
 * @author denis
 */
public class Proceso5 extends Thread {

    int num;
    int t;
    String name;
    
    public Proceso5(int num) {
        this.num = num;
    }

    public void det() {

        if (num > 33) {
            t = this.MIN_PRIORITY;
            
        }else{
            t = this.MAX_PRIORITY;
        }
    }
 
    
    

    public void run() {
        System.out.println(this.getPriority());
    }

}
