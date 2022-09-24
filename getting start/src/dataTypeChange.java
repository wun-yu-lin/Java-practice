public class dataTypeChange {
    public static void main(String[] args){
        //資料小轉大
        byte byteVal;
        byteVal = 127;
        int intVal = byteVal;
        System.out.println(intVal);


        //資料大轉小
        int a = 1000;
        byte b = (byte) a; //強制轉換會導致資料溢位
        System.out.println(b);

        //整數轉字串
        int intVal1 = 100;
        String strVal = Integer.toString(intVal1);
        System.out.println(strVal);

        //字串轉整數
        String strVal1 = "123";
        int intVal2 = Integer.parseInt(strVal1);
    }
}
