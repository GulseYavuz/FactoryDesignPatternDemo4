public class AhsapKapi implements IKapi{
    private String color;
    private String type;

    public AhsapKapi(String color, String type) {
        System.out.println("AHSAP KAPINIZ: " +color+ " " +type);
    }

    @Override
    public void kapiOlustur() {

    }
    public void AhsapKapi(String color, String type){
        this.color = color;
        this.type = type;

    }
}
