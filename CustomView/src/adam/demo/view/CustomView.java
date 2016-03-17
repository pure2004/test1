package adam.demo.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;

public class CustomView extends View {

	public CustomView(Context context) {
		super(context);
		setFocusable(true);
		setFocusableInTouchMode(true);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean onKeyUp(int keyCode, KeyEvent event) {
		// TODO Auto-generated method stub
		if(keyCode==KeyEvent.KEYCODE_DPAD_CENTER){
			Log.i("ls log", "center clicked");
		}
		return super.onKeyUp(keyCode, event);
	}

	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		super.onDraw(canvas);
		
		/*//²Ã¼ôÇøÓòclip
		canvas.clipRect(50, 50, 300, 300);
		canvas.clipRect(100, 100, 400, 400);*/
		
		canvas.drawColor(Color.LTGRAY);
		
		Paint _paint=new Paint();
		_paint.setColor(Color.RED);
		
		//drawRect
		canvas.drawRect(10, 10, 900, 900, _paint);
		
		
		//drawOval
		_paint.setColor(Color.BLUE);
		_paint.setAntiAlias(true);
		RectF _oval=new RectF(20,20,800,400);
		canvas.drawOval(_oval, _paint);
		
		Matrix _matrix=new Matrix();
//		_matrix.setRotate(30.0f);
		_matrix.setScale(4, 4);
		canvas.setMatrix(_matrix);
		
		//drawText
		_paint.setColor(Color.WHITE);
		canvas.drawText("Hello World", 100, 200, _paint);
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		// TODO Auto-generated method stub
		if(event.getAction()==MotionEvent.ACTION_UP){
			Log.i("ls log", "CustomView OnTouchEvent ACTION_UP");
			if(event.getEventTime()-event.getDownTime()> 2000){
				Log.i("ls log", "CustomView OnTouchEvent Long Clicked");
			}
		}
		if(event.getAction()==MotionEvent.ACTION_DOWN){
			Log.i("ls log", "CustomView OnTouchEvent ACTION_DOWN");
		}
		return super.onTouchEvent(event);
	}
	
	
	
}
