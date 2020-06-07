public class TestIf {
    public static void main(String[] args) {
        /*
        if(表达式1){
            表达式2；
        }
        如果表达式1的值是true,
        就执行表达式2
         */
        boolean b1 = true;
        //如果成立就打印yes
        if (b1){
            System.out.println("yes");
        }

        boolean b = false;
        //如果有多个表达式，必须用大括弧包括起来
        if(b){//b = false 块内表达式都不执行
            System.out.println("yes1");
            System.out.println("yes2");
            System.out.println("yes3");
        }

        //否则表达式2 3 无论b是否为true都会执行
        if(b)
            System.out.println("yes4");//b = false 表达式1 不执行
        System.out.println("yes5");//无括号，表达式2 3 不受if控制，直接执行
        System.out.println("yes6");

        //如果只有一个表达式可以不用写括弧，看上去会简约一些
        if(b){
            System.out.println("yes7");
        }

        if(b)
            System.out.println("yes8");

        /*
        if后面有一个分号; 而分号也是一个完整的表达式
        如果b为true，会执行这个分号，然后打印yes
        如果b为false，不会执行这个分号，然后打印yes
        这样，看上去无论如何都会打印yes
         */
        boolean c = true;
//        boolean c = false;
        if (c);
        System.out.println("yes9");

        /*
        if else
        else 代表不成立的情况
        表达式1 —————
          |             |
          |true         | false
          |             |
        表达式2         表达式3
         */

        boolean d = false;
        if (d){
            System.out.println("yes10");
        }
        else{
            System.out.println("no10");
        }

        /*
        else if 是多条件判断
         */
        //如果只使用 if,会执行4次判断
        int i = 2;
        if (i==1){
            System.out.println(1);
        }
        if (i==2){
            System.out.println(2);
        }
        if (i==3){
            System.out.println(3);
        }
        else{
            System.out.println("3失败");
        }
        if (i==4){
            System.out.println(4);
        }
        else{
            System.out.println("4失败");
        }

        //如果使用else if, 一旦某一条件，判断成立， 后面的判断就不会执行了，节约了运算资源
        if (i==1)
            System.out.println(1);
        else if (i==2)
            System.out.println(2);
        else if (i==3)
            System.out.println(3);
        else if (i==4)
            System.out.println(4);

    }
}
