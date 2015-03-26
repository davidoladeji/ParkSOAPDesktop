
package com.davidoladeji.park.service.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for carpark complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="carpark">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="available" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="capacity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="capacitydisabled" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="capacityfamily" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="codename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="mobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="regularprice" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="spacesavailable" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "carpark", propOrder = {
    "available",
    "capacity",
    "capacitydisabled",
    "capacityfamily",
    "codename",
    "id",
    "mobile",
    "regularprice",
    "spacesavailable"
})
public class Carpark {

    protected boolean available;
    protected int capacity;
    protected int capacitydisabled;
    protected int capacityfamily;
    protected String codename;
    protected Long id;
    protected String mobile;
    protected double regularprice;
    protected int spacesavailable;

    /**
     * Gets the value of the available property.
     * 
     */
    public boolean isAvailable() {
        return available;
    }

    /**
     * Sets the value of the available property.
     * 
     */
    public void setAvailable(boolean value) {
        this.available = value;
    }

    /**
     * Gets the value of the capacity property.
     * 
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Sets the value of the capacity property.
     * 
     */
    public void setCapacity(int value) {
        this.capacity = value;
    }

    /**
     * Gets the value of the capacitydisabled property.
     * 
     */
    public int getCapacitydisabled() {
        return capacitydisabled;
    }

    /**
     * Sets the value of the capacitydisabled property.
     * 
     */
    public void setCapacitydisabled(int value) {
        this.capacitydisabled = value;
    }

    /**
     * Gets the value of the capacityfamily property.
     * 
     */
    public int getCapacityfamily() {
        return capacityfamily;
    }

    /**
     * Sets the value of the capacityfamily property.
     * 
     */
    public void setCapacityfamily(int value) {
        this.capacityfamily = value;
    }

    /**
     * Gets the value of the codename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodename() {
        return codename;
    }

    /**
     * Sets the value of the codename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodename(String value) {
        this.codename = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setId(Long value) {
        this.id = value;
    }

    /**
     * Gets the value of the mobile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * Sets the value of the mobile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobile(String value) {
        this.mobile = value;
    }

    /**
     * Gets the value of the regularprice property.
     * 
     */
    public double getRegularprice() {
        return regularprice;
    }

    /**
     * Sets the value of the regularprice property.
     * 
     */
    public void setRegularprice(double value) {
        this.regularprice = value;
    }

    /**
     * Gets the value of the spacesavailable property.
     * 
     */
    public int getSpacesavailable() {
        return spacesavailable;
    }

    /**
     * Sets the value of the spacesavailable property.
     * 
     */
    public void setSpacesavailable(int value) {
        this.spacesavailable = value;
    }

}
