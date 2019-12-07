////////////////////////////////////////////////////////////////////
// [MASSIMO] [TOFFOLETTO] [1161727]
////////////////////////////////////////////////////////////////////
package it.unipd.tos.business.exception;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class TakeAwayBillExceptionTest {    
    
    private static TakeAwayBillException takeAway;
    
    @BeforeClass
    public static void beforeClass(){
        takeAway= new TakeAwayBillException("Eccezione");
    }
    
    @Test
    public void testGetMessage(){
        assertEquals("Eccezione", takeAway.getMessage());
    }

}
