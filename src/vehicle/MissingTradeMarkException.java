/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle;

/**
 *
 * @author Nohch
 */
public class MissingTradeMarkException extends Throwable {
    
    public String message;

    public MissingTradeMarkException(String message) {
   
        this.message = message;
    }
    
}
