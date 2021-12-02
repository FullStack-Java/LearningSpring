package main.java.com.programming;

public class EmailClient {
//    private BasicSpellChecker basicSpellChecker;
    private AdvancedSpellChecker advancedSpellChecker;

    public EmailClient(){
        //this is not good coding
        //right here we can say that email class is tightly coupled with BasicSpellChecker class
//        Makes the code:
//        1. hard to maintain
//        2.  " " extend
//        3.  " " unit test the code
//        Code must be loosely coupled.

//        if we wanted to use the Advanced Spell CHecker Class
//        We would then have to change the instance of the basic spell checker to advanced spell checker
//        this is exactly what is meant by tightly coupling
//         See other branch to view how to make this code loosely coupled. looselyCoupled

//        this.basicSpellChecker = new BasicSpellChecker();
        this.advancedSpellChecker = new AdvancedSpellChecker();

    }
    public void sendMail(String mail){
//        basicSpellChecker.checkSpelling(mail);
        advancedSpellChecker.checkSpelling(mail);

    }

}
