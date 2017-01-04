package gtechblog455.blogspot.com.app;

import android.app.*;
import android.content.*;
import android.media.*;
import android.net.*;
import android.os.*;
import android.support.v4.app.*;
import android.view.*;
import android.widget.*;
import gtechblog455.blogspot.com.app.gtech_blog_adapter_list.ad;

public class JogosSinuca extends ListActivity
{
	MediaPlayer md;
	Uri a;
	Intent dl;
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO: Implement this method
		super.onCreate(savedInstanceState);
		getWindow().setBackgroundDrawableResource(R.raw.bg);
		getActionBar().setDisplayHomeAsUpEnabled(true);
		setContentView(R.layout.gm);
		int[] rs = {
			R.drawable.ball_pool,
			R.drawable.bilhar,
			R.drawable.ball,
			R.drawable.ball_pool,
		};
		String[] lt = {
			"Pool Ball Master",
			"Bilhar - Pool Billiards Pro",
			"9 Ball Pool Snooker 2017",
			"8 Ball Pool",
		};
		setListAdapter(new ad(this, lt, rs));
	}
	public void ref(View v){
		MediaPlayer md = MediaPlayer.create(JogosSinuca.this, R.raw.click_);
		md.start();
		a = a.parse("http://www.4shared.com/mobile/7WcYrbROba/gtech_blog.html");
		Intent dl = new Intent(Intent.ACTION_VIEW, a);
		startActivity(dl);
	}
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id)
	{
		// TODO: Implement this method
		super.onListItemClick(l, v, position, id);
		Object o = this.getListAdapter().getItem(position);
		String lp = o.toString();
		md = md.create(JogosSinuca.this, R.raw.click_);
		md.start();
		if(lp.toString() == "8 Ball Pool"){
			Toast.makeText(this, "Apenas Download!!", Toast.LENGTH_LONG).show();
			final String[] h ={
				"DOWNLOAD"
			};
			ArrayAdapter ad = new ArrayAdapter(this, R.layout.dl, R.id.tv, h);
			AlertDialog.Builder bd = new AlertDialog.Builder(this);
			bd.setSingleChoiceItems(ad, 0, new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						if(h[vi].toString() == "DOWNLOAD"){
							md = md.create(JogosSinuca.this, R.raw.click_);
							md.start();
							a = a.parse("https://play.google.com/store/apps/details?id=com.miniclip.eightballpool");
							dl = new Intent(dl.ACTION_VIEW, a);
							startActivity(dl);
						}
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "9 Ball Pool Snooker 2017"){
			Toast.makeText(this, "Apenas Download!!", Toast.LENGTH_LONG).show();
			final String[] h ={
				"DOWNLOAD"
			};
			ArrayAdapter ad = new ArrayAdapter(this, R.layout.dl, R.id.tv, h);
			AlertDialog.Builder bd = new AlertDialog.Builder(this);
			bd.setSingleChoiceItems(ad, 0, new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						if(h[vi].toString() == "DOWNLOAD"){
							md = md.create(JogosSinuca.this, R.raw.click_);
							md.start();
							a = a.parse("https://play.google.com/store/apps/details?id=com.FutureGamesStudiosInc.BallPoolSnooker2017");
							dl = new Intent(dl.ACTION_VIEW, a);
							startActivity(dl);
						}
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Bilhar - Pool Billiards Pro"){
			Toast.makeText(this, "Apenas Download!!", Toast.LENGTH_LONG).show();
			final String[] h ={
				"DOWNLOAD"
			};
			ArrayAdapter ad = new ArrayAdapter(this, R.layout.dl, R.id.tv, h);
			AlertDialog.Builder bd = new AlertDialog.Builder(this);
			bd.setSingleChoiceItems(ad, 0, new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						if(h[vi].toString() == "DOWNLOAD"){
							md = md.create(JogosSinuca.this, R.raw.click_);
							md.start();
							a = a.parse("https://play.google.com/store/apps/details?id=com.forthblue.pool");
							dl = new Intent(dl.ACTION_VIEW, a);
							startActivity(dl);
						}
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Pool Ball Master"){
			Toast.makeText(this, "Apenas Download!!", Toast.LENGTH_LONG).show();
			final String[] h ={
				"DOWNLOAD"
			};
			ArrayAdapter ad = new ArrayAdapter(this, R.layout.dl, R.id.tv, h);
			AlertDialog.Builder bd = new AlertDialog.Builder(this);
			bd.setSingleChoiceItems(ad, 0, new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						if(h[vi].toString() == "DOWNLOAD"){
							md = md.create(JogosSinuca.this, R.raw.click_);
							md.start();
							a = a.parse("https://play.google.com/store/apps/details?id=mplay.billiards.ball8.pool.free&referrer=utm_source%3Dgoogle%26utm_medium%3Dorganic%26utm_term%3D");
							dl = new Intent(dl.ACTION_VIEW, a);
							startActivity(dl);
						}
					}
				});
			bd.create();
			bd.show();
		}
	}
	public boolean onCreateOptionsMenu(Menu m){
		getMenuInflater().inflate(R.menu.util, m);
		return true;
	}
	public boolean onOptionsItemSelected(MenuItem i){
		switch(i.getItemId()){
			case android.R.id.home:
				NavUtils.navigateUpFromSameTask(this);
				return true;
			case R.id.fe:
				Intent fe = new Intent(Intent.ACTION_SEND);
				fe.setType("text/plain");
				fe.putExtra(Intent.EXTRA_EMAIL, new String[]
							{"dthhack@gmail.com"});
				fe.putExtra(Intent.EXTRA_SUBJECT, "Reportar Erros");
				fe.putExtra(Intent.EXTRA_TEXT, "Explique o erro...");
				startActivity(Intent.createChooser(fe, "Por favor, selecione \n seu provedor de Email e me\n envie sua sujestão..."));
				return true;
		}
		return true;
	}
}
