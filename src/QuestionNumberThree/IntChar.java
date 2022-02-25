package QuestionNumberThree;

public class IntChar {
    public int a = 9;
    public char b = 'b';

    public void character(int a, char b) {

        System.out.println("The integer is " + a);
        System.out.println("The char is " + b);
    }
    // Even though the method name is same, only changing the sequence of the parameters makes it totally valid.
    public void character(char b, int a){
        System.out.println("The char is " + b);
        System.out.println("The integer is " + a);
    }

}
