import java.util.*;
public class OptionalDemo1 {
    public static void main(String[] args) {
        String name = null;
        Optional<String> op = Optional.ofNullable(name);

        if(op.isPresent()){
            String cap = name.toUpperCase();
            System.out.println(cap);
        }
        else{
            name = "Java Technocrat.";
            System.out.println("Size of name is : " + name.length());
            System.out.println(name);
        }
    }
    
}