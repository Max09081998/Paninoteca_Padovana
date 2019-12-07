////////////////////////////////////////////////////////////////////
// [MASSIMO] [TOFFOLETTO] [1161727]
////////////////////////////////////////////////////////////////////
package it.unipd.tos.model;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import it.unipd.tos.model.ItemType;
import it.unipd.tos.model.MenuItem;

public class MenuItemTest {

    private static MenuItem menuItem;
    
    @BeforeClass
    public static void beforeClass(){
        menuItem= new MenuItem(ItemType.Bevande, "Aranciata", 2.2d);
    }
    
    @Test
    public void testGetItemType(){
        assertEquals(ItemType.Bevande, menuItem.getItemType());
    }
    
    @Test
    public void testGetName(){
        assertEquals("Aranciata", menuItem.getName());
    }
    
    @Test
    public void testGetPrice(){
        assertEquals(2.2d, menuItem.getPrice(), 0);
    }
}
