package com.example.orkatrade.ui;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.ContactsContract;

import com.example.orkatrade.ProfileActivity;

public class ProfileDatabase {

        private SQLiteDatabase database;

        public ProfileDatabase(Context context) {
            database = new SQLiteOpenHelper(context, "user_profile.db", null, 1) {
                @Override
                public void onCreate(SQLiteDatabase db) {
                    db.execSQL("CREATE TABLE user_profile (name TEXT, money REAL)");
                }

                @Override
                public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
                    // Handle database upgrades
                }
            }.getWritableDatabase();
        }

        public void ProfileActivity(ContactsContract.Profile Profile) {
            ContentValues values = new ContentValues();
            values.put("name", ProfileActivity.getName();
            values.put("money", ProfileActivity.getMoney();
            database.insert("user_profile", null, values);
        }

        public ProfileActivity.UserProfile getUserProfile() {
            Cursor cursor = database.query("user_profile", new String[]{"name", "money"}, null, null, null, null, null);
            if (cursor.moveToFirst()) {
                String name = cursor.getString(0);
                double money = cursor.getDouble(1);
                return new ProfileActivity.UserProfile(name, money);
            }
            return null;
        }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

    }
}

