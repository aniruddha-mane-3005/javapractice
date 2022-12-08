package introduction;

public class ExpressionResults {
    public static void main(String[] args) {
        byte b1= 10;
        short s1 = 20;
        int i1 = 30;
        long l1 = 40l;
        float f1 = 50.f;
        double d1 = 60.5;
        char c1='a';



        int output = b1+s1;
        long output2 =b1+i1;
        float output3 = l1+f1;
        double output4 = d1+c1;

        System.out.println('A' + f1);// char+char=int//130
        System.out.println("a" + 'a');//aa
        System.out.println('a' + 'a');//194
        System.out.println(output);
        System.out.println(output2);
        System.out.println(output3);
        System.out.println(output4);
    }

}
