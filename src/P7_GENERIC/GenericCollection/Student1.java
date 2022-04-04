package P7_GENERIC.GenericCollection;

public class Student1<T1, T2> {
    private T1 studentCode;
    private String name;
    private T2 age;

    public Student1() {
    }

    public Student1(T1 studentCode, String name, T2 age) {
        this.studentCode = studentCode;
        this.name = name;
        this.age = age;
    }

    public T1 getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(T1 studentCode) {
        this.studentCode = studentCode;
    }

    public T2 getAge() {
        return age;
    }

    public void setAge(T2 age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "studentCode=" + studentCode +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
