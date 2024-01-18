public class Employee {
    private String Name;
    private int Salary;
    private int NetSalary;

    public Employee(String name, int salary){
        this.Salary = salary;
        this.Name = name;
        setNetSalary();
    }

    public int getNetSalary() {
        return NetSalary;
    }

    public int getSalary() {
        return Salary;
    }

    public String getName() {
        return Name;
    }

    public void setNetSalary() {
        NetSalary = (int)(Salary * 0.80);
    }

    public void setName(String name) {
        Name = name;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    @Override
    public String toString(){
        return "Employee = { Name = " + Name +
                ", Salary = " + Salary +
                ", NetSalary = " + NetSalary +
                "}";
    }
}
