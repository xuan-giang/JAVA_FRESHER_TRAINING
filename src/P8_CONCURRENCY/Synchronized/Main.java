package P8_CONCURRENCY.Synchronized;

public class Main {
    public static void main(String[] args) {

        Project[] projects  = new Project[5];

        Developer developer = new Developer();

        projects[0]         = new Project(developer);
        projects[1]         = new Project(developer);
        projects[2]         = new Project(developer);
        projects[3]         = new Project(developer);
        projects[4]         = new Project(developer);

        projects[0].start();
        projects[1].start();
        projects[2].start();
    }
}
