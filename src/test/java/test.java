import com.google.api.client.util.DateTime;
import org.junit.Rule;
import org.junit.Test;
import sun.util.resources.LocaleData;

import java.util.Date;

import static org.testng.Assert.*;

public class test {
    public static void main(String[] args) {


        helloworld nameuser = new helloworld();

        System.out.println(nameuser);


        // Given
        helloworld underTest = new helloworld();

        // When
        Object tests = null;
        String result = underTest.toString();

        // Then
        assertNotNull(result);
       // assertTrue(result.isEmpty());
       // assertNull(result.getClass());
    }




    test() {
        Date now = new Date();

        System.out.println(now);
        helloworld test1 = new helloworld();


        Date lStop = new Date();
        System.out.println("Time of execution in seconds:" + ((lStop.getTime() - now.getTime()) / 1000));
    }
}

