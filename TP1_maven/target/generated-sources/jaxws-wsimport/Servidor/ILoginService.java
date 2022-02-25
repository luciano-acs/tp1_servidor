
package Servidor;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ILoginService", targetNamespace = "http://ISTP1.Service.Contracts.Service")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ILoginService {


    /**
     * 
     * @param codigo
     * @return
     *     returns Servidor.Autorizacion
     */
    @WebMethod(operationName = "SolicitarAutorizacion", action = "http://ISTP1.Service.Contracts.Service/ILoginService/SolicitarAutorizacion")
    @WebResult(name = "SolicitarAutorizacionResult", targetNamespace = "http://ISTP1.Service.Contracts.Service")
    @RequestWrapper(localName = "SolicitarAutorizacion", targetNamespace = "http://ISTP1.Service.Contracts.Service", className = "Servidor.SolicitarAutorizacion")
    @ResponseWrapper(localName = "SolicitarAutorizacionResponse", targetNamespace = "http://ISTP1.Service.Contracts.Service", className = "Servidor.SolicitarAutorizacionResponse")
    public Autorizacion solicitarAutorizacion(
        @WebParam(name = "codigo", targetNamespace = "http://ISTP1.Service.Contracts.Service")
        String codigo);

}
