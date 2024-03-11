
import locals.util.model.Employees;
import locals.util.EmployeeManagerBean;
import locals.util.iEmployeeManagerLocal;
import remotes.Singleton.INomina;
import remotes.Stateful.IAttendanceManager;
import remotes.Stateless.IPerformance;

import javax.ejb.EJB;
import javax.ejb.embeddable.EJBContainer;
import java.util.List;
import java.util.Properties;

public class TestClient {
    @EJB
    private static INomina iSingletonManager;

    @EJB
    private  static IAttendanceManager iStatefulManager;

    @EJB
    private  static IPerformance iStatelessManager;
    @EJB
    private static iEmployeeManagerLocal IEMLocal;

    public static void main(String[] args) {
        setup();
//        testAddEmployee();
//        testGetEmployees();
    }

    public static void setup() {
        Properties properties = new Properties();
        properties.put("EmployeeManagerBean", new EmployeeManagerBean());
        EJBContainer.createEJBContainer(properties);
    }

//    public static void testAddEmployee() {
//        IEMLocal.addEmployee("John", "Doe", 30, "Active");
//        System.out.println("Employee added successfully.");
//    }

//    public static void testGetEmployees() {
//        List<Employees> employees = IEMLocal.getEmployees();
//        System.out.println("Employees:");
//        for (Employees employee : employees) {
//            System.out.println(
//                    ", Name: " + employee.getName() +
//                    ", Lastname: " + employee.getLastname() +
//                    ", Age: " + employee.getAge() +
//                    ", Status: " + employee.getStatus());
//        }
//    }


    public static void remotesCalls(){

    }
    public static void localCalls(){

    }
}
