public class Task1 {

    public static void main(String... args){
        reverse("Java test");
    }

    public static void reverse(String str){
        if(str != null && !str.isEmpty()){
            String reverseStr = "";
            for(int i=str.length()-1;i>=0;i--){
                reverseStr += str.charAt(i);
            }
            System.out.println("Input = " + str + " , Output = " + reverseStr);
        }else{
            System.out.println("String is not valid.");
        }

    }
}
