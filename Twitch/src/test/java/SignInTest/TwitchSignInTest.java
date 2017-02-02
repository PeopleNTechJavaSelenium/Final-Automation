package SignInTest;


import methods.CommonMethods;
import org.testng.annotations.Test;

/**
 * Created by abra on 1/31/17.
 */
public class TwitchSignInTest extends CommonMethods{

    @Test
    public void signInUsingDB() throws Exception{
        userLogInDB();
    }
}
