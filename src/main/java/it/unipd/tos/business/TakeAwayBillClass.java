////////////////////////////////////////////////////////////////////
// [MASSIMO] [TOFFOLETTO] [1161727]
////////////////////////////////////////////////////////////////////
package it.unipd.tos.business;

import java.util.List;

import it.unipd.tos.business.exception.TakeAwayBillException;
import it.unipd.tos.model.ItemType;
import it.unipd.tos.model.MenuItem;

public class TakeAwayBillClass implements TakeAwayBill {

    public double getOrderPrice(List<MenuItem> itemsOrdered) 
            throws TakeAwayBillException {
        double totPrice=0.0d;
        int numSandwitch = 0;
        double minPriceSandwitch=-1.0d;
        
        for(MenuItem item:itemsOrdered){            
            if(item.getItemType()==ItemType.Panini){
                if(minPriceSandwitch==-1.0d){
                    minPriceSandwitch=item.getPrice();
                }
                else{
                    if(minPriceSandwitch>item.getPrice()){
                        minPriceSandwitch=item.getPrice();
                    }
                }
                numSandwitch++;
            }
            totPrice+=item.getPrice();
        }
        
        if(numSandwitch>5){
            totPrice = totPrice - (minPriceSandwitch/2.0d);
        }
        
        return totPrice;
    }

}
