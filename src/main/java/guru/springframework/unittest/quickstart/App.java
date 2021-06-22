package guru.springframework.unittest.quickstart;

/**
 * Hello world!
 *
 */
public class App 
{
//    public static void main( String[] args )
//    {
//        System.out.println( "Hello World!" );
//    }
    public String concatAndConvert(String str1,String str2)
    {
        String result = str1.concat(str2);
        return result.toUpperCase();
    }

}
