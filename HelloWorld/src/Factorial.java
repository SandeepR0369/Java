public class Factorial {
    public static void main(String args[]) {
        Addition add = new Addition();
        int s = add.addTwoInt(1,2);
        System.out.println("Sum of two integer values :"+ s);


        int i, fact=1;
        int number=5;
        for(i=1;i<=number;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
    }
}
/*
public int max(int x, int y) {
    if x > y {
        return x;
    }else {
        return y;
    }

}*/

class Addition {

    int sum = 0;

    public int addTwoInt(int a, int b){

        // adding two integer value.
        sum = a + b;

        //returning summation of two values.
        return sum;
    }

}