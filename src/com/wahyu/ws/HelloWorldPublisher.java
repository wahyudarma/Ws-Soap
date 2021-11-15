package com.wahyu.ws;

import javax.xml.ws.Endpoint;
import com.wahyu.ws.HelloWorldImpl;

public class HelloWorldPublisher
{
    public static void main(String[]args)
    {
        Endpoint.publish(
                "http://localhost:8888/ws/hello", new HelloWorldImpl()
        );
    }
}
