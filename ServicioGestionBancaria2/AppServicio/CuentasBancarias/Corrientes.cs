using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AppServicio.CuentasBancarias
{
    public class Corrientes : Cuentas
    {

        private static int count = 0;
        private static int numeroTransaciones = 3;


        #region "Propiedades"
        public double LimitesCreditos { get; set; }
        public double TasaInteres { get; set; }

        #endregion

        #region "Costructores"
        ///<summary>
        ///Contructor de Cuenta Corriente
        ///</summary>
        public Corrientes()
            : base()
        {
            LimitesCreditos = 0.0;
            TasaInteres = 0.0;
        }
        public Corrientes(int id, int idCliente, string nombreCliente, double saldo, double limitesCreditos, double tasadeInteres)
            : base(id, idCliente, nombreCliente, saldo)
        {
            LimitesCreditos = limitesCreditos;
            TasaInteres = tasadeInteres;
        }
        #endregion

        #region "Metodos Sobre Escritos"
        public override string ToString()
        {
            return base.ToString() +
                     "\nLimite de Creditos:  " + LimitesCreditos + "\n" +
                     "\nTasa de Interes:  " + TasaInteres;
        }

        public override bool Equals(object obj)
        {
            Corrientes o = (Corrientes)obj;
            bool result = false;

            if ((base.Equals(o)) &&
                (this.LimitesCreditos == o.LimitesCreditos) &&
                (TasaInteres == o.TasaInteres))

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
            if ((count > numeroTransaciones) && (valor < LimitesCreditos))
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
