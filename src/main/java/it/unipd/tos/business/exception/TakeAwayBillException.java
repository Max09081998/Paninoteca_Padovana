////////////////////////////////////////////////////////////////////
// [MASSIMO] [TOFFOLETTO] [1161727]
////////////////////////////////////////////////////////////////////
package it.unipd.tos.business.exception;

@SuppressWarnings("serial")
public class TakeAwayBillException extends Exception {
    public TakeAwayBillException(String mex) {
        super(mex);
    }

    public String getMessage(){
        return super.getMessage();
    }
}