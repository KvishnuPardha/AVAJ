class user {
    /**
     * This method adds two numbers
     * 
     * @param a
     * @param b
     * @return sum of a and b
     */
    public static int add(int a, int b) {
        return a + b;
    }

    /**
     * This method subtracts two numbers
     * 
     * @param a
     * @param b
     * @return difference of a and b
     */
    public static int sub(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Addition of 2 and 3 is: " + add(2, 3));
        System.out.println("Subtraction of 2 and 3 is: " + sub(2, 3));
        System.out.println("Addition of 2 and 3 is: " + add(2, 3));
    }
}