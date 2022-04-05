package P8_CONCURRENCY;

public class UserInput extends Thread{

    @Override
    public void run() {
        for(int i = 0; i < 5; i++)
        {
            System.out.println("User Input: " + (i + 1));

            // Delay 1s
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
