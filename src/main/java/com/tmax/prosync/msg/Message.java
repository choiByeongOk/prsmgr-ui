/**
 * TmaxData, Co. Copyright(C) 2001-, All rights reserved.
 */
package com.tmax.prosync.msg;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author Uihyun (uihyun_kim@tmaxdata.com) 2017. 7. 5.
 * @version $Id$
 */

/**
 * Message Properties, Locale¸¦ °ü¸®.
 */
public class Message {
    private static Locale locale;
    private static ResourceBundle msg;

    static {
        locale = Locale.getDefault();
        msg = ResourceBundle.getBundle("com.tmax.prosync.msg.ApplicationResources");
    }

    public static Locale geteLocale() {
        return locale;
    }

    public static void setLocale(Locale locale) {
        Message.locale = locale;
        msg = ResourceBundle.getBundle("com.tmax.prosync.msg.ApplicationResources", locale);

    }

    public static String getMsg(String key) {
        return msg.getString(key);
    }
}
