package hillos;

/**
 *
 * @author denis
 */
public class Proceso1 implements Runnable {

    private String name;

    public Proceso1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {

            // Se llama a la función "getName()" para obtener el nombre que se le dio al hilo
            Thread currThread = Thread.currentThread();

            // thread created
            Thread t = new Thread(this, "Admin Thread");

            System.out.println("current thread = " + currThread);
            System.out.println("thread created = " + t);

            System.out.println(i + " " + getName());

            try {
                Thread.sleep((int) (Math.random() * 2000));

            } catch (Exception e) {
            }
        }
    }

    public void setName(String name) {
        this.name = name;
    }

}
