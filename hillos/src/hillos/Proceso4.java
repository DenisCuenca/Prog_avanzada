
package hillos;

/**
 *
 * @author denis
 */

class Proceso4 implements Runnable{
    
    private int pri;

    
    public int getPriority() {
        return pri;
    }

    public void setPriority(int pri) {
        this.pri = pri;
    }
    
    public void run(){
        for (int i = 0; i < 10; i++) {
            if(this.getPriority()<3){
                
                System.out.println("");
                
            }
        }
    
    }
    
    
    
}
