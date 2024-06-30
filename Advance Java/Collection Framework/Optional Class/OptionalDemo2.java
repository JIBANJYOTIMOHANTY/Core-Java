import java.util.*;
public class OptionalDemo2 {
    public static void main(String[] args) {
        String name = "Java Technocrat."       ;
        Optional <String> op = Optional.ofNullable(name);
        op.ifPresent(System.out::println);
        System.out.println("Value is : "+op.get());
        
        Optional <String> ee = Optional.empty();
        System.out.println(ee);
    }
}