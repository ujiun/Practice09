package com.javaex.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	System.out.println("친구를 3명 등록해 주세요");
    	
    	List<Friend> fArray = new ArrayList<Friend>();
    	
    	for(int i=0; i<3; i++) {
    		String[] input = sc.nextLine().split(" ");
    		fArray.add(new Friend(input[0],input[1],input[2]));
    		
    	}

    	for(Friend info : fArray) {
    		info.showInfo();
    	}
    	
    	sc.close();
    }

}
