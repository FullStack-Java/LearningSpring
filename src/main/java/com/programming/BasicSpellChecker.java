package main.java.com.programming;

public class BasicSpellChecker {

    public void checkSpelling(String mail){
        if(mail!= null){
            System.out.println("Checking Spelling ...");
            System.out.println("Spell Checking Completed ...");
        }else{
            throw new RuntimeException("An exception occurred while  checking the spelling");
        }

    }
}
