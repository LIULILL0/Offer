package jianzhiOffer;
//双重检测锁模式（DCL）尤其jvm底层需要优化，会出现指令优化，故会出现错误。所以需要用volatile
//多线程情况下双重检测锁模式发生指令重排序。所以需要禁止指令重排序序
public class Offer2_4 {
    private static volatile Offer2_4 o;

    private Offer2_4() {
    }

    public static Offer2_4 getInstance() {
        if (o == null) {
            synchronized (Offer2_4.class){
                if(o==null){
                    o = new Offer2_4();
                }
            }
        }
        return o;
    }
}
