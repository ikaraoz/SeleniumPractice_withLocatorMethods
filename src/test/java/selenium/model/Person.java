package selenium.model;

import lombok.*;

//@Getter
//@Setter
//@AllArgsConstructor
//@NoArgsConstructor
//@ToString
public class Person {
    private String name;
    private String office;
    private String age;
    private String position;
    private String salary;
    private String startDate;

    public String getName() {
        return name;
    }

    public String getOffice() {
        return office;
    }

    public String getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }

    public String getSalary() {
        return salary;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", office='" + office + '\'' +
                ", age='" + age + '\'' +
                ", position='" + position + '\'' +
                ", salary='" + salary + '\'' +
                ", startDate='" + startDate + '\'' +
                '}';
    }
}
