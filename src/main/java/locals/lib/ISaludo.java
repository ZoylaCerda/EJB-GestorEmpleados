package locals.lib;

import javax.ejb.Local;

@Local
public interface ISaludo {
    public String Saludo(String ejb);
}
