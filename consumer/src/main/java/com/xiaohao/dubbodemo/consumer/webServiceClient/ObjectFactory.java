
package com.xiaohao.dubbodemo.consumer.webServiceClient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.xiaohao.dubbodemo.consumer.webServiceClient package. 
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

    private final static QName _WebServiceSayHello_QNAME = new QName("http://service.dubbodemo.xiaohao.com/", "webServiceSayHello");
    private final static QName _WebServiceSayHelloResponse_QNAME = new QName("http://service.dubbodemo.xiaohao.com/", "webServiceSayHelloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.xiaohao.dubbodemo.consumer.webServiceClient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link WebServiceSayHelloResponse }
     * 
     */
    public WebServiceSayHelloResponse createWebServiceSayHelloResponse() {
        return new WebServiceSayHelloResponse();
    }

    /**
     * Create an instance of {@link WebServiceSayHello }
     * 
     */
    public WebServiceSayHello createWebServiceSayHello() {
        return new WebServiceSayHello();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebServiceSayHello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.dubbodemo.xiaohao.com/", name = "webServiceSayHello")
    public JAXBElement<WebServiceSayHello> createWebServiceSayHello(WebServiceSayHello value) {
        return new JAXBElement<WebServiceSayHello>(_WebServiceSayHello_QNAME, WebServiceSayHello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WebServiceSayHelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.dubbodemo.xiaohao.com/", name = "webServiceSayHelloResponse")
    public JAXBElement<WebServiceSayHelloResponse> createWebServiceSayHelloResponse(WebServiceSayHelloResponse value) {
        return new JAXBElement<WebServiceSayHelloResponse>(_WebServiceSayHelloResponse_QNAME, WebServiceSayHelloResponse.class, null, value);
    }

}
