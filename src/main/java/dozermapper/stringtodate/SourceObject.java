package dozermapper.stringtodate;

public class SourceObject {

    private String dateStringFrom;
    private String dateStringEnd;

    public String getDateStringFrom() {
        return dateStringFrom;
    }

    public void setDateStringFrom(String dateStringFrom) {
        this.dateStringFrom = dateStringFrom;
    }

    public String getDateStringEnd() {
        return dateStringEnd;
    }

    public void setDateStringEnd(String dateStringEnd) {
        this.dateStringEnd = dateStringEnd;
    }

    @Override
    public String toString() {
        return "SourceObject{" +
                "dateStringFrom='" + dateStringFrom + '\'' +
                ", dateStringEnd='" + dateStringEnd + '\'' +
                '}';
    }
}
