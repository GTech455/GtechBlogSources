package gtechblog455.blogspot.com.app;
import android.app.*;
import android.content.*;
import android.content.res.*;
import android.media.*;
import android.net.*;
import android.os.*;
import android.support.v4.app.*;
import android.support.v7.app.*;
import android.view.*;
import android.widget.*;
import gtechblog455.blogspot.com.app.gtech_blog_adapter_list.*;
import java.io.*;

import android.support.v7.app.AlertDialog;
public class aps extends ListActivity
{
Intent dl;
Uri a;
	InputStream r;
	AssetManager as;
	MediaPlayer md;
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		// TODO: Implement this method
		super.onCreate(savedInstanceState);
		setContentView(R.layout.win);
		getActionBar().setDisplayHomeAsUpEnabled(true);
		getWindow().setBackgroundDrawableResource(R.raw.bg);
		int[] rs = {
			R.drawable.putty_ic,
			R.drawable.winanp_ic,
			R.drawable.atube_ic,
			R.drawable.ftp_ic,
			R.drawable.qube_ic,
			R.raw.exe,
			R.drawable.revo_ic,
			R.drawable.adw_ic,
			R.drawable.dos_ic,
		};
		String[] lt = {
			"PuTTy",
			"Winamp Portatil",
			"aTube Catcher",
			"CuteFTP Professional",
			"The Qube 0.8",
			"Ativador e desativador do UAC do Windows",
			"RevoUninstaller1.94Portable",
			"adwcleaner v4.106",
			"Dosvox v4.5 para Windows de 32bytes"
		};
		setListAdapter(new ad(this, lt, rs));
	}
	String aps9(){
		r = getResources().openRawResource(R.raw.aps9);
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
	String aps8(){
		r = getResources().openRawResource(R.raw.aps8);
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
	String aps7(){
		r = getResources().openRawResource(R.raw.aps7);
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
	String aps6(){
		r = getResources().openRawResource(R.raw.aps6);
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
	String aps5(){
		r = getResources().openRawResource(R.raw.aps5);
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
	String aps4(){
		r = getResources().openRawResource(R.raw.aps4);
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
	String aps3(){
		r = getResources().openRawResource(R.raw.aps3);
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
	String aps2(){
		r = getResources().openRawResource(R.raw.aps2);
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
	String aps1(){
		r = getResources().openRawResource(R.raw.aps1);
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
		Object o = getListAdapter().getItem(position);
		final String lp = o.toString();
		md = MediaPlayer.create(aps.this, R.raw.click_);
		md.start();
		if(lp.toString() == "Winamp Portatil"){
			AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
			bd.setTitle(lp);
			bd.setIcon(R.raw.exe);
			bd.setMessage(aps9());
			bd.setNeutralButton("Baixar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						MediaPlayer md = MediaPlayer.create(aps.this, R.raw.click_);
						md.start();
						a = a.parse("http://www.mundocegal.com.br/programas/winampportable.exe");
						dl = new Intent(dl.ACTION_VIEW, a);
						startActivity(dl);
					}
				});
			bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						md = MediaPlayer.create(aps.this, R.raw.click_);
						md.start();
						Toast.makeText(aps.this, "Download de " + lp + " cancelado!!", Toast.LENGTH_LONG).show();
					}
				});
			bd.setPositiveButton("Screen", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						md = MediaPlayer.create(aps.this, R.raw.click_);
						md.start();
						LayoutInflater y = getLayoutInflater();
						View view = y.inflate(R.layout.imps9, null);
						AlertDialog.Builder bd = new AlertDialog.Builder(aps.this, R.style.alert);
						bd.setView(view);
						bd.create();
						bd.show();
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "PuTTy"){
			AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
			bd.setTitle(lp);
			bd.setIcon(R.raw.exe);
			bd.setMessage(aps8());
			bd.setNeutralButton("Baixar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						MediaPlayer md = MediaPlayer.create(aps.this, R.raw.click_);
						md.start();
						a = a.parse("http://www.mundocegal.com.br/programas/putty.exe");
						dl = new Intent(dl.ACTION_VIEW, a);
						startActivity(dl);
					}
				});
			bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						md = MediaPlayer.create(aps.this, R.raw.click_);
						md.start();
						Toast.makeText(aps.this, "Download de " + lp + " cancelado!!", Toast.LENGTH_LONG).show();
					}
				});
			bd.setPositiveButton("Screen", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						md = MediaPlayer.create(aps.this, R.raw.click_);
						md.start();
						LayoutInflater y = getLayoutInflater();
						View view = y.inflate(R.layout.imps8, null);
						AlertDialog.Builder bd = new AlertDialog.Builder(aps.this, R.style.alert);
						bd.setView(view);
						bd.create();
						bd.show();
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "aTube Catcher"){
			AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
			bd.setTitle(lp);
			bd.setIcon(R.raw.exe);
			bd.setMessage(aps7());
			bd.setNeutralButton("Baixar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						MediaPlayer md = MediaPlayer.create(aps.this, R.raw.click_);
						md.start();
						a = a.parse("http://www.mundocegal.com.br/programas/atubecatcher.exe");
						dl = new Intent(dl.ACTION_VIEW, a);
						startActivity(dl);
					}
				});
			bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						md = MediaPlayer.create(aps.this, R.raw.click_);
						md.start();
						Toast.makeText(aps.this, "Download de " + lp + " cancelado!!", Toast.LENGTH_LONG).show();
					}
				});
			bd.setPositiveButton("Screen", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						md = MediaPlayer.create(aps.this, R.raw.click_);
						md.start();
						LayoutInflater y = getLayoutInflater();
						View view = y.inflate(R.layout.imps7, null);
						AlertDialog.Builder bd = new AlertDialog.Builder(aps.this, R.style.alert);
						bd.setView(view);
						bd.create();
						bd.show();
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "CuteFTP Professional"){
			AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
			bd.setTitle(lp);
			bd.setIcon(R.raw.exe);
			bd.setMessage(aps6());
			bd.setNeutralButton("Baixar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						MediaPlayer md = MediaPlayer.create(aps.this, R.raw.click_);
						md.start();
						a = a.parse("http://www.mundocegal.com.br/programas/CuteFTP_Pro_8.3.4.0007.rar");
						dl = new Intent(dl.ACTION_VIEW, a);
						startActivity(dl);
					}
				});
			bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						md = MediaPlayer.create(aps.this, R.raw.click_);
						md.start();
						Toast.makeText(aps.this, "Download de " + lp + " cancelado!!", Toast.LENGTH_LONG).show();
					}
				});
			bd.setPositiveButton("Screen", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						md = MediaPlayer.create(aps.this, R.raw.click_);
						md.start();
						LayoutInflater y = getLayoutInflater();
						View view = y.inflate(R.layout.imps6, null);
						AlertDialog.Builder bd = new AlertDialog.Builder(aps.this, R.style.alert);
						bd.setView(view);
						bd.create();
						bd.show();
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "The Qube 0.8"){
			AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
			bd.setTitle(lp);
			bd.setIcon(R.raw.exe);
			bd.setMessage(aps5());
			bd.setNeutralButton("Baixar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						MediaPlayer md = MediaPlayer.create(aps.this, R.raw.click_);
						md.start();
						a = a.parse("http://www.mundocegal.com.br/programas/theqube8.zip");
						dl = new Intent(dl.ACTION_VIEW, a);
						startActivity(dl);
					}
				});
			bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						md = MediaPlayer.create(aps.this, R.raw.click_);
						md.start();
						Toast.makeText(aps.this, "Download de " + lp + " cancelado!!", Toast.LENGTH_LONG).show();
					}
				});
			bd.setPositiveButton("Screen", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						md = MediaPlayer.create(aps.this, R.raw.click_);
						md.start();
						LayoutInflater y = getLayoutInflater();
						View view = y.inflate(R.layout.imps5, null);
						AlertDialog.Builder bd = new AlertDialog.Builder(aps.this, R.style.alert);
						bd.setView(view);
						bd.create();
						bd.show();
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Ativador e desativador do UAC do Windows"){
			AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
			bd.setTitle(lp);
			bd.setIcon(R.raw.exe);
			bd.setMessage(aps4());
			bd.setNeutralButton("Baixar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						MediaPlayer md = MediaPlayer.create(aps.this, R.raw.click_);
						md.start();
						a = a.parse("http://www.mundocegal.com.br/programas/uac.rar");
						dl = new Intent(dl.ACTION_VIEW, a);
						startActivity(dl);
					}
				});
			bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						md = MediaPlayer.create(aps.this, R.raw.click_);
						md.start();
						Toast.makeText(aps.this, "Download de " + lp + " cancelado!!", Toast.LENGTH_LONG).show();
					}
				});
			bd.setPositiveButton("Screen", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						md = MediaPlayer.create(aps.this, R.raw.click_);
						md.start();
						LayoutInflater y = getLayoutInflater();
						View view = y.inflate(R.layout.imps4, null);
						AlertDialog.Builder bd = new AlertDialog.Builder(aps.this, R.style.alert);
						bd.setView(view);
						bd.create();
						bd.show();
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "RevoUninstaller1.94Portable"){
			AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
			bd.setTitle(lp);
			bd.setIcon(R.raw.exe);
			bd.setMessage(aps3());
			bd.setNeutralButton("Baixar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						MediaPlayer md = MediaPlayer.create(aps.this, R.raw.click_);
						md.start();
						a = a.parse("http://www.mundocegal.com.br/programas/RevoUninstaller1.94Portable.rar");
						dl = new Intent(dl.ACTION_VIEW, a);
						startActivity(dl);
					}
				});
			bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						md = MediaPlayer.create(aps.this, R.raw.click_);
						md.start();
						Toast.makeText(aps.this, "Download de " + lp + " cancelado!!", Toast.LENGTH_LONG).show();
					}
				});
			bd.setPositiveButton("Screen", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						md = MediaPlayer.create(aps.this, R.raw.click_);
						md.start();
						LayoutInflater y = getLayoutInflater();
						View view = y.inflate(R.layout.imps3, null);
						AlertDialog.Builder bd = new AlertDialog.Builder(aps.this, R.style.alert);
						bd.setView(view);
						bd.create();
						bd.show();
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "adwcleaner v4.106"){
			AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
			bd.setTitle(lp);
			bd.setIcon(R.raw.exe);
			bd.setMessage(aps2());
			bd.setNeutralButton("Baixar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						MediaPlayer md = MediaPlayer.create(aps.this, R.raw.click_);
						md.start();
						a = a.parse("http://www.mundocegal.com.br/programas/adwcleaner_4.106.exe");
						dl = new Intent(dl.ACTION_VIEW, a);
						startActivity(dl);
					}
				});
			bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						md = MediaPlayer.create(aps.this, R.raw.click_);
						md.start();
						Toast.makeText(aps.this, "Download de " + lp + " cancelado!!", Toast.LENGTH_LONG).show();
					}
				});
			bd.setPositiveButton("Screen", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						md = MediaPlayer.create(aps.this, R.raw.click_);
						md.start();
						LayoutInflater y = getLayoutInflater();
						View view = y.inflate(R.layout.imps2, null);
						AlertDialog.Builder bd = new AlertDialog.Builder(aps.this, R.style.alert);
						bd.setView(view);
						bd.create();
						bd.show();
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Dosvox v4.5 para Windows de 32bytes"){
			AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
			bd.setTitle(lp);
			bd.setIcon(R.raw.exe);
			bd.setMessage(aps1());
			bd.setNeutralButton("Baixar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						MediaPlayer md = MediaPlayer.create(aps.this, R.raw.click_);
						md.start();
						a = a.parse("http://www.intervox.nce.ufrj.br/dosvox/programas/dv45-setup.exe");
						dl = new Intent(dl.ACTION_VIEW, a);
						startActivity(dl);
					}
				});
			bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						md = MediaPlayer.create(aps.this, R.raw.click_);
						md.start();
						Toast.makeText(aps.this, "Download de " + lp + " cancelado!!", Toast.LENGTH_LONG).show();
					}
				});
			bd.setPositiveButton("Screen", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						md = MediaPlayer.create(aps.this, R.raw.click_);
						md.start();
						LayoutInflater y = getLayoutInflater();
						View view = y.inflate(R.layout.imps1, null);
						AlertDialog.Builder bd = new AlertDialog.Builder(aps.this, R.style.alert);
						bd.setView(view);
						bd.create();
						bd.show();
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
		MediaPlayer md = MediaPlayer.create(aps.this, R.raw.click_);
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
