/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclient;

/**
 *
 * @author Carlos
 */
public class JavaClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cta = 123;
        double valor = 2000000;
        addCuentasAhorros(999, 999, "Carlos", 5000000, 0.3);
        addCuentasCorrientes(888, 888, "Andres", 4000000, 8000000, 0.2);
        addCuentasCheques(777, 777, "Buelvas", 6000000, "777");
        depositar(999, valor);
        depositar(888, 1500000);
        depositar(777, 500000);
        
        System.out.println("Cuenta: "+bucarCuentas(999));
        System.out.println("Cuenta: "+bucarCuentas(888));
        System.out.println("Cuenta: "+bucarCuentas(777));
        
        System.out.println("Cuenta: "+balance(999,2));
        System.out.println("Cuenta: "+bucarCuentas(999)+"\n");
        System.out.println("Cuenta: "+cuentas());
        
        
    }

    private static String depositar(int idCuenta, double valor) {
        SGB.ServicioGestionBancaria service = new SGB.ServicioGestionBancaria();
        SGB.ServicioGestionBancariaSoap port = service.getServicioGestionBancariaSoap();
        return port.depositar(idCuenta, valor);
    }

    private static String balance(int idCuenta, double valor) {
        SGB.ServicioGestionBancaria service = new SGB.ServicioGestionBancaria();
        SGB.ServicioGestionBancariaSoap port = service.getServicioGestionBancariaSoap();
        return port.balance(idCuenta, valor);
    }

    private static String bucarCuentas(int idCuenta) {
        SGB.ServicioGestionBancaria service = new SGB.ServicioGestionBancaria();
        SGB.ServicioGestionBancariaSoap port = service.getServicioGestionBancariaSoap();
        return port.bucarCuentas(idCuenta);
    }
    

    private static void addCuentasAhorros(int idCuenta, int idCliente, java.lang.String nombreCliente, double saldo, double tasaInteres) {
        SGB.ServicioGestionBancaria service = new SGB.ServicioGestionBancaria();
        SGB.ServicioGestionBancariaSoap port = service.getServicioGestionBancariaSoap();
        port.addCuentasAhorros(idCuenta, idCliente, nombreCliente, saldo, tasaInteres);
    }

    private static String retirar(int idCuenta, double valor) {
        SGB.ServicioGestionBancaria service = new SGB.ServicioGestionBancaria();
        SGB.ServicioGestionBancariaSoap port = service.getServicioGestionBancariaSoap();
        return port.retirar(idCuenta, valor);
    }

    private static void addCuentasCheques(int idCuenta, int idCliente, java.lang.String nombreCliente, double saldo, java.lang.String idTalonario) {
        SGB.ServicioGestionBancaria service = new SGB.ServicioGestionBancaria();
        SGB.ServicioGestionBancariaSoap port = service.getServicioGestionBancariaSoap();
        port.addCuentasCheques(idCuenta, idCliente, nombreCliente, saldo, idTalonario);
    }

    private static void addCuentasCorrientes(int idCuenta, int idCliente, java.lang.String nombreCliente, double saldo, double limiteCredito, double tasaInteres) {
        SGB.ServicioGestionBancaria service = new SGB.ServicioGestionBancaria();
        SGB.ServicioGestionBancariaSoap port = service.getServicioGestionBancariaSoap();
        port.addCuentasCorrientes(idCuenta, idCliente, nombreCliente, saldo, limiteCredito, tasaInteres);
    }

    private static String cuentas() {
        SGB.ServicioGestionBancaria service = new SGB.ServicioGestionBancaria();
        SGB.ServicioGestionBancariaSoap port = service.getServicioGestionBancariaSoap();
        return port.cuentas();
    }
    
    
}
