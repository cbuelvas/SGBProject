/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import CuentasBancarias.Ahorros;
import CuentasBancarias.Cuentas;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Carlos
 */
public class CuentasRepo {
    public List <Cuentas> banco;
    
    Ahorros cuenta1 = new Ahorros(123, 7373555, "Hugo", 300000.0, 0.1);

    public CuentasRepo() {
        this.banco = new ArrayList<>();
    }
    
    public void addCuentas(Cuentas cta)
    {            
        banco.add(cta);            
    }
    public ArrayList<Cuentas> getCuentas()
    {
        return (ArrayList<Cuentas>) banco;
    }
}
