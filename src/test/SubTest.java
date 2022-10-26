package test;

public class SubTest extends Test{
    public static int test(int a,int b){
        return a*a + b*b;
    }

    public SubTest(){
//        super();
        System.out.println("child");
    }

    public static void main(String[] args) {
        SubTest st = new SubTest();
        System.out.println(SubTest.test(2,3));
    }
}
