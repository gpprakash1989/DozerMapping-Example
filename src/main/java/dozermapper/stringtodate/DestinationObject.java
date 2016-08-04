package dozermapper.stringtodate;

import java.util.Date;

public class DestinationObject {

    private Date dateFrom;
    private Date dateEnd;

    public Date getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public Date getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    @Override
    public String toString() {
        return "DestinationObject{" +
                "dateEnd=" + dateEnd +
                ", dateFrom=" + dateFrom +
                '}';
    }
}
