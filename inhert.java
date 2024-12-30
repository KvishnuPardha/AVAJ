/**
 * demonstrate the multi lvl inheritance in java
 */
class Grandparent{
int id =1;
}

class Parent extends Grandparent{
    int id =2;
}

class You extends Parent{
    int id =3;
    
}

public class inhert extends You{
    public static void main(String[] args) {
        You obj = new You();
        System.out.println(obj.id);
    }
}
