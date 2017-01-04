package gtechblog455.blogspot.com.app;
import android.app.*;
import android.os.*;
import android.net.*;
import android.text.method.*;
import android.content.*;
import android.content.*;
import android.support.v7.app.AlertDialog;
import gtechblog455.blogspot.com.app.gtech_blog_adapter_list.ad;
import java.io.*;
import java.util.*;
import android.media.*;
import android.widget.*;
import android.view.*;
import android.support.v4.app.*;

public class extras extends ListActivity
{
	Uri a;
	Intent dl;
	MediaPlayer md;
	InputStream r;
	ByteArrayOutputStream c;
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		// TODO: Implement this method
		super.onCreate(savedInstanceState);
		setContentView(R.layout.as);
		getActionBar().setDisplayHomeAsUpEnabled(true);
		getWindow().setBackgroundDrawableResource(R.raw.bg);
		Toast.makeText(this, "Apenas na tela horizontal!!", Toast.LENGTH_LONG).show();
		int[] rs = {
			R.drawable.win8,
			R.drawable.win10,
		};
		String[] lt  = {
			"Windows 8.1 32/64bits",
			"Windows 10 32/64bits",
		};
		setListAdapter(new ad(this, lt, rs));
	}
	String extr2(){
		r = getResources().openRawResource(R.raw.extr1);
		c = new ByteArrayOutputStream();
		int i;
		try{
			i = r.read();
			while(i != -1){
				c.write(i);
				i = r.read();
			}
			c.close();
		} catch(IOException s){
		}
		return c.toString();
	}
String extr1(){
		r = getResources().openRawResource(R.raw.extr2);
		c = new ByteArrayOutputStream();
		int i;
		try{
			i = r.read();
			while(i != -1){
				c.write(i);
				i = r.read();
			}
			c.close();
		} catch(IOException s){
		}
		return c.toString();
	}
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id)
	{
		// TODO: Implement this method
		super.onListItemClick(l, v, position, id);
		Object o = getListAdapter().getItem(position);
		final String lp = o.toString();
		md = md.create(extras.this, R.raw.click_);
		md.start();
		if(lp.toString() == "Windows 8.1 32/64bits"){
			AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
			bd.setTitle(lp);
			bd.setIcon(R.raw.exe);
			bd.setMessage(extr2());
			bd.setNeutralButton("Baixar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int ci){
						md = md.create(extras.this, R.raw.click_);
						md.start();
						a = a.parse("https://www.microsoft.com/pt-br/software-download/windows8");
						dl = new Intent(dl.ACTION_VIEW, a);
						startActivity(dl);
					}
				});
			bd.setPositiveButton("Screen", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						md = md.create(extras.this, R.raw.click_);
						md.start();
						LayoutInflater li = getLayoutInflater();
						View v = li.inflate(R.layout.ixt2, null);
						AlertDialog.Builder bd = new AlertDialog.Builder(extras.this, R.style.alert);
						bd.setView(v);
						bd.create();
						bd.show();
					}
				});
			bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vk){
						Toast.makeText(extras.this, "Download de " + lp + " cancelado!!", Toast.LENGTH_LONG).show();
						md = md.create(extras.this, R.raw.click_);
						md.start();
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Windows 10 32/64bits"){
			AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
			bd.setTitle(lp);
			bd.setIcon(R.raw.exe);
			bd.setMessage(extr1());
			bd.setNeutralButton("Baixar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int ci){
						md = md.create(extras.this, R.raw.click_);
						md.start();
						a = a.parse("https://www.microsoft.com/pt-br/software-download/windows10");
						dl = new Intent(dl.ACTION_VIEW, a);
						startActivity(dl);
					}
				});
			bd.setPositiveButton("Screen", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						md = md.create(extras.this, R.raw.click_);
						md.start();
						LayoutInflater li = getLayoutInflater();
						View v = li.inflate(R.layout.ixt1, null);
						AlertDialog.Builder bd = new AlertDialog.Builder(extras.this, R.style.alert);
						bd.setView(v);
						bd.create();
						bd.show();
					}
				});
			bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vk){
						Toast.makeText(extras.this, "Download de " + lp + " cancelado!!", Toast.LENGTH_LONG).show();
						md = md.create(extras.this, R.raw.click_);
						md.start();
					}
				});
			bd.create();
			bd.show();
		}
	}
	public void ref(View v){
		MediaPlayer md = MediaPlayer.create(extras.this, R.raw.click_);
		md.start();
		a = a.parse("http://www.4shared.com/mobile/7WcYrbROba/gtech_blog.html");
		dl = new Intent(dl.ACTION_VIEW, a);
		startActivity(dl);
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
