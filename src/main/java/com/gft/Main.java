package com.gft;

import com.gft.application.Menu;
import java.util.Scanner;

public class Main {

    private static String YES = "y";

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)){
            Boolean keep = Boolean.TRUE;
            while (keep) {
                System.out.print("Hello, what's your order: ");
                String[] order = in.nextLine().split(",");
                System.out.println(Menu.menuBuilder(order));
                System.out.print("Want to make another order? (y/n) ");
                keep = YES.equals(in.nextLine()) ? Boolean.TRUE : Boolean.FALSE;
            }
        }
    }

}

