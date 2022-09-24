public class Encapsulation {
    //封裝
    //    物件導向最基本的原則，把真實世界的某個事物包成物件，裡面的資訊不對外公開，只公開某些特定方法讓別人使用，內部的實做及資料都隱藏起來，不讓人直接使用，也不需要讓別人直接使用。也就是所謂的 資訊隱藏（Information Hiding）
    //封裝常用修飾詞 private 私有, public公開
    //private 只有自己類別的能存取，此資訊通常會同類別會設定其他方法來讀取資訊
    //public 任何人都可以調用，一般人都可以呼叫
    public static void main(String[] args) {
        Student student = new Student();
        student.setInfo("wunyu", 25, "boy");
        System.out.println(student.getAge());
        System.out.println(student.getGender());
        System.out.println(student.getName());
    }
}
