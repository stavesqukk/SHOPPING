package models;

public class modelcart {

    int itemnumber;

    public int getItemnumber() {
        return itemnumber;
    }

    public void setItemnumber(int itemnumber) {
        this.itemnumber = itemnumber;
    }

    String[] itemname;

    public String[] getItemname() {
        return itemname;
    }

    public void setItemname(String[] itemname) {
        this.itemname = itemname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    int id;

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname;
    }

    public int[] getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int[] itemPrice) {
        this.itemPrice = itemPrice;
    }

    String shopname;
    int[] itemPrice;

    public modelcart(int id, String shopname, int[] itemPrice, String[] itemname, int itemnumber) {
        this.id = id;
        this.shopname = shopname;
        this.itemPrice = itemPrice;
        this.itemnumber = itemnumber;
        this.itemname = itemname;
    }

    public void displayInformation(){
            String shopname = this.shopname;
            int[] itemPrice = this.itemPrice;
            int id = this.id;
            String[] itemname = this.itemname;
            for(int i=0; i<itemnumber;i++){
                int pp = itemPrice[i];
                int totalprice = 0;
                totalprice = totalprice + pp;
                System.out.println(id + "from the " + shopname + "with the items"+itemname[i]+"with the price"+itemPrice[i] );

        }

    }

}
