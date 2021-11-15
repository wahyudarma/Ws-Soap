package com.wahyu.ws;
import javax.jws.WebService;

//Service Implementation
@WebService(endpointInterface = "com.wahyu.ws.HelloWorld")
public class HelloWorldImpl implements HelloWorld
{
    @Override
    public String getHelloWorldAsString(String name)
    {
        return "Hello " + name;
    }
}
