package net.serhiri.proxy;

import net.serhiri.Service.IService;
import net.serhiri.Service.ServiceImp;

public class LoggingProxy implements IService {
    private IService serviceImp;

    public LoggingProxy(IService serviceImp) {
        this.serviceImp = serviceImp;
    }
    @Override
    public double compute(int param) {
        long t1=System.currentTimeMillis();
        double result = serviceImp.compute(param);
        long t2=System.currentTimeMillis();
        System.out.println("duration =>"+(t2-t1));
        return result;
    }
}
