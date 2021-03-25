package icecreamShop.BillAbz.application;

import icecreamShop.BillAbz.eatables.Cone;
import icecreamShop.BillAbz.eatables.Magnum;
import icecreamShop.BillAbz.sellers.IceCreamSalon;
import icecreamShop.BillAbz.sellers.PriceList;

public class IceCreamApp {
    public static void main(String[] args) {

        IceCreamSalon iceCreamSalon = new IceCreamSalon();
        iceCreamSalon.orderMagnum(Magnum.MagnumType.ALPINENUTS);
        iceCreamSalon.orderCone(Cone.Flavor.values());
        

        System.out.println(iceCreamSalon.getProfit());

    }
}
