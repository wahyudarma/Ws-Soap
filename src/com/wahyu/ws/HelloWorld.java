package com.wahyu.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

//Service endpoint
@WebService
//@SOAPBinding(style = Style.DOCUMENT, use= SOAPBinding.Use.LITERAL)
@SOAPBinding(style = Style.RPC)
public interface HelloWorld
{
    @WebMethod String getHelloWorldAsString(String name);
}
