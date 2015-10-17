using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AppServicio.CuentasBancarias
{
    public class Cheques : Cuentas
    {

        private static int count = 0;
        private static int numeroTransaciones = 3;


        #region "Propiedades"
        public string IdTalonario { get; set; }

        #endregion

        #region "Constrctores"

        ///<summary>
        ///Contructor por defecto  de Cuenta Cheques
        ///</summary>
        ///
        public Cheques()
        {
            IdTalonario = "...";
        }

        public Cheques(int id, int idCliente, string nombreCliente, double saldo, string idTalonario)
            : base(id, idCliente, nombreCliente, saldo)
        {
            IdTalonario  = idTalonario;
        }

        #endregion

        #region "Metodos Sobre Escritos"

        public override string ToString()
        {
            return base.ToString() +
                   "ID talonario: " + IdTalonario;
        }
        public override bool Equals(object obj)
        {
            Cheques o = (Cheques)obj;
            bool result = false;

            if (base.Equals(o) &&
               (IdTalonario == o.IdTalonario))
                result = true;

            return result;
        }

        public override int GetHashCode()
        {
            return this.ToString().GetHashCode();
        }

        public override string depositar(double valor)
        {
            return "\nA este tipo de cuenta no se le permiten depositos";
        }
        public override string retitar(double valor)
        {
            Saldo =Saldo - valor;

            return balance(valor, 'R');
        }

        public override string balance(double valor, char movimiento)
        {
            string result = "";

            switch (movimiento)
            {
                case 'R':
                    result = "\n=======Movimiento Actual======"
                    + "\nFecha: " + DateTime.Now.ToShortDateString()
                    + "\nHora: " + DateTime.Now.ToShortTimeString()
                    + "\nRetiro por Valor : " + valor
                    + "\nBalanca actual: " + Saldo;
                    break;
                default:
                    result = "\n=======Movimiento Actual======"
                    + "\nFecha: " + DateTime.Now.ToShortDateString()
                    + "\nHora: " + DateTime.Now.ToShortTimeString()
                    + "\nBalanca actual: " + Saldo;
                    break;

            }


            return result;
        }
        #endregion
    }
}
