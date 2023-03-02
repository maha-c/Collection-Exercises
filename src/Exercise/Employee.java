package Exercise;

public class Employee implements Comparable<Employee> {
    private String name;
    private int age;
    private int experience;
    public Employee(String name, int age, int experience) {
        this.name = name;
        this.age = age;
        this.experience = experience;
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

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
    @Override
    public String toString() {
        return "Employee { " +
                "name= " + name + '\'' +
                " , age= " + age +
                ", experience= " + experience +
                " }";
    }
    // compare with another employee
    public  int compareTo(Employee other){
        int result;
        result = this.name.compareTo(other.getName());
        if(result != 0){
            return result;
        }else {
            return this.age - other.getAge();
        }
    }



}
