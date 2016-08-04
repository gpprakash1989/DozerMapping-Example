package dozermapper.configuration.annotation;

import org.dozer.Mapping;


public class SourceObject {

    @Mapping("titleOfDestination")
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
