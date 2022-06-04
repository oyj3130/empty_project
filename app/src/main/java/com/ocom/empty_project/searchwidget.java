package com.ocom.empty_project;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.RemoteViews;
import android.widget.Toast;

/**
 * Implementation of App Widget functionality.
 */
public class searchwidget extends AppWidgetProvider {

    private final String ACTION_BTN = "widgetbtnonclick";

    static void updateAppWidget(Context context, AppWidgetManager appWidgetManager,
                                int appWidgetId) {

        CharSequence widgetText = context.getString(R.string.appwidget_text);
        // Construct the RemoteViews object
        RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.searchwidget);
        views.setTextViewText(R.id.appwidget_text, widgetText);

        // Instruct the widget manager to update the widget
        appWidgetManager.updateAppWidget(appWidgetId, views);
    }


    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        // There may be multiple widgets active, so update all of them
        Log.d("yoon", "widget onUpdate");
        /*
        //------------Internet Code------------------//
        //https://m.blog.naver.com/PostView.naver?isHttpsRedirect=true&blogId=mym0404&logNo=221345595300
        RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.searchwidget);

        Intent clickIntent=new Intent(context,searchwidget.class);
        clickIntent.setAction(context.getResources().getString(R.string.searchbutton));

        PendingIntent pendingIntent=PendingIntent.getBroadcast(context,0,clickIntent,0);
        views.setOnClickPendingIntent(R.id.button4,pendingIntent);
        //-------------------------------------------//

        for (int appWidgetId : appWidgetIds) {
            updateAppWidget(context, appWidgetManager, appWidgetId);
        }
        */
    }
    //------------Internet Code------------------//
    //https://m.blog.naver.com/PostView.naver?isHttpsRedirect=true&blogId=mym0404&logNo=221345595300

    @Override
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
        Log.w("Widget", "Clicked button1");
        String action = intent.getAction();
        Toast.makeText(context, "Button1", Toast.LENGTH_SHORT).show();
        if(action.equals(context.getResources().getString(R.string.searchbutton))) {
            Toast.makeText(context,"성공!",Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onEnabled(Context context) {
        // Enter relevant functionality for when the first widget is created
    }

    @Override
    public void onDisabled(Context context) {
        // Enter relevant functionality for when the last widget is disabled
    }
}