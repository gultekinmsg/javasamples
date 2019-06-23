package com.gultekinmsg.encapsulation;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean isDublexPrinter;

    public Printer(int tonerLevel,boolean isDublexPrinter) {
        if (tonerLevel>-1 && tonerLevel<=100){
            this.tonerLevel = tonerLevel;
        }else {
            this.tonerLevel = -1;
        }
        this.isDublexPrinter = isDublexPrinter;
        this.pagesPrinted = 0;

    }

    public int fillUpToner(int tonerLevel) {
        if (tonerLevel>0 && tonerLevel<=100){
            if (this.tonerLevel + tonerLevel>100){
                return -1;
            }
            this.tonerLevel += tonerLevel;
            return this.tonerLevel;
        }else {
            return -1;
        }

    }
    public int simulatePrintingPage(int pagesPrinted){
        if (this.isDublexPrinter){
            this.pagesPrinted += pagesPrinted/2+pagesPrinted%2 ;
            System.out.println("Printing in dublex mode");
            return pagesPrinted;
        }else {
            this.pagesPrinted += pagesPrinted;
            return pagesPrinted;
        }
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
