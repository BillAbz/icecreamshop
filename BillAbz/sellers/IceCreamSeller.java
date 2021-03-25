package icecreamShop.BillAbz.sellers;

import icecreamShop.BillAbz.eatables.Cone;
import icecreamShop.BillAbz.eatables.IceRocket;
import icecreamShop.BillAbz.eatables.Magnum;

public interface IceCreamSeller extends Profitable{
    Cone orderCone(Cone.Flavor[] flavors);
    IceRocket orderIceRocket();
    Magnum orderMagnum(Magnum.MagnumType magnumType);
}
