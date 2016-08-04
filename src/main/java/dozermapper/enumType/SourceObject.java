package dozermapper.enumType;

public class SourceObject {

    private SourceType sourceType;

    public SourceType getSourceType() {
        return sourceType;
    }

    public void setSourceType(SourceType sourceType) {
        this.sourceType = sourceType;
    }

    @Override
    public String toString() {
        return "SourceObject{" +
                "sourceType=" + sourceType +
                '}';
    }
}
