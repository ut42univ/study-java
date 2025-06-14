
/**
 * CalcPayroll
 */

import java.io.*;

public class CalcPayroll {
    public static void main(String[] args) throws IOException {
        BufferedReader d = new BufferedReader(new InputStreamReader(System.in));

        Integer wage, hours;

        System.out.println("時給を入力してください> ");
        wage = Integer.parseInt(d.readLine());

        System.out.println("労働時間を入力してください> ");
        hours = Integer.parseInt(d.readLine());

        System.out.println("あなたの今月給与は " + String.format("%,d", wage * hours) + " 円です");
    }
}
