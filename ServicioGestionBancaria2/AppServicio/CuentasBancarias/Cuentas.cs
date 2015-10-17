using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AppServicio.CuentasBancarias
{
    public abstract class Cuentas
    {
        #region "Propiedades"
        public int Id { get; set; }
        public int IdCliente { get; set; }
        public string NombreCliente { get; set; }
        public double Saldo { get; set; }
        #endregion


        #region "Constructores"
        ///<summary>
        ///Contructor de Cuentas
        ///</summary>
        public Cuentas()
        {
            Id = 0;
            IdCliente = 0;
            NombreCliente = "Nombre Clientes";
            Saldo = 0.0;
        }
        ///<summary>
        ///Contructor de inicialización Cuentas
        ///</summary>
        ///<param name="id">Numero de la cuenta</param>
        ///<param name="nombreCliente">Nombre del Cliente</param>
        ///<param name="idCliente">Numero identificacíón del Cliente</param>   
        ///<param name="monto">Balance actual del Cliente  </param>
        ///
        public Cuentas(int id, int idCliente, string nombreCliente, double saldo)
        {
            Id = id;
            IdCliente = idCliente;
            NombreCliente = nombreCliente;
            Saldo = saldo;
        }
        #endregion


        #region "Metodos Sobre Escritos"
        public override string ToString()
        {
            return
                     "\nNum Cuenta:  " + Id +
                     "\nNombre:  " + NombreCliente +
                     "\nIdentificacion Cliente: " + IdCliente +
                     "\nSaldo Actual: " + Saldo;
        }

        public override bool Equals(object obj)
        {
            Cuentas o = (Cuentas)obj;
            bool result = false;

            if ((Id == o.Id) &&
                (IdCliente == o.IdCliente) &&
                (NombreCliente == o.NombreCliente) &&
                (Saldo == o.Saldo))

                result = true;

            return result;
        }

        public override int GetHashCode()
        {
            return this.ToString().GetHashCode();
        }
        #endregion

        public abstract string depositar(double valor);

        public abstract string retitar(double valor);

        public abstract string balance(double valor, char movimiento);
    }


}

