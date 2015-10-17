using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Services;
using AppServicio.Data;
using AppServicio.CuentasBancarias;

namespace AppServicio
{
    /// <summary>
    /// Descripción breve de ServicioGestionBancaria
    /// </summary>
    [WebService(Namespace = "http://tempuri.org/")]
    [WebServiceBinding(ConformsTo = WsiProfiles.BasicProfile1_1)]
    [System.ComponentModel.ToolboxItem(false)]
    // Para permitir que se llame a este servicio web desde un script, usando ASP.NET AJAX, quite la marca de comentario de la línea siguiente. 
    // [System.Web.Script.Services.ScriptService]


    public class ServicioGestionBancaria : System.Web.Services.WebService
    {

        CuentasRepositories data = new CuentasRepositories();


        [WebMethod]
        public string balance(int idCuenta, double valor)
        {
            string result = "";
            foreach (Cuentas i in data.getCuentas())
            {
                if (i.Id == idCuenta)                    
                result = i.balance(valor,' ');
            }
            return result;
        }
        [WebMethod]
        public string depositar(int idCuenta, double valor)
        {
            string result = "";
            foreach (Cuentas i in data.getCuentas())
            {
                if (i.Id == idCuenta)
                    i.depositar(valor);
                result = i.balance(valor, 'D');
            }
            return result;
        }
        [WebMethod]
        public string retirar(int idCuenta, double valor)
        {
            string result = "";
            foreach (Cuentas i in data.getCuentas())
            {
                if (i.Id == idCuenta)
                    i.retitar(valor);
                    result = i.balance(valor, 'R');
            }
            return result;
        }
        [WebMethod]
        public string cuentas()
        {
            string result = "";
            foreach (Cuentas i in data.getCuentas())
                result += i.ToString();
            return result;
        }

        [WebMethod]
        public string bucarCuentas(int idCuenta)
        {
            string result = "";
            data.getCuentas();
            foreach (Cuentas i in data.getCuentas())
            {
                if (i.Id == idCuenta)
                    result = i.ToString();
            }
            return result;
        }
        [WebMethod]
        public void addCuentasAhorros(int idCuenta,
                                        int idCliente,
                                        string nombreCliente,
                                        double saldo,
                                        double tasaInteres)
        {
            Ahorros cta = new Ahorros(idCuenta,
                                      idCliente,
                                      nombreCliente,
                                      saldo,
                                      tasaInteres);

            data.addCuentas(cta);
            
        }
        [WebMethod]
        public void addCuentasCorrientes(int idCuenta,
                                        int idCliente,
                                        string nombreCliente,
                                        double saldo,
                                        double limiteCredito,
                                        double tasaInteres)
        {
            Corrientes cta = new Corrientes(idCuenta,
                                      idCliente,
                                      nombreCliente,
                                      saldo,
                                      limiteCredito,
                                      tasaInteres);

            data.addCuentas(cta);
        }
        [WebMethod]
        public void addCuentasCheques(int idCuenta,
                                        int idCliente,
                                        string nombreCliente,
                                        double saldo,
                                        string idTalonario)
        {
            Cheques cta = new Cheques(idCuenta,
                                      idCliente,
                                      nombreCliente,
                                      saldo,
                                      idTalonario);

            data.addCuentas(cta);
        }
    }
    
}
