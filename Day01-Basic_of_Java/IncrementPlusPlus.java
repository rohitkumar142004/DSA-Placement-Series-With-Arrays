package Basicofjava;
import java.util.Scanner;
public class IncrementPlusPlus {
    static void main(String[] args) {
        int x = 10;

        System.out.println(++x); // preIncrement
        System.out.println(x++); // postIncrement
        // Both preIncrement and postIncrement are same when they are write seprately only but if it will writw with sout then theyboth are same

        System.out.println(x);
    }
}

//int x = 10;
//sout(x++); // post increment means pahle x ko use karega pahloe tho khud x ka value print hoga phir isko bada do
//// aur jab main akle line main aaye tho x ka value 11 ho ya tha isliye 11 print hwa
//sout(x)
//
// int x = 10
// sout(++x) // means pahle incremet karo phir print karo
//sout(x) tho x ka value pahle hi 11 print hoga aur iska bhi 11 hoga

//# Homework
//1. sout(--x) -- 9
//sout(x--) 9 ismai pahle x print hoga phir uske baad hog jo bhi karna hoga next main 9 print kar dega aur x ke value ko ye 8 kar dega
//sout(x) 8

//int y = ++x in this case the value of y would be 9 x value is 8 becuase it is post incremnt so it will increase first the it will store

//int y = ++x --- this means first the value of x will increment then it wlud be 9 then 9 wwill store i y
//sout(x + y) -- it will print 18 not 17 becuasse it will increment first and the value of x will be 9
