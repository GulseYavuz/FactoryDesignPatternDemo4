public class AhsapKapiFactory implements IKapiFactory{
    @Override
    public IKapi kapiOlustur(String color, String type) {
        return new AhsapKapi(color, type);
    }
}
