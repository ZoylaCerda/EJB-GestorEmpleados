package remotes.Stateful.model;

import java.io.Serializable;
import java.util.Date;

public class Attendance implements Serializable {
    private String employee;
    private Date date;
    private boolean attendanced;

    public Attendance(String employee, Date date, boolean attendanced) {
        this.employee = employee;
        this.date = date;
        this.attendanced = attendanced;
    }
    public Attendance(){

    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isAttendanced() {
        return attendanced;
    }

    public void setAttendanced(boolean attendanced) {
        this.attendanced = attendanced;
    }


    @Override
    public String toString() {
        return "Nombre: '" + employee + '\'' +
                ", Fecha: " + date +
                ", Asistió: " + attendanced;
    }
}
