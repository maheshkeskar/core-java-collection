import java.util.*;
import java.util.stream.Collectors;

class Employee implements Comparable<Employee>{
    String name;
    int salary;
    int id;

    public Employee(String name, int salary, int id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee employee)) return false;
        return salary == employee.salary && id == employee.id && name.equals(employee.name);
    }   @Override
    public int hashCode() {
        return Objects.hash(name, salary, id);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        return this.salary - o.salary;
    }
}


