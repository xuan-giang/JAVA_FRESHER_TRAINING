package P6_COLLECTIONS.Comparable;



public class Student implements Comparable{
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Student studentObj = (Student) o;

        if(this.getAge() > studentObj.getAge())
        {
            return 1;
        }else if(this.getAge() < studentObj.getAge()){
            return -1;
        }else {
            return 0;
        }

    }
}
