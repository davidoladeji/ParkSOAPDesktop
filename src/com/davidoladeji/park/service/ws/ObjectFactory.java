
package com.davidoladeji.park.service.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.davidoladeji.park.service.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SetGrantedExitResponse_QNAME = new QName("http://ws.service.park.davidoladeji.com/", "setGrantedExitResponse");
    private final static QName _UpdateBookingByIdResponse_QNAME = new QName("http://ws.service.park.davidoladeji.com/", "updateBookingByIdResponse");
    private final static QName _SetGrantedEntryResponse_QNAME = new QName("http://ws.service.park.davidoladeji.com/", "setGrantedEntryResponse");
    private final static QName _UpdateBookingById_QNAME = new QName("http://ws.service.park.davidoladeji.com/", "updateBookingById");
    private final static QName _CountAllBookings_QNAME = new QName("http://ws.service.park.davidoladeji.com/", "countAllBookings");
    private final static QName _FindAllActiveBookingsResponse_QNAME = new QName("http://ws.service.park.davidoladeji.com/", "findAllActiveBookingsResponse");
    private final static QName _FindAllCarparksResponse_QNAME = new QName("http://ws.service.park.davidoladeji.com/", "findAllCarparksResponse");
    private final static QName _FindAllActiveBookings_QNAME = new QName("http://ws.service.park.davidoladeji.com/", "findAllActiveBookings");
    private final static QName _FindAllCarparks_QNAME = new QName("http://ws.service.park.davidoladeji.com/", "findAllCarparks");
    private final static QName _SetGrantedEntry_QNAME = new QName("http://ws.service.park.davidoladeji.com/", "setGrantedEntry");
    private final static QName _FindAllBookingsResponse_QNAME = new QName("http://ws.service.park.davidoladeji.com/", "findAllBookingsResponse");
    private final static QName _FindByCarRegistrationAndCarpark_QNAME = new QName("http://ws.service.park.davidoladeji.com/", "findByCarRegistrationAndCarpark");
    private final static QName _FindByCarRegistrationAndCarparkResponse_QNAME = new QName("http://ws.service.park.davidoladeji.com/", "findByCarRegistrationAndCarparkResponse");
    private final static QName _FindAllBookings_QNAME = new QName("http://ws.service.park.davidoladeji.com/", "findAllBookings");
    private final static QName _SetGrantedExit_QNAME = new QName("http://ws.service.park.davidoladeji.com/", "setGrantedExit");
    private final static QName _CountAllBookingsResponse_QNAME = new QName("http://ws.service.park.davidoladeji.com/", "countAllBookingsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.davidoladeji.park.service.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FindAllActiveBookings }
     * 
     */
    public FindAllActiveBookings createFindAllActiveBookings() {
        return new FindAllActiveBookings();
    }

    /**
     * Create an instance of {@link FindAllCarparks }
     * 
     */
    public FindAllCarparks createFindAllCarparks() {
        return new FindAllCarparks();
    }

    /**
     * Create an instance of {@link SetGrantedEntry }
     * 
     */
    public SetGrantedEntry createSetGrantedEntry() {
        return new SetGrantedEntry();
    }

    /**
     * Create an instance of {@link FindAllBookingsResponse }
     * 
     */
    public FindAllBookingsResponse createFindAllBookingsResponse() {
        return new FindAllBookingsResponse();
    }

    /**
     * Create an instance of {@link FindAllActiveBookingsResponse }
     * 
     */
    public FindAllActiveBookingsResponse createFindAllActiveBookingsResponse() {
        return new FindAllActiveBookingsResponse();
    }

    /**
     * Create an instance of {@link FindAllCarparksResponse }
     * 
     */
    public FindAllCarparksResponse createFindAllCarparksResponse() {
        return new FindAllCarparksResponse();
    }

    /**
     * Create an instance of {@link UpdateBookingById }
     * 
     */
    public UpdateBookingById createUpdateBookingById() {
        return new UpdateBookingById();
    }

    /**
     * Create an instance of {@link CountAllBookings }
     * 
     */
    public CountAllBookings createCountAllBookings() {
        return new CountAllBookings();
    }

    /**
     * Create an instance of {@link SetGrantedEntryResponse }
     * 
     */
    public SetGrantedEntryResponse createSetGrantedEntryResponse() {
        return new SetGrantedEntryResponse();
    }

    /**
     * Create an instance of {@link SetGrantedExitResponse }
     * 
     */
    public SetGrantedExitResponse createSetGrantedExitResponse() {
        return new SetGrantedExitResponse();
    }

    /**
     * Create an instance of {@link UpdateBookingByIdResponse }
     * 
     */
    public UpdateBookingByIdResponse createUpdateBookingByIdResponse() {
        return new UpdateBookingByIdResponse();
    }

    /**
     * Create an instance of {@link CountAllBookingsResponse }
     * 
     */
    public CountAllBookingsResponse createCountAllBookingsResponse() {
        return new CountAllBookingsResponse();
    }

    /**
     * Create an instance of {@link SetGrantedExit }
     * 
     */
    public SetGrantedExit createSetGrantedExit() {
        return new SetGrantedExit();
    }

    /**
     * Create an instance of {@link FindAllBookings }
     * 
     */
    public FindAllBookings createFindAllBookings() {
        return new FindAllBookings();
    }

    /**
     * Create an instance of {@link FindByCarRegistrationAndCarpark }
     * 
     */
    public FindByCarRegistrationAndCarpark createFindByCarRegistrationAndCarpark() {
        return new FindByCarRegistrationAndCarpark();
    }

    /**
     * Create an instance of {@link FindByCarRegistrationAndCarparkResponse }
     * 
     */
    public FindByCarRegistrationAndCarparkResponse createFindByCarRegistrationAndCarparkResponse() {
        return new FindByCarRegistrationAndCarparkResponse();
    }

    /**
     * Create an instance of {@link Booking }
     * 
     */
    public Booking createBooking() {
        return new Booking();
    }

    /**
     * Create an instance of {@link Carpark }
     * 
     */
    public Carpark createCarpark() {
        return new Carpark();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetGrantedExitResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.service.park.davidoladeji.com/", name = "setGrantedExitResponse")
    public JAXBElement<SetGrantedExitResponse> createSetGrantedExitResponse(SetGrantedExitResponse value) {
        return new JAXBElement<SetGrantedExitResponse>(_SetGrantedExitResponse_QNAME, SetGrantedExitResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateBookingByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.service.park.davidoladeji.com/", name = "updateBookingByIdResponse")
    public JAXBElement<UpdateBookingByIdResponse> createUpdateBookingByIdResponse(UpdateBookingByIdResponse value) {
        return new JAXBElement<UpdateBookingByIdResponse>(_UpdateBookingByIdResponse_QNAME, UpdateBookingByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetGrantedEntryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.service.park.davidoladeji.com/", name = "setGrantedEntryResponse")
    public JAXBElement<SetGrantedEntryResponse> createSetGrantedEntryResponse(SetGrantedEntryResponse value) {
        return new JAXBElement<SetGrantedEntryResponse>(_SetGrantedEntryResponse_QNAME, SetGrantedEntryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateBookingById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.service.park.davidoladeji.com/", name = "updateBookingById")
    public JAXBElement<UpdateBookingById> createUpdateBookingById(UpdateBookingById value) {
        return new JAXBElement<UpdateBookingById>(_UpdateBookingById_QNAME, UpdateBookingById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountAllBookings }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.service.park.davidoladeji.com/", name = "countAllBookings")
    public JAXBElement<CountAllBookings> createCountAllBookings(CountAllBookings value) {
        return new JAXBElement<CountAllBookings>(_CountAllBookings_QNAME, CountAllBookings.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllActiveBookingsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.service.park.davidoladeji.com/", name = "findAllActiveBookingsResponse")
    public JAXBElement<FindAllActiveBookingsResponse> createFindAllActiveBookingsResponse(FindAllActiveBookingsResponse value) {
        return new JAXBElement<FindAllActiveBookingsResponse>(_FindAllActiveBookingsResponse_QNAME, FindAllActiveBookingsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllCarparksResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.service.park.davidoladeji.com/", name = "findAllCarparksResponse")
    public JAXBElement<FindAllCarparksResponse> createFindAllCarparksResponse(FindAllCarparksResponse value) {
        return new JAXBElement<FindAllCarparksResponse>(_FindAllCarparksResponse_QNAME, FindAllCarparksResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllActiveBookings }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.service.park.davidoladeji.com/", name = "findAllActiveBookings")
    public JAXBElement<FindAllActiveBookings> createFindAllActiveBookings(FindAllActiveBookings value) {
        return new JAXBElement<FindAllActiveBookings>(_FindAllActiveBookings_QNAME, FindAllActiveBookings.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllCarparks }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.service.park.davidoladeji.com/", name = "findAllCarparks")
    public JAXBElement<FindAllCarparks> createFindAllCarparks(FindAllCarparks value) {
        return new JAXBElement<FindAllCarparks>(_FindAllCarparks_QNAME, FindAllCarparks.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetGrantedEntry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.service.park.davidoladeji.com/", name = "setGrantedEntry")
    public JAXBElement<SetGrantedEntry> createSetGrantedEntry(SetGrantedEntry value) {
        return new JAXBElement<SetGrantedEntry>(_SetGrantedEntry_QNAME, SetGrantedEntry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllBookingsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.service.park.davidoladeji.com/", name = "findAllBookingsResponse")
    public JAXBElement<FindAllBookingsResponse> createFindAllBookingsResponse(FindAllBookingsResponse value) {
        return new JAXBElement<FindAllBookingsResponse>(_FindAllBookingsResponse_QNAME, FindAllBookingsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByCarRegistrationAndCarpark }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.service.park.davidoladeji.com/", name = "findByCarRegistrationAndCarpark")
    public JAXBElement<FindByCarRegistrationAndCarpark> createFindByCarRegistrationAndCarpark(FindByCarRegistrationAndCarpark value) {
        return new JAXBElement<FindByCarRegistrationAndCarpark>(_FindByCarRegistrationAndCarpark_QNAME, FindByCarRegistrationAndCarpark.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindByCarRegistrationAndCarparkResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.service.park.davidoladeji.com/", name = "findByCarRegistrationAndCarparkResponse")
    public JAXBElement<FindByCarRegistrationAndCarparkResponse> createFindByCarRegistrationAndCarparkResponse(FindByCarRegistrationAndCarparkResponse value) {
        return new JAXBElement<FindByCarRegistrationAndCarparkResponse>(_FindByCarRegistrationAndCarparkResponse_QNAME, FindByCarRegistrationAndCarparkResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllBookings }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.service.park.davidoladeji.com/", name = "findAllBookings")
    public JAXBElement<FindAllBookings> createFindAllBookings(FindAllBookings value) {
        return new JAXBElement<FindAllBookings>(_FindAllBookings_QNAME, FindAllBookings.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetGrantedExit }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.service.park.davidoladeji.com/", name = "setGrantedExit")
    public JAXBElement<SetGrantedExit> createSetGrantedExit(SetGrantedExit value) {
        return new JAXBElement<SetGrantedExit>(_SetGrantedExit_QNAME, SetGrantedExit.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CountAllBookingsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.service.park.davidoladeji.com/", name = "countAllBookingsResponse")
    public JAXBElement<CountAllBookingsResponse> createCountAllBookingsResponse(CountAllBookingsResponse value) {
        return new JAXBElement<CountAllBookingsResponse>(_CountAllBookingsResponse_QNAME, CountAllBookingsResponse.class, null, value);
    }

}
