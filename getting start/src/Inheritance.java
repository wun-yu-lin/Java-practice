public class Inheritance {

    public static void main(String[] args) {
        ExtendsClass extendsClass = new ExtendsClass();
        extendsClass.setName("wunyu");
        System.out.println(extendsClass.getName());
    }




//    // 繼承 extends
//    //class 子類別可以繼承父類別的屬性與方法
//     //this 為指向自身的方法
        //super 為指向父類別的方法
//      //多層繼承時與執行的順序 繼承 C extend B extend A, 執行順序 A=>B=>C
//    //父類別
//    class A{
//        public String ClassA_name;
//        public String ClassA_nickName;
//
//    }
//    class B extends A {
//        public void setName(String name){
//            ClassA_name = name;
//        }
//        public void setNickName(String nickName){
//            ClassA_nickName = nickName;
//        }
//        public String getName(){
//            return ClassA_name;
//        }
//
//        public String getNickName(){
//            return ClassA_nickName;
//        }
//    }
}
