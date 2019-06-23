package com.gultekinmsg.encapsulation;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(50, true);
        System.out.println("Initial page count = " + printer.getPagesPrinted());
        int pagesPrinted = printer.simulatePrintingPage(4);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer " + printer.getPagesPrinted());
        pagesPrinted = printer.simulatePrintingPage(2);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer " + printer.getPagesPrinted());

    }
}
