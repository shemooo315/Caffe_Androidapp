package com.example.mainpage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DPHelper extends SQLiteOpenHelper {

    public static final String DBname="login";
    SQLiteDatabase login;


    public DPHelper(Context context ) {
        super(context, DBname, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase MyDB) {
     MyDB.execSQL("create Table users(username TEXT primary key,password TEXT)");
    }


    @Override
    public void onUpgrade(SQLiteDatabase MyDB, int i, int i1) {
     MyDB.execSQL("drop Table if exists users");
    }
    public void addnewaccount(String name,String pass){
        ContentValues data=new ContentValues();
        data.put("username",name);
        data.put("password",pass);
        login=getWritableDatabase();
        login.insert("users",null,data);
        login.close();
    }
    public boolean checkusername(String user){
        login=getWritableDatabase();
        Cursor cursor=login.rawQuery("select * from users where username = ?",new String[]{user});
        if (cursor.getCount()>0){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean checkuserandpass(String user, String pass){
        login=getWritableDatabase();
        Cursor cursor=login.rawQuery("select * from users where username=? and password=?",new String[] {user,pass});
      if(cursor.getCount()>0){
          return true;
      }
      else{
          return false;
      }
    }
    public void delete() {
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("delete from "+ "users");
        db.close();
    }


}
