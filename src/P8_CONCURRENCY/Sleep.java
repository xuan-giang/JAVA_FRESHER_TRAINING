package P8_CONCURRENCY;

public class Sleep extends Thread{
    @Override
    public void run() {
        while (true)
        {
            System.out.println("Sleep... ");

            // Delay 2s
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
