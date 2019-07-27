package jianzhiOffer;


//静态内部类（线程安全，调用效率高，同时也可以做到延迟加载）
public class Offer2_3 {
    private static class Singleton{
        private static final Offer2_3 o = new Offer2_3();
    }
    private Offer2_3(){}
    public static Offer2_3 getInstance(){
        return Singleton.o;
    }
}
