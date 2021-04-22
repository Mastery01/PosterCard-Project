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
public class Name {
    
   private String first; // first name
   private String last;  // last name
	
   /** Creates a default name whose first and last names are empty. */
   public Name()
   {
      first = ""; // empty string
      last = "";
   } // end default constructor
	
   /** Creates a name whose first and last names are the strings 
       firstName and lastName, respectively. */	
   public Name(String firstName, String lastName)
   {
      first = firstName;
      last = lastName;
   } // end constructor

   /** Sets the first name to the string firstName. */	
   public void setFirst(String firstName)
   {
      first = firstName; 
   } // end setFirst
	
   /** Sets the last name to the string lastName. */
   public void setLast(String lastName)
   {
      last = lastName;
   } // end setLast
	
   /** Sets the first and last names to the strings 
       firstName and lastName, respectively. */	
   public void setName(String firstName, String lastName)
   {
      setFirst(firstName);
      setLast(lastName);
   } // end setName
	
   /** Returns the first name as a string. */
   public String getFirst()
	{
      return first;
   } // end getFirst
	
   /** Returns the last name as a string. */
   public String getLast()
   {
      return last;
   } // end getLast
	
   /** Returns the entire name as a string. */	
   public String getName()
   {
      return first + " " + last;
   } // end getName
	
   /** Returns the entire name as a string. */
   public String toString()
   {
      return getName();
   } // end toString 
	
   /** Indicates whether this Name is same as the other Name */
   public boolean equals(Object other)
   {
      boolean result = false;
      if (other instanceof Name)
      {
         Name otherName = (Name)other;
         result = first.equals(otherName.first) &&
         last.equals(otherName.last);
      } // end if
      return result;
   } // equals
   
   /** Gives the last name to otherName. */
   public void giveLastNameTo(Name otherName)
   {
      otherName.setLast(last);
   } // end giveLastNameTo
        
}//end Name
