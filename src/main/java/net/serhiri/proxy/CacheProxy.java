package net.serhiri.proxy;

import net.serhiri.Service.IService;
import net.serhiri.Service.ServiceImp;

import java.util.HashMap;

public class CacheProxy implements IService {
    private IService serviceImp;

    public CacheProxy(IService serviceImp) {
        this.serviceImp = serviceImp;
    }
    HashMap<Integer,Double>cache=new HashMap<>();
    @Override
    public double compute(int param) {
        Double cacheValue=cache.get(param);
        if(cacheValue!=null){
            System.out.println("----Cache Result");
            return cacheValue;
        }
        else {
            double result = serviceImp.compute(param);
            cache.put(param,result);//avec le parametre voila le reultat calcule
            System.out.println("-----New Computing Result ");
            return result;
        }
    }
}
