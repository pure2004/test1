package ls.demo;


import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;

public class AdamService extends Service {
	
	
	static int mIndex=0;
	
	public void helloService(){
		Log.i("ls log", "ok");
	}
	
	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		Log.i("ls log", "AdamService onCreate"+(++mIndex));
		super.onCreate();
		
	}

	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		Log.i("ls log", "AdamService onDestroy");
		super.onDestroy();
	}

	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
		// TODO Auto-generated method stub
		Log.i("ls log", "AdamService onStartCommand");
		new Thread (new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				helloService();
			}
		}).start();
		return super.onStartCommand(intent, flags, startId);
	}
	
	//接口对象
	IBinder mMyBinder=new MyBinder();
	
	//定义Binder接口实现
	class MyBinder extends Binder{
		
		public AdamService getService(){
			return AdamService.this;
		}
		
		public String helloWorld(String name){
			return "Your name is:"+name;
		}
	} 
	@Override
	public boolean onUnbind(Intent intent) {
		// TODO Auto-generated method stub
		Log.i("ls log", "AdamService onUnbind");
		return super.onUnbind(intent);
	}

	@Override
	public IBinder onBind(Intent intent) {
		// TODO Auto-generated method stub
		Log.i("ls log", "AdamService onBind");
		return mMyBinder;
	}

}
