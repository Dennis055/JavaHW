package hello;


import java.util.Scanner;

public class scanner_test {
    public static void main(String[] args) {
        float float1, float2, float3;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("請輸入三個浮點數(以Tab鍵分開)：");
        float1 = scanner.nextFloat();
        float2 = scanner.nextFloat();
        float3 = scanner.nextFloat();
        System.out.println("您輸入第一個浮點數為：" + float1 );
        System.out.println("您輸入第二個浮點數為：" + float2 );
        System.out.println("您輸入第三個浮點數為：" + float3 );

    }
}
