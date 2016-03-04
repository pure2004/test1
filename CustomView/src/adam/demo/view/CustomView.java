package adam.demo.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.Log;
import android.view.KeyEvent;
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
		
		Paint _paint=new Paint();
		_paint.setColor(Color.RED);
		
		canvas.drawRect(100, 100, 900, 900, _paint);
		
		_paint.setColor(Color.BLACK);
		canvas.drawText("Hello World", 200, 200, _paint);
		
	}
	
	
	
}
