package hannoi;

import javax.sound.midi.Soundbank;

public class Hannoi {

    public static void hanoimove(int num, char a ,char b, char c){
        if(num == 0){
            System.out.println("error");
        } else if (num == 1){
            move(1,a,c);
        } else {
            hanoimove(num - 1,a,c,b);
            move(num, a,c);
            hanoimove(num-1,a,b,c);
        }
    }

    private static void move(int n ,char a , char b){
        System.out.println("把第"+ n +"个塔，借助"+a+"移动到" +b);
    }

    public static void main(String[] args) {
        hanoimove(10,'A','B','C');
    }
}
