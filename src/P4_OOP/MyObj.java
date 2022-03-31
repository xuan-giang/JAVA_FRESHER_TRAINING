package P4_OOP;

public class MyObj {
    private int x;
    private String name;


    public MyObj() {
        x = 10;
        name = "Demo Object";
    }

    public void printInfoObj()
    {
        System.out.println("x = " + x + " - name: " + name);
    }
}
