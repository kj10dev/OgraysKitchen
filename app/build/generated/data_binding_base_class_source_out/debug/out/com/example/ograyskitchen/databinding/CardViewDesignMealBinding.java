// Generated by view binder compiler. Do not edit!
package com.example.ograyskitchen.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.ograyskitchen.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class CardViewDesignMealBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView ivFootItem;

  @NonNull
  public final TextView tvItemName;

  @NonNull
  public final TextView tvPrice;

  private CardViewDesignMealBinding(@NonNull LinearLayout rootView, @NonNull ImageView ivFootItem,
      @NonNull TextView tvItemName, @NonNull TextView tvPrice) {
    this.rootView = rootView;
    this.ivFootItem = ivFootItem;
    this.tvItemName = tvItemName;
    this.tvPrice = tvPrice;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static CardViewDesignMealBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static CardViewDesignMealBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.card_view_design_meal, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static CardViewDesignMealBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ivFootItem;
      ImageView ivFootItem = ViewBindings.findChildViewById(rootView, id);
      if (ivFootItem == null) {
        break missingId;
      }

      id = R.id.tvItemName;
      TextView tvItemName = ViewBindings.findChildViewById(rootView, id);
      if (tvItemName == null) {
        break missingId;
      }

      id = R.id.tvPrice;
      TextView tvPrice = ViewBindings.findChildViewById(rootView, id);
      if (tvPrice == null) {
        break missingId;
      }

      return new CardViewDesignMealBinding((LinearLayout) rootView, ivFootItem, tvItemName,
          tvPrice);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
