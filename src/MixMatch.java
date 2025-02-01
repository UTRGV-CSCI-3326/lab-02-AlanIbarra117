public class MixMatch{

    public static void main(String[] args) {

        // Declaring and initializing variables of different data types
        String varString = "Hello, Java!";
        char varChar = 'A';
        short varShort = 32000;
        int varInt = 2147483647;
        long varLong = 9223372036854775807L;
        float varFloat = 3.14f;
        double varDouble = 3.141592653589793;
        boolean varBoolean = true;

        // Printing each variable with its description
        System.out.println(varString + " <- String, stores text and must be enclosed in double quotes.");
        System.out.println(varChar + " <- char, stores a single character and must be enclosed in single quotes.");
        System.out.println(varShort + " <- short, stores whole numbers from -32,768 to 32,767.");
        System.out.println(varInt + " <- int, stores whole numbers from -2,147,483,648 to 2,147,483,647.");
        System.out.println(varLong + " <- long, stores whole numbers from -9 quintillion to 9 quintillion, needs 'L' at the end.");
        System.out.println(varFloat + " <- float, stores decimal numbers with less precision, needs 'f' at the end.");
        System.out.println(varDouble + " <- double, stores decimal numbers with high precision.");
        System.out.println(varBoolean + " <- boolean, stores either true or false.");

        // Printing multiple variables in a single statement
        System.out.println("Mixing data types: " + varString + ", " + varChar + ", " + varInt + ", " + varBoolean);
    }
}