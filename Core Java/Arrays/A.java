import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class E
{
    int data;
    int value;
    E(int data, int value)
    {
        this.data = data;
        this.value = value;
    }
}
public class A
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        System.out.println(name);
    }
}