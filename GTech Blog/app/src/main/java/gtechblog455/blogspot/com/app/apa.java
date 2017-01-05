package gtechblog455.blogspot.com.app;
import android.app.*;
import android.content.*;
import android.content.res.*;
import android.media.*;
import android.net.*;
import android.os.*;
import android.support.v4.app.*;
import android.support.v7.app.*;
import android.util.*;
import android.view.*;
import android.widget.*;
import gtechblog455.blogspot.com.app.gtech_blog_adapter_list.*;
import java.io.*;
import android.support.v7.app.AlertDialog;
public class apa extends ListActivity{
	InputStream r;
	Uri a;
	Intent dl;
	MediaPlayer md;
	AssetManager as;
	public void onCreate(Bundle m){
		super.onCreate(m);
		getActionBar().setDisplayHomeAsUpEnabled(true);
		setContentView(R.layout.ap);
		getWindow().setBackgroundDrawableResource(R.raw.bg);
		String[] lt = {
			"Consulta PIS",
			"Detran.BA Mobile",
			"IP Tools: Network utilities",
			"Ferramentas Inteligentes",
			"Xadrez: Mate em 1 (problemas)",
			"Software Update mais recente",
			"QR Droid Code Scanner",
			"File Expert - File Manager",
			"TeamViewer para Remote Control",
			"WinZip – Zip UnZip Tool",
			"7Zipper 2.0",
			"Avast Cleanup",
			"Ares Música Player",
			"Controle Financeiro Mobills",
			"As Minhas Finanças by 7c",
			"Utilidades de Android",
			"Army Knife for Android",
			"VIRUSfighter Android FREE",
			"Conversor de unidades",
			"Gravador de vóz avançado",
			"Wifi Scanner",
			"Go Theme",
			"PicsArt",
			"Du Battery Saver",
			"Firefox",
			"AIDE Java, Android, C/C++",
			"Quoda",
			"Terminal Emulator",
			"Google Tradutor",
			"Holo Launcher HD",
			"Go Launcher EX",
			"Link2SD",
			"Linux Deploy",
			"Teclado Swift Key",
			"Simple Unrar",
			"Paint Pro",
			"Notepad++",
			"Gif Creator",
			"Screen Recorder",
			"Dual file Manager XT",
			"Android Assistant",
			"Adobe Reader",
			"Docs To Go",
		};
		int[] rs = {
			R.drawable.pis,
			R.drawable.detran,
			R.drawable.ip_tools,
			R.drawable.tools,
			R.drawable.xadres,
			R.drawable.up,
			R.drawable.qr,
			R.drawable.file,
			R.drawable.team,
			R.drawable.winzip,
			R.drawable.ziper,
			R.drawable.avast,
			R.drawable.ares_a,
			R.drawable.financeiro,
			R.drawable.my_finances,
			R.drawable.utl,
			R.drawable.knife,
			R.drawable.figther,
			R.drawable.conversor_un,
			R.drawable.ad_rec,
			R.drawable.scan,
			R.drawable.go_theme,
			R.drawable.pics,
			R.drawable.du,
			R.drawable.firefox,
			R.drawable.aide,
			R.drawable.quoda,
			R.drawable.term,
			R.drawable.tr,
			R.drawable.holo,
			R.drawable.go,
			R.drawable.link,
			R.drawable.deploy,
			R.drawable.swift,
			R.drawable.unrar,
			R.drawable.paint,
			R.drawable.notepad,
			R.drawable.gif,
			R.drawable.scc,
			R.drawable.dual,
			R.drawable.assistant,
			R.drawable.adobe,
			R.drawable.docs,
		};
		setListAdapter(new ad(this, lt, rs));
	}
	public void ref(View v){
		a = a.parse("http://www.4shared.com/mobile/7WcYrbROba/gtech_blog.html");
		dl = new Intent(dl.ACTION_VIEW, a);
		startActivity(dl);
		MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
		md.start();
	}
	String apa56(){
		r = getResources().openRawResource(R.raw.apa56);
		ByteArrayOutputStream c = new ByteArrayOutputStream();
		int s;
		try{
			s = r.read();
			while(s != -1){
				c.write(s);
				s = r.read();
			}
			c.close();
		} catch(IOException e){
		}
		return c.toString();
	}
	String apa55(){
		r = getResources().openRawResource(R.raw.apa55);
		ByteArrayOutputStream c = new ByteArrayOutputStream();
		int s;
		try{
			s = r.read();
			while(s != -1){
				c.write(s);
				s = r.read();
			}
			c.close();
		} catch(IOException e){
		}
		return c.toString();
	}
	String apa54(){
		r = getResources().openRawResource(R.raw.apa54);
		ByteArrayOutputStream c = new ByteArrayOutputStream();
		int s;
		try{
			s = r.read();
			while(s != -1){
				c.write(s);
				s = r.read();
			}
			c.close();
		} catch(IOException e){
		}
		return c.toString();
	}
	String apa51(){
		r = getResources().openRawResource(R.raw.apa51);
		ByteArrayOutputStream c = new ByteArrayOutputStream();
		int s;
		try{
			s = r.read();
			while(s != -1){
				c.write(s);
				s = r.read();
			}
			c.close();
		} catch(IOException e){
		}
		return c.toString();
	}
	String apa50(){
		r = getResources().openRawResource(R.raw.apa50);
		ByteArrayOutputStream c = new ByteArrayOutputStream();
		int s;
		try{
			s = r.read();
			while(s != -1){
				c.write(s);
				s = r.read();
			}
			c.close();
		} catch(IOException e){
		}
		return c.toString();
	}
	String apa49(){
		r = getResources().openRawResource(R.raw.apa49);
		ByteArrayOutputStream c = new ByteArrayOutputStream();
		int s;
		try{
			s = r.read();
			while(s != -1){
				c.write(s);
				s = r.read();
			}
			c.close();
		} catch(IOException e){
		}
		return c.toString();
	}
	String apa48(){
		r = getResources().openRawResource(R.raw.apa48);
		ByteArrayOutputStream c = new ByteArrayOutputStream();
		int s;
		try{
			s = r.read();
			while(s != -1){
				c.write(s);
				s = r.read();
			}
			c.close();
		} catch(IOException e){
		}
		return c.toString();
	}
	String apa47(){
		r = getResources().openRawResource(R.raw.apa47);
		ByteArrayOutputStream c = new ByteArrayOutputStream();
		int s;
		try{
			s = r.read();
			while(s != -1){
				c.write(s);
				s = r.read();
			}
			c.close();
		} catch(IOException e){
		}
		return c.toString();
	}
	String apa46(){
		r = getResources().openRawResource(R.raw.apa46);
		ByteArrayOutputStream c = new ByteArrayOutputStream();
		int s;
		try{
			s = r.read();
			while(s != -1){
				c.write(s);
				s = r.read();
			}
			c.close();
		} catch(IOException e){
		}
		return c.toString();
	}
	String apa45(){
		r = getResources().openRawResource(R.raw.apa45);
		ByteArrayOutputStream c = new ByteArrayOutputStream();
		int s;
		try{
			s = r.read();
			while(s != -1){
				c.write(s);
				s = r.read();
			}
			c.close();
		} catch(IOException e){
		}
		return c.toString();
	}
	String apa44(){
		r = getResources().openRawResource(R.raw.apa44);
		ByteArrayOutputStream c = new ByteArrayOutputStream();
		int s;
		try{
			s = r.read();
			while(s != -1){
				c.write(s);
				s = r.read();
			}
			c.close();
		} catch(IOException e){
		}
		return c.toString();
	}
	String apa43(){
		r = getResources().openRawResource(R.raw.apa43);
		ByteArrayOutputStream c = new ByteArrayOutputStream();
		int s;
		try{
			s = r.read();
			while(s != -1){
				c.write(s);
				s = r.read();
			}
			c.close();
		} catch(IOException e){
		}
		return c.toString();
	}
	String apa42(){
		r = getResources().openRawResource(R.raw.apa42);
		ByteArrayOutputStream c = new ByteArrayOutputStream();
		int s;
		try{
			s = r.read();
			while(s != -1){
				c.write(s);
				s = r.read();
			}
			c.close();
		} catch(IOException e){
		}
		return c.toString();
	}
	String apa41(){
		r = getResources().openRawResource(R.raw.apa41);
		ByteArrayOutputStream c = new ByteArrayOutputStream();
		int s;
		try{
			s = r.read();
			while(s != -1){
				c.write(s);
				s = r.read();
			}
			c.close();
		} catch(IOException e){
		}
		return c.toString();
	}
	String apa40(){
		r = getResources().openRawResource(R.raw.apa40);
		ByteArrayOutputStream c = new ByteArrayOutputStream();
		int s;
		try{
			s = r.read();
			while(s != -1){
				c.write(s);
				s = r.read();
			}
			c.close();
		} catch(IOException e){
		}
		return c.toString();
	}
	String apa39(){
		r = getResources().openRawResource(R.raw.apa39);
		ByteArrayOutputStream c = new ByteArrayOutputStream();
		int s;
		try{
			s = r.read();
			while(s != -1){
				c.write(s);
				s = r.read();
			}
			c.close();
		} catch(IOException e){
		}
		return c.toString();
	}
	String apa38(){
		r = getResources().openRawResource(R.raw.apa38);
		ByteArrayOutputStream c = new ByteArrayOutputStream();
		int s;
		try{
			s = r.read();
			while(s != -1){
				c.write(s);
				s = r.read();
			}
			c.close();
		} catch(IOException e){
		}
		return c.toString();
	}
	String apa37(){
		r = getResources().openRawResource(R.raw.apa37);
		ByteArrayOutputStream c = new ByteArrayOutputStream();
		int s;
		try{
			s = r.read();
			while(s != -1){
				c.write(s);
				s = r.read();
			}
			c.close();
		} catch(IOException e){
		}
		return c.toString();
	}
	String apa36(){
		r = getResources().openRawResource(R.raw.apa36);
		ByteArrayOutputStream c = new ByteArrayOutputStream();
		int s;
		try{
			s = r.read();
			while(s != -1){
				c.write(s);
				s = r.read();
			}
			c.close();
		} catch(IOException e){
		}
		return c.toString();
	}
	String apa35(){
		r = getResources().openRawResource(R.raw.apa35);
		ByteArrayOutputStream c = new ByteArrayOutputStream();
		int s;
		try{
			s = r.read();
			while(s != -1){
				c.write(s);
				s = r.read();
			}
			c.close();
		} catch(IOException e){
		}
		return c.toString();
	}
	String apa12(){
		r = getResources().openRawResource(R.raw.apa12);
		ByteArrayOutputStream c = new ByteArrayOutputStream();
		int s;
		try{
			s = r.read();
			while(s != -1){
				c.write(s);
				s = r.read();
			}
			c.close();
		} catch(IOException e){
		}
		return c.toString();
	}
	String apa11(){
		r = getResources().openRawResource(R.raw.apa11);
		ByteArrayOutputStream c = new ByteArrayOutputStream();
		int s;
		try{
			s = r.read();
			while(s != -1){
				c.write(s);
				s = r.read();
			}
			c.close();
		} catch(IOException e){
		}
		return c.toString();
	}
	String apa13(){
		r = getResources().openRawResource(R.raw.apa13);
		ByteArrayOutputStream c = new ByteArrayOutputStream();
		int s;
		try{
			s = r.read();
			while(s != -1){
				c.write(s);
				s = r.read();
			}
			c.close();
		} catch(IOException e){
		}
		return c.toString();
	}
	String apa10(){
		r = getResources().openRawResource(R.raw.apa10);
		ByteArrayOutputStream c = new ByteArrayOutputStream();
		int s;
		try{
			s = r.read();
			while(s != -1){
				c.write(s);
				s = r.read();
			}
			c.close();
		} catch(IOException e){
		}
		return c.toString();
	}
	String apa9(){
		r = getResources().openRawResource(R.raw.apa9);
		ByteArrayOutputStream c = new ByteArrayOutputStream();
		int s;
		try{
			s = r.read();
			while(s != -1){
				c.write(s);
				s = r.read();
			}
			c.close();
		} catch(IOException e){
		}
		return c.toString();
	}
	String apa8(){
		r = getResources().openRawResource(R.raw.apa8);
		ByteArrayOutputStream c = new ByteArrayOutputStream();
		int s;
		try{
			s = r.read();
			while(s != -1){
				c.write(s);
				s = r.read();
			}
			c.close();
		} catch(IOException e){
		}
		return c.toString();
	}
	String apa6(){
		r = getResources().openRawResource(R.raw.apa6);
		ByteArrayOutputStream c = new ByteArrayOutputStream();
		int s;
		try{
			s = r.read();
			while(s != -1){
				c.write(s);
				s = r.read();
			}
			c.close();
		} catch(IOException e){
		}
		return c.toString();
	}
	String apa5(){
		r = getResources().openRawResource(R.raw.apa5);
		ByteArrayOutputStream c = new ByteArrayOutputStream();
		int s;
		try{
			s = r.read();
			while(s != -1){
				c.write(s);
				s = r.read();
			}
			c.close();
		} catch(IOException e){
		}
		return c.toString();
	}
	String apa4(){
		r = getResources().openRawResource(R.raw.apa4);
		ByteArrayOutputStream c = new ByteArrayOutputStream();
		int s;
		try{
			s = r.read();
			while(s != -1){
				c.write(s);
				s = r.read();
			}
			c.close();
		} catch(IOException e){
		}
		return c.toString();
	}
	String apa3(){
		r = getResources().openRawResource(R.raw.apa3);
		ByteArrayOutputStream c = new ByteArrayOutputStream();
		int s;
		try{
			s = r.read();
			while(s != -1){
				c.write(s);
				s = r.read();
			}
			c.close();
		} catch(IOException e){
		}
		return c.toString();
	}
	String apa14(){
		r = getResources().openRawResource(R.raw.apa14);
		ByteArrayOutputStream c = new ByteArrayOutputStream();
		int s;
		try{
			s = r.read();
			while(s != -1){
				c.write(s);
				s = r.read();
			}
			c.close();
		} catch(IOException e){
		}
		return c.toString();
	}
	String apa15(){
		r = getResources().openRawResource(R.raw.apa15);
		ByteArrayOutputStream c = new ByteArrayOutputStream();
		int s;
		try{
			s = r.read();
			while(s != -1){
				c.write(s);
				s = r.read();
			}
			c.close();
		} catch(IOException e){
		}
		return c.toString();
	}
	String apa17(){
		r = getResources().openRawResource(R.raw.apa17);
		ByteArrayOutputStream c = new ByteArrayOutputStream();
		int s;
		try{
			s = r.read();
			while(s != -1){
				c.write(s);
				s = r.read();
			}
			c.close();
		} catch(IOException e){
		}
		return c.toString();
	}
	String apa16(){
		r = getResources().openRawResource(R.raw.apa16);
		ByteArrayOutputStream c = new ByteArrayOutputStream();
		int s;
		try{
			s = r.read();
			while(s != -1){
				c.write(s);
				s = r.read();
			}
			c.close();
		} catch(IOException e){
		}
		return c.toString();
	}
	String apa18(){
		r = getResources().openRawResource(R.raw.apa18);
		ByteArrayOutputStream c = new ByteArrayOutputStream();
		int s;
		try{
			s = r.read();
			while(s != -1){
				c.write(s);
				s = r.read();
			}
			c.close();
		} catch(IOException e){
		}
		return c.toString();
	}
	String apa19(){
		r = getResources().openRawResource(R.raw.apa19);
		ByteArrayOutputStream c = new ByteArrayOutputStream();
		int s;
		try{
			s = r.read();
			while(s != -1){
				c.write(s);
				s = r.read();
			}
			c.close();
		} catch(IOException e){
		}
		return c.toString();
	}
	String apa20(){
		r = getResources().openRawResource(R.raw.apa20);
		ByteArrayOutputStream c = new ByteArrayOutputStream();
		int s;
		try{
			s = r.read();
			while(s != -1){
				c.write(s);
				s = r.read();
			}
			c.close();
		} catch(IOException e){
		}
		return c.toString();
	}
	String apa21(){
		r = getResources().openRawResource(R.raw.apa21);
		ByteArrayOutputStream c = new ByteArrayOutputStream();
		int s;
		try{
			s = r.read();
			while(s != -1){
				c.write(s);
				s = r.read();
			}
			c.close();
		} catch(IOException e){
		}
		return c.toString();
	}
	String apa23(){
		r = getResources().openRawResource(R.raw.apa23);
		ByteArrayOutputStream c = new ByteArrayOutputStream();
		int s;
		try{
			s = r.read();
			while(s != -1){
				c.write(s);
				s = r.read();
			}
			c.close();
		} catch(IOException e){
		}
		return c.toString();
	}
	String apa24(){
		r = getResources().openRawResource(R.raw.apa24);
		ByteArrayOutputStream c = new ByteArrayOutputStream();
		int s;
		try{
			s = r.read();
			while(s != -1){
				c.write(s);
				s = r.read();
			}
			c.close();
		} catch(IOException e){
		}
		return c.toString();
	}
	String apa26(){
		r = getResources().openRawResource(R.raw.apa26);
		ByteArrayOutputStream c = new ByteArrayOutputStream();
		int s;
		try{
			s = r.read();
			while(s != -1){
				c.write(s);
				s = r.read();
			}
			c.close();
		} catch(IOException e){
		}
		return c.toString();
	}
	String apa27(){
		r = getResources().openRawResource(R.raw.apa27);
		ByteArrayOutputStream c = new ByteArrayOutputStream();
		int s;
		try{
			s = r.read();
			while(s != -1){
				c.write(s);
				s = r.read();
			}
			c.close();
		} catch(IOException e){
		}
		return c.toString();
	}
	String apa28(){
		r = getResources().openRawResource(R.raw.apa28);
		ByteArrayOutputStream c = new ByteArrayOutputStream();
		int s;
		try{
			s = r.read();
			while(s != -1){
				c.write(s);
				s = r.read();
			}
			c.close();
		} catch(IOException e){
		}
		return c.toString();
	}
	String apa29(){
		r = getResources().openRawResource(R.raw.apa29);
		ByteArrayOutputStream c = new ByteArrayOutputStream();
		int s;
		try{
			s = r.read();
			while(s != -1){
				c.write(s);
				s = r.read();
			}
			c.close();
		} catch(IOException e){
		}
		return c.toString();
	}
	String apa30(){
		r = getResources().openRawResource(R.raw.apa30);
		ByteArrayOutputStream c = new ByteArrayOutputStream();
		int s;
		try{
			s = r.read();
			while(s != -1){
				c.write(s);
				s = r.read();
			}
			c.close();
		} catch(IOException e){
		}
		return c.toString();
	}
	String apa31(){
		r = getResources().openRawResource(R.raw.apa31);
		ByteArrayOutputStream c = new ByteArrayOutputStream();
		int s;
		try{
			s = r.read();
			while(s != -1){
				c.write(s);
				s = r.read();
			}
			c.close();
		} catch(IOException e){
		}
		return c.toString();
	}
	String apa32(){
		r = getResources().openRawResource(R.raw.apa32);
		ByteArrayOutputStream c = new ByteArrayOutputStream();
		int s;
		try{
			s = r.read();
			while(s != -1){
				c.write(s);
				s = r.read();
			}
			c.close();
		} catch(IOException e){
		}
		return c.toString();
	}
	String apa33(){
		r = getResources().openRawResource(R.raw.apa33);
		ByteArrayOutputStream c = new ByteArrayOutputStream();
		int s;
		try{
			s = r.read();
			while(s != -1){
				c.write(s);
				s = r.read();
			}
			c.close();
		} catch(IOException e){
		}
		return c.toString();
	}
	String apa34(){
		r = getResources().openRawResource(R.raw.apa34);
		ByteArrayOutputStream c = new ByteArrayOutputStream();
		int s;
		try{
			s = r.read();
			while(s != -1){
				c.write(s);
				s = r.read();
			}
			c.close();
		} catch(IOException e){
		}
		return c.toString();
	}
	public void onListItemClick(ListView l, View v, int p, long id){
		final MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
		md.start();
		Object o = this.getListAdapter().getItem(p);
		final String lp = o.toString();
		if(lp.toString() == "Consulta PIS"){
			AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
			bd.setTitle(lp);
			bd.setIcon(R.drawable.ic_launcher);
			bd.setMessage(apa56());
			bd.setPositiveButton("Baixar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						a = a.parse("https://play.google.com/store/apps/details?id=br.com.mobills.consultapis");
						dl = new Intent(dl.ACTION_VIEW, a);
						startActivity(dl);
					}
				});
			bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vu){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						Toast.makeText(apa.this, "Instalacao de " + lp + " Cancelada!!", Toast.LENGTH_LONG).show();
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Detran.BA Mobile"){
			AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
			bd.setTitle(lp);
			bd.setIcon(R.drawable.ic_launcher);
			bd.setMessage(apa55());
			bd.setPositiveButton("Baixar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						a = a.parse("https://play.google.com/store/apps/details?id=br.gov.ba.detran");
						dl = new Intent(dl.ACTION_VIEW, a);
						startActivity(dl);
					}
				});
			bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vu){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						Toast.makeText(apa.this, "Instalacao de " + lp + " Cancelada!!", Toast.LENGTH_LONG).show();
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "IP Tools: Network utilities"){
			AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
			bd.setTitle(lp);
			bd.setIcon(R.drawable.ic_launcher);
			bd.setMessage(apa54());
			bd.setPositiveButton("Baixar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						a = a.parse("https://play.google.com/store/apps/details?id=com.ddm.iptools");
						dl = new Intent(dl.ACTION_VIEW, a);
						startActivity(dl);
					}
				});
			bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vu){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						Toast.makeText(apa.this, "Instalacao de " + lp + " Cancelada!!", Toast.LENGTH_LONG).show();
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Ferramentas Inteligentes"){
			AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
			bd.setTitle(lp);
			bd.setIcon(R.drawable.ic_launcher);
			bd.setMessage(apa51());
			bd.setPositiveButton("Baixar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						a = a.parse("https://play.google.com/store/apps/details?id=com.pcmehanik.smarttoolkit");
						dl = new Intent(dl.ACTION_VIEW, a);
						startActivity(dl);
					}
				});
			bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vu){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						Toast.makeText(apa.this, "Instalacao de " + lp + " Cancelada!!", Toast.LENGTH_LONG).show();
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Xadrez: Mate em 1 (problemas)"){
			AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
			bd.setTitle(lp);
			bd.setIcon(R.drawable.ic_launcher);
			bd.setMessage(apa50());
			bd.setPositiveButton("Baixar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						a = a.parse("https://play.google.com/store/apps/details?id=com.chessking.android.learn.matein1");
						dl = new Intent(dl.ACTION_VIEW, a);
						startActivity(dl);
					}
				});
			bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vu){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						Toast.makeText(apa.this, "Instalacao de " + lp + " Cancelada!!", Toast.LENGTH_LONG).show();
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Software Update mais recente"){
			AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
			bd.setTitle(lp);
			bd.setIcon(R.drawable.ic_launcher);
			bd.setMessage(apa49());
			bd.setPositiveButton("Baixar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						a = a.parse("https://play.google.com/store/apps/details?id=com.sp41ky.updatesw");
						dl = new Intent(dl.ACTION_VIEW, a);
						startActivity(dl);
					}
				});
			bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vu){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						Toast.makeText(apa.this, "Instalacao de " + lp + " Cancelada!!", Toast.LENGTH_LONG).show();
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "QR Droid Code Scanner"){
			AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
			bd.setTitle(lp);
			bd.setIcon(R.drawable.ic_launcher);
			bd.setMessage(apa48());
			bd.setPositiveButton("Baixar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						a = a.parse("https://play.google.com/store/apps/details?id=la.droid.qr");
						dl = new Intent(dl.ACTION_VIEW, a);
						startActivity(dl);
					}
				});
			bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vu){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						Toast.makeText(apa.this, "Instalacao de " + lp + " Cancelada!!", Toast.LENGTH_LONG).show();
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "File Expert - File Manager"){
			AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
			bd.setTitle(lp);
			bd.setIcon(R.drawable.ic_launcher);
			bd.setMessage(apa47());
			bd.setPositiveButton("Baixar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						a = a.parse("https://play.google.com/store/apps/details?id=xcxin.filexpert");
						dl = new Intent(dl.ACTION_VIEW, a);
						startActivity(dl);
					}
				});
			bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vu){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						Toast.makeText(apa.this, "Instalacao de " + lp + " Cancelada!!", Toast.LENGTH_LONG).show();
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "TeamViewer para Remote Control"){
			AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
			bd.setTitle(lp);
			bd.setIcon(R.drawable.ic_launcher);
			bd.setMessage(apa46());
			bd.setPositiveButton("Baixar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						a = a.parse("https://play.google.com/store/apps/details?id=com.teamviewer.teamviewer.market.mobile");
						dl = new Intent(dl.ACTION_VIEW, a);
						startActivity(dl);
					}
				});
			bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vu){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						Toast.makeText(apa.this, "Instalacao de " + lp + " Cancelada!!", Toast.LENGTH_LONG).show();
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "WinZip – Zip UnZip Tool"){
			AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
			bd.setTitle(lp);
			bd.setIcon(R.drawable.ic_launcher);
			bd.setMessage(apa45());
			bd.setPositiveButton("Baixar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						a = a.parse("https://play.google.com/store/apps/details?id=com.winzip.android");
						dl = new Intent(dl.ACTION_VIEW, a);
						startActivity(dl);
					}
				});
			bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vu){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						Toast.makeText(apa.this, "Instalacao de " + lp + " Cancelada!!", Toast.LENGTH_LONG).show();
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "7Zipper 2.0"){
			AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
			bd.setTitle(lp);
			bd.setIcon(R.drawable.ic_launcher);
			bd.setMessage(apa44());
			bd.setPositiveButton("Baixar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						a = a.parse("https://play.google.com/store/apps/details?id=org.joa.zipperplus7v2");
						dl = new Intent(dl.ACTION_VIEW, a);
						startActivity(dl);
					}
				});
			bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vu){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						Toast.makeText(apa.this, "Instalacao de " + lp + " Cancelada!!", Toast.LENGTH_LONG).show();
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Avast Cleanup"){
			AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
			bd.setTitle(lp);
			bd.setIcon(R.drawable.ic_launcher);
			bd.setMessage(apa43());
			bd.setPositiveButton("Baixar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						a = a.parse("https://play.google.com/store/apps/details?id=com.avast.android.cleaner");
						dl = new Intent(dl.ACTION_VIEW, a);
						startActivity(dl);
					}
				});
			bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vu){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						Toast.makeText(apa.this, "Instalacao de " + lp + " Cancelada!!", Toast.LENGTH_LONG).show();
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Ares Música Player"){
			AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
			bd.setTitle(lp);
			bd.setIcon(R.drawable.ic_launcher);
			bd.setMessage(apa42());
			bd.setPositiveButton("Baixar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						a = a.parse("https://play.google.com/store/apps/details?id=com.rioapps.ares.musica");
						dl = new Intent(dl.ACTION_VIEW, a);
						startActivity(dl);
					}
				});
			bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vu){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						Toast.makeText(apa.this, "Instalacao de " + lp + " Cancelada!!", Toast.LENGTH_LONG).show();
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Controle Financeiro Mobills"){
			AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
			bd.setTitle(lp);
			bd.setIcon(R.drawable.ic_launcher);
			bd.setMessage(apa41());
			bd.setPositiveButton("Baixar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						a = a.parse("https://play.google.com/store/apps/details?id=br.com.gerenciadorfinanceiro.controller");
						dl = new Intent(dl.ACTION_VIEW, a);
						startActivity(dl);
					}
				});
			bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vu){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						Toast.makeText(apa.this, "Instalacao de " + lp + " Cancelada!!", Toast.LENGTH_LONG).show();
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "As Minhas Finanças by 7c"){
			AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
			bd.setTitle(lp);
			bd.setIcon(R.drawable.ic_launcher);
			bd.setMessage(apa40());
			bd.setPositiveButton("Baixar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						a = a.parse("https://play.google.com/store/apps/details?id=com.sevencsolutions.myfinances");
						dl = new Intent(dl.ACTION_VIEW, a);
						startActivity(dl);
					}
				});
			bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vu){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						Toast.makeText(apa.this, "Instalacao de " + lp + " Cancelada!!", Toast.LENGTH_LONG).show();
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "HoraBus - Muriaé"){
			AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
			bd.setTitle(lp);
			bd.setIcon(R.drawable.ic_launcher);
			bd.setMessage(apa39());
			bd.setPositiveButton("Baixar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						a = a.parse("https://play.google.com/store/apps/details?id=com.venancio.hiago.bushorario");
						dl = new Intent(dl.ACTION_VIEW, a);
						startActivity(dl);
					}
				});
			bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vu){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						Toast.makeText(apa.this, "Instalacao de " + lp + " Cancelada!!", Toast.LENGTH_LONG).show();
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Utilidades de Android"){
			AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
			bd.setTitle(lp);
			bd.setIcon(R.drawable.ic_launcher);
			bd.setMessage(apa38());
			bd.setPositiveButton("Baixar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						a = a.parse("https://play.google.com/store/apps/details?id=co.com.utilitiesAndroid");
						dl = new Intent(dl.ACTION_VIEW, a);
						startActivity(dl);
					}
				});
			bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vu){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						Toast.makeText(apa.this, "Instalacao de " + lp + " Cancelada!!", Toast.LENGTH_LONG).show();
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Army Knife for Android"){
			AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
			bd.setTitle(lp);
			bd.setIcon(R.drawable.ic_launcher);
			bd.setMessage(apa37());
			bd.setPositiveButton("Baixar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						a = a.parse("https://play.google.com/store/apps/details?id=com.digital_and_dreams.android.android_army_knife");
						dl = new Intent(dl.ACTION_VIEW, a);
						startActivity(dl);
					}
				});
			bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vu){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						Toast.makeText(apa.this, "Instalacao de " + lp + " Cancelada!!", Toast.LENGTH_LONG).show();
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "VIRUSfighter Android FREE"){
			AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
			bd.setTitle(lp);
			bd.setIcon(R.drawable.ic_launcher);
			bd.setMessage(apa36());
			bd.setPositiveButton("Baixar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						a = a.parse("https://play.google.com/store/apps/details?id=com.virusfighter.android");
						dl = new Intent(dl.ACTION_VIEW, a);
						startActivity(dl);
					}
				});
			bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vu){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						Toast.makeText(apa.this, "Instalacao de " + lp + " Cancelada!!", Toast.LENGTH_LONG).show();
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Conversor de unidades"){
			AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
			bd.setTitle(lp);
			bd.setIcon(R.drawable.ic_launcher);
			bd.setMessage(apa35());
			bd.setPositiveButton("Baixar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						a = a.parse("https://play.google.com/store/apps/details?id=com.mathpad.mobile.android.wt.unit");
						dl = new Intent(dl.ACTION_VIEW, a);
						startActivity(dl);
					}
				});
			bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vu){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						Toast.makeText(apa.this, "Instalacao de " + lp + " Cancelada!!", Toast.LENGTH_LONG).show();
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Docs To Go"){
			AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
			bd.setTitle(lp);
			bd.setIcon(R.drawable.ic_launcher);
			bd.setMessage(apa34());
			bd.setPositiveButton("Baixar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						a = a.parse("http://sites.google.com/site/gbtec92/docs.apk");
						dl = new Intent(dl.ACTION_VIEW, a);
						startActivity(dl);
					}
				});
			bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vu){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						Toast.makeText(apa.this, "Instalação de " + lp + " Cancelada!!", Toast.LENGTH_LONG).show();
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Android Assistant"){
			AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
			bd.setTitle(lp);
			bd.setIcon(R.drawable.ic_launcher);
			bd.setMessage(apa31());
			bd.setPositiveButton("Baixar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						a = a.parse("http://sites.google.com/site/gbtec92/assistant.apk");
						dl = new Intent(dl.ACTION_VIEW, a);
						startActivity(dl);
					}
				});
			bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vu){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						Toast.makeText(apa.this, "Instalação de " + lp + " Cancelada!!", Toast.LENGTH_LONG).show();
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Adobe Flash Player"){
			AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
			bd.setTitle(lp);
			bd.setIcon(R.drawable.ic_launcher);
			bd.setMessage(apa33());
			bd.setPositiveButton("Baixar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						a = a.parse("http://sites.google.com/site/gbtec92/flash.apk");
						dl = new Intent(dl.ACTION_VIEW, a);
						startActivity(dl);
					}
				});
			bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vu){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						Toast.makeText(apa.this, "Instalação de " + lp + " Cancelada!!", Toast.LENGTH_LONG).show();
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Adobe Reader"){
			AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
			bd.setTitle(lp);
			bd.setIcon(R.drawable.ic_launcher);
			bd.setMessage(apa32());
			bd.setPositiveButton("Baixar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						a = a.parse("https://play.google.com/store/apps/details?id=com.adobe.reader");
						dl = new Intent(dl.ACTION_VIEW, a);
						startActivity(dl);
					}
				});
			bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vu){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						Toast.makeText(apa.this, "Instalação de " + lp + " Cancelada!!", Toast.LENGTH_LONG).show();
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Dual file Manager XT"){
			AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
			bd.setTitle(lp);
			bd.setIcon(R.drawable.ic_launcher);
			bd.setMessage(apa30());
			bd.setPositiveButton("Baixar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						a = a.parse("https://play.google.com/store/apps/details?id=it.medieval.dualfm_xt");
						dl = new Intent(dl.ACTION_VIEW, a);
						startActivity(dl);
					}
				});
			bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vu){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						Toast.makeText(apa.this, "Instalação de " + lp + " Cancelada!!", Toast.LENGTH_LONG).show();
					}
				});
			bd.create();
			bd.show();
		}

		if(lp.toString() == "MP3 Converter"){
			AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
			bd.setTitle(lp);
			bd.setIcon(R.drawable.ic_launcher);
			bd.setMessage(apa28());
			bd.setPositiveButton("Baixar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						a = a.parse("https://play.google.com/store/apps/details?id=com.springwalk.mediaconverter&hl=pt");
						dl = new Intent(dl.ACTION_VIEW, a);
						startActivity(dl);
					}
				});
			bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vu){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						Toast.makeText(apa.this, "Instalação de " + lp + " Cancelada!!", Toast.LENGTH_LONG).show();
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Screen Recorder"){
			AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
			bd.setTitle(lp);
			bd.setIcon(R.drawable.ic_launcher);
			bd.setMessage(apa27());
			bd.setPositiveButton("Baixar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						a = a.parse("https://play.google.com/store/apps/details?id=com.nll.screenrecorder");
						dl = new Intent(dl.ACTION_VIEW, a);
						startActivity(dl);
					}
				});
			bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vu){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						Toast.makeText(apa.this, "Instalação de " + lp + " Cancelada!!", Toast.LENGTH_LONG).show();
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Gif Creator"){
			AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
			bd.setTitle(lp);
			bd.setIcon(R.drawable.ic_launcher);
			bd.setMessage(apa26());
			bd.setPositiveButton("Baixar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						a = a.parse("https://play.google.com/store/apps/details?id=com.struchev.gif_creator");
						dl = new Intent(dl.ACTION_VIEW, a);
						startActivity(dl);
					}
				});
			bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vu){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						Toast.makeText(apa.this, "Instalação de " + lp + " Cancelada!!", Toast.LENGTH_LONG).show();
					}
				});
			bd.create();
			bd.show();
		}

		if(lp.toString() == "Notepad++"){
			AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
			bd.setTitle(lp);
			bd.setIcon(R.drawable.ic_launcher);
			bd.setMessage(apa24());
			bd.setPositiveButton("Baixar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						a = a.parse("https://play.google.com/store/apps/details?id=com.onto.notepad");
						dl = new Intent(dl.ACTION_VIEW, a);
						startActivity(dl);
					}
				});
			bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vu){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						Toast.makeText(apa.this, "Instalação de " + lp + " Cancelada!!", Toast.LENGTH_LONG).show();
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Paint Pro"){
			AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
			bd.setTitle(lp);
			bd.setIcon(R.drawable.ic_launcher);
			bd.setMessage(apa23());
			bd.setPositiveButton("Baixar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						a = a.parse("https://play.google.com/store/apps/details?id=com.electricsheep.paint");
						dl = new Intent(dl.ACTION_VIEW, a);
						startActivity(dl);
					}
				});
			bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vu){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						Toast.makeText(apa.this, "Instalação de " + lp + " Cancelada!!", Toast.LENGTH_LONG).show();
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Simple Unrar"){
			AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
			bd.setTitle(lp);
			bd.setIcon(R.drawable.ic_launcher);
			bd.setMessage(apa20());
			bd.setPositiveButton("Baixar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						a = a.parse("https://play.google.com/store/apps/details?id=com.resonancelab.unrar");
						dl = new Intent(dl.ACTION_VIEW, a);
						startActivity(dl);
					}
				});
			bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vu){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						Toast.makeText(apa.this, "Instalação de " + lp + " Cancelada!!", Toast.LENGTH_LONG).show();
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Teclado Swift Key"){
			AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
			bd.setTitle(lp);
			bd.setIcon(R.drawable.ic_launcher);
			bd.setMessage(apa18());
			bd.setPositiveButton("Baixar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						a = a.parse("https://play.google.com/store/apps/details?id=com.jb.gokeyboard.theme.tmeflames&hl=pt_BR&referrer=utm_source%3Dgoogle%26utm_medium%3Dorganic%26utm_term%3Dteclado+fogo+para+android&pcampaignid=APPU_1__8I3Vv2rEsSgwATB7a2wDw");
						dl = new Intent(dl.ACTION_VIEW, a);
						startActivity(dl);
					}
				});
			bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vu){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						Toast.makeText(apa.this, "Instalação de " + lp + " Cancelada!!", Toast.LENGTH_LONG).show();
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Linux Deploy"){
			AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
			bd.setTitle("Linux Deploy");
			bd.setIcon(R.drawable.ic_launcher);
			bd.setMessage(apa17());
			bd.setPositiveButton("Baixar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						a = a.parse("https://play.google.com/store/apps/details?id=ru.meefik.linuxdeploy");
						dl = new Intent(dl.ACTION_VIEW, a);
						startActivity(dl);
					}
				});
			bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vu){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						Toast.makeText(apa.this, "Instalação de " + lp + " Cancelada!!", Toast.LENGTH_LONG).show();
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Link2SD"){
			AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
			bd.setTitle("Link2SD");
			bd.setIcon(R.drawable.ic_launcher);
			bd.setMessage(apa16());
			bd.setPositiveButton("Baixar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						a = a.parse("https://play.google.com/store/apps/details?id=com.buak.Link2SD");
						dl = new Intent(dl.ACTION_VIEW, a);
						startActivity(dl);
					}
				});
			bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vu){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						Toast.makeText(apa.this, "Instalação de " + lp + " Cancelada!!", Toast.LENGTH_LONG).show();
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Go Launcher EX"){
			AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
			bd.setTitle("Go Launcher EX");
			bd.setIcon(R.drawable.ic_launcher);
			bd.setMessage(apa14());
			bd.setPositiveButton("Baixar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						a = a.parse("http://www.google.com.br/url?q=https://play.google.com/store/apps/details%3Fid%3Dcom.gau.go.launcherex%26hl%3Dpt_BR&sa=U&ved=0CAsQFjAAahUKEwj58ZHN1vzHAhXDkZAKHW1CCCQ&sig2=tzCudhyYG42YL6qJm1BGHg&usg=AFQjCNGn-E88bCtSiEIPGr8tNvdc3WMduw");
						dl = new Intent(dl.ACTION_VIEW, a);
						startActivity(dl);
					}
				});
			bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vu){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						Toast.makeText(apa.this, "Instalação de " + lp + " Cancelada!!", Toast.LENGTH_LONG).show();
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Holo Launcher HD"){
			AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
			bd.setTitle("Holo Launcher HD");
			bd.setIcon(R.drawable.ic_launcher);
			bd.setMessage(apa14());
			bd.setPositiveButton("Baixar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						a = a.parse("http://www.google.com.br/url?q=https://play.google.com/store/apps/details%3Fid%3Dcom.mobint.hololauncher.hd%26hl%3Dpt_BR&sa=U&ved=0CAsQFjAAahUKEwj-gPS11vzHAhUKkpAKHWRGD8A&sig2=mbw0a4zq9ynJtNUI1IJvbA&usg=AFQjCNG-V3zmFXi7yIS4uJ-fhpmmu1GXBA");
						dl = new Intent(dl.ACTION_VIEW, a);
						startActivity(dl);
					}
				});
			bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vu){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						Toast.makeText(apa.this, "Instalação de " + lp + " Cancelada!!", Toast.LENGTH_LONG).show();
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Google Tradutor"){
			AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
			bd.setTitle("Google Tradutor");
			bd.setIcon(R.drawable.ic_launcher);
			bd.setMessage(apa12());
			bd.setPositiveButton("Baixar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						a = a.parse("http://www.google.com.br/url?q=https://play.google.com/store/apps/details%3Fid%3Dcom.google.android.apps.translate%26hl%3Dpt_BR&sa=U&ved=0CBUQFjAAahUKEwiR19_s1vzHAhXCFJAKHb1GCa8&sig2=i8g2UqasSSQDt4EgpAOTow&usg=AFQjCNHH7l13H4TORVFKMs-uAG_92IBQug");
						dl = new Intent(dl.ACTION_VIEW, a);
						startActivity(dl);
					}
				});
			bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vu){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						Toast.makeText(apa.this, "Instalação de " + lp + " Cancelada!!", Toast.LENGTH_LONG).show();
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Go Theme"){
			AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
			bd.setTitle("Go Theme");
			bd.setIcon(R.drawable.ic_launcher);
			bd.setMessage(apa13());
			bd.setPositiveButton("Baixar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						a = a.parse("https://play.google.com/store/apps/details?id=com.jb.gokeyboard.theme.tmeflames&hl=pt_BR&referrer=utm_source%3Dgoogle%26utm_medium%3Dorganic%26utm_term%3Dteclado+fogo+para+android&pcampaignid=APPU_1__8I3Vv2rEsSgwATB7a2wDw");
						dl = new Intent(dl.ACTION_VIEW, a);
						startActivity(dl);
					}
				});
			bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vu){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						Toast.makeText(apa.this, "Instalação de " + lp + " Cancelada!!", Toast.LENGTH_LONG).show();
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Terminal Emulator"){
			AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
			bd.setTitle("Terminal Emulator");
			bd.setIcon(R.drawable.ic_launcher);
			bd.setMessage(apa11());
			bd.setPositiveButton("Baixar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						a = a.parse("http://www.google.com.br/url?q=https://play.google.com/store/apps/details%3Fid%3Djackpal.androidterm%26hl%3Dpt_BR&sa=U&ved=0CAsQFjAAahUKEwig46r61vzHAhUFQ5AKHRL3AMg&sig2=Vu0-PBJ-EsI8v9G5K217Ow&usg=AFQjCNH2-07jrP7gyRzcXb7C8IX5NIOK4Q");
						dl = new Intent(dl.ACTION_VIEW, a);
						startActivity(dl);
					}
				});
			bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vu){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						Toast.makeText(apa.this, "Instalação de " + lp + " Cancelada!!", Toast.LENGTH_LONG).show();
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Quoda"){
			AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
			bd.setTitle("Quoda");
			bd.setIcon(R.drawable.ic_launcher);
			bd.setMessage(apa10());
			bd.setPositiveButton("Baixar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						a = a.parse("https://play.google.com/store/apps/details?id=com.henrythompson.quoda");
						dl = new Intent(dl.ACTION_VIEW, a);
						startActivity(dl);
					}
				});
			bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vu){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						Toast.makeText(apa.this, "Instalação de " + lp + " Cancelada!!", Toast.LENGTH_LONG).show();
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "AIDE Java, Android, C/C++"){
			AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
			bd.setTitle("AIDE Java, Android, C/C++");
			bd.setIcon(R.drawable.ic_launcher);
			bd.setMessage(apa9());
			bd.setPositiveButton("Baixar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						a = a.parse("https://play.google.com/store/apps/details?id=com.aide.ui&hl=pt_BR&referrer=utm_source%3Dgoogle%26utm_medium%3Dorganic%26utm_term%3Daide+android&pcampaignid=APPU_1_udcgVoX3GILReJbfulA");
						dl = new Intent(dl.ACTION_VIEW, a);
						startActivity(dl);
					}
				});
			bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vu){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						Toast.makeText(apa.this, "Instalação de " + lp + " Cancelada!!", Toast.LENGTH_LONG).show();
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Firefox"){
			AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
			bd.setTitle("Firefox");
			bd.setIcon(R.drawable.ic_launcher);
			bd.setMessage(apa8());
			bd.setPositiveButton("Baixar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						a = a.parse("https://play.google.com/store/apps/details?id=org.mozilla.firefox&hl=pt_BR&referrer=utm_source%3Dgoogle%26utm_medium%3Dorganic%26utm_term%3Dfirefox+android&pcampaignid=APP,U_1_Z9ggVqIYjfF69OmO2AM");
						dl = new Intent(dl.ACTION_VIEW, a);
						startActivity(dl);
					}
				});
			bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vu){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						Toast.makeText(apa.this, "Instalação de " + lp + " Cancelada!!", Toast.LENGTH_LONG).show();
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Du Battery Saver"){
			AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
			bd.setTitle("Du Battery Saver");
			bd.setIcon(R.drawable.ic_launcher);
			bd.setMessage(apa6());
			bd.setPositiveButton("Baixar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						a = a.parse("https://play.google.com/store/apps/details?id=com.dianxinos.dxbs");
						dl = new Intent(dl.ACTION_VIEW, a);
						startActivity(dl);
					}
				});
			bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vu){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						Toast.makeText(apa.this, "Instalação de " + lp + " Cancelada!!", Toast.LENGTH_LONG).show();
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "PicsArt"){
			AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
			bd.setTitle("PicsArt");
			bd.setIcon(R.drawable.ic_launcher);
			bd.setMessage(apa5());
			bd.setPositiveButton("Baixar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						a = a.parse("https://www.google.com.br/url?q=https://play.google.com/store/apps/details%3Fid%3Dcom.picsart.studio%26hl%3Dpt_BR&sa=U&ved=0CAsQFjAAahUKEwil76SP_enIAhXFH5AKHSXIBh4&usg=AFQjCNEjVXgwfIzqhVfBWEZiRxzf2LxdNw");
						dl = new Intent(dl.ACTION_VIEW, a);
						startActivity(dl);
					}
				});
			bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vu){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						Toast.makeText(apa.this, "Instalação de " + lp + " Cancelada!!", Toast.LENGTH_LONG).show();
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Wifi Scanner"){
			AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
			bd.setTitle("Wifi Scanner");
			bd.setIcon(R.drawable.ic_launcher);
			bd.setMessage(apa3());
			bd.setPositiveButton("Baixar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						a = a.parse("https://play.google.com/store/apps/details?id=com.easymobile.lan.scanner");
						dl = new Intent(dl.ACTION_VIEW, a);
						startActivity(dl);
					}
				});
			bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vu){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						Toast.makeText(apa.this, "Instalação de " + lp + " Cancelada!!", Toast.LENGTH_LONG).show();
					}
				});
			bd.create();
			bd.show();
		}
		if(lp.toString() == "Gravador de vóz avançado"){
			AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
			bd.setTitle("Gravador de vóz avançado");
			bd.setIcon(R.drawable.ic_launcher);
			bd.setMessage(apa2());
			bd.setPositiveButton("Baixar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vi){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						a = a.parse("https://play.google.com/store/apps/details?id=com.enlightment.voicerecorder&hl=pt_BR&referrer=utm_source%3Dgoogle%26utm_medium%3Dorganic%26utm_term%3Dgravador+de+v%C3%B3z+avan%C3%A7ado&pcampaignid=APPU_1_gONGVpyCNoyXwgSxyq-QAw");
						dl = new Intent(dl.ACTION_VIEW, a);
						startActivity(dl);
					}
				});
			bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
					public void onClick(DialogInterface d, int vu){
						MediaPlayer md = MediaPlayer.create(apa.this, R.raw.click_);
						md.start();
						Toast.makeText(apa.this, "Instalação de " + lp + " Cancelada!!", Toast.LENGTH_LONG).show();
					}
				});
			bd.create();
			bd.show();
		}
	}
	String apa2(){
		r = getResources().openRawResource(R.raw.apa2);
		ByteArrayOutputStream c = new ByteArrayOutputStream();
		int s;
		try{
			s = r.read();
			while(s != -1){
				c.write(s);
				s = r.read();
			}
			c.close();
		} catch(IOException e){
		}
		return c.toString();
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
				startActivity(Intent.createChooser(fe, "Por favor, selecione seu provedor \n de Email e envie sua reclamação..."));
				return true;
		}
		return true;
	}
}
