import javax.swing.*;
public class MainClass {
    public static void DeveloperInfo(){
        JOptionPane.showMessageDialog(null,"Developed : bc2342");
    } 
    public static void main(String[] args){
     CartClass myCart;
     ProductClass procl;
     int ch;
     String input;
     try {
                myCart = new CartClass();
                //myCart = new CartClass(1,"orange",2.0,2);
                //procl = new ProductClass(1,"orange",2.0,2);
                //myCart = new CartClass(procl);
                while (true)
                {
                    input = JOptionPane.showInputDialog("1 for Add Item(s) to Cart" +
                    "\n 2 for Remove an Item from Cart \n 3 for Go to Checkout" +
                    "\n 4 for Empty Cart" + "\n 5 for Exit Program");
                    ch = Integer.parseInt(input);
                    switch (ch) {
                    case 1:
                    myCart.addItem();
                    break;
                    case 2:
                    myCart.removeItem();
                    break;
                    case 3:
                    myCart.getItemsList();
                    break;
                    case 4:
                    myCart.emptyCart();
                    break;
                    case 5:
                    MainClass.DeveloperInfo();
                    System.exit(0);
                    }

                }//end while
     }catch(NullPointerException e){
          JOptionPane.showMessageDialog(null,"invild Pointer Exception");
     }catch(NumberFormatException n)
     {
          JOptionPane.showMessageDialog(null,"invild number Exception");
     }
    

    }//main
}