package com.oracle.LamdaDemo;

import java.util.regex.Pattern;
@FunctionalInterface
interface UserRegdInterface {
    void validate(String a, String b);
}
public class UserLamda {
    public static void main(String[] args) {
        UserRegdInterface firstName = (String pattern, String firstname) -> {
            if (Pattern.matches(pattern, firstname)) {
                System.out.println("True");
            }else {
                System.out.println("False");

            }
        };
        UserRegdInterface lastName = (String pattern, String lastname) -> {
            if (Pattern.matches(pattern, lastname)) {
                System.out.println("True");

            }else {
                System.out.println("False");

            }
        };
        UserRegdInterface email = (String pattern, String Email) -> {
            if (Pattern.matches(pattern, Email)) {
                System.out.println("True");

            }else {
                System.out.println("False");

            }
        };
        UserRegdInterface phoneNo = (String pattern, String Num) -> {
            if (Pattern.matches(pattern, Num)) {
                System.out.println("True");

            }else {
                System.out.println("False");

            }
        };
        UserRegdInterface passWord = (String pattern, String pass) -> {
            if (Pattern.matches(pattern, pass)) {
                System.out.println("True");

            }else {
                System.out.println("False");

            }
        };


        firstName.validate("^[A-Z][a-z]{2,}$", "GAYU");
        firstName.validate("^[A-Z][a-z]{2,}$", "ga");

        lastName.validate("^[A-Z][a-z]{2,}$", "Chowdhary");
        lastName.validate("^[A-Z][a-z]{2,}$", "ch");

        email.validate("^[a-zA-Z0-9_-]+(?:\\.[a-zA-Z0-9_+-]+)@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)$","gayuChowdhary51@gmail.com");
        email.validate("^[a-zA-Z0-9_-]+(?:\\.[a-zA-Z0-9_+-]+)@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)$","gayugmail.com");

        phoneNo.validate("^[9][1]{0,1}\\s[0-9]{10}", "91 923456789");
        phoneNo.validate("^[9][1]{0,1}\\s[0-9]{10}", "91 93456");

        passWord.validate("(?=.[A-Z])(?=.[0-9])(?=.[!@#$%^&()_-])[a-zA-Z0-9].{8,}$","Gayu@123");
        passWord.validate("(?=.[A-Z])(?=.[0-9])(?=.[!@#$%^&()_-])[a-zA-Z0-9].{8,}$","gayu@");

    }
}


