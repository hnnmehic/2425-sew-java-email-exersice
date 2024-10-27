package at.htl.students;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

class EmailFormatterAppTest {

    @Test
    void testFormatEmails() {

        List<String> emailList = List.of("Example@Domain.Com", "TEST@EMAIL.COM", "User@Example.com");

        List<String> expectedFormattedEmails = List.of("example@domain.com", "test@email.com", "user@example.com");

        List<String> actualFormattedEmails = EmailFormatterApp.formatEmails(emailList);

        assertEquals(expectedFormattedEmails, actualFormattedEmails,
                "Die formatierten E-Mails stimmen nicht mit den erwarteten überein.");
    }
}
