package remotes.Stateful;

import locals.util.iEmployeeManagerLocal;
import locals.util.model.Employees;
import remotes.Stateful.model.Attendance;

import javax.ejb.EJB;
import javax.ejb.Stateful;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Stateful
public class AttendanceManagerBean implements IAttendanceManager{
    @EJB
    private iEmployeeManagerLocal IEMLocal;
    private List<Attendance> attendanceList;

    public AttendanceManagerBean(){
        attendanceList = new ArrayList<>();

        Attendance attendance1 = new Attendance("John Doe", new Date(), true);
        Attendance attendance2 = new Attendance("Jane Smith", new Date(), true);
        Attendance attendance3 = new Attendance("Michel Jackson", new Date(), true);

        attendanceList.add(attendance1);
        attendanceList.add(attendance2);
        attendanceList.add(attendance3);
    }


    @Override
    public String Saludo(){
        return IEMLocal.Saludo("Stateful 💦");
    }
    @Override
    public String getAttendanceRecords() {
        StringBuilder result = new StringBuilder();
        for (Attendance attendance : attendanceList) {
            result.append("Nombre: ").append(attendance.getEmployee())
                    .append(", Fecha: ").append(attendance.getDate())
                    .append(", Presente: ").append(attendance.isAttendanced())
                    .append("\n");
        }
        return result.toString();
    }
    @Override
    public String addAttendanceRecord(String employee, Date date, boolean present) {
        Attendance attendance = new Attendance();
        attendance.setEmployee(employee);
        attendance.setDate(date);
        attendance.setAttendanced(present);

        attendanceList.add(attendance);
        return "Nuevo registro de asistencia agregado:\n" + attendance.toString() + "\n";
    }

}
