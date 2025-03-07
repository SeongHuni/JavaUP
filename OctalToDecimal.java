import java.util.Scanner;
import java.lang.Math;

public class OctalToDecimal {
    public static <inputValue> void main(String[] args) {

        System.out.print("8진수 입력: ");
        Scanner scanner = new Scanner(System.in);
        int inputValue = (int) scanner.nextInt();
        //try catch를 사용하여 8진수 형태가 아니면 오류나 예외발생.
        try{
            int output=0;
            for(int i=0; inputValue > 0; i++){
                int temp = inputValue % 10;
                double temp2 = Math.pow(8,i);
                output += temp * temp2;
                inputValue /= 10;
            }
            System.out.print("10진수 출력: " + output);

        }catch(Exception e){
            System.out.println(e.getMessage());
            //둘중에 하나 사용
            e.printStackTrace();
        }
    }
}