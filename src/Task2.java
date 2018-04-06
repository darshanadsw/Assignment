public class Task2 {
    public static void main(String... args){
        add(100, 30);
    }

    public static void add(int a,int b){

        String result = "" + a + " + " + b + " = ";
        while(b != 0){
            int shift = a & b;
            a = a ^ b;
            b = shift << 1;
        }
        System.out.println(result + a);
    }
}
