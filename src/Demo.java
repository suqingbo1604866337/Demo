public class Demo {
    Demo(){

    }

    void say(){
        System.out.println("demo");
    }
}

class Test extends Demo{
    public static void main(String []args0){
        new Test().say();
    }
}
