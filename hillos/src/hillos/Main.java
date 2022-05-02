package hillos;

/**
 *
 * @author denis
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //new Thread(new Proceso1("empieza")).start();
        //new Thread(new Proceso1("termina")).start();
        
        
        
        System.out.println("Proceso para consegir el id de los hilos");
        
        Thread t2 = new Proceso2(200); // id 11
        Thread t3 = new Proceso2(2000); // id 12
        Thread t4 = new Proceso2(6); // id 13
        
        
        System.out.println("------o----------o---------o--------o----------o-------");
        
        //t2.start();
        //t3.start(); 
        //t4.start();
        
        
        System.out.println("------o----------o-----Proceso3----o--------o----------o-------");
        
        Thread t5 = new Proceso3(6);
        Thread t6 = new Proceso3(4000);
        
        t5.start();
        t6.start();
        
        System.out.println("-----------------");
        
        t5.getPriority();
        t6.getPriority();
        
        

        //System.out.println(t5.isAlive());
        //System.out.println(t6.isAlive());
        
        
        
        
        
        
    }

}
