
package service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for valueArray complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="valueArray">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="maximumCapacity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "valueArray", propOrder = {
    "maximumCapacity"
})
@XmlSeeAlso({
    StringArray.class
})
public abstract class ValueArray {

    protected int maximumCapacity;

    /**
     * Gets the value of the maximumCapacity property.
     * 
     */
    public int getMaximumCapacity() {
        return maximumCapacity;
    }

    /**
     * Sets the value of the maximumCapacity property.
     * 
     */
    public void setMaximumCapacity(int value) {
        this.maximumCapacity = value;
    }

}
