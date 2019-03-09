/**
 * Created by Mohammadi-HR on 3/9/2019.
 */
public class RepeatInString {

    public static void main(String[] args) {
        RepeatInString repeatInString = new RepeatInString();
        repeatInString.StringInString(" sub : how many sub sub substrinng are here sub", "");
    }

    public int StringInString(String one, String two) {
        int M = two.length();
        int N = one.length();
        int res = 0;

        if (one == null || two == null || one.isEmpty() || two.isEmpty()) {
            System.out.println(0);
            return 0;
        } else {
            for (int i = 0; i <= N - M; i++) {
                int j;
                for (j = 0; j < M; j++) {
                    if (one.charAt(i + j) != two.charAt(j)) {
                        break;
                    }
                }
                if (j == M) {
                    res++;
                    j = 0;
                }
            }
            System.out.println(res);
            return res;
        }
    }

/*////// Second Solurion

    public int StringInString(String one, String two) {
        int numberOfOccurrence = 0;
        if (one == null || two == null || one.isEmpty() || two.isEmpty()) {
            System.out.println(0);
            return 0;
        } else {
            while (one.contains(two) != false) {
                one = one.substring(0, one.lastIndexOf(two));
                numberOfOccurrence++;
            }
        }
        System.out.println(numberOfOccurrence);
        return numberOfOccurrence;
    }
*///////

    /*////// Third Solurion
            public int StringInString(String one, String two) {
                int lastIndex = 0;
                int count = 0;
                if (one == null || two == null || one.isEmpty() || two.isEmpty()) {
                    System.out.println(0);
                    return 0;
                } else {
                    while (lastIndex != -1) {

                        lastIndex = one.indexOf(two, lastIndex);

                        if (lastIndex != -1) {
                            count++;
                            lastIndex += two.length();
                        }
                    }
                }
                System.out.println(count);
                return count;
            }
    *///////

}
