/**
 * Created by Mohammadi-HR on 3/9/2019.
 */
public class RepeatInString {

    public static void main(String[] args) {
        RepeatInString repeatInString = new RepeatInString();
        System.out.println(repeatInString.StringInString("in hiin hi in horin", "hi"));
    }

    public int StringInString(String one, String two) {
        int numberOfOccurrence = 0;
        while (one.contains(two) != false) {
            one = one.substring(0, one.lastIndexOf(two));
            numberOfOccurrence++;
        }
        return numberOfOccurrence;
    }
}
