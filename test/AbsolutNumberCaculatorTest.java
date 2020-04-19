import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class AbsolutNumberCaculatorTest {

    @Test
    public void testAbsoluteNumber(){
        int number=0;
        int expected=0;

        int result=AbsolutNumberCaculator.findAbsolteNumber(number);
        assertEquals(expected,result);    //? sao lai can pulic ạ?

    }
    @Test
    public  void  testAbsoluteNumber1(){
        int number=-1;
        int expected=1;

        int result=AbsolutNumberCaculator.findAbsolteNumber(number);
        assertEquals(expected,result);

    }

    @Test

    public void testAbsoluteNUmber2(){
        int number =1;
        int expected=1;
        int result=AbsolutNumberCaculator.findAbsolteNumber(number);
        assertEquals(expected,result);
    }




}