public class Polymorphism_test {
    public static void main(String[] args){
        Polymorphism polymorphism = new Polymorphism();
        polymorphism.move();
        Abstract_inheritance abstract_inheritance = new Abstract_inheritance();
        abstract_inheritance.sayHello(); //抽象類別中，建立方法並inheritance
        abstract_inheritance.abMethod(); //抽象類別中，抽象方法並inheritance 及 實作方法
    }
}
