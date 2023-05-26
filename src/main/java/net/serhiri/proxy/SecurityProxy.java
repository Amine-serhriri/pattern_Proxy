package net.serhiri.proxy;

import net.serhiri.Client.SecurityContext;
import net.serhiri.Service.IService;
import net.serhiri.Service.ServiceImp;

public class SecurityProxy implements IService {
    private IService serviceImp;

    public SecurityProxy(IService serviceImp) {
        this.serviceImp = serviceImp;
    }

    @Override
    public double compute(int param) {
        if (!SecurityContext.Role.equals("root")) {
            throw new RuntimeException("Not Authorized");
        }
        double result = serviceImp.compute(param);
        return result;
    }


}
