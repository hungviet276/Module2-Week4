import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateNumberPhone {
    private Pattern pattern;
    private Matcher matcher;
    public final String NUMBER_PHONE = "^[(][0-9]{2}[)][-][(][0][0-9]{9}[)]$";
    public boolean validate(String regex){
        pattern = Pattern.compile(NUMBER_PHONE);
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
