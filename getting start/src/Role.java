public class Role {

    // property
    String nickName;
    String gender;
    Info info = new Info();

    //method
    void sayHello(){
        System.out.println("Hello");
    }
    String saySomething(String str){
        System.out.println(str);
        return str;
    }


    //inner class
    class Info{
        int age = 100;
        int tall;
        String realName;
    }
}
