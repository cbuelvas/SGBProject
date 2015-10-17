using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AppServicio.CuentasBancarias
{
    public class Ahorros : Cuentas
    {

        private static int count = 0;
        private static int numeroTransaciones = 3;


        #region "Propiedades"

        public double TasaInteres { get; set; }

        #endregion

        #region"Constructores"

        ///<summary>
        ///Contructor por defecto  de Cuenta de Ahorros
        ///</summary>
        ///
        public Ahorros() : base()
        {
            TasaInteres = 0.0;
        }

        public Ahorros(int id, int idCliente, string nombreCliente, double saldo, double tasaInteres)
                    : base(id, idCliente, nombreCliente, saldo)
        {
            TasaInteres = tasaInteres;
        }

        #endregion

        #region "Metodos Sobre Escritos"

        public override string ToString()
        {
            return base.ToString() +
                   "\nTasa de Interes: " + TasaInteres;
        }
        public override bool Equals(object obj)
        {
            Ahorros o = (Ahorros)obj;
            bool result = false;

            if ((base.Equals(o)) &&
               (this.TasaInteres == o.TasaInteres))
                result = true;

            return result;
        }

        public override int GetHashCode()
        {
            return this.ToString().GetHashCode();
        }


        public override string depositar(double valor)
        {
            Saldo += valor;
            return balance(valor, 'D');
        }
        public override string retitar(double valor)
        {
            count++;
            if (count > numeroTransaciones)
                Saldo = (Saldo - (valor + TasaInteres));

            else
                Saldo = Saldo - valor;


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
                case 'D':
                    result = "\n=======Movimiento Actual======"
                    + "\nFecha: " + DateTime.Now.ToShortDateString()
                    + "\nHora: " + DateTime.Now.ToShortTimeString()
                    + "\nDeposito por Valor : " + valor
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
