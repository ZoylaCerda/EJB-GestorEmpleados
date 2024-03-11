package remotes.Stateless;

import javax.ejb.Remote;
import java.util.Date;

@Remote
public interface IPerformance {
    public String Saludo();
    public String getPerformances();
    public String addPerformance(String employeeName, Date date, int rating);
}
