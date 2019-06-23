package com.gultekinmsg.paintjob;

public class Main {
    public static void main(String[] args) {

        System.out.println(getBucket(-3.4, 2.1, 1.5, 2));
        System.out.println(getBucket(3.4, 2.1, 1.5, 2));
        System.out.println(getBucket(2.75, 3.25, 2.5, 1));
        System.out.println("----------");
        System.out.println(getBucket(-3.4, 2.1, 1.5));
        System.out.println(getBucket(3.4, 2.1, 1.5));
        System.out.println(getBucket(7.25, 4.3, 2.35));
        System.out.println("----------");
        System.out.println(getBucket(3.4, 1.5));
        System.out.println(getBucket(6.26, 2.2));
        System.out.println(getBucket(3.26, 0.75));
    }


    public static int getBucket(double width, double height, double areaPerBucket, double extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }
        double area = width * height;
        double painted = areaPerBucket * extraBuckets;
        double left = area - painted;
        double needBucket = left / areaPerBucket;
        int buyBucket = (int) Math.ceil(needBucket);
        return buyBucket;
    }

    public static int getBucket(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }
        double area = width * height;
        double needBucket = area / areaPerBucket;
        int buyBucket = (int) Math.ceil(needBucket);
        return buyBucket;

    }

    public static int getBucket(double area, double areaPerBucket) {
        if (area < 0 || areaPerBucket <= 0) {
            return -1;
        }
        double needBucket = area / areaPerBucket;
        int buyBucket = (int) Math.ceil(needBucket);
        return buyBucket;
    }
}
