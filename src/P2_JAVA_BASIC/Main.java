package P2_JAVA_BASIC;

public class Main {
    public static void main(String[] args) {

        // VARIABLES
        System.out.println("----------------------------------");
        Variables variables = new Variables();
        variables.variableIs();

        // DATA TYPES
        System.out.println("----------------------------------");
        Data_Types data_types = new Data_Types();
        data_types.testDataTypes();

        // TYPE CASTING
        data_types.testTypeCasting();

        // CONTROL FLOW
        System.out.println("----------------------------------");
        ControlFlow controlFlow = new ControlFlow();
        controlFlow.controlFlow1();
        controlFlow.controlFlow2();

        //ARRAY
        System.out.println("----------------------------------");
        Array array = new Array();
        array.getArrayLength();
        array.getSumArray();

        array.printMatrix();
        array.findElement();

        array.sortArray();
        System.out.println("After sort: ");
        array.printArray();
    }
}
