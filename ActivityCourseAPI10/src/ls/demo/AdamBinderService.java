package ls.demo;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;

public class AdamBinderService extends Service {

	//�ӿڶ���
	IBinder mMyBinder=new MyBinder();
	
	//����Binder�ӿ�ʵ��
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
		//��¶MyBinder�ӿڶ���
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
