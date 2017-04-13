package shidian.com.shidianhttp;

import android.app.Application;
import android.content.Context;

/**
 * Created by Charlin on 2017/4/13.
 */

public class APPApplication extends Application {

    private static Context context;

    @Override
    public void onCreate()
    {
        context = getApplicationContext();
    }

    public static Context getContext()
    {
        return context;
    }

}