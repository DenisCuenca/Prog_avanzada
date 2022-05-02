package hillos;

/**
 *
 * @author denis
 */

public class Proceso2 extends Thread{
    
    int ret;

    public Proceso2(int ret) {
        this.ret = ret;
    }
    
    
  
    
    public void run(){
        
        
        for (int i = 0; i < 4; i++) {                                    
            System.out.println(i+" -- Hilo " + +getId() + " en ejecución -- ");                        
            
            try {
                
                Thread.sleep( (ret) );
                
            } catch (Exception e) {
                
            }
        }
    
    }
    
    
    
    
    
}
