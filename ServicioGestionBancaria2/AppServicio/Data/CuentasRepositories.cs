using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using AppServicio.CuentasBancarias;

namespace AppServicio.Data
{
    public class CuentasRepositories
    {
        static List<Cuentas> banco = new List<Cuentas>();

        Ahorros cuenta1 = new Ahorros(123, 7373555, "Hugo", 300000.0, 0.1);

        public void addCuentas(Cuentas cta)
        {
            
            banco.Add(cta);
            
         }

        public IEnumerable<Cuentas> getCuentas()
        {
            return banco;
        }
    }
}