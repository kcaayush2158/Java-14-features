package records;

import java.math.BigDecimal;

public class RecordDemo {
    public static void main(String[] args){
        RecordsExample record = new RecordsExample("apple","inc",20,"California", BigDecimal.valueOf(1000000));
        System.out.println(record.firstName());
        System.out.println(record.lastName());
    }
}
