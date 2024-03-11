package remotes.Singleton;

import locals.util.model.Employees;
import remotes.Singleton.model.Nomina;

import javax.ejb.Remote;
import java.util.List;

@Remote
public interface INomina {
    public String Saludo();
    public String getNominas();
    public String addRecord(String employeeFullname, double salary, double overtime, double discount);


}
