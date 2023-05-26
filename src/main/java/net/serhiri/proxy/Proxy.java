package net.serhiri.proxy;

import net.serhiri.Service.IService;
import net.serhiri.Service.ServiceImp;



public class Proxy implements IService {
    private IService serviceImp;

    public Proxy(IService serviceImp) {
        this.serviceImp = serviceImp;
    }
    @Override
    public double compute(int param) {
        double res = serviceImp.compute(param);
        return res;
    }
}
