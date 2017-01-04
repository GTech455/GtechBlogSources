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
public class ass extends ListActivity
{
	Uri a;
	Intent dl;
	MediaPlayer md;
	InputStream r;
	ByteArrayOutputStream c;
	public void onCreate(Bundle m){
		super.onCreate(m);
		setContentView(R.layout.as);
		getActionBar().setDisplayHomeAsUpEnabled(true);
		getWindow().setBackgroundDrawableResource(R.raw.bg);
		Toast.makeText(this, "Apenas na tela horizontal!!", Toast.LENGTH_LONG).show();
		String[] lt = {
		"zDevStudio - Z80 Development Studio",
		"Blodsheed Dev-Pascal",
		"Visual C++ 2012 Express Edition",
		"Visual C++ 2010 Express Edition",
		"Visual C++ 2005 Express Edition",
		"Borland Dev C++ Compiler",
		"Blodsheed Dev C++ Compiler",
		};
		int[] rs = {
			R.drawable.zdev,
			R.drawable.blood,
			R.drawable.visual2012,
			R.drawable.visual2010,
			R.drawable.visual2005,
			R.drawable.borland,
			R.drawable.blood,
		};
		setListAdapter(new ad(this, lt, rs));
	}
	String ass7(){
		r = getResources().openRawResource(R.raw.ass7);
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
	String ass6(){
		r = getResources().openRawResource(R.raw.ass6);
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
	String ass5(){
		r = getResources().openRawResource(R.raw.ass5);
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
	String ass4(){
		r = getResources().openRawResource(R.raw.ass4);
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
	String ass3(){
		r = getResources().openRawResource(R.raw.ass3);
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
	String ass2(){
		r = getResources().openRawResource(R.raw.ass2);
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
	String ass1(){
		r = getResources().openRawResource(R.raw.ass1);
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
		md = md.create(ass.this, R.raw.click_);
		md.start();
		if(lp.toString() == "zDevStudio - Z80 Development Studio"){
			AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
			bd.setTitle(lp);
			bd.setIcon(R.raw.exe);
			bd.setMessage(ass7());
			bd.setNeutralButton("Baixar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int ci){
						md = md.create(ass.this, R.raw.click_);
						md.start();
						a = a.parse("https://sourceforge.net/projects/zdevstudio/files/latest/download?source=directory");
						dl = new Intent(dl.ACTION_VIEW, a);
						startActivity(dl);
					}
				});
			bd.setPositiveButton("Screen", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						md = md.create(ass.this, R.raw.click_);
						md.start();
						LayoutInflater li = getLayoutInflater();
						View v = li.inflate(R.layout.ims7, null);
						AlertDialog.Builder bd = new AlertDialog.Builder(ass.this, R.style.alert);
						bd.setView(v);
						bd.create();
						bd.show();
					}
				});
			bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vk){
						Toast.makeText(ass.this, "Download de " + lp + " cancelado!!", Toast.LENGTH_LONG).show();
						md = md.create(ass.this, R.raw.click_);
						md.start();
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Blodsheed Dev C++ Compiler"){
			AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
			bd.setTitle(lp);
			bd.setIcon(R.raw.exe);
			bd.setMessage(ass6());
			bd.setNeutralButton("Baixar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int ci){
						md = md.create(ass.this, R.raw.click_);
						md.start();
						a = a.parse("http://www.superdownloads.com.br/download/199/bloodshed-dev-c/redir-32-bits.html");
						dl = new Intent(dl.ACTION_VIEW, a);
						startActivity(dl);
					}
				});
			bd.setPositiveButton("Screen", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						md = md.create(ass.this, R.raw.click_);
						md.start();
						LayoutInflater li = getLayoutInflater();
						View v = li.inflate(R.layout.ims6, null);
						AlertDialog.Builder bd = new AlertDialog.Builder(ass.this, R.style.alert);
						bd.setView(v);
						bd.create();
						bd.show();
					}
				});
			bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vk){
						Toast.makeText(ass.this, "Download de " + lp + " cancelado!!", Toast.LENGTH_LONG).show();
						md = md.create(ass.this, R.raw.click_);
						md.start();
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Borland Dev C++ Compiler"){
			AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
			bd.setTitle(lp);
			bd.setIcon(R.raw.exe);
			bd.setMessage(ass5());
			bd.setNeutralButton("Baixar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int ci){
						md = md.create(ass.this, R.raw.click_);
						md.start();
						a = a.parse("http://www.google.com.br/imgres?imgurl=http://www.tarma.com/articles/1996sep_fig2_full.gif&imgrefurl=http://www.tarma.com/articles/1996sep.htm&h=768&w=1024&tbnid=xghpfDZOLDO0CM:&q=borland+c%2B%2B+compiler&docid=CQFMdY0h3OEVtM&hl=pt-BR&ei=-UFHVvjLO4uiwgTg27KIBg&tbm=isch&ved=0CB0QMygAMABqFQoTCLis4vOMkMkCFQuRkAod4K0MYQ");
						dl = new Intent(dl.ACTION_VIEW, a);
						startActivity(dl);
					}
				});
			bd.setPositiveButton("Screen", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						md = md.create(ass.this, R.raw.click_);
						md.start();
						LayoutInflater li = getLayoutInflater();
						View v = li.inflate(R.layout.ims5, null);
						AlertDialog.Builder bd = new AlertDialog.Builder(ass.this, R.style.alert);
						bd.setView(v);
						bd.create();
						bd.show();
					}
				});
			bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vk){
						Toast.makeText(ass.this, "Download de " + lp + " cancelado!!", Toast.LENGTH_LONG).show();
						md = md.create(ass.this, R.raw.click_);
						md.start();
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Visual C++ 2005 Express Edition"){
			AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
			bd.setTitle(lp);
			bd.setIcon(R.raw.exe);
			bd.setMessage(ass4());
			bd.setNeutralButton("Baixar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int ci){
						md = md.create(ass.this, R.raw.click_);
						md.start();
						a = a.parse(" http://www.superdownloads.com.br/download/24/visual-studio-2005-express/redir-32-bits.html");
						dl = new Intent(dl.ACTION_VIEW, a);
						startActivity(dl);
					}
				});
			bd.setPositiveButton("Screen", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						md = md.create(ass.this, R.raw.click_);
						md.start();
						LayoutInflater li = getLayoutInflater();
						View v = li.inflate(R.layout.ims4, null);
						AlertDialog.Builder bd = new AlertDialog.Builder(ass.this, R.style.alert);
						bd.setView(v);
						bd.create();
						bd.show();
					}
				});
			bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vk){
						Toast.makeText(ass.this, "Download de " + lp + " cancelado!!", Toast.LENGTH_LONG).show();
						md = md.create(ass.this, R.raw.click_);
						md.start();
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Visual C++ 2010 Express Edition"){
			AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
			bd.setTitle(lp);
			bd.setIcon(R.raw.exe);
			bd.setMessage(ass3());
			bd.setNeutralButton("Baixar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int ci){
						md = md.create(ass.this, R.raw.click_);
						md.start();
						a = a.parse("http://www.superdownloads.com.br/download/24/visual-studio-2010-express/redir-32-bits.html");
						dl = new Intent(dl.ACTION_VIEW, a);
						startActivity(dl);
					}
				});
			bd.setPositiveButton("Screen", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						md = md.create(ass.this, R.raw.click_);
						md.start();
						LayoutInflater li = getLayoutInflater();
						View v = li.inflate(R.layout.ims3, null);
						AlertDialog.Builder bd = new AlertDialog.Builder(ass.this, R.style.alert);
						bd.setView(v);
						bd.create();
						bd.show();
					}
				});
			bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vk){
						Toast.makeText(ass.this, "Download de " + lp + " cancelado!!", Toast.LENGTH_LONG).show();
						md = md.create(ass.this, R.raw.click_);
						md.start();
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Visual C++ 2012 Express Edition"){
			AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
			bd.setTitle(lp);
			bd.setIcon(R.raw.exe);
			bd.setMessage(ass2());
			bd.setNeutralButton("Baixar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int ci){
						md = md.create(ass.this, R.raw.click_);
						md.start();
						a = a.parse("http://www.superdownloads.com.br/download/24/visual-studio-2012-express/redir-32-bits.html");
						dl = new Intent(dl.ACTION_VIEW, a);
						startActivity(dl);
					}
				});
			bd.setPositiveButton("Screen", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						md = md.create(ass.this, R.raw.click_);
						md.start();
						LayoutInflater li = getLayoutInflater();
						View v = li.inflate(R.layout.ims2, null);
						AlertDialog.Builder bd = new AlertDialog.Builder(ass.this, R.style.alert);
						bd.setView(v);
						bd.create();
						bd.show();
					}
				});
			bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vk){
						Toast.makeText(ass.this, "Download de " + lp + " cancelado!!", Toast.LENGTH_LONG).show();
						md = md.create(ass.this, R.raw.click_);
						md.start();
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Blodsheed Dev-Pascal"){
			AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
			bd.setTitle(lp);
			bd.setIcon(R.raw.exe);
			bd.setMessage(ass1());
			bd.setNeutralButton("Baixar", new DialogInterface.OnClickListener(){
				public void onClick(DialogInterface d, int ci){
					md = md.create(ass.this, R.raw.click_);
					md.start();
					a = a.parse("http://www.superdownloads.com.br/download/153/dev-pascal/after-download-32-bits.html");
					dl = new Intent(dl.ACTION_VIEW, a);
					startActivity(dl);
				}
			});
			bd.setPositiveButton("Screen", new DialogInterface.OnClickListener(){
				public void onClick(DialogInterface d, int vi){
					md = md.create(ass.this, R.raw.click_);
					md.start();
					LayoutInflater li = getLayoutInflater();
					View v = li.inflate(R.layout.ims1, null);
					AlertDialog.Builder bd = new AlertDialog.Builder(ass.this, R.style.alert);
					bd.setView(v);
					bd.create();
					bd.show();
				}
			});
			bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
				public void onClick(DialogInterface d, int vk){
					Toast.makeText(ass.this, "Download de " + lp + " cancelado!!", Toast.LENGTH_LONG).show();
					md = md.create(ass.this, R.raw.click_);
					md.start();
				}
			});
			bd.create();
			bd.show();
		}
	}
	public void ref(View v){
		MediaPlayer md = MediaPlayer.create(ass.this, R.raw.click_);
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
