package com.example.myutils;

import android.content.Context;
import android.content.Intent;

public class MyMath {
    public static int addition(int first_number, int second_number){
        return first_number+second_number;
    }

    public static void start_activity(Context context){
        {
            context.startActivity(new Intent(context,ActionPlus.class));
        }
    }

}
