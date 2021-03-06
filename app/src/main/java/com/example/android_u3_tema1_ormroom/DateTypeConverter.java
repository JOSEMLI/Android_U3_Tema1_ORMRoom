package com.example.android_u3_tema1_ormroom;

import androidx.room.TypeConverter;

import java.util.Date;

public class DateTypeConverter {
  @TypeConverter
  public long convertDateToLong(Date date) {
    return date.getTime();
  }
  @TypeConverter
  public Date convertLongToDate(long time) {
    return new Date(time);
  }
}
