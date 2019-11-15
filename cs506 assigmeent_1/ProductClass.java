import java.util.*;
import javax.swing.*;

public class ProductClass {
   private int id;
   private String name; 
   private double price; 
   private int quantity;
   private double total;
	
    public ProductClass() {
           setId(0);
           setTotal(0.0);
           setName("null");
           setPrice(0);
           setQuantity(0);
    }

    public ProductClass(int id,String name,double price,int quantity) {
           setId(id);
           setTotal(price * quantity);
           setName(name);
           setPrice(price);
           setQuantity(quantity);
    }

    public ProductClass(ProductClass s) {
           setId(s.id);
           setTotal(s.price * s.quantity);
           setName(s.name);
           setPrice(s.price);
           setQuantity(s.quantity);
           
    }
    
	 public void setId(int id){
          this.id = id;
     }
     public void setName(String name){
         this.name = name;
     } 
     public void setPrice(double price){
        this.price = price;
     }
     public void setQuantity(int quantity){
         this.quantity = quantity;
     }
     public void setTotal(double total){
         this.total = total;
     }
	 public int getId(){
         return this.id;
     }
     public String getName(){
         return this.name;
     }
     public double getPrice(){
         return this.price;
     }
     public int getQuantity(){
         return this.quantity;
     }
    public double getTotal(){
         return this.total;
     }
    public void print() {
        JOptionPane.showMessageDialog(null, +id+ "." +name + ": $" + price + "X"+quantity);
    }

}