import java.util.Scanner;

public class TestWhile {
    /*
    while和do-while循环语句
    只要while中的表达式成立，就会不断地循环执行
    do{ } while 循环
    与while的区别是，无论是否成立，先执行一次，再进行判断
     */

    //阶乘的方法
    int method(int n) {
        if(n == 1 | n == 0) {
            return 1;
        }
        else {
            return method(n-1)*n;
        }
    }

    public static void main(String[] args) {
        //打印0到4
        int i = 0;
        while(i<5) {
            System.out.println(i);
            i++;
        }

        //打印0到4
        //与while的区别是，无论是否成立，先执行一次，再进行判断
        int j = 6;
        do{
            System.out.println(j);
            j++;
        } while(j < 5);

        //练习阶乘
        //单独写一个阶乘方法，new 一个对象 调用
        // TODO Auto-generated method stub
        TestWhile testWhile = new TestWhile();
        Scanner scanner =new Scanner(System.in);
        System.out.println("请输入一个整数：    ");
        int n =scanner.nextInt();
        System.out.println("阶乘是："   +  testWhile.method(n));

    }
}
