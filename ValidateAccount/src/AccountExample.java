import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {
    private Pattern pattern;
    private Matcher matcher;
    private static String ACCOUNT_REGEX = "^[_a-z0-9]{6,}$";
    public boolean validate(String regex){
        pattern = Pattern.compile(ACCOUNT_REGEX);
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
