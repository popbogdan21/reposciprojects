/*
  @class NumarDeZile has one method that has @param month, year as Strings and
  returns the number of days in a month as an integer
  @ used the algorithm discussed in the first class that I attended in Scoala Informala  (Pseudocod)
  @ uses switch function as requested
 */

public class NumarDeZile {
    public static int findNumberOfDays(String month, String year){

        switch (Integer.parseInt(month)) {
            case 2:{
                // not my own formula -  translated the formula from this support site for excel
                //https://support.microsoft.com/en-us/help/214019/method-to-determine-whether-a-year-is-a-leap-year
                if (((Integer.parseInt(year) % 400) == 0) ||
                        (((Integer.parseInt(year) % 4) == 0) &&
                                ((Integer.parseInt(year) % 100) != 0))){
                    return 29;
                }else {
                    return 28;
                }
            }
            // didnt find the syntax that allowed me to group values 4, 6, 11
            // in only two cases and default in the switch
            case 4: {
                return 30;
            }
            case 6: {
                return 30;
            }
            case 11:{
                return 30;
            }
            default:return 31;
        }
    }
}