/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;


public class Customer {
   private int ID =1;
   private boolean isNew =true;
   private double total = 1000.0;
   
   public void displayCustomerInfo() {
    System.out.println("Client ID: " + ID);
    System.out.println("Client New: " + isNew);
    System.out.println("Total purchases: " + total);
    }   
}


