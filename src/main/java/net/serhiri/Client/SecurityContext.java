package net.serhiri.Client;

public class SecurityContext {
    public static String Username="";
    public static String Password="";
    public static String Role="";

    public static void authenticate(String user,String mdp,String r){
        Username=user;
        Password=mdp;
        Role=r;
    }

}
