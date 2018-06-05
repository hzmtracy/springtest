package com.tk.othertools;


import org.apache.commons.lang.SystemUtils;
import org.joda.time.DateTime;
import org.apache.commons.lang.StringUtils;

import java.util.Date;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class OtherToolsApplicationTests {

    public static void main(String[] args) {
        String timeoutExpress = "2h";
        String timeExpire = null;
        if (!timeoutExpress.isEmpty() && timeoutExpress.endsWith("m")) {
            timeoutExpress = StringUtils.remove(timeoutExpress, "m");
            timeExpire = new DateTime(new Date()).plusMinutes(Integer.parseInt(timeoutExpress)).toString("yyyy-MM-dd HH:mm");
        }
        if (!timeoutExpress.isEmpty() && timeoutExpress.endsWith("h")) {
            timeoutExpress = StringUtils.remove(timeoutExpress, "h");
            timeExpire = new DateTime(new Date()).plusHours(Integer.parseInt(timeoutExpress)).toString("yyyy-MM-dd HH:mm");
        }
        System.out.println(SystemUtils.USER_NAME);
    }
}
