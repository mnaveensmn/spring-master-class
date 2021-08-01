package com.naveen.hotelbooking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HotelbookingApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelbookingApplication.class, args);
		/*String s= "user@370";
		String ns = "";
		for (int i=0;i<s.length();i++) {
			char c = (char) (s.charAt(i)+3);
			ns = ns+c;
		}
		System.out.println(ns);
		s="";
		for (int i=0;i<ns.length();i++) {
			char c = (char) (ns.charAt(i)-3);
			s = s+c;
		}
		System.out.println(s);*/
	}
	
}
