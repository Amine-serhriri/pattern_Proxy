package net.serhiri;


import net.serhiri.Client.Context;
import net.serhiri.Client.SecurityContext;
import net.serhiri.Service.ServiceImp;
import net.serhiri.proxy.CacheProxy;
import net.serhiri.proxy.LoggingProxy;
import net.serhiri.proxy.Proxy;
import net.serhiri.proxy.SecurityProxy;

public class Main {
    public static void main(String[] args) {
        SecurityContext.authenticate("user1","123","root");
        Context context=new Context();
        context.setService(new LoggingProxy(new SecurityProxy(new CacheProxy(new ServiceImp()))) );
        context.compute(2);


    }
}