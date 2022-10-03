import org.w3c.dom.ls.LSOutput;
import org.w3c.dom.ls.LSParserFilter;

import javax.swing.*;

import java.util.Scanner;

import static java.lang.Integer.reverse;
import static java.lang.Integer.valueOf;

public class Main {

    public static void main(String[] args) {

      int x = getBucketCount(0.75, 0.75, 0.5, 0);
        System.out.println(x);
        int z = getBucketCount(3.4, 2.1, 1.5);
        System.out.println(z);
        int y = getBucketCount(3.4, 1.5);
        System.out.println(y);
    }


    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        double areaCover = areaPerBucket * extraBuckets;
        double area = (height * width);
        double buckets = Math.ceil(area/areaPerBucket)-extraBuckets;

        if (width <=0 || height <=0|| areaPerBucket <=0 || extraBuckets <0) {
            return -1;
        } else {
            return (int) buckets;
        }

    }
    public static int getBucketCount(double width, double height, double areaPerBucket){
        double area = (height * width);
        double buckets = area /areaPerBucket;
        if (width<=0||height<=0||areaPerBucket<=0){
            return -1;
        }else{
            return (int) Math.ceil(buckets);

        }

    }
    public static int getBucketCount(double area, double areaPerBucket){
        if (area<=0||areaPerBucket<=0){
            return -1;
        }else{
            return (int) Math.ceil(area/areaPerBucket);

        }

    }
}
















