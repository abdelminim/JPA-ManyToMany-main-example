import java.util.Date;
import org.joda.time.DateTime;
import org.joda.time.Months;
import static com.fasterxml.jackson.databind.type.LogicalType.DateTime;

public class Test {
    public static void main(String[] args) {
        Date fromDate = new DateTime().minusMonths(5).withDayOfMonth(1).toDate();
        Date toDate = new DateTime().withDayOfMonth(1).toDate();

        System.out.println("from : " +fromDate);
        System.out.println("todate: "+toDate);
    }
}
