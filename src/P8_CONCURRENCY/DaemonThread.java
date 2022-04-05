package P8_CONCURRENCY;

public class DaemonThread extends Thread{
    @Override
    public void run() {
        int i = 0;
        while (true)
        {
            System.out.println("Daemon Thread: "  + i);
            i++;

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
