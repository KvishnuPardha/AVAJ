


/**
 * This class is used to demonstrate the use of this keyword
 */
public class dev {
    int id=5;
    String name="default";

    /**
     * Constructor used to demonstrate the use of this keyword
     * @param id
     * @param name
     */
    dev(int id , String name){
        this.id = id; //this keyword is used to refer current class instance variable
        name = name; //this keyword is NOT used to refer current class instance variable
    }

    void display(){
        System.out.println(id + " " + name);
    }



    public static void main(String[] args) {
        dev obj = new dev(1, "John");   //creating object
        obj.display(); //calling method with object
        dev obj1 = new dev(2, "Jane");
        obj1.display();
    }
}
