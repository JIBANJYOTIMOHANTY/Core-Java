public class Hashcode 
{
    int data;
    Hashcode(int data)
    {
        this.data = data;
    }
    @Override
    public int hashCode()
    {
        return data;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(this.hashCode() == obj.hashCode())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    @Deprecated
    public static void main(String[] args) 
    {
            Hashcode h1 = new Hashcode(109);
            Hashcode h2 = new Hashcode(109);
            System.out.println(h1.hashCode() + "\t" + h2.hashCode());

            if(h1.equals(h2))
            {
                System.out.println("Equals");
            }
            else
            {
                System.out.println("Not Equals");
            }

            Integer i1 = new Integer(100);
            Integer i2 = new Integer(100);

            System.out.println(i1.hashCode() + "\t" + i2.hashCode());
            if(i1.equals(i2))
            {
                System.out.println("True");
            }
            else
            {
                System.out.println("False");
            }
    }    
}
