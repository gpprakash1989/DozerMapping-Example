package dozermapper.configuration.xml;


public class DestinationObject {

    private String titleOfDestination;

    public String getTitleOfDestination() {
        return titleOfDestination;
    }

    public void setTitleOfDestination(String titleOfDestination) {
        this.titleOfDestination = titleOfDestination;
    }

    @Override
    public String toString() {
        return "DestinationObject{" +
                "titleOfDestination='" + titleOfDestination + '\'' +
                '}';
    }
}
