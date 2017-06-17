package com.example.android.sunshine.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.example.android.sunshine.data.WeatherContract.WeatherEntry;

/**
 * Manages a local database for weather data.
 */
// TODO (11) Extend SQLiteOpenHelper from WeatherDbHelper
public class WeatherDbHelper extends SQLiteOpenHelper {

    //  TODO (12) Create a public static final String called DATABASE_NAME with value "weather.db"
    public static final String DATABASE_NAME = "weather.db";

    //  TODO (13) Create a private static final int called DATABASE_VERSION and set it to 1
    private static final int DATABASE_VERSION = 1;

    //  TODO (14) Create a constructor that accepts a context and call through to the superclass constructor
    public WeatherDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);

    }

    //  TODO (15) Override onCreate and create the weather table from within it
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        final String SQL_CREATE_WEATHER_TABLE =
                "CREATE TABLE" +   WeatherEntry.TABLE_NAME + " ("                       +
                WeatherEntry._ID                + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                WeatherEntry.COLUMN_DATE        + " INTEGER,"                           +
                WeatherEntry.COLUMN_WEATHER_ID  + " INTEGER,"                           +
                WeatherEntry.COLUMN_MIN_TEMP    +" REAL,"                               +
                WeatherEntry.COLUMN_MAX_TEMP    + "REAL,"                               +
                WeatherEntry.COLUMN_HUMIDITY    + "REAL,"                               +
                WeatherEntry.COLUMN_PRESSURE    + " REAL, "                             +
                WeatherEntry.COLUMN_WIND_SPEED  + " REAL, "                             +
                WeatherEntry.COLUMN_DEGREES     + "REAL "                               +" );";


        sqLiteDatabase.execSQL(SQL_CREATE_WEATHER_TABLE);


    }

    //  TODO (16) Override onUpgrade, but don't do anything within it ye

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {


    }


}
