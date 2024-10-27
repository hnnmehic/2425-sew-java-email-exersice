package at.htl.students;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CombinedEmailProcessorTest {

    @Test
    void testFilterAndFormatEmails() {

        List<String> emailList = List.of("Example@Domain.Com", "INVALID_EMAIL", "test@domain.com", "User@Example.com");


        List<String> expectedFilteredEmails = List.of("example@domain.com", "test@domain.com", "user@example.com");


        List<String> actualFilteredEmails = CombinedEmailProcessor.filterAndFormatEmails(emailList);

        assertEquals(expectedFilteredEmails, actualFilteredEmails,
                "Die formatierten und gefilterten E-Mails stimmen nicht mit den erwarteten überein.");
    }
}