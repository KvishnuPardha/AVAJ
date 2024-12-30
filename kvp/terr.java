package kvp;

public class terr {
    public static void main(String[] args) {

        try {
            char[] arr = new char[5];
            arr[6] = 'a';
        } catch (Exception e) {
            System .err.println("The Error is :"+e);
        } finally {
            System.out.println("Finally block is always executed");
        }
    }
}