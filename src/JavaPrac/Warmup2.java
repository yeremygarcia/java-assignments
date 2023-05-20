package JavaPrac;
public class Warmup2 {
    public String stringTimes(String str, int n) {
        String result = "";
        for (int i=0; i<n; i++) {
            result = result + str;
        }
        return result;
        /*initialize result variable
        use a for loop to concatenate str to result
         */
    }
    public String frontTimes(String str, int n) {
        int frontLen = 3;
        if (frontLen > str.length()) {
            frontLen = str.length();
        }
        String front = str.substring(0, frontLen);

        String result = "";
        for (int i=0; i<n; i++) {
            result = result + front;
        }
        return result;
        /* set frontLen to 3, If length of the str is
        less than frontLen, frontLen is changed to the length of str
        variable result is initialized and a for loop executed
         */
    }
    int countXX(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("xx")) count++;
        }
        return count;

    /*to count how many times "xx" in the input
    str and returning the "count"
     */
    }
    boolean doubleX(String str) {
        int i = str.indexOf("x");
        if (i == -1) return false;

        if (i+1 >= str.length()) return false;
        return str.substring(i+1, i+2).equals("x");
        /*to determine if the given input str contains a two xx
        pattern.
         */
    }

    public String stringBits(String str) {
        String result = "";
        for (int i=0; i<str.length(); i+=2) {
            result = result + str.substring(i, i+1);
        }
        return result;
        /* to return extract every other character from the given
        input string str and return the resulting string.
         */
    }
    public String stringSplosion(String str) {
        String result = "";
        for (int i=0; i<str.length(); i++) {
            result = result + str.substring(0, i+1);
        }
        return result;
        /* adding substrings to increase the length of str and returning that result*/
    }
    public int last2(String str) {
        if (str.length() < 2) return 0;

        String end = str.substring(str.length()-2);
        int count = 0;

        for (int i=0; i<str.length()-2; i++) {
            String sub = str.substring(i, i+2);
            if (sub.equals(end)) {
                count++;
            }
        }

        return count;
        /* to count how many times the substring is equal
        to the last two characters of the input str
         */
    }

    public int arrayCount9(int[] nums) {
        int count = 0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] == 9) {
                count++;
            }
        }
        return count;
        /* to see how may times '9' is given
         in the given input array nums and that 'count'
         */
    }


























}
