package icecreamShop.BillAbz.eatables;

public class Magnum implements Eatable{
    private MagnumType type;


    public Magnum(){

    }
    public Magnum(MagnumType magnumType){
        this.type = magnumType;
    }

    public MagnumType getType() {
        return type;
    }

    @Override
    public void eat() {
        System.out.println("Hmm lekker!! Ik hou echt van Magnum :)");
    }




    public enum MagnumType {
        MILKCHOCOLATE,
        WHITECHOCOLATE,
        BLACKCHOCOLATE,
        ALPINENUTS,
        ROMANTICSTRAWBERRIES
    }
}
