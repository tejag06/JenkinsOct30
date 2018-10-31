package FirstJenkinsJob.SampleAppJenkins;

public class MyClass {
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println( "Hello World 2!" );
        System.out.println( "Hello World 3!" );
       
        String t = "TEja";
        String r = "Ravi";
        String s = "Shankar";
        StringBuilder builder = new StringBuilder();
        
         for(int i=0; i<=10; i++) {
        	 builder.append(t);
        	 builder.append(r);
        	 builder.append(s);
        	 builder.append("-");
         }
         System.out.println(builder);
    }
}
