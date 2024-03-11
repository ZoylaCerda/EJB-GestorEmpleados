package locals.util;

import locals.lib.ISaludo;
import locals.util.model.Employees;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class EmployeeManagerBean implements iEmployeeManagerLocal {

    @EJB
    private ISaludo saludo;

    private List<Employees> employeeList;
    public EmployeeManagerBean(){
        employeeList = new ArrayList<>();
        Employees employee1 = new Employees("John", "Doe", 30, "Activo");
        Employees employee2 = new Employees("Jane", "Smith", 25, "Activo");
        Employees employee3 = new Employees("Michael", "Johnson", 35, "Inactivo");

        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
    }

    @Override
    public String Saludo(String ejb){
        return saludo.Saludo(ejb);
    }

    @Override
    public String addEmployee(String name, String lastname, int age, String status){
        Employees employee = new Employees(name, lastname, age, status);

        employeeList.add(employee);
        return "Nuevo empleado:\n" + employee;
    }

    @Override
    public Employees getEmployee(){
        Employees employees1 = new Employees("wabo","a", 1,"active");
        return employees1;
    }
}
