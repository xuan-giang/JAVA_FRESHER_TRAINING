package P8_CONCURRENCY.Synchronized;

public class Project extends Thread{
    Developer developer;

    public Project(Developer developer)
    {
        this.developer = developer;
    }

    @Override
    public void run() {
        this.developer.coding();
    }
}
