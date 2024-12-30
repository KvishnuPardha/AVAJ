public class Construct {

    private int id;
    private String name;

    public Construct() {
        int id = 5;
        String name = "default";
    }

    public Construct(int id, String name) {
        this.id = id;
        this.name = name;
    }


    public static void main(String[] args) {
        Construct obj = new Construct();
        System.out.println(obj.id + " " + obj.name);
        Construct obj1 = new Construct(2, "Jane");
        System.out.println(obj1.id + " " + obj1.name);
    }
}
