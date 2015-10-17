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
public class Cheques extends Cuentas{
    private static int count = 0;
    private static int numeroTransacciones = 3;
    private String IdTalonario;

    public String getIdTalonario() {
        return IdTalonario;
    }
    public void setIdTalonario(String IdTalonario) {
        this.IdTalonario = IdTalonario;
    }
    
    public Cheques(){
        IdTalonario = "";        
    }
    
    public Cheques(int id, int idCliente, String nombreCliente, double saldo, String idTalonario){
            IdTalonario  = idTalonario;
        }
    
    @Override
    public String toString() {
        return super.toString() + "\nId Talonario: " + IdTalonario;
    }
    
    @Override
    public boolean equals(Object obj) {
        Cheques o = (Cheques) obj;
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
            if (this.IdTalonario == o.IdTalonario) {
                result = true;
            }
        }
        return result;
    }
    
    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }
    
    @Override
    public String depositar(double valor) {
        return "\nA este tipo de cuenta no se le permiten depositos";
    }

    @Override
    public String retitar(double valor) {
        count++;
        double a = getSaldo();
        double b = a;
        a = a - valor;
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
            default:
                resultado="\n=======Movimiento Actual======"
                    + "\nFecha: No se en java como \nHora: no supe como"                   
                    + "\nBalanca actual: " + getSaldo();
                    break;
        }
        return resultado;
    }
    
}
