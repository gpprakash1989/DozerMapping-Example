package dozermapper.enumType;

public class DestinationObject {

    private DestinationType destinationType;

    public DestinationType getDestinationType() {
        return destinationType;
    }

    public void setDestinationType(DestinationType destinationType) {
        this.destinationType = destinationType;
    }

    @Override
    public String toString() {
        return "DestinationObject{" +
                "destinationType=" + destinationType +
                '}';
    }
}
