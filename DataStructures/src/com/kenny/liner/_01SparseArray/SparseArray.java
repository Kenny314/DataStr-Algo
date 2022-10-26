package com.kenny.liner._01SparseArray;

public class SparseArray {
    public static void main(String[] args) {
        // create original
        /*
        原始二维数组
         */
        int chessArray[][] = new int[11][11];
        chessArray[1][3] = 1;
        chessArray[1][5] = 1;
        chessArray[3][7] = 2;
        chessArray[7][10] = 2;
        //打印
//        for(int[] row : chessArray){
//            for(int data : row){
//                System.out.printf("%d\t",data);
//            }
//            System.out.println();
//        }
        //遍历，获取二维数组中到有效数据数据
        int sum = 0;
        for (int[] row : chessArray){
            for(int data: row){
                if(data != 0)
                    sum++;
            }
        }
        System.out.println(sum);
        //创建稀疏数组
        int sparseArray[][] = new int[sum+1][3];
        sparseArray[0][0] = 11;
        sparseArray[0][1] = 11;
        sparseArray[0][2] = sum;
        int t = 1;
        for(int i = 0;i < 11;i++){
            for(int j = 0; j < 11;j++){
                if(chessArray[i][j] !=0){
                    sparseArray[t][0] = i;
                    sparseArray[t][1] = j;
                    sparseArray[t][2] = chessArray[i][j];
                    t++;
                }
            }
        }
        System.out.println("------");
        for(int i = 0;i < sum+1; i++){
            for(int j = 0;j<3;j++){
                System.out.printf("%d\t",sparseArray[i][j]);
            }
            System.out.println();
        }

        //TODO
        //恢复原始数组

    }
}
