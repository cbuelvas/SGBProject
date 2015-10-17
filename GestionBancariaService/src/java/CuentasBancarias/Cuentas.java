/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CuentasBancarias;

/**
 *
 * @author Carlos
 */
public abstract class Cuentas {
    private int Id;
    private int IdCliente;
    private java.lang.String NombreCliente;
    private double Saldo;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(int IdCliente) {
        this.IdCliente = IdCliente;
    }

    public String getNombreCliente() {
        return NombreCliente;
    }

    public void setNombreCliente(String NombreCliente) {
        this.NombreCliente = NombreCliente;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

    public Cuentas(int Id, int IdCliente, String NombreCliente, double Saldo) {
        this.Id = Id;
        this.IdCliente = IdCliente;
        this.NombreCliente = NombreCliente;
        this.Saldo = Saldo;
    }
    
    public Cuentas()
        {
            Id = 0;
            IdCliente = 0;
            NombreCliente = "Nombre Clientes";
            Saldo = 0.0;
        }

    @Override
    public String toString() {
        return "\nNum Cuenta:  " + Id +
               "\nNombre:  " + NombreCliente +
               "\nIdentificacion Cliente: " + IdCliente +
               "\nSaldo Actual: " + Saldo; 
    }

    @Override
    public boolean equals(Object obj) {
        Cuentas o = (Cuentas)obj;
            boolean result = false;

            if ((Id == o.Id) &&
                (IdCliente == o.IdCliente) &&
                (NombreCliente.equals(o.NombreCliente)) &&
                (Saldo == o.Saldo))

                result = true;

            return result; 
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode(); 
    }
    
    public abstract String depositar(double valor);

    public abstract String retitar(double valor);

    public abstract String balance(double valor, char movimiento);
    
}
