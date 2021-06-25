package com.eajy.materialdesign2.fragment;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.PopupMenu;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;
import com.eajy.materialdesign2.App;
import com.eajy.materialdesign2.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.button.MaterialButton;

import java.text.DateFormat;
import java.util.Calendar;

import static android.content.Context.MODE_PRIVATE;


public class DialogsFragment extends Fragment implements View.OnClickListener {

    private MaterialButton btn_dialog_1, btn_dialog_2, btn_dialog_3, btn_dialog_4, btn_dialog_5,
            btn_dialog_6, btn_dialog_7, btn_dialog_8, btn_dialog_9, btn_dialog_10, btn_dialog_11;
    private Calendar calendar;
    private int progress = 0;

    private AdView ad_view_dialog;
    private CardView card_ad_dialog;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        NestedScrollView nestedScrollView = (NestedScrollView) inflater.inflate(R.layout.fragment_dialogs, container, false);
        btn_dialog_1 = nestedScrollView.findViewById(R.id.btn_dialog_1);
        btn_dialog_2 = nestedScrollView.findViewById(R.id.btn_dialog_2);
        btn_dialog_3 = nestedScrollView.findViewById(R.id.btn_dialog_3);
        btn_dialog_4 = nestedScrollView.findViewById(R.id.btn_dialog_4);
        btn_dialog_5 = nestedScrollView.findViewById(R.id.btn_dialog_5);
        btn_dialog_6 = nestedScrollView.findViewById(R.id.btn_dialog_6);
        btn_dialog_7 = nestedScrollView.findViewById(R.id.btn_dialog_7);
        btn_dialog_8 = nestedScrollView.findViewById(R.id.btn_dialog_8);
//        btn_dialog_9 = nestedScrollView.findViewById(R.id.btn_dialog_9);
//        btn_dialog_10 = nestedScrollView.findViewById(R.id.btn_dialog_10);
        btn_dialog_11 = nestedScrollView.findViewById(R.id.btn_dialog_11);
        ad_view_dialog = nestedScrollView.findViewById(R.id.ad_view_dialog);
        card_ad_dialog = nestedScrollView.findViewById(R.id.card_ad_dialog);
        return nestedScrollView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        calendar = Calendar.getInstance();
        btn_dialog_1.setOnClickListener(this);
        btn_dialog_2.setOnClickListener(this);
        btn_dialog_3.setOnClickListener(this);
        btn_dialog_4.setOnClickListener(this);
        btn_dialog_5.setOnClickListener(this);
        btn_dialog_6.setOnClickListener(this);
        btn_dialog_7.setOnClickListener(this);
        btn_dialog_8.setOnClickListener(this);
//        btn_dialog_9.setOnClickListener(this);
//        btn_dialog_10.setOnClickListener(this);
        btn_dialog_11.setOnClickListener(this);
        showAd();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_dialog_1:
                new AlertDialog.Builder(getContext())
                        .setTitle("First")
                        .setMessage("又要上学了 每次买一箱背过去都不够吃的 吃过好多牌子螺蛳粉 还是最爱好欢螺 味道很浓郁 汤料很喜欢 料也超多 喜欢吃羊肉的朋友可以试试煮羊肉卷 还可以放点金针菇 土豆片 各种自己喜欢吃的 做豪华款吃 你会爱上的！！")
                        .setPositiveButton(getString(R.string.dialog_ok), null)
                        .setNegativeButton(getString(R.string.dialog_cancel), null)
                        .setNeutralButton(getString(R.string.dialog_neutral), null)
                        .show();

                break;

            case R.id.btn_dialog_2:
                new AlertDialog.Builder(getContext())
                        .setTitle("Second")
                        .setMessage("很不错的小零食，价格一般般，味道就还可以，是和鞋带在办公室，饿的时候来一个，去的时候根本停不下来，吃了一个就会想吃第2个，嗯，数量足，发货快，整体还是非常不错的，买牌子的放心一点，至少不会加大量的不明的添加剂。超级满足，配茶吃当点心或者配牛奶当早餐都很好。")
                        .setPositiveButton(getString(R.string.dialog_ok), null)
                        .setNegativeButton(getString(R.string.dialog_cancel), null)
                        .setNeutralButton(getString(R.string.dialog_neutral), null)
                        .show();
                break;

            case R.id.btn_dialog_3:
                new AlertDialog.Builder(getContext())
                        .setTitle("Third")
                        .setMessage("作为祖国的花朵，第一吃螺丝粉儿，没什么感觉啊。味道不错，特别香。酸酸辣辣的，上面建议的吃法说的是要把粉条先煮十分钟，不过我搞不懂到底是冷水下锅之后十分钟还是开水下锅十分钟，我是冷水下锅，然后吃起来就感觉很硬？放那个调料包一定不要把醋一次性倒完，不然真的是酸得打摆摆。那个辣油真的是有点味。")
                        .setPositiveButton(getString(R.string.dialog_ok), null)
                        .setNegativeButton(getString(R.string.dialog_cancel), null)
                        .setNeutralButton(getString(R.string.dialog_neutral), null)
                        .show();

                break;

            case R.id.btn_dialog_4:
                new AlertDialog.Builder(getContext())
                        .setTitle("Fourth")
                        .setMessage("味道真的不错，朋友都喜欢吃。今天还是比较幸运的，去了没有排队，坐下之后人瞬间好多。不过感觉涮菜吃的时候有点咸了，不过量绝对是够的。心里还觉得一个价钱不知道怎么样，结果是感觉比想象中令人满意，希望店家多搞活动，下次会再团。")
                        .setPositiveButton(getString(R.string.dialog_ok), null)
                        .setNegativeButton(getString(R.string.dialog_cancel), null)
                        .setNeutralButton(getString(R.string.dialog_neutral), null)
                        .show();

                break;

            case R.id.btn_dialog_5:
                new AlertDialog.Builder(getContext())
                        .setTitle("Fifth")
                        .setMessage("味道超赞，而且一看就让人觉得很有食欲，但是分量不大，属于比较精致的类型。胜在菜品也很新鲜，味道咸淡适中，而且火候掌握的刚好。上菜速度很快。就是用餐环境还需要改善，但是价格非常实惠，基本隔段时间就会来一次。")
                        .setPositiveButton(getString(R.string.dialog_ok), null)
                        .setNegativeButton(getString(R.string.dialog_cancel), null)
                        .setNeutralButton(getString(R.string.dialog_neutral), null)
                        .show();

                break;

            case R.id.btn_dialog_6:
                new AlertDialog.Builder(getContext())
                        .setTitle("Sixth")
                        .setMessage("锅贴煎饺是在韭菜煎饺的基础上再加工的美食，汤汁经过这一工序已消失殆尽，味道煎香可口；马蹄糕在我看来就是红糖发糕，软软糯糯的，口齿留香。")
                        .setPositiveButton(getString(R.string.dialog_ok), null)
                        .setNegativeButton(getString(R.string.dialog_cancel), null)
                        .setNeutralButton(getString(R.string.dialog_neutral), null)
                        .show();

                break;

            case R.id.btn_dialog_7:
                new AlertDialog.Builder(getContext())
                        .setTitle("Seventh")
                        .setMessage("粤菜：它以选料广泛，选料精细，讲究鲜、嫩、爽、滑、浓为主要特点。")
                        .setPositiveButton(getString(R.string.dialog_ok), null)
                        .setNegativeButton(getString(R.string.dialog_cancel), null)
                        .setNeutralButton(getString(R.string.dialog_neutral), null)
                        .show();

                break;

            case R.id.btn_dialog_8:
                new AlertDialog.Builder(getContext())
                        .setTitle("Eighth ")
                        .setMessage("浙菜：选料讲究，烹饪独到，注重本味，制作精细。选料讲究，就是做到“细、特、鲜、嫩”4条原则。")
                        .setPositiveButton(getString(R.string.dialog_ok), null)
                        .setNegativeButton(getString(R.string.dialog_cancel), null)
                        .setNeutralButton(getString(R.string.dialog_neutral), null)
                        .show();

                break;

//            case R.id.btn_dialog_9:
//                BottomSheetDialog mBottomSheetDialog = new BottomSheetDialog(getContext());
//                View dialogView = getActivity().getLayoutInflater().inflate(R.layout.dialog_bottom_sheet, null);
//                Button btn_dialog_bottom_sheet_ok = dialogView.findViewById(R.id.btn_dialog_bottom_sheet_ok);
//                Button btn_dialog_bottom_sheet_cancel = dialogView.findViewById(R.id.btn_dialog_bottom_sheet_cancel);
//                ImageView img_bottom_dialog = dialogView.findViewById(R.id.img_bottom_dialog);
//                Glide.with(getContext()).load(R.drawable.bottom_dialog).into(img_bottom_dialog);
//                mBottomSheetDialog.setContentView(dialogView);
//                btn_dialog_bottom_sheet_ok.setOnClickListener(v -> mBottomSheetDialog.dismiss());
//                btn_dialog_bottom_sheet_cancel.setOnClickListener(v -> mBottomSheetDialog.dismiss());
//                mBottomSheetDialog.show();
//                break;
//
//            case R.id.btn_dialog_10:
//                Dialog fullscreenDialog = new Dialog(getContext(), R.style.DialogFullscreen);
//                fullscreenDialog.setContentView(R.layout.dialog_fullscreen);
//                ImageView img_full_screen_dialog = fullscreenDialog.findViewById(R.id.img_full_screen_dialog);
//                Glide.with(getContext()).load(R.drawable.google_assistant).into(img_full_screen_dialog);
//                Toolbar toolbar_full_screen_dialog = fullscreenDialog.findViewById(R.id.toolbar_full_screen_dialog);
//                toolbar_full_screen_dialog.setNavigationOnClickListener(v -> {
//                    fullscreenDialog.dismiss();
//                });
//                fullscreenDialog.show();
//                break;
//
            case R.id.btn_dialog_11:
                new AlertDialog.Builder(getContext())
                        .setTitle("Ninth")
                        .setMessage("湘菜：以熏、蒸、干炒为主，口味重于酸、辣， 辣味菜和烟熏腊肉是湘菜的独特风味。")
                        .setPositiveButton(getString(R.string.dialog_ok), null)
                        .setNegativeButton(getString(R.string.dialog_cancel), null)
                        .setNeutralButton(getString(R.string.dialog_neutral), null)
                        .show();

                break;

        }
    }

    private void showAd() {
        try {
            SharedPreferences sharedPreferences = getContext().getSharedPreferences("app", MODE_PRIVATE);
            if (!sharedPreferences.getBoolean("isDonated", false)) {
                AdRequest adRequest = new AdRequest.Builder().build();
                ad_view_dialog.loadAd(adRequest);

                Animation animation = new AlphaAnimation(0.0f, 1.0f);
                animation.setDuration(500);
                card_ad_dialog.setVisibility(View.VISIBLE);
                card_ad_dialog.startAnimation(animation);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
