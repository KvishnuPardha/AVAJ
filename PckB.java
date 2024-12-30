class Pck {
    private int id = 5;

}
public class PckB {
    public static void main(String[] args) {
        Pck obj = new Pck();
        try {
            System.out.println(obj.id);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println( e);
        }
        
    }
    
}