package P8_CONCURRENCY;

public class Main {
    public static void main(String[] args) {

        studyThread6();
        studyThread4();

        for(int i = 0; i < 5; i++)
        {
            System.out.println("Study Thread 1: " + i);

            // Delay 0.5s
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    static void studyThread1()
    {
        UserInput threadUserInput = new UserInput();
        threadUserInput.start();


    }

    static void studyThread2()
    {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 5; i++)
                {
                    System.out.println("Study Thread 2: " + i);

                    // Delay 0.5s
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        thread.start();
    }

    static void studyThread3()
    {
        Thread thread = new Thread(new CheckSpelling());

        thread.start();
    }

    // Daemon Thread
    static void studyThread4()
    {

        Thread thread = new Thread(new DaemonThread());

        // Finish after other threads finish
        thread.setDaemon(true);

        thread.start();
    }

    // Demo join
    static void studyThread5()
    {
        //Run other thread after this thread finish
        Thread thread = new Thread(new CheckSpelling());

        thread.start();

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    static void studyThread6()
    {
        //Run other thread after this thread finish
        Thread thread = new Thread(new Sleep());

        thread.start();


    }
}
