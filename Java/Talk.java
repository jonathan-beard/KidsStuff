import java.io.*;
import java.lang.*;

public class Talk
{
    public static void main( String[] args )
    {
        String command = new StringBuilder().append( "say " ).append( args[ 0 ] ).toString();
        try{
            Runtime.getRuntime().exec( command );
        }catch( IOException ex )
        {
            System.out.println( ex.getMessage() );
        }
    }
}
