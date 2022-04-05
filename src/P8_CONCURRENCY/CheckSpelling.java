package P8_CONCURRENCY;

public class CheckSpelling implements Runnable{
    @Override
    public void run() {
        for(int i = 0; i < 5; i++)
        {
            System.out.println("Check spelling: " + i);

            // Delay 0.5s
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
