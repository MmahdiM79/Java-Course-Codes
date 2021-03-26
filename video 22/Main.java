




public class Main 
{
    public static void main(String[] args) 
    {
        // String s1 = "hello world channel";
        // System.out.println(s1.replace('l', 'L'));
        // System.out.println(s1);
        // System.out.println(s1.replaceAll("nn", "M"));
        // System.out.println(s1.replace("world", ""));

        
        // String s2 = "hello world CHANNEL";
        // System.out.println(s2.toUpperCase());
        // System.out.println(s2.toLowerCase());


        long number = 10030101010l;
        System.out.println(String.valueOf(number) + "  " + String.valueOf(number).getClass());
        System.out.println(String.valueOf(number).length());

        
        float f = 12.25f;
        String sf = String.valueOf(f);
        System.out.println(sf + "  " + sf.substring(sf.indexOf('.')));
        System.out.println(sf + "  " + sf.substring(0, sf.indexOf('.')));
    }
}
