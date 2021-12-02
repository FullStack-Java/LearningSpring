package main.java.com.programming;

public class AdvancedSpellChecker {

    public void checkSpelling(String mail){
        if(mail!= null){
//            Determining the language of the email message
//            checking for grammatical errors in the email message
//            Check spelling in the email message

            System.out.println("Spell Checking Completed!!!!!!!!!");
        }else{
            throw new RuntimeException("An exception occurred while  checking the spelling");
        }
    }
}
