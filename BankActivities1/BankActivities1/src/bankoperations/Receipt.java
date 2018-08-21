package bankoperations;

import java.util.Calendar;

public class Receipt {
    public void printErr(String errMessage) {
        System.out.println("Transaction date:"+
                            DateUtils.getDate(Calendar.YEAR,Calendar.MONTH,Calendar.DAY_OF_MONTH).toString());

        System.out.println(errMessage);
    }

    public void printOperation(String s, String s1, String s2, String s3, String s4) {
        System.out.println(" Transaction date:"+
                            DateUtils.getDate(Calendar.YEAR,Calendar.MONTH,Calendar.DAY_OF_MONTH).toString());
        System.out.println(s+s1+s4);
        System.out.println(s2+s3+s4);
    }
}
