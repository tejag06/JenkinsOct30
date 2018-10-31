package FirstJenkinsJob.SampleAppJenkins;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println( "Hello World 2!" );
        System.out.println( "Hello World 3!" );
       
        String a = "TEja";
        String b = "Ravi";
        String c = "Shankar";
        StringBuilder builder = new StringBuilder();
        
         for(int i=0; i<=10; i++) {
        	 builder.append(a);
        	 builder.append(b);
        	 builder.append(c);
        	 builder.append("-");
         }
         System.out.println(builder);
    }
}
