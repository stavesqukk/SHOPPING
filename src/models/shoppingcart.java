package models;


public class shoppingcart {

   int numberofitems;
   String[] itemName;
   int[] itemprice;

    public shoppingcart(int numberofitems, int[] itemprice, String[] itemName) {
        this.itemName = itemName;
        this.itemprice = itemprice;
        this.numberofitems = numberofitems;
    }
    public void displayInformation(){
        int numberofitems = this.numberofitems;
        String[] itemName = this.itemName;
        int[] itemprice = this.itemprice;
        System.out.println("Items in the cart:");
        for(int i=0;i<numberofitems;i++) {
            System.out.println("Item Name:" + itemName[i] + "Item Price:" + itemprice[i]);
        }

    }
}
