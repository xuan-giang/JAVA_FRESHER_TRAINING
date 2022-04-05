package P3_METHOD_IN_JAVA;

public class Method {
    public static void main(String[] args) {
        // Demo method
        // Overloading method
        myMethod("Nguyễn Xuân Giang ");

        // Demo method multiple parameters
        // Overloading method
        myMethod("Xuân Giang", 20, "Ha Noi University Of Industry");

        // Demo method return values
        System.out.println(getSum(40, 60));

        /*
        In OOP, there are two types of method: Service method and Support method
        - Service method ~ Public method
        - Support method ~ Private method

         */

        /*
        Overriding method: Method extend from parent class

        @Overriding
        toString

         */


        EmployeeService employeeService = new EmployeeServiceImpl();
        System.out.println(employeeService.findEmployeeById(2).toString());

        /*

        Instance: Name + Variables + Methods => new Object();

        Static: Only use in class
                Static member
                Static method
                Static is created before "new object();"

         */
    }

    static void myMethod(String name)
    {
        System.out.println("My name is " + name);
    }

    static void myMethod(String name, int age, String school)
    {
        System.out.println("My name is " + name + " - " + age + " year old\n" + "I'm a student at " + school);
    }

    static int getSum(int x, int y)
    {
        return x + y;
    }
}
