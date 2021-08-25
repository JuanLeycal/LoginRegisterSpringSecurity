package com.tdp;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordGenerator {

    public static void main(){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String rawPass = "12345";
        String encodedPass = encoder.encode(rawPass);

        System.out.println(encodedPass);
    }
}
