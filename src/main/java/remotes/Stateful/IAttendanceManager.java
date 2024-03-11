package remotes.Stateful;

import javax.ejb.Remote;
import java.util.Date;

@Remote
public interface IAttendanceManager {
    public String Saludo();
    public String getAttendanceRecords();
    public String addAttendanceRecord(String employee, Date date, boolean present);
}
