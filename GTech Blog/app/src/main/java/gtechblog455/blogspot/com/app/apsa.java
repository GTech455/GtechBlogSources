package gtechblog455.blogspot.com.app;
import android.app.*;
import android.content.*;
import android.media.*;
import android.net.*;
import android.os.*;
import android.widget.*;
import android.support.v7.app.AlertDialog;
import gtechblog455.blogspot.com.app.gtech_blog_adapter_list.ad;
import java.io.*;
import android.view.*;
import android.support.v4.app.*;

public class apsa extends ListActivity
{
InputStream r;
MediaPlayer md;
Uri a;
Intent dl;
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO: Implement this method
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ap);
		getActionBar().setDisplayHomeAsUpEnabled(true);
		getWindow().setBackgroundDrawableResource(R.raw.bg);
		int[] rs = {
			R.drawable.talkback_ic,
			R.drawable.ideal_ic,
			R.drawable.ideal_ic,
		};
		String[] lt = {
			"Síntese de voz Google",
			"Google TalkBack",
			"IDEAL Accessible App Installer"
		};
		setListAdapter(new ad(this, lt, rs));
	}
	String apsa3(){
		r = getResources().openRawResource(R.raw.apsa3);
		ByteArrayOutputStream c = new ByteArrayOutputStream();
		int i;
		try{
			i = r.read();
			while(i != -1){
				c.write(i);
				i = r.read();
			}
			c.close();
		} catch(IOException e){
		}
		return c.toString();
	}
	String apsa2(){
		r = getResources().openRawResource(R.raw.apsa2);
		ByteArrayOutputStream c = new ByteArrayOutputStream();
		int i;
		try{
			i = r.read();
			while(i != -1){
				c.write(i);
				i = r.read();
			}
			c.close();
		} catch(IOException e){
		}
		return c.toString();
	}
	String apsa1(){
		r = getResources().openRawResource(R.raw.apsa1);
		ByteArrayOutputStream c = new ByteArrayOutputStream();
		int i;
		try{
			i = r.read();
			while(i != -1){
				c.write(i);
				i = r.read();
			}
			c.close();
		} catch(IOException e){
		}
		return c.toString();
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id)
	{
		// TODO: Implement this method
		super.onListItemClick(l, v, position, id);
		final MediaPlayer md = MediaPlayer.create(apsa.this, R.raw.click_);
		md.start();
		Object o = this.getListAdapter().getItem(position);
		final String lp = o.toString();
		if(lp.toString() == "Síntese de voz Google"){
			AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
			bd.setTitle(lp);
			bd.setIcon(R.drawable.ic_launcher);
			bd.setMessage(apsa3());
			bd.setPositiveButton("Baixar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						MediaPlayer md = MediaPlayer.create(apsa.this, R.raw.click_);
						md.start();
						a = a.parse("https://play.google.com/store/apps/details?id=com.google.android.tts");
						dl = new Intent(dl.ACTION_VIEW, a);
						startActivity(dl);
					}
				});
			bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vu){
						MediaPlayer md = MediaPlayer.create(apsa.this, R.raw.click_);
						md.start();
						Toast.makeText(apsa.this, "Instalacao de " + lp + " Cancelada!!", Toast.LENGTH_LONG).show();
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Google TalkBack"){
			AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
			bd.setTitle(lp);
			bd.setIcon(R.drawable.ic_launcher);
			bd.setMessage(apsa2());
			bd.setPositiveButton("Baixar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						MediaPlayer md = MediaPlayer.create(apsa.this, R.raw.click_);
						md.start();
						a = a.parse("https://play.google.com/store/apps/details?id=com.google.android.marvin.talkback");
						dl = new Intent(dl.ACTION_VIEW, a);
						startActivity(dl);
					}
				});
			bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vu){
						MediaPlayer md = MediaPlayer.create(apsa.this, R.raw.click_);
						md.start();
						Toast.makeText(apsa.this, "Instalacao de " + lp + " Cancelada!!", Toast.LENGTH_LONG).show();
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "IDEAL Accessible App Installer"){
			AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
			bd.setTitle(lp);
			bd.setIcon(R.drawable.ic_launcher);
			bd.setMessage(apsa1());
			bd.setPositiveButton("Baixar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						MediaPlayer md = MediaPlayer.create(apsa.this, R.raw.click_);
						md.start();
						a = a.parse("https://play.google.com/store/apps/details?id=com.ideal.backbundle");
						dl = new Intent(dl.ACTION_VIEW, a);
						startActivity(dl);
					}
				});
			bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vu){
						MediaPlayer md = MediaPlayer.create(apsa.this, R.raw.click_);
						md.start();
						Toast.makeText(apsa.this, "Instalacao de " + lp + " Cancelada!!", Toast.LENGTH_LONG).show();
					}
				});
			bd.create();
			bd.show();
		}
	}
	public void ref(View v){
		a = a.parse("http://www.4shared.com/mobile/7WcYrbROba/gtech_blog.html");
		dl = new Intent(dl.ACTION_VIEW, a);
		startActivity(dl);
		MediaPlayer md = MediaPlayer.create(apsa.this, R.raw.click_);
		md.start();
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
