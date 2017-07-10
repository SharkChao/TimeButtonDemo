package com.lenovohit.administrator.timebuttondemo;

import java.util.Date;

/**
 * Created by SharkChao on 2017-07-10.
 */

public class UserData {
    private static Date data;

    public static Date getData() {
        return data;
    }

    public static void setData(Date data) {
        UserData.data = data;
    }
}
