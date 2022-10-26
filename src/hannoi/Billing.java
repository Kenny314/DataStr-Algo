package hannoi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Billing {
    public static final int enter_fee = 2;
    public static final int first_hour_fee = 3;
    public static final int extra_fee_hour = 4;
    public int solution(String E, String L) {
        if("".equals(E) || E == null || "".equals(L) || L == null){
            return -1;
        }

        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");

        long enterTime = 0;
        try {
            enterTime = sdf.parse(E).getTime();
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        long leaveTime = 0;
        try {
            leaveTime = sdf.parse(L).getTime();
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        long diff = leaveTime - enterTime;

        long hours = diff / (60*60*1000);
        long minutes = diff/(60*1000) - hours*60;

        if(minutes == 0){
            if(hours == 0){
                return enter_fee;
            } else {
                if(hours == 1){
                    return enter_fee + first_hour_fee;
                }
                if(hours > 1){
                    return (int) (enter_fee + first_hour_fee + (hours - 1)*extra_fee_hour);
                }
            }
        } else {
            if(hours == 0){
                return enter_fee + first_hour_fee;
            } if(hours == 1){
                return (int) (enter_fee + first_hour_fee + (hours)*extra_fee_hour);
            } if(hours > 1){
                return (int) (enter_fee + first_hour_fee + (hours)*extra_fee_hour);
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Billing b = new Billing();
        int r = b.solution("17:00", "18:48");
    }
}
