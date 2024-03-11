package locals.util;

import locals.util.model.Employees;

import javax.ejb.Local;

@Local
public interface iEmployeeManagerLocal {

    public String addEmployee(String name, String lastname, int age, String status);

    public String Saludo(String ejb);
    public Employees getEmployee();

}
