
package SGB;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ServicioGestionBancariaSoap", targetNamespace = "http://tempuri.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ServicioGestionBancariaSoap {


    /**
     * 
     * @param valor
     * @param idCuenta
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "http://tempuri.org/balance")
    @WebResult(name = "balanceResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "balance", targetNamespace = "http://tempuri.org/", className = "SGB.Balance")
    @ResponseWrapper(localName = "balanceResponse", targetNamespace = "http://tempuri.org/", className = "SGB.BalanceResponse")
    public String balance(
        @WebParam(name = "idCuenta", targetNamespace = "http://tempuri.org/")
        int idCuenta,
        @WebParam(name = "valor", targetNamespace = "http://tempuri.org/")
        double valor);

    /**
     * 
     * @param valor
     * @param idCuenta
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "http://tempuri.org/depositar")
    @WebResult(name = "depositarResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "depositar", targetNamespace = "http://tempuri.org/", className = "SGB.Depositar")
    @ResponseWrapper(localName = "depositarResponse", targetNamespace = "http://tempuri.org/", className = "SGB.DepositarResponse")
    public String depositar(
        @WebParam(name = "idCuenta", targetNamespace = "http://tempuri.org/")
        int idCuenta,
        @WebParam(name = "valor", targetNamespace = "http://tempuri.org/")
        double valor);

    /**
     * 
     * @param valor
     * @param idCuenta
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "http://tempuri.org/retirar")
    @WebResult(name = "retirarResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "retirar", targetNamespace = "http://tempuri.org/", className = "SGB.Retirar")
    @ResponseWrapper(localName = "retirarResponse", targetNamespace = "http://tempuri.org/", className = "SGB.RetirarResponse")
    public String retirar(
        @WebParam(name = "idCuenta", targetNamespace = "http://tempuri.org/")
        int idCuenta,
        @WebParam(name = "valor", targetNamespace = "http://tempuri.org/")
        double valor);

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "http://tempuri.org/cuentas")
    @WebResult(name = "cuentasResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "cuentas", targetNamespace = "http://tempuri.org/", className = "SGB.Cuentas")
    @ResponseWrapper(localName = "cuentasResponse", targetNamespace = "http://tempuri.org/", className = "SGB.CuentasResponse")
    public String cuentas();

    /**
     * 
     * @param idCuenta
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "http://tempuri.org/bucarCuentas")
    @WebResult(name = "bucarCuentasResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "bucarCuentas", targetNamespace = "http://tempuri.org/", className = "SGB.BucarCuentas")
    @ResponseWrapper(localName = "bucarCuentasResponse", targetNamespace = "http://tempuri.org/", className = "SGB.BucarCuentasResponse")
    public String bucarCuentas(
        @WebParam(name = "idCuenta", targetNamespace = "http://tempuri.org/")
        int idCuenta);

    /**
     * 
     * @param idCliente
     * @param nombreCliente
     * @param saldo
     * @param idCuenta
     * @param tasaInteres
     */
    @WebMethod(action = "http://tempuri.org/addCuentasAhorros")
    @RequestWrapper(localName = "addCuentasAhorros", targetNamespace = "http://tempuri.org/", className = "SGB.AddCuentasAhorros")
    @ResponseWrapper(localName = "addCuentasAhorrosResponse", targetNamespace = "http://tempuri.org/", className = "SGB.AddCuentasAhorrosResponse")
    public void addCuentasAhorros(
        @WebParam(name = "idCuenta", targetNamespace = "http://tempuri.org/")
        int idCuenta,
        @WebParam(name = "idCliente", targetNamespace = "http://tempuri.org/")
        int idCliente,
        @WebParam(name = "nombreCliente", targetNamespace = "http://tempuri.org/")
        String nombreCliente,
        @WebParam(name = "saldo", targetNamespace = "http://tempuri.org/")
        double saldo,
        @WebParam(name = "tasaInteres", targetNamespace = "http://tempuri.org/")
        double tasaInteres);

    /**
     * 
     * @param idCliente
     * @param nombreCliente
     * @param limiteCredito
     * @param saldo
     * @param idCuenta
     * @param tasaInteres
     */
    @WebMethod(action = "http://tempuri.org/addCuentasCorrientes")
    @RequestWrapper(localName = "addCuentasCorrientes", targetNamespace = "http://tempuri.org/", className = "SGB.AddCuentasCorrientes")
    @ResponseWrapper(localName = "addCuentasCorrientesResponse", targetNamespace = "http://tempuri.org/", className = "SGB.AddCuentasCorrientesResponse")
    public void addCuentasCorrientes(
        @WebParam(name = "idCuenta", targetNamespace = "http://tempuri.org/")
        int idCuenta,
        @WebParam(name = "idCliente", targetNamespace = "http://tempuri.org/")
        int idCliente,
        @WebParam(name = "nombreCliente", targetNamespace = "http://tempuri.org/")
        String nombreCliente,
        @WebParam(name = "saldo", targetNamespace = "http://tempuri.org/")
        double saldo,
        @WebParam(name = "limiteCredito", targetNamespace = "http://tempuri.org/")
        double limiteCredito,
        @WebParam(name = "tasaInteres", targetNamespace = "http://tempuri.org/")
        double tasaInteres);

    /**
     * 
     * @param idTalonario
     * @param idCliente
     * @param nombreCliente
     * @param saldo
     * @param idCuenta
     */
    @WebMethod(action = "http://tempuri.org/addCuentasCheques")
    @RequestWrapper(localName = "addCuentasCheques", targetNamespace = "http://tempuri.org/", className = "SGB.AddCuentasCheques")
    @ResponseWrapper(localName = "addCuentasChequesResponse", targetNamespace = "http://tempuri.org/", className = "SGB.AddCuentasChequesResponse")
    public void addCuentasCheques(
        @WebParam(name = "idCuenta", targetNamespace = "http://tempuri.org/")
        int idCuenta,
        @WebParam(name = "idCliente", targetNamespace = "http://tempuri.org/")
        int idCliente,
        @WebParam(name = "nombreCliente", targetNamespace = "http://tempuri.org/")
        String nombreCliente,
        @WebParam(name = "saldo", targetNamespace = "http://tempuri.org/")
        double saldo,
        @WebParam(name = "idTalonario", targetNamespace = "http://tempuri.org/")
        String idTalonario);

}
