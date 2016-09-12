package worsley.chris.ZCWLivingRoom.worsley.chris;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by christopherworsley on 9/11/16.
 */
public class TelevisionTest {
    @Test
    public void getVolumeTest(){
        //To properly Test the getVolume method we need to have an Television object available
        Television television = new Television();

        // In the constructor of the Television Object we set the initial value of volume to 0
        // so the expected value returned by getVolume should logically be 0 when the function is working
        Integer expectedValue = 0;

        // Here we get the actualValue of returned from getVolume
        // If we run the application as is, this value will return null
        Integer actualValue = television.getVolume();

        // Here is where we test our UNIT of code, and assert that the expected value
        // matches the actualValue. When the test is functional this assertion will pass.
        // As things stand at this point, this assertion will fail.
        assertEquals("The value should be 0",expectedValue,actualValue);
    }
    @Test
    public void setVolumeTest(){
        Television television = new Television();
        Integer expectedValue = 0;
        television.setVolume(0);
        Integer actualValue = television.getVolume();
        assertEquals("The value should be 0",expectedValue,actualValue);
    }

}
