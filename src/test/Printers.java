package test;

public class Printers {
    public void solution(int N) {
        if(N < 1 || N >= 100){
            throw new RuntimeException("wrong number,between (1-100)");
        }
        for(int i = 1;i< N;i++){
            System.out.println("L");
        }
        for(int i = 1;i<=N;i++){
            System.out.print("L");
        }
        System.out.println("");
        System.out.println("whold line");
    }

    public static void main(String[] args) {
        Printers p = new Printers();
        p.solution(3);

        StringBuffer aa = new StringBuffer();


    }
}
