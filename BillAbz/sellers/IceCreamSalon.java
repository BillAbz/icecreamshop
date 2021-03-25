package icecreamShop.BillAbz.sellers;

import icecreamShop.BillAbz.eatables.Cone;
import icecreamShop.BillAbz.eatables.IceRocket;
import icecreamShop.BillAbz.eatables.Magnum;

public class IceCreamSalon implements IceCreamSeller{
    private PriceList priceList = new PriceList();
    private double totalProfit = 0;


    @Override
    public Cone orderCone(Cone.Flavor[] flavors) {
        totalProfit += priceList.getBallPrice();
        return null;
    }

    @Override
    public IceRocket orderIceRocket() {
        totalProfit += priceList.getRocketPrice();
        return null;
    }

    @Override
    public Magnum orderMagnum(Magnum.MagnumType magnumType) {
        if (magnumType == Magnum.MagnumType.ALPINENUTS || magnumType == Magnum.MagnumType.ROMANTICSTRAWBERRIES){
            totalProfit += 1.2*priceList.getMagnumStandardPrice();
        }else totalProfit += priceList.getMagnumStandardPrice();
        return null;
    }

    @Override
    public double getProfit() {
        return totalProfit;
    }

    @Override
    public String toString() {
        return "IceCreamSalom{" +
                "priceList=" + priceList +
                ", totalProfit=" + totalProfit +
                '}';
    }
}
