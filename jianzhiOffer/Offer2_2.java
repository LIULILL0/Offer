package jianzhiOffer;

//懒汉式加载（线程安全，调用效率不高，但是可以做到延迟加载）
public class Offer2_2 {
    private static Offer2_2 o ;
    private Offer2_2(){}
    public static synchronized Offer2_2 getInstance(){
        if(o==null){
            o =  new Offer2_2();
        }
        return o;
    }
}
