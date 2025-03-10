package ProgrammingApplication;

import java.util.Scanner;
import java.lang.Math;

public class OctalToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("8진수 입력: ");
        int inputValue = scanner.nextInt();

        if(inputValue % 8 >= 1){
            //if문을 사용하여 8진수 형태가 아니면 오류.

            try{
                //try-catch문을 사용하여 오류시 오류 메세지 출력.

                int output=0;
                //8진수를 10진수로 변환한 값 출력 전에 변수 초기화.

                for(int i=0; inputValue > 0; i++){
                    //inputValue의 값이 0보다 클때까지 for문을 반복함.

                    int temp = inputValue % 10;
                    //inputValue를 10으로 나눈 나머지를 temp에 저장함.

                    double temp2 = Math.pow(8,i);
                    //8의 i승을 곱함

                    output += (int) (temp * temp2);
                    //inputValue의 나머지와 temp2의 값을 더함.

                    inputValue /= 10;
                    //inputValue를 10자리수로 나누어 나머지를 빼냄
                }
                System.out.print("10진수 출력: " + output);

            } catch(Exception e){
                System.out.print("Error message" + e.getMessage());
                //에러의 원인을 간단히 출력
            }
        }else{
            System.out.print("Error: 입력하신 것은 8진수가 아닙니다.");
            scanner.close();
        }
        //inputValue가 8진수 형태가 아닐시 else문으로 빠짐.
    }
}
