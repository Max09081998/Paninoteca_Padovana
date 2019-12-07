package it.unipd.tos.business;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import it.unipd.tos.business.exception.TakeAwayBillException;
import it.unipd.tos.model.ItemType;
import it.unipd.tos.model.MenuItem;

public class TakeAwayBillClassTest {

    private TakeAwayBillClass takeAwayBillClass;
    
    @Before
    public void before(){
        takeAwayBillClass=new TakeAwayBillClass();
    }
    
    
    @Test
    public void testGetFirstOrderPrice() {
        List<MenuItem> itemOrderedList = new ArrayList<MenuItem>();
        for(int i=0; i<5; i++){
            itemOrderedList.add(new MenuItem(ItemType.Bevande, "Coca Cola", 2.5d));
        }
        try{
            assertEquals(12.5d, takeAwayBillClass.getOrderPrice(itemOrderedList), 0);
        }
        catch(TakeAwayBillException exception){
            fail(exception.getMessage());
        }
    }

}
