public class Main {
    public static void main(String[] args) {

        IKapiFactory ahsapKapiFactory = new AhsapKapiFactory();
        IKapiFactory demirKapiFactory = new DemirKapiFactory();


        ahsapKapiFactory.kapiOlustur("siyah" , "ahsap");
        demirKapiFactory.kapiOlustur("beyaz", "demir");

    }
}