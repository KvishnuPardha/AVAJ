package kvp;

public class utility1 {
    public String nameToBinary(String name) {
        StringBuilder binary = new StringBuilder();
        for (char c : name.toCharArray()) {
            binary.append(String.format("%8s", Integer.toBinaryString(c)).replaceAll(" ", "0"));
        }
        return binary.toString();
    }
    
}
