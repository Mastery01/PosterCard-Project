/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package postercardprinter;

/**
 *
 * @author amanda
 */
public class Postercard {
        private String message;
        private Name sender;
        //private Name recipient;
        //private String name;
        private Object recipient;
 
    public Postercard(Name Sender, String Message){
        message = Message;
        sender = Sender;
        recipient = null;
    }
    
    public void setRecipient(Name aRecipient)
    {
        recipient = aRecipient;
    }
    
    public void print()
    {
       System.out.println("Dear ");
       System.out.println(recipient+": ");
       System.out.println(message);
       System.out.println("Love, ");
       System.out.println(sender);
    }
    
}

