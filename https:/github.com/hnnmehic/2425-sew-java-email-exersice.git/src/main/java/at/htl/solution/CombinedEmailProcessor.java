package at.htl.solution;

import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;


public class CombinedEmailProcessor {
    private static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
    private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);

    public static void main(String[] args) {
        List<String> emailList = List.of("Example@Domain.Com", "INVALID_EMAIL", "test@domain.com");

        List<String> validAndFormattedEmails = filterAndFormatEmails(emailList);
        validAndFormattedEmails.forEach(System.out::println);
    }

    public static List<String> filterAndFormatEmails(List<String> emails) {
        EmailValidator validator = email -> EMAIL_PATTERN.matcher(email).matches();
        EmailFormatter formatter = String::toLowerCase;

        return emails.stream()
                .filter(validator::isValid)
                .map(formatter::format)
                .collect(Collectors.toList());
    }
}