package com.example.ograyskitchen.database;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class FoodItemDao_Impl implements FoodItemDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<FoodItem> __insertionAdapterOfFoodItem;

  private final EntityDeletionOrUpdateAdapter<FoodItem> __deletionAdapterOfFoodItem;

  private final EntityDeletionOrUpdateAdapter<FoodItem> __updateAdapterOfFoodItem;

  public FoodItemDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfFoodItem = new EntityInsertionAdapter<FoodItem>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `foodItem_table` (`foodItemId`,`foodItem_name`,`foodItem_price`,`foodItem_category`) VALUES (nullif(?, 0),?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, FoodItem value) {
        stmt.bindLong(1, value.getFoodItemId());
        if (value.getFoodItemName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getFoodItemName());
        }
        stmt.bindDouble(3, value.getFoodItemPrice());
        if (value.getFoodItemCategory() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getFoodItemCategory());
        }
      }
    };
    this.__deletionAdapterOfFoodItem = new EntityDeletionOrUpdateAdapter<FoodItem>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `foodItem_table` WHERE `foodItemId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, FoodItem value) {
        stmt.bindLong(1, value.getFoodItemId());
      }
    };
    this.__updateAdapterOfFoodItem = new EntityDeletionOrUpdateAdapter<FoodItem>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `foodItem_table` SET `foodItemId` = ?,`foodItem_name` = ?,`foodItem_price` = ?,`foodItem_category` = ? WHERE `foodItemId` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, FoodItem value) {
        stmt.bindLong(1, value.getFoodItemId());
        if (value.getFoodItemName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getFoodItemName());
        }
        stmt.bindDouble(3, value.getFoodItemPrice());
        if (value.getFoodItemCategory() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getFoodItemCategory());
        }
        stmt.bindLong(5, value.getFoodItemId());
      }
    };
  }

  @Override
  public Object insert(final FoodItem foodItem, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfFoodItem.insert(foodItem);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public void insertAll(final List<FoodItem> foodItemList) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfFoodItem.insert(foodItemList);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public Object delete(final FoodItem foodItem, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfFoodItem.handle(foodItem);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object update(final FoodItem foodItem, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfFoodItem.handle(foodItem);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public LiveData<List<FoodItem>> getAll() {
    final String _sql = "SELECT * FROM foodItem_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"foodItem_table"}, false, new Callable<List<FoodItem>>() {
      @Override
      public List<FoodItem> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfFoodItemId = CursorUtil.getColumnIndexOrThrow(_cursor, "foodItemId");
          final int _cursorIndexOfFoodItemName = CursorUtil.getColumnIndexOrThrow(_cursor, "foodItem_name");
          final int _cursorIndexOfFoodItemPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "foodItem_price");
          final int _cursorIndexOfFoodItemCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "foodItem_category");
          final List<FoodItem> _result = new ArrayList<FoodItem>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final FoodItem _item;
            final long _tmpFoodItemId;
            _tmpFoodItemId = _cursor.getLong(_cursorIndexOfFoodItemId);
            final String _tmpFoodItemName;
            if (_cursor.isNull(_cursorIndexOfFoodItemName)) {
              _tmpFoodItemName = null;
            } else {
              _tmpFoodItemName = _cursor.getString(_cursorIndexOfFoodItemName);
            }
            final double _tmpFoodItemPrice;
            _tmpFoodItemPrice = _cursor.getDouble(_cursorIndexOfFoodItemPrice);
            final String _tmpFoodItemCategory;
            if (_cursor.isNull(_cursorIndexOfFoodItemCategory)) {
              _tmpFoodItemCategory = null;
            } else {
              _tmpFoodItemCategory = _cursor.getString(_cursorIndexOfFoodItemCategory);
            }
            _item = new FoodItem(_tmpFoodItemId,_tmpFoodItemName,_tmpFoodItemPrice,_tmpFoodItemCategory);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<FoodItem>> getAllCategory(final String category) {
    final String _sql = "SELECT * FROM foodItem_table WHERE foodItem_category = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (category == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, category);
    }
    return __db.getInvalidationTracker().createLiveData(new String[]{"foodItem_table"}, false, new Callable<List<FoodItem>>() {
      @Override
      public List<FoodItem> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfFoodItemId = CursorUtil.getColumnIndexOrThrow(_cursor, "foodItemId");
          final int _cursorIndexOfFoodItemName = CursorUtil.getColumnIndexOrThrow(_cursor, "foodItem_name");
          final int _cursorIndexOfFoodItemPrice = CursorUtil.getColumnIndexOrThrow(_cursor, "foodItem_price");
          final int _cursorIndexOfFoodItemCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "foodItem_category");
          final List<FoodItem> _result = new ArrayList<FoodItem>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final FoodItem _item;
            final long _tmpFoodItemId;
            _tmpFoodItemId = _cursor.getLong(_cursorIndexOfFoodItemId);
            final String _tmpFoodItemName;
            if (_cursor.isNull(_cursorIndexOfFoodItemName)) {
              _tmpFoodItemName = null;
            } else {
              _tmpFoodItemName = _cursor.getString(_cursorIndexOfFoodItemName);
            }
            final double _tmpFoodItemPrice;
            _tmpFoodItemPrice = _cursor.getDouble(_cursorIndexOfFoodItemPrice);
            final String _tmpFoodItemCategory;
            if (_cursor.isNull(_cursorIndexOfFoodItemCategory)) {
              _tmpFoodItemCategory = null;
            } else {
              _tmpFoodItemCategory = _cursor.getString(_cursorIndexOfFoodItemCategory);
            }
            _item = new FoodItem(_tmpFoodItemId,_tmpFoodItemName,_tmpFoodItemPrice,_tmpFoodItemCategory);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
