package calendar;

/*
@class NumberOfDays has one method that has @param month, year as Strings and
returns the number of days in a month as an integer
@ used the algorithm discussed in the first class that I attended in Scoala Informala  (Pseudocod)
@ uses switch function as requested
*/
    public class NumberOfDays {
        public int findNumberOfDays(String month, String year) {
            switch (Integer.parseInt(month)) {
                case 1: {
                    return 31;
                }
                case 2: {
                    // not my own formula -  translated the formula from this support site for excel
                    //https://support.microsoft.com/en-us/help/214019/method-to-determine-whether-a-year-is-a-leap-year
                    if (((Integer.parseInt(year) % 400) == 0) ||
                            (((Integer.parseInt(year) % 4) == 0) &&
                                    ((Integer.parseInt(year) % 100) != 0))) {
                        return 29;
                    } else {
                        return 28;
                    }
                }
                // didnt find the syntax that allowed me to group values 4, 6, 11
                // in only two cases and default in the switch
                case 3: {
                    return 31;
                }
                case 4: {
                    return 30;
                }
                case 5: {
                    return 31;
                }
                case 6: {
                    return 30;
                }
                case 7: {
                    return 31;
                }
                case 8: {
                    return 31;
                }
                case 9: {
                    return 30;
                }
                case 10: {
                    return 31;
                }
                case 11: {
                    return 30;
                }
                case 12: {
                    return 31;
                }
                default: {
                    return -1;
                }
            }
        }
    }
