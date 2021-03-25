package icecreamShop.BillAbz.sellers;

import icecreamShop.BillAbz.eatables.Cone;
import icecreamShop.BillAbz.eatables.IceRocket;
import icecreamShop.BillAbz.eatables.Magnum;

public class IceCreamCar implements IceCreamSeller{
    private PriceList priceList = new PriceList();
    private Stock stock = new Stock();
    private double profit;


    @Override
    public Cone orderCone(Cone.Flavor[] flavors) {
        stock.setCones(14);
        return null;
    }

    public Cone prepareCone(Cone.Flavor[] flavors){

        return null;
    }

    @Override
    public IceRocket orderIceRocket() {
        stock.setIceRockets(50);
        return orderIceRocket();
    }

    public IceRocket prepareIceRocket(){
        return null;
    }

    @Override
    public Magnum orderMagnum(Magnum.MagnumType magnumType) {
        stock.setMagni(20);
        System.out.println(magnumType);
        return null;
    }

    public Magnum prepareMagnum(Magnum.MagnumType magnumType){
        stock.getMagni();
        return null;
    }

    @Override
    public double getProfit() {
        return 0;
    }
}
