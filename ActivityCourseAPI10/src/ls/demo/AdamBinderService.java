package ls.demo;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;

public class AdamBinderService extends Service {

	//接口对象
	IBinder mMyBinder=new MyBinder();
	
	//定义Binder接口实现
	class MyBinder extends Binder{
		
		public AdamBinderService getService(){
			return AdamBinderService.this;
		}
		
		public String helloWorld(String name){
			return "Your name is:"+name;
		}
	}
		
		
	@Override
	public boolean onUnbind(Intent intent) {
		// TODO Auto-generated method stub
		Log.i("ls log", "AdamBinderService onUnBind");
		return super.onUnbind(intent);
	}

	@Override
	public IBinder onBind(Intent arg0) {
		// TODO Auto-generated method stub
		Log.i("ls log", "AdamBinderService onBind");
		//暴露MyBinder接口定义
		return mMyBinder;
	}

	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		Log.i("ls log", "AdamBinderService onStartCreate");
		super.onCreate();
	}

	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		Log.i("ls log", "AdamBinderService onDestory");
		super.onDestroy();
	}
	
	public void helloService(){
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
				Log.i("ls log", i+"");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
	}
	
	
}
