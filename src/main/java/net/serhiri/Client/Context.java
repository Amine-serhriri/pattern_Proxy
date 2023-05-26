package net.serhiri.Client;

import net.serhiri.Service.IService;

public class Context {
    private IService service;//le contexte est lié à la partie cliente 
    public void compute(int param){
        System.out.println("==================");
        double result = service.compute( param);
        System.out.println("Result =>"+result);
        System.out.println("==================");
    }

    public void setService(IService service) {
        this.service = service;
    }
}
