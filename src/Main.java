import models.modelcart;
import models.shoppingcart;
public class Main {
    public static void main(String[] args) {

        shoppingcart aa = new shoppingcart(3, new int[]{1000, 2000, 200}, new String[]{"Sweater", "Muffler", "Socks"});
        aa.displayInformation();

        modelcart kk = new modelcart(1230,"ZARA", new int[]{1000,200,500}, new String[]{"Bag","Copy","Jacket"},3);
        kk.displayInformation();

    }
}
