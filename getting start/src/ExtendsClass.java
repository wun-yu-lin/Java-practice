public class ExtendsClass extends B{

}

// 繼承 extends
//class 子類別可以繼承父類別的屬性與方法
//父類別
class A{
    String ClassA_name;
    String ClassA_nickName;

}

//子類別
class B extends A {
    void setName(String name) {
        ClassA_name = name;
    }

    void setNickName(String nickName) {
        ClassA_nickName = nickName;
    }

    String getName() {
        return ClassA_name;
    }

    String getNickName() {
        return ClassA_nickName;
    }
}

