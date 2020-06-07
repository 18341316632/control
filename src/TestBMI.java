import java.util.Scanner;

public class TestBMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入身高(m)");
        float high = scanner.nextFloat();
        System.out.println("输入体重(kg)");
        float kg = scanner.nextFloat();
        float BMI = kg / (high * high);
        System.out.println("BMI值是   " + BMI);
        if (BMI >= 35){
            System.out.println("重度肥胖");
        }
        else if (BMI >= 30){
            System.out.println("中度肥胖");
        }
        else if (BMI >= 27){
            System.out.println("轻度肥胖");
        }
        else if (BMI >= 24){
            System.out.println("体重过重");
        }
        else if (BMI >= 18.5){
            System.out.println("正常范围");
        }
        else if (BMI < 18.5){
            System.out.println("体重过轻");
        }
    }
}
