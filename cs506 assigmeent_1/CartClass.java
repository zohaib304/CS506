import java.util.*;
import javax.swing.*;
public class CartClass{
    ArrayList products;
    ProductClass addProduct;

	public CartClass(){
        products = new ArrayList();
    }

         public CartClass(int id,String name,double price,int quan)
     {
         products = new ArrayList();
         addProduct = new ProductClass(id,name,price,quan);
         products.add(addProduct);
     }

     public CartClass(ProductClass c)
     {
         products = new ArrayList();
         addProduct = new ProductClass(c.getId(),c.getName(),c.getPrice(),c.getQuantity());
         products.add(addProduct);
     }      
    public void addItem(){
    boolean flag = true;
    while (flag) 
    {
        String input = JOptionPane.showInputDialog("1 To Add 'orange ($2.0)'" +
        "\n 2 To Add 'grapes ($2.5)' \n 3 To Add 'Banana ($1.5)'" +
        "\n 4 To Add 'Mango ($3.0)'" + "\n 5 To Done");
        
        int ch = Integer.parseInt(input);
        String q = "";
        int quan = 0;
        
        switch (ch) {
        case 1:
        q = JOptionPane.showInputDialog("Please Specify the quantity (1 to 10)");
        quan = Integer.parseInt(q);
        
        addProduct = new ProductClass(1,"orange",2.0,quan);
        products.add(addProduct);
        break;
         case 2:
        q = JOptionPane.showInputDialog("Please Specify the quantity (1 to 10)");
        quan = Integer.parseInt(q);
         
         addProduct = new ProductClass(2,"grapes",2.5,quan);
         products.add(addProduct);
         break;
         case 3:
        q = JOptionPane.showInputDialog("Please Specify the quantity (1 to 10)");
        quan = Integer.parseInt(q);
        
        addProduct = new ProductClass(3,"banana",1.5,quan);
        products.add(addProduct);
         break;
         case 4:
        q = JOptionPane.showInputDialog("Please Specify the quantity (1 to 10)");
        quan = Integer.parseInt(q);
        
        addProduct = new ProductClass(4,"manago",3.0,quan);
        products.add(addProduct);
         break;
        case 5:
        flag = false;
        }      
    }//while
    }//

    	public void getItemsList()
        {
          if(products.isEmpty()){
            JOptionPane.showMessageDialog(null,"Cart is Empty");    
          }else{
          String output = "";
          int outputTotalQuan = 0;
          double outputTotal = 0.0;
          for(int i=0; i<products.size(); i++)
          {
          ProductClass pro = (ProductClass)products.get(i);
            output+=pro.getId()+ "." +pro.getName() + ": $" + pro.getPrice() + "X"+pro.getQuantity()+" = $" + pro.getTotal() + "\n";
            outputTotalQuan +=  pro.getQuantity();
            outputTotal += pro.getTotal();
          }
          JOptionPane.showMessageDialog(null, output + "\n No. of items " +outputTotalQuan+ "- Total Bill $"+outputTotal);
           

          }

        }
    
     public void removeItem(){
         if(products.isEmpty()){
           JOptionPane.showMessageDialog(null,"Cart is Empty");    
           }
          else{
          String output = "";
          
          
          for(int i=0; i<products.size(); i++)
          {
          ProductClass pro = (ProductClass)products.get(i);
            output+=pro.getId()+ " .to remove  " +pro.getName()+"\n";
          }
          String ch = JOptionPane.showInputDialog(output);
          int id = Integer.parseInt(ch);
                    for (int i=0; i< products.size(); i++) {
                    ProductClass pro = (ProductClass)products.get(i);
                    if (id == pro.getId())
                        {
                         products.remove(i);
                         JOptionPane.showMessageDialog(null,"Item Removed");    
                       }
                    }         
          }
     }

     public void emptyCart(){
           if(products.isEmpty()){
            JOptionPane.showMessageDialog(null,"Cart is Empty");
           }
           else{
           for(int i=0; i<products.size(); i++) {
           ProductClass pro = (ProductClass)products.get(i);
           products.remove(i);
            }//for
           JOptionPane.showMessageDialog(null,"All items removed successfullys");
           }//else    
     
        }
        



}