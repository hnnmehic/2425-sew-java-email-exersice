package at.htl.students;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmailFilterTest {
    @Test
    public void testFilterValidEmails() {
        List<String> emailList = List.of(
                "example@example.com",
                "invalid-email",
                "test@domain.com",
                "user@domain",
                "user.name+tag@domain.com"
        );

        List<String> expectedValidEmails = List.of(
                "example@example.com",
                "test@domain.com",
                "user.name+tag@domain.com"
        );

        List<String> actualValidEmails = EmailFilter.filterValidEmails(emailList);
        assertEquals(expectedValidEmails, actualValidEmails, "Filtered emails do not match expected valid emails.");
    }

}