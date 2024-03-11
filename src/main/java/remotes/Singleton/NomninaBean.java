package remotes.Singleton;

import locals.util.iEmployeeManagerLocal;
import remotes.Singleton.model.Nomina;

import javax.ejb.EJB;
import javax.ejb.Singleton;
import java.util.ArrayList;
import java.util.List;

@Singleton
public class NomninaBean implements INomina {
    @EJB
    private iEmployeeManagerLocal iEMLocal;

    private List<Nomina> nominaList;
    public NomninaBean(){
        nominaList = new ArrayList<>();

        // Nómina de Juan
        Nomina juanNomina = new Nomina();
        juanNomina.setEmployeeFullname("Juan Carlos");
        juanNomina.setSalary(200);
        juanNomina.setOvertime(3);
        juanNomina.setDiscount(3.5);
        juanNomina.setTotal(juanNomina.getSalary() + juanNomina.getOvertime() * 2 - juanNomina.getDiscount());
        nominaList.add(juanNomina);

        // Nómina de María
        Nomina mariaNomina = new Nomina();
        mariaNomina.setEmployeeFullname("María López");
        mariaNomina.setSalary(250);
        mariaNomina.setOvertime(2);
        mariaNomina.setDiscount(2.0);
        mariaNomina.setTotal(mariaNomina.getSalary() + mariaNomina.getOvertime() * 2 - mariaNomina.getDiscount());
        nominaList.add(mariaNomina);
    }

    @Override
    public String Saludo(){
        return iEMLocal.Saludo("Singleton 💥");
    }

    @Override
    public String getNominas() {
        StringBuilder result = new StringBuilder();
        for (Nomina nomina : nominaList) {
            result.append("Nombre: ").append(nomina.getEmployeeFullname())
                    .append(", Salario: ").append(nomina.getSalary())
                    .append(", Horas Extras: ").append(nomina.getOvertime())
                    .append(", Descuento: ").append(nomina.getDiscount())
                    .append(", Total: ").append(nomina.getTotal())
                    .append("\n");
        }
        return result.toString();
    }


    @Override
    public String addRecord(String employeeFullname, double salary, double overtime, double discount){
        Nomina nomina = new Nomina();
        double total = salary + (overtime * 2) - discount;

        nomina.setEmployeeFullname(employeeFullname);
        nomina.setSalary(salary);
        nomina.setOvertime(overtime);
        nomina.setDiscount(discount);
        nomina.setTotal(total);

        nominaList.add(nomina);
        return "Nuevo registro:\n" + nomina +"\n";
    }
}
