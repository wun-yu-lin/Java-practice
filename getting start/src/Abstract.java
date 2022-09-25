abstract public class Abstract {
    //抽象可以想像成一種概念，並不存在於世界上, 此類別無法實體化
    //用來做為其他class繼承使用, 只能被繼承
    void sayHello(){
        System.out.println("Hello");
    }
    abstract void abMethod(); //抽象方法不能再抽象class中實作，需要在實體化的class中實作出來
}
