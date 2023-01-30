# Код Customer
***
>package Domain;
>
>
>public class Customer {
>  private int ID =1;
>  private boolean isNew =true;
>  private double total = 1000.0;
>   
>  public void displayCustomerInfo() {
>   System.out.println("Client ID: " + ID);
>   System.out.println("Client New: " + isNew);
>   System.out.println("Total purchases: " + total);
>   }   
>}
# CustomerTest
***
>package test;
>
>import Domain.Customer;
>
>public class CustomerTest {
>     public static void main(String[] args){
>	Customer myCustomer = new Customer();
>        myCustomer.displayCustomerInfo();
>    }
>} 

![alt text](https://github.com/ppc-ntu-khpi/java-1-Ivanina-Matvij/blob/main/images/done.png "done")
    