public class Polymorphism extends Animal{
    //Polymorphism多型 - 利用父類別提供的方法呼叫，子類別可以有自己特有的行為
    //子類別會overwrite 父類類別的方法，此現象稱為多型


    //方法重載(Overload)：我們在方法那一節討論到，方法重載(Overload)，即在一個類別當中，有同樣的方法名稱，但參數資料不同。
    //方法重寫(Override)：子類別繼承父類別，覆寫父類別方法，方法名稱與參數都一樣。子類別可以根據自己需求重新定義改寫方法。
    void move() {
        System.out.println("Polymorphism"); //override method, 覆蓋掉 Anima類別中的 move方法
        super.move(); // 使用 父 class 之方法
    }
}

