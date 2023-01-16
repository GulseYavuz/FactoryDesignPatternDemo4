public class DemirKapi implements IKapi{
    private String color;
    private String type;

    public DemirKapi(String color, String type) {
        System.out.println("DEMİR KAPINIZ: " +color+ " " +type);
    }

    @Override
    public void kapiOlustur() {

    }
    public DemirKapi(){
        this.color= color;
        this.type= type;

    }
}
