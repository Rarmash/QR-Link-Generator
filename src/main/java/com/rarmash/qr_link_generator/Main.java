package com.rarmash.qr_link_generator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter URL: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String str = br.readLine();
            LinkConverter.convertLink(str);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
