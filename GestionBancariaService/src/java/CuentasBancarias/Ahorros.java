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
public class Ahorros extends Cuentas {

    private static int count = 0;
    private static int numeroTransacciones = 3;

    private double TasaInteres;

    public double getTasaInteres() {
        return TasaInteres;
    }

    public void setTasaInteres(double TasaInteres) {
        this.TasaInteres = TasaInteres;
    }

    public Ahorros() {
        TasaInteres = 0.0;
    }

    public Ahorros(int id, int idCliente, String nombreCliente, double saldo, double tasaInteres) {
        TasaInteres = tasaInteres;
    }

    @Override
    public String depositar(double valor) {
        double a = getSaldo();
        a += valor;
        setSaldo(a);
        return balance(a, 'D');
    }

    @Override
    public String retitar(double valor) {
        count++;
        double a = getSaldo();
        double b = a;
        if (count > numeroTransacciones) {
            a = (a - (valor * TasaInteres));
        } else {
            a = a - valor;
        }
        if (a <= 0) {
            setSaldo(b);
            return "Fondos insuficientes";            
        } else {  
            setSaldo(a);
        }
        return balance(a, 'R');
    }

    @Override
    public String balance(double valor, char movimiento) {
        String resultado = "";
        switch(movimiento){
        
            case 'R':
                resultado="\n=======Movimiento Actual======"
                    + "\nFecha: No se en java como \nHora: no supe como" 
                    + "\nRetiro por Valor : " + valor
                    + "\nBalanca actual: " + getSaldo();
                    break;
            case 'D':
                resultado="\n=======Movimiento Actual======"
                    + "\nFecha: No se en java como \nHora: no supe como" 
                    + "\nReposito por Valor de : " + valor
                    + "\nBalanca actual: " + getSaldo();
                    break;
            default:
                resultado="\n=======Movimiento Actual======"
                    + "\nFecha: No se en java como \nHora: no supe como"                   
                    + "\nBalanca actual: " + getSaldo();
                    break;
        }
        return resultado;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTasa de Interes: " + TasaInteres;
    }

    @Override
    public boolean equals(Object obj) {
        Ahorros o = (Ahorros) obj;
        boolean result = false;
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        if (!super.equals(obj)) {
            return false;
        } else {
            // compare subclass fields
            if (this.TasaInteres == o.TasaInteres) {
                result = true;
            }
        }
        return result;
    }

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }

}
