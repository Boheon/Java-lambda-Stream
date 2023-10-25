package rambdaex.ex03;

public class MyFunctionalInterfaceExample2 {
    public Runnable test(){
        String lname = "고길동";
        Runnable r;

        //Runnable의 익명 구현 객체에서 this확인
        r = new Runnable() {
            private String name = "박길동";
            @Override
            public void run() {
                System.out.println(this.name);
            }
        };
        r.run();
        System.out.println(this);

//        r = ()-> System.out.println(this.name);
       // r = ()-> System.out.println(this.lname);//지역변수가 람다에서 쓰이면 final
//        r.run();
        return r;
//        return ()-> System.out.println(this.name);
    }

    public static void main(String[] args){
        MyFunctionalInterfaceExample2 t = new MyFunctionalInterfaceExample2();
        Runnable r = t.test();
        r.run();
    }
}
