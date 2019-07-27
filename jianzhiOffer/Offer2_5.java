package jianzhiOffer;

//Joshua Bloch大神说过的这句话：“单元素的枚举类型已经成为实现Singleton的最佳方法”
//可以防止反射和反序列化的漏洞
public enum Offer2_5 {
    INSTANCE;
    public Offer2_5 getInstance(){
        return INSTANCE;
    }
}
