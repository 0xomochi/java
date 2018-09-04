//0xomochi
//ClassSample.java

class ClassSample{
/*
public static void main(String[] args){
    ClassSample printm = new ClassSample();
        printm.printMessage();
}
*/
    //フィールド
    String name;    //[1]
    String address; //[2]

public static void main(String[] args){
    ClassSample printm = new ClassSample();
    printm.exec();
}

    //実行メソッド[3]
    public void exec(){
        init();             //[4]
        name = "0xomochi";  //[6]
        address = "Tokyo";  //[7]
        printMessage();     //[8]
    }

    //初期化メソッド[5]
    public void init(){
        name = "";          //[4]
        address = "";       //[5]
    }

    //メッセージ出力メソッド[9]
    private void printMessage(){
        System.out.println(getMessage());   //[10]
    }

    //メッセージ設定メソッド[11]
    private String getMessage(){
        return " I'm " + name + "." + " I live in " + address + ".";     //[12]
    }
}
