package weblab.waq.p01;

/**
 * Hello world!
 *
 */
import org.apache.commons.codec.digest.DigestUtils;


public class App 
{
    public static void main( String[] args )
    {
                if (args.length < 1) {
            System.err.println("Please provide an input!");
            System.exit(0);
        }
        else{
        	String account = "waq";
        	String password = "0729563253bc11cb72714d61132adfe7ba2346b581b02546c9ac4a65fc0c02d8";

        	if(password.equals(sha256hex(args[1]))&& account.equals(args[0]))
        		System.out.println("login succefully!!!");
        	else
        		System.out.println("login failedly!!!");
        }

    }
        public static String sha256hex(String input) {
        return DigestUtils.sha256Hex(input);
    }

}
