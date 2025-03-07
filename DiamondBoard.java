import java.util.Scanner;

public class DiamondBoard {
    public static void main(String[] args) {
        System.out.print("도형크기 입력: ");
        Scanner scanner = new Scanner(System.in);
        int size = (int) scanner.nextInt();
        try{
            for(int i = 0; i < size; i++){
                for(int j = 0; j < size; j++){
                    System.out.print("*");
                    if(i == j || i + j == size - 1){
                        System.out.print("*");
                        if(i == j){
                            System.out.println();
                        }
                    }
                }
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
