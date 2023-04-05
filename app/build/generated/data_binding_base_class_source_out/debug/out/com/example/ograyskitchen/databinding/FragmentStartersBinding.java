// Generated by data binding compiler. Do not edit!
package com.example.ograyskitchen.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.ograyskitchen.R;
import com.example.ograyskitchen.database.FoodItemViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentStartersBinding extends ViewDataBinding {
  @NonNull
  public final LinearLayout foodItemName;

  @NonNull
  public final TextView fooditems;

  @Bindable
  protected FoodItemViewModel mViewModel;

  protected FragmentStartersBinding(Object _bindingComponent, View _root, int _localFieldCount,
      LinearLayout foodItemName, TextView fooditems) {
    super(_bindingComponent, _root, _localFieldCount);
    this.foodItemName = foodItemName;
    this.fooditems = fooditems;
  }

  public abstract void setViewModel(@Nullable FoodItemViewModel viewModel);

  @Nullable
  public FoodItemViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentStartersBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_starters, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentStartersBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentStartersBinding>inflateInternal(inflater, R.layout.fragment_starters, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentStartersBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_starters, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentStartersBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentStartersBinding>inflateInternal(inflater, R.layout.fragment_starters, null, false, component);
  }

  public static FragmentStartersBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentStartersBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentStartersBinding)bind(component, view, R.layout.fragment_starters);
  }
}