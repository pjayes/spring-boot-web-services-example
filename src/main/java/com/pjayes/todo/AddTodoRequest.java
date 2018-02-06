//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.7 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2018.02.06 alle 05:06:08 PM CET 
//


package com.pjayes.todo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per anonymous complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Todo" type="{http://pjayes.com/todo}TodoType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "todo"
})
@XmlRootElement(name = "AddTodoRequest")
public class AddTodoRequest {

    @XmlElement(name = "Todo", required = true)
    protected TodoType todo;

    /**
     * Recupera il valore della proprietà todo.
     * 
     * @return
     *     possible object is
     *     {@link TodoType }
     *     
     */
    public TodoType getTodo() {
        return todo;
    }

    /**
     * Imposta il valore della proprietà todo.
     * 
     * @param value
     *     allowed object is
     *     {@link TodoType }
     *     
     */
    public void setTodo(TodoType value) {
        this.todo = value;
    }

}
