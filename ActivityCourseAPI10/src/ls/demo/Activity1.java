package ls.demo;




import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;


public class Activity1 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.layout_activity1);
		
		//this.getWindow().setContentView(this.getLayoutInflater().inflate(R.layout.layout_activity1, null));
	
		Button _button=(Button) this.findViewById(R.id.buttonStartA);
		_button.setText("ls       ");
		
		Button _newButton=new Button(this);
		_newButton.setText("Phone button");
		
		LinearLayout _ll=(LinearLayout) findViewById(R.id.linerLayout1);
		_ll.addView(_newButton,LayoutParams.WRAP_CONTENT,LayoutParams.WRAP_CONTENT);
		
		_button.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Log.i("ls","Button1 clicked");
//				Toast.makeText(Activity1.this, "Button Clicked", 4000).show();
				
//				Intent _intent=new Intent(Activity1.this,RoseActivity.class);
				
				Intent _intent=new Intent();
				_intent.setAction("ls.demo.WATCHMOVIE");
				_intent.setData(Uri.parse("http://www.baidu.com"));
				_intent.putExtra("ls.demo.LSKEY", "���");
				
//				startActivity(_intent);
				
				startActivityForResult(_intent, 1234); 
			}
			
		});
		
		
		
		
		/*_newButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent _intent2=new Intent();
//				_intent2.setAction(Intent.ACTION_DIAL);
				_intent2.setAction(Intent.ACTION_CALL);
				_intent2.setData(Uri.parse("tel:1234"));
				startActivity(_intent2);
			}
		});*/
	}
	
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, data);
		
		if(resultCode == 4321){
			String _resultValue=data.getExtras().getString("ls.demo.LSKEY");
			
			Toast.makeText(this, _resultValue, Toast.LENGTH_LONG).show();
		}
		
	}
	
}
//123
//456
//789