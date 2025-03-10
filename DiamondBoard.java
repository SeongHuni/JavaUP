package ProgrammingApplication;

import java.util.Scanner;

public class HollowDiamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("도형크기 입력: ");
        int size = scanner.nextInt();

        if(size % 2 == 1){
        //홀수가 아닌 수를 입력시 else문으로 빠져나옴.

            try{

                for(int i = 1; i <= size; i++){
                    // 입력한 size와 같아질때까지 i번 반복하여 *을 출

                    //상단 *출력
                    for(int j = size; j > i; j--){
                        //j와 size가 값이 같아질 때까지 빈 공간을 출력해주는 반복문
                        System.out.print(" ");
                    }
                    System.out.print("*");
                    //남은 공간만큼 *를 출력

                    for(int j = 1; j < (i-1)*2; j++){
                        //*과*사이 빈공간을 출력
                        System.out.print(" ");
                    }

                    if(i == 1){
                        System.out.println();
                    }
                    else{
                        System.out.println("*");
                    }
                }

                //하단 * 출력 역삼각형 모양
                for(int i = size - 1; i >= 1; i--){

                    for(int j = size; j>i; j--){
                        //빈 공간 출력 반복문
                        System.out.print(" ");
                    }
                    System.out.print("*");
                    //반복문 종료후 * 출력

                    for(int j = 1; j < (i-1)*2; j++){
                    //마지막 행에선 공백이 인쇄되지 않음.
                        System.out.print(" ");
                    }

                    if(i == 1){
                        System.out.println();
                    }else{
                        System.out.println("*");
                    }

                }

            }catch (Exception e){
                System.out.print("Error message" + e.getMessage());
            }
        }else{
            System.out.print("Error: 숫자를 홀수로 입력해주세요.");
            scanner.close();
        }

    }
}
