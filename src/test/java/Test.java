import remotes.Singleton.INomina;
import remotes.Stateful.IAttendanceManager;
import remotes.Stateless.IPerformance;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.sql.SQLException;
import java.util.Date;

public class Test {
    static String lookupstg = "java:global/GestorEmpleadosEJB-RA101621-1.0-SNAPSHOT/";

    public  static void main(String[] args) throws SQLException {
//        NominaTest();
//        AttendanceTest();
        PerformanceTest();
    }
    public static void PerformanceTest(){
        try {
            Context jdni = new InitialContext();
            IPerformance performance = (IPerformance) jdni.lookup(lookupstg + "PerformanceBean!remotes.Stateless.IPerformance");

            System.out.println(performance.Saludo());
            System.out.println(performance.getPerformances());
            System.out.println(performance.addPerformance("Marta Duran", new Date(), 10));
            System.out.println(performance.getPerformances());


        } catch (NamingException e){
            e.printStackTrace(System.out);
        }
    }

    public  static  void AttendanceTest(){
        try {
            Context jdni = new InitialContext();
            IAttendanceManager IAttendance = (IAttendanceManager) jdni.lookup(lookupstg + "AttendanceManagerBean!remotes.Stateful.IAttendanceManager");

            System.out.println(IAttendance.Saludo());
            System.out.println(IAttendance.getAttendanceRecords());
            System.out.println(IAttendance.addAttendanceRecord("Marta Duran", new Date(), false));
            System.out.println(IAttendance.getAttendanceRecords());


        } catch (NamingException e){
            e.printStackTrace(System.out);
        }
    }
    public static void NominaTest(){
        try {
            Context jdni = new InitialContext();

//            INomina EMLocal = (INomina) jdni.lookup("java:global/GestorEmpleadosEJB-RA101621-1.0-SNAPSHOT/NomninaBean!remotes.Singleton.INomina");
            INomina EMLocal = (INomina) jdni.lookup(lookupstg + "NomninaBean!remotes.Singleton.INomina");

            System.out.println(EMLocal.Saludo());
            System.out.println(EMLocal.getNominas());
            System.out.println(EMLocal.addRecord("Marvin Ramos", 300, 3, 4.5));
            System.out.println(EMLocal.getNominas());


        } catch (NamingException e){
            e.printStackTrace(System.out);
        }
    }
}
