package multi;

public class multi {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("This is another thread");
        });

        t.start();
        System.out.println("This isn't another thread");
    }
}
