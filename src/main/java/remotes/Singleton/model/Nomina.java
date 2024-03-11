package remotes.Singleton.model;

import java.io.Serializable;

public class Nomina implements Serializable {
    private String employeeFullname;
    private double salary;
    private double overtime;
    private double discount;
    private double total;

    public Nomina(String employeeFullname, double salary, double overtime, double discount, double total) {
        this.employeeFullname = employeeFullname;
        this.salary = salary;
        this.overtime = overtime;
        this.discount = discount;
        this.total = total;
    }

    public Nomina(){

    }

    public String getEmployeeFullname() {
        return employeeFullname;
    }

    public void setEmployeeFullname(String employeeFullname) {
        this.employeeFullname = employeeFullname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getOvertime() {
        return overtime;
    }

    public void setOvertime(double overtime) {
        this.overtime = overtime;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return  "Nombre: '" + employeeFullname + '\'' +
                ", Salario: " + salary +
                ", Horas extras: " + overtime +
                ", Descuento: " + discount +
                ", Total: " + total;
    }
}
