/**
 * demonstrate the multi lvl inheritance , super keyword in java
 */
class Grandparent {
    int id = 1;
    String colour = "white";
}

class Parent extends Grandparent {
    int id = 2;
    String colour = "black";

    void display() {
        System.out.println(super.colour);
    }
}

class You extends Parent {
    int id = 3;

}

public class inhert extends You {
    public static void main(String[] args) {
        You obj = new You();
        System.out.println(obj.id);
        obj.display();
    }
}
