package hannoi;

public class Solution {
    public int solution(int N){
        String binaryString = Integer.toBinaryString(N);
        System.out.println("-------" + binaryString);
        char[] temp = binaryString.toCharArray();
        int binaryGap = 0;
        int curBinaryGap = 0;
        int start = 0;
        for(int i = 0; i < temp.length; i++){
            if(temp[i] == '0'){
                curBinaryGap++;
                continue;
            } else {
                if (curBinaryGap > binaryGap){
                    binaryGap = curBinaryGap;
                }
                curBinaryGap = 0;
            }

        }
        return binaryGap;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int result = s.solution(32);
        System.out.println("======"+result);
    }
}
