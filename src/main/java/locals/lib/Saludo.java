package locals.lib;

import javax.ejb.Stateless;

@Stateless
public class Saludo implements ISaludo{
    @Override
    public String Saludo(String ejb) {
        return "Hola, soy " + ejb;
    }
}
