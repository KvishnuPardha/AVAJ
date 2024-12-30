import kvp.utility1;
public class PckA {

    public static void main(String[] args) {
        utility1 util = new utility1();
        encap obj = new encap();
        System.out.println(util.nameToBinary("Vishnu"));
        obj.setAge(5);
        System.out.println(obj.getAge());
        obj.setName("Vishnu");
        System.out.println(obj.getName());wq

    }
    
}