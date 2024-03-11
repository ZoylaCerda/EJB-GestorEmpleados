package remotes.Stateless;

import locals.util.iEmployeeManagerLocal;
import remotes.Stateless.model.Performance;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Stateless
public class PerformanceBean implements IPerformance {
    @EJB
    private iEmployeeManagerLocal iEMLocal;

    private List<Performance> performanceList;

    public PerformanceBean(){
        performanceList = new ArrayList<>();
        Performance performance1 = new Performance("Juan Carlos",new Date(),10);
        Performance performance2 = new Performance("Michel Jackson", new Date(), 9);

        performanceList.add(performance1);
        performanceList.add(performance2);
    }

    @Override
    public String Saludo(){ return iEMLocal.Saludo("Stateless 🥵");}
    @Override
    public String getPerformances() {
        StringBuilder result = new StringBuilder();
        for (Performance performance : performanceList) {
            result.append("Nombre: ").append(performance.getEmployee())
                    .append(", Fecha: ").append(performance.getDate())
                    .append(", Calificación: ").append(performance.getGradeNote())
                    .append("\n");
        }
        return result.toString();
    }

    @Override
    public String addPerformance(String employeeName, Date date, int rating){
        Performance performance = new Performance(employeeName, date, rating);
        performanceList.add(performance);
        return "Nuevo rendimiento agregado:\n" + performance + "\n";
    }
}
