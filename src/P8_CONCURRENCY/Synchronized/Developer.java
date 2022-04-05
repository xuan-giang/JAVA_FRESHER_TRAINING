package P8_CONCURRENCY.Synchronized;

public class Developer {

    public synchronized void coding()
    {
        for(int i = 1; i <= 5; i++)
        {
            System.out.println("Coding file " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("--------- Finish Project --------");
    }
}
