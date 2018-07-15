package top.trumeet.common.utils;

import android.content.Context;
import android.content.SharedPreferences;

import com.crossbowffs.remotepreferences.RemotePreferences;

/**
 * @author zts
 */
public class PreferencesUtils {

    public static final String AUTHORITY = "top.trumeet.mipushframework.preferences";
    public static final String MAIN_PREFS = "top.trumeet.mipush_preferences";

    public static final String KEY_ACCESS_MODE = "AccessMode";
    public static final String KEY_DEBUG_ICON = "DebugIcon";
    public static final String AUTO_REGISTER = "AutoRegister";
    public static final String KEY_DEBUG_INTENT = "DebugIntent";
    public static final String KEY_FOREGROUND_NOTIFICATION = "ForegroundNotification";
    public static final String KEY_ENABLE_WAKEUP_TARGET = "EnableWakeupTarget";
    public static final String KEY_ENABLE_GROUP_NOTIFICATION = "EnableGroupNotification";

    public static SharedPreferences getPreferences(Context ctx) {
        return new RemotePreferences(ctx, PreferencesUtils.AUTHORITY, PreferencesUtils.MAIN_PREFS, true);
    }

}
