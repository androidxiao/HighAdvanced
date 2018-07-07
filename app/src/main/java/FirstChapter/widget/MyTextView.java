package FirstChapter.widget;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;

/**
 * Created by chawei on 2018/6/8.
 */

public class MyTextView extends android.support.v7.widget.AppCompatTextView {

    public static final String TAG = "MyTextView";
    
    public MyTextView(Context context) {
        super(context);
    }

    public MyTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.d(TAG, "dispatchTouchEvent: ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.d(TAG, "dispatchTouchEvent: ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.d(TAG, "dispatchTouchEvent: ACTION_UP");
                break;
            case MotionEvent.ACTION_CANCEL:
                Log.d(TAG, "dispatchTouchEvent: ACTION_CANCEL");
                break;
                default:
                    break;
        }
        return super.dispatchTouchEvent(event);//往下分发
//        return false;//不会往下分发，且只执行自己的 action_down 事件
//        return true;//不会往下分发，顺序执行自己的 action_down -> action_move -> action_up 事件
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.d(TAG, "onTouchEvent: ACTION_DOWN");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.d(TAG, "onTouchEvent: ACTION_MOVE");
                break;
            case MotionEvent.ACTION_UP:
                Log.d(TAG, "onTouchEvent: ACTION_UP");
                break;
            case MotionEvent.ACTION_CANCEL:
                Log.d(TAG, "onTouchEvent: ACTION_CANCEL");
                break;
                default:
                    break;
        }
//        return  false;//同 super.onTouchEvent(event);
        return super.onTouchEvent(event);//只执行自身的 action_down 事件，不消耗事件，事件会回传回去，如果都不处理，会被 Activity onTouchEvent 消耗
//        return true;//消费事件，顺序执行 action_down -> action_move -> action_up 事件
    }
}
