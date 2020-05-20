import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateNameOfClass {
    private Pattern pattern;
    private Matcher matcher;
    public final String NAME_CLASS = "^[C|A|P][0-9]{4}[G|H|I|K|L|M]$";
    public boolean validate(String regex){
        pattern = Pattern.compile(NAME_CLASS);
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
