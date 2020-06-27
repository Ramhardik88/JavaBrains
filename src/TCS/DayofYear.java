package TCS;

import java.util.Scanner;

public class DayofYear {
    public static void main(String[] args) {
        int dayNum,monthNum,dayOfYear = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the DayNumber");
        dayNum=scan.nextInt();
        System.out.println("Enter the monthNumber");
        monthNum=scan.nextInt();

        switch (monthNum-1)
        {
            case 11:dayOfYear+=30;
            case 10:dayOfYear+=31;
            case 9:dayOfYear+=30;
            case 8:dayOfYear+=31;
            case 7:dayOfYear+=31;
            case 6:dayOfYear+=30;
            case 5:dayOfYear+=31;
            case 4:dayOfYear+=30;
            case 3:dayOfYear+=31;
            case 2:dayOfYear+=28;
            case 1:dayOfYear+=31;
        }
        dayOfYear+=dayNum;
        System.out.println(dayOfYear);

    }
}
