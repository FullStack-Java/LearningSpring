package main.java.com.programming;

public class EmailApplication {
    public static void main(String[] args) {
        EmailClient emailClient = new EmailClient();

        emailClient.sendMail("Hey, This is my first email message");
        emailClient.sendMail("Hey, this is my second email message");
    }
}
