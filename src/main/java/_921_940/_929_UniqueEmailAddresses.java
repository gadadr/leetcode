package _921_940;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class _929_UniqueEmailAddresses {

    public int numUniqueEmails(String[] emails) {
        Set<String> emailAddresses = new HashSet<>();
        for (String email : emails) {
            int ampersand = email.indexOf("@");
            String localName = email.substring(0, email.indexOf("+") != -1 ? email.indexOf("+") : ampersand);
            localName = localName.replaceAll(".", "");
            emailAddresses.add(localName + email.substring(ampersand));
        }
        return emailAddresses.size();
    }

    public int numUniqueEmails2(String[] emails) {
        Set<String> emailAddresses = new HashSet<>();
        for (String email : emails) {
            StringBuilder sb = new StringBuilder();
            int ampersand = email.indexOf("@");
            for (char ch : email.substring(0, ampersand).toCharArray()) {
                if (ch == '.') continue;
                else if (ch == '+') break;
                else sb.append(ch);
            }
            emailAddresses.add(sb.toString() + email.substring(ampersand));
        }
        return emailAddresses.size();
    }

    @Test
    public void numUniqueEmailsTest() {
        String[] emails = new String[]{"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"};
        int ans = numUniqueEmails(emails);
        Assertions.assertEquals(ans, 2);
    }

    @Test
    public void numUniqueEmails2Test() {
        String[] emails = new String[]{"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"};
        int ans = numUniqueEmails2(emails);
        Assertions.assertEquals(ans, 2);
    }
}
