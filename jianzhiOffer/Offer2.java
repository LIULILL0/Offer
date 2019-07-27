package jianzhiOffer;

//饿汉式（线程安全，调用效率高，但是不能做到延迟加载）
public class Offer2 {
    private static Offer2 o = new Offer2();
    private Offer2(){}
    public static Offer2 getInstance(){
        return o;
    }
}
