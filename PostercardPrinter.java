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
public class PostercardPrinter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        String text = "I am having a great time on\nthe island of Java. Weather\nis great. Wish you were here!";
        Postercard postcard = new Postercard(new Name("Janice", "Jones"), text);
        postcard.setRecipient(new Name("Sue", "Jackson"));
        postcard.print();
        postcard.setRecipient(new Name("Tim", "Thomkins"));
        postcard.print();
    }
  
}
