
package services;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IServicesPharmacie", targetNamespace = "http://services/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IServicesPharmacie {


    /**
     * 
     * @return
     *     returns java.util.List<services.Pharmacie>
     */
    @WebMethod(operationName = "ListdesPharmacies")
    @WebResult(name = "ListeDesPharmacies", targetNamespace = "")
    @RequestWrapper(localName = "ListdesPharmacies", targetNamespace = "http://services/", className = "services.ListdesPharmacies")
    @ResponseWrapper(localName = "ListdesPharmaciesResponse", targetNamespace = "http://services/", className = "services.ListdesPharmaciesResponse")
    @Action(input = "http://services/IServicesPharmacie/ListdesPharmaciesRequest", output = "http://services/IServicesPharmacie/ListdesPharmaciesResponse")
    public List<Pharmacie> listdesPharmacies();

    /**
     * 
     * @return
     *     returns java.util.List<services.Pharmacie>
     */
    @WebMethod(operationName = "ListdesPharmaciesenGarde")
    @WebResult(name = "ListeDesPharmaciesEnGarde", targetNamespace = "")
    @RequestWrapper(localName = "ListdesPharmaciesenGarde", targetNamespace = "http://services/", className = "services.ListdesPharmaciesenGarde")
    @ResponseWrapper(localName = "ListdesPharmaciesenGardeResponse", targetNamespace = "http://services/", className = "services.ListdesPharmaciesenGardeResponse")
    @Action(input = "http://services/IServicesPharmacie/ListdesPharmaciesenGardeRequest", output = "http://services/IServicesPharmacie/ListdesPharmaciesenGardeResponse")
    public List<Pharmacie> listdesPharmaciesenGarde();

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns services.Pharmacie
     */
    @WebMethod(operationName = "PharmacieProche")
    @WebResult(name = "ListeDesPharmaciesProche", targetNamespace = "")
    @RequestWrapper(localName = "PharmacieProche", targetNamespace = "http://services/", className = "services.PharmacieProche")
    @ResponseWrapper(localName = "PharmacieProcheResponse", targetNamespace = "http://services/", className = "services.PharmacieProcheResponse")
    @Action(input = "http://services/IServicesPharmacie/PharmacieProcheRequest", output = "http://services/IServicesPharmacie/PharmacieProcheResponse")
    public Pharmacie pharmacieProche(
        @WebParam(name = "arg0", targetNamespace = "")
        Double arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        Double arg1);

}
