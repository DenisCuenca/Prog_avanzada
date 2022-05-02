
package hillos;

/**
 *
 * @author denis
 */

public class Proceso6 extends Thread{
    
    public void run()  
    {    
        //checking for daemon thread    
        if(Thread.currentThread().isDaemon())  
        {  
            System.out.println("daemon thread work");    
        }    
        else  
        {    
            System.out.println("user thread work");    
        }    
    }    
    
    
    
}
