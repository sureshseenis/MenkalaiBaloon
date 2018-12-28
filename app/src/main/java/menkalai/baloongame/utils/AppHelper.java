package menkalai.baloongame.utils;

import android.content.Context;
import android.content.SharedPreferences;


public class AppHelper {

    private static final String PREFS_GLOBAL = "prefs_global";
    private static final String PREF_TOP_SCORE = "pref_top_score";
    private static final String PREG_LEVEL="pref_level";

    private static SharedPreferences getPreferences(Context context) {
        return context.getSharedPreferences(
                PREFS_GLOBAL, Context.MODE_PRIVATE);
    }

    //  Setters and getters for global preferences
    public static boolean isTopScore(Context context, int newScore) {
        int topScore = getPreferences(context).getInt(PREF_TOP_SCORE, 0);
        return newScore > topScore;
    }

    public static int getTopScore(Context context) {
        return getPreferences(context).getInt(PREF_TOP_SCORE, 0);
    }

    //  Setters and getters for global preferences
    public static boolean isLevel(Context context, int newLevel) {
        int topLevel = getPreferences(context).getInt(PREG_LEVEL, 0);
        return newLevel > topLevel;
    }

    public static int getLevel(Context context) {
        return getPreferences(context).getInt(PREG_LEVEL, 0);
    }

    public static void setTopScore(Context context, int score,int level) {
        SharedPreferences.Editor editor = getPreferences(context).edit();
        editor.putInt(PREF_TOP_SCORE, score);
        editor.putInt(PREG_LEVEL, level);
        editor.apply();
    }
}
