package at.htl.students;


import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;



public class EmailFilter {
    private static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
    private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);

    public static void main(String[] args) {
        List<String> emailList = List.of("example@example.com", "invalid-email", "test@domain.com");
        // Implementiere hier den Code
    }

    public static List<String> filterValidEmails(List<String> emailList) {
        // Implementiere hier den Code
        return null;

    }
}
