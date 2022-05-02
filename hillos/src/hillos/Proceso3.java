package hillos;

/**
 *
 * @author denis
 */
public class Proceso3 extends Thread {

    int n;

    public Proceso3(int n) {
        this.n = n;
    }

    public boolean detectarNum() {
        if (n > 3000) {
            return false;

        } else {
            return true;
        }
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Proceso de deteccion de hilo : time left: " + i);
            System.out.println(this.getName());
            this.isAlive();
            if (!detectarNum()) {
                this.stop();
            }
            
        }

    }

}
