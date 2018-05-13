public class Demo {
    Demo(){

    }

    void say(){
        System.out.println("demo");
    }
}

class Test extends Demo{

    enum type {
        alipay,wechat;
    }

    void say(){
        System.out.println("hello world");
    }
    public static void main(String []args0){
        new Test().say();
    }
}
