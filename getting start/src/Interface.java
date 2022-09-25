public class Interface implements InterfaceA{
    //透過InterfaceA介面來這個class中實作method

    public static void main(String[] args) {

    }
    //功能開發後，請user針對規則去執行，稱為介面
    //介面無法被實體化出來，同一個class可以implement多個interface
    //需要被實作的方法
    @Override
    public void getData() {
        System.out.println("Data output...");
        //x 已經在InterfaceA 被定義了，為常數不能被更改，但可以調用
        System.out.println("X:"+ x);
    }


}
