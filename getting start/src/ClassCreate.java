public class ClassCreate {
    public static void main(String[] args) {
        Role role = new Role();
        role.nickName = "wunyu";
        System.out.println(role.nickName);
        role.sayHello();
        role.saySomething("Hello my name is wunyu");
        System.out.println(role.info.age);

    }
}
