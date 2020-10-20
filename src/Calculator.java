import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // 初始化变量
        int num = 0;
        int sum = 0;
        int cnt = 0;
        int ret = 0;

        //输入数字
        Scanner in = new Scanner(System.in);
        while (num != -1) {
            System.out.println("input your num. input -1 to terminate");
            num = in.nextInt();
            sum += num;
            cnt++;
        }
        cnt--;

        //计算平均数
        ret = sum / cnt;

        //输出
        System.out.println("Total number: " + cnt);
        System.out.println("Average is " + ret);
    }
}
