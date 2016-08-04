package dozermapper.configuration.api;


public class SourceObject {

    private String titleOfSource;

    public String getTitleOfSource() {
        return titleOfSource;
    }

    public void setTitleOfSource(String titleOfSource) {
        this.titleOfSource = titleOfSource;
    }

    @Override
    public String toString() {
        return "SourceObject{" +
                "titleOfSource='" + titleOfSource + '\'' +
                '}';
    }
}
