package at.htl.solution;

import java.util.List;
import java.util.stream.Collectors;

public class EmailFormatterApp {
    public static void main(String[] args) {
        List<String> emailList = List.of("Example@Domain.Com", "TEST@EMAIL.COM");
        List<String> formattedEmails = formatEmails(emailList);
        formattedEmails.forEach(System.out::println);
    }
    public static List<String> formatEmails(List<String> emails) {

        EmailFormatter formatter = String::toLowerCase;
        return emails.stream()
                .map(formatter::format)
                .collect(Collectors.toList());
    }


}
