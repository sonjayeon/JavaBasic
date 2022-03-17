package chap08;

public class TwoDimensionArrayWithkukuDan {
    public static void main(String[] args) {

        // 구구단 답을 관리하기 위한 2차원 배열
        int[][] kukuDan = new int[9][9];

        for(int dan = 0; dan < 9; dan++){
            for(int i = 0; i < 9; i++){
                kukuDan[dan][i] = (dan + 1) * (i+1);
            }
        }
        for(int dan = 0; dan < 9; dan++){
            System.out.print((dan+1) + "단 : ");
            for(int i = 0; i < 9; i++){
                System.out.print(kukuDan[dan][i] + "\t");
                // \t은 일정하게 자리를 띄워줌
            }
            System.out.println();
            // 1단 찍으면 다음줄로 넘어감
        }
    }

}
