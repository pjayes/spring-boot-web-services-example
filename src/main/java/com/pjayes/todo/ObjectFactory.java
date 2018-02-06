//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.7 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2018.02.06 alle 05:06:08 PM CET 
//


package com.pjayes.todo;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.pjayes.todo package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.pjayes.todo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MarkAsCompletedRequest }
     * 
     */
    public MarkAsCompletedRequest createMarkAsCompletedRequest() {
        return new MarkAsCompletedRequest();
    }

    /**
     * Create an instance of {@link AddTodoRequest }
     * 
     */
    public AddTodoRequest createAddTodoRequest() {
        return new AddTodoRequest();
    }

    /**
     * Create an instance of {@link TodoType }
     * 
     */
    public TodoType createTodoType() {
        return new TodoType();
    }

    /**
     * Create an instance of {@link DeleteTodoRequest }
     * 
     */
    public DeleteTodoRequest createDeleteTodoRequest() {
        return new DeleteTodoRequest();
    }

    /**
     * Create an instance of {@link GetTodoResponse }
     * 
     */
    public GetTodoResponse createGetTodoResponse() {
        return new GetTodoResponse();
    }

    /**
     * Create an instance of {@link GetTodoRequest }
     * 
     */
    public GetTodoRequest createGetTodoRequest() {
        return new GetTodoRequest();
    }

}
