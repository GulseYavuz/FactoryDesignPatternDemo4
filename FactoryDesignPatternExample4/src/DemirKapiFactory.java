public class DemirKapiFactory implements IKapiFactory{
    @Override
    public IKapi kapiOlustur(String color, String type) {
        return new DemirKapi(color, type);
    }
}
