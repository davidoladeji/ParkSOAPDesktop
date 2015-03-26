
package com.davidoladeji.park.service.ws;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ParkSOAPService", targetNamespace = "http://ws.service.park.davidoladeji.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ParkSOAPService {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<com.davidoladeji.park.service.ws.Booking>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findAllActiveBookings", targetNamespace = "http://ws.service.park.davidoladeji.com/", className = "com.davidoladeji.park.service.ws.FindAllActiveBookings")
    @ResponseWrapper(localName = "findAllActiveBookingsResponse", targetNamespace = "http://ws.service.park.davidoladeji.com/", className = "com.davidoladeji.park.service.ws.FindAllActiveBookingsResponse")
    public List<Booking> findAllActiveBookings(
        @WebParam(name = "arg0", targetNamespace = "")
        boolean arg0);

    /**
     * 
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "countAllBookings", targetNamespace = "http://ws.service.park.davidoladeji.com/", className = "com.davidoladeji.park.service.ws.CountAllBookings")
    @ResponseWrapper(localName = "countAllBookingsResponse", targetNamespace = "http://ws.service.park.davidoladeji.com/", className = "com.davidoladeji.park.service.ws.CountAllBookingsResponse")
    public int countAllBookings();

    /**
     * 
     * @return
     *     returns java.util.List<com.davidoladeji.park.service.ws.Booking>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findAllBookings", targetNamespace = "http://ws.service.park.davidoladeji.com/", className = "com.davidoladeji.park.service.ws.FindAllBookings")
    @ResponseWrapper(localName = "findAllBookingsResponse", targetNamespace = "http://ws.service.park.davidoladeji.com/", className = "com.davidoladeji.park.service.ws.FindAllBookingsResponse")
    public List<Booking> findAllBookings();

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "updateBookingById", targetNamespace = "http://ws.service.park.davidoladeji.com/", className = "com.davidoladeji.park.service.ws.UpdateBookingById")
    @ResponseWrapper(localName = "updateBookingByIdResponse", targetNamespace = "http://ws.service.park.davidoladeji.com/", className = "com.davidoladeji.park.service.ws.UpdateBookingByIdResponse")
    public void updateBookingById(
        @WebParam(name = "arg0", targetNamespace = "")
        Long arg0);

    /**
     * 
     * @return
     *     returns java.util.List<com.davidoladeji.park.service.ws.Carpark>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findAllCarparks", targetNamespace = "http://ws.service.park.davidoladeji.com/", className = "com.davidoladeji.park.service.ws.FindAllCarparks")
    @ResponseWrapper(localName = "findAllCarparksResponse", targetNamespace = "http://ws.service.park.davidoladeji.com/", className = "com.davidoladeji.park.service.ws.FindAllCarparksResponse")
    public List<Carpark> findAllCarparks();

    /**
     * 
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "setGrantedEntry", targetNamespace = "http://ws.service.park.davidoladeji.com/", className = "com.davidoladeji.park.service.ws.SetGrantedEntry")
    @ResponseWrapper(localName = "setGrantedEntryResponse", targetNamespace = "http://ws.service.park.davidoladeji.com/", className = "com.davidoladeji.park.service.ws.SetGrantedEntryResponse")
    public void setGrantedEntry(
        @WebParam(name = "arg0", targetNamespace = "")
        boolean arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        Booking arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "setGrantedExit", targetNamespace = "http://ws.service.park.davidoladeji.com/", className = "com.davidoladeji.park.service.ws.SetGrantedExit")
    @ResponseWrapper(localName = "setGrantedExitResponse", targetNamespace = "http://ws.service.park.davidoladeji.com/", className = "com.davidoladeji.park.service.ws.SetGrantedExitResponse")
    public void setGrantedExit(
        @WebParam(name = "arg0", targetNamespace = "")
        boolean arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        Booking arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns com.davidoladeji.park.service.ws.Booking
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findByCarRegistrationAndCarpark", targetNamespace = "http://ws.service.park.davidoladeji.com/", className = "com.davidoladeji.park.service.ws.FindByCarRegistrationAndCarpark")
    @ResponseWrapper(localName = "findByCarRegistrationAndCarparkResponse", targetNamespace = "http://ws.service.park.davidoladeji.com/", className = "com.davidoladeji.park.service.ws.FindByCarRegistrationAndCarparkResponse")
    public Booking findByCarRegistrationAndCarpark(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        Carpark arg1);

}