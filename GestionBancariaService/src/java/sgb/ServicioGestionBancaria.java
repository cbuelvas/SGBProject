/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sgb;

import CuentasBancarias.Ahorros;
import CuentasBancarias.Cheques;
import CuentasBancarias.Corrientes;
import CuentasBancarias.Cuentas;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import Data.CuentasRepo;
import java.util.ArrayList;


/**
 *
 * @author Carlos
 */
@WebService(serviceName = "ServicioGestionBancaria")
public class ServicioGestionBancaria {
    CuentasRepo data = new CuentasRepo();    
    
    @WebMethod(operationName = "addCuentaAhorro")
    public String addCuentaAhorro(@WebParam(name = "idCuenta") int idCuenta, @WebParam(name = "idUsuario") int idUsuario, @WebParam(name = "nombreUsuario") String nombreUsuario, @WebParam(name = "valor") double valor, @WebParam(name = "tasaInteres") double tasaInteres) {
        Ahorros cta = new Ahorros(idCuenta,idUsuario,nombreUsuario,valor,tasaInteres);
        data.addCuentas(cta);
        return null;
    }
   
    @WebMethod(operationName = "addCuentaCorriente")
    public String addCuentaCorriente(@WebParam(name = "idCuenta") int idCuenta, @WebParam(name = "idCliente") int idCliente, @WebParam(name = "nombreCliente") String nombreCliente, @WebParam(name = "saldo") double saldo, @WebParam(name = "limite") double limite, @WebParam(name = "tasaInteres") double tasaInteres) {
        Corrientes cta = new Corrientes(idCuenta,idCliente,nombreCliente,saldo,limite,tasaInteres);
        data.addCuentas(cta);
        return null;
    }

    @WebMethod(operationName = "addCuentaCheque")
    public String addCuentaCheque(@WebParam(name = "idCuenta") int idCuenta, @WebParam(name = "idCliente") int idCliente, @WebParam(name = "nombreCliente") String nombreCliente, @WebParam(name = "saldo") double saldo, @WebParam(name = "idTalonario") String idTalonario) {
        Cheques cta = new Cheques(idCuenta,idCliente,nombreCliente,saldo,idTalonario);
        data.addCuentas(cta);        
        return null;
    }

    @WebMethod(operationName = "balance")
    public String balance(@WebParam(name = "idCuenta") int idCuenta) {
        ArrayList<Cuentas> temp = data.getCuentas();
        String result = "";        
        for(int i=0;i<=temp.size();i++){
            int id=0;
            id=temp.get(i).getId();
            System.out.println("id");
        }
        return result;
    }

    @WebMethod(operationName = "depositar")
    public String depositar(@WebParam(name = "idCuenta") int idCuenta, @WebParam(name = "valor") double valor) {
        //TODO write your implementation code here:
        return null;
    }

    @WebMethod(operationName = "retirar")
    public String retirar(@WebParam(name = "idCuenta") int idCuenta, @WebParam(name = "valor") double valor) {
        //TODO write your implementation code here:
        return null;
    }

    @WebMethod(operationName = "cuentas")
    public String cuentas() {
        String resultado = "";
        ArrayList<Cuentas> temp = data.getCuentas();
        for (int i=0;i<=temp.size();i++){
            resultado = temp.get(i).toString();
        }
        return resultado;
    }

    @WebMethod(operationName = "buscarCuenta")
    public String buscarCuenta(@WebParam(name = "idCuenta") int idCuenta) {
        //TODO write your implementation code here:
        return null;
    }
}
