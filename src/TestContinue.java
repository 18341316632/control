public class TestContinue {
    /*
    continue 继续下一次循环
     */
    public static void main(String[] args) {
        /*
        如果是双数，后面的代码不执行，直接进行下一次循环
         */
        //打印单数
        for (int j = 0; j < 10; j++) {
            if(0==j%2)
                continue; //如果是双数，后面的代码不执行，直接进行下一次循环
                System.out.println(j);
        }

        /*
        打印 1-100 之间的数，如果这个数，要么是3，要么5的倍数，就忽略掉
         */
        for (int i = 1; i < 101 ; i++) {
            if (!(0 == i % 3 || 0 == i % 5))
                continue;
                System.out.println(i);
        }
    }
}
