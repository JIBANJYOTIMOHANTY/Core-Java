public class Chrome2 
{
    
    public static void main(String[] args) throws Exception
    {
        Runtime rr = Runtime.getRuntime();
        String s[] = {"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe","www.GeeksforGeeks.org"};       
        rr.exec(s);
    }    
}