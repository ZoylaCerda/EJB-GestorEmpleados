package remotes.Stateless.model;

import java.io.Serializable;
import java.util.Date;

public class Performance implements Serializable {
    private String employee;
    private Date date;
    private int gradeNote;

    public Performance(String employee, Date date, int gradeNote) {
        this.employee = employee;
        this.date = date;
        this.gradeNote = gradeNote;
    }
    public Performance(){

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

    public int getGradeNote() {
        return gradeNote;
    }

    public void setGradeNote(int gradeNote) {
        this.gradeNote = gradeNote;
    }

    @Override
    public String toString() {
        return
                "Nombre: '" + employee + '\'' +
                ", Fecha: " + date +
                ", Nota: " + gradeNote;
    }
}
