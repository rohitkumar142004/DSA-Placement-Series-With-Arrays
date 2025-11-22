package Basicofjava;

public class Character {
    static void main(String[] args) {
        char ch = '^';
        System.out.println(ch);
        int ascii = ch; // implicit typecasting
        System.out.println(ascii);
        int asc = (int)ch;
        System.out.println(asc);
        char ch2 = 'b';
        System.out.println((int)ch2);

        // another trick to find out the typecasting add 0 with that stroing variable
        System.out.println(ch+0);
        System.out.println(ch+ch2); // even in this case the sum of the first value and the second value  of ascii will sum  and we will get the result


    }
}

// three type of characters
//a, b,c,d,e,f,g
//A,B,C,D,E,F,G,
//1,2,3,4,5,6.7,8,9

// ASCII VALUES
//A - 65 ,   a - 97, b - 98, c - 99, z -- 122
//B - 66 ,
//
//
//X -- 88,
//Y -- 89,
//Z -- 90


