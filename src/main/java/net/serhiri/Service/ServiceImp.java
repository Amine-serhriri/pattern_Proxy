package net.serhiri.Service;

public class ServiceImp implements IService{
    @Override
    public double compute(int param) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        double value=33;
        return value*param;
    }
}
