package gtechblog455.blogspot.com.app;
import android.app.*;
import android.os.*;
import android.text.method.*;
import android.net.*;
import android.media.*;
import android.widget.*;
import android.view.*;
import android.support.v7.app.AlertDialog;
import gtechblog455.blogspot.com.app.gtech_blog_adapter_list.ad;
import java.io.*;
import android.content.*;
import android.view.View.OnClickListener;
import android.content.res.*;
import android.support.v4.app.*;
public class apwin extends ListActivity{
	InputStream r;
	byte[] bf;
	int size;
	AssetManager as;
	Uri a;
	Intent dl;
	MediaPlayer md;
   public void onCreate(Bundle m) {
      super.onCreate(m);
 setContentView(R.layout.win);
 getActionBar().setDisplayHomeAsUpEnabled(true);
	   getWindow().setBackgroundDrawableResource(R.raw.bg);
 Toast.makeText(this, "Apenas com o tela na horizontal!!", Toast.LENGTH_LONG).show();
 
String[] lt = {
    "AMD Catalyst Driver para Windows 8",
    "Excel 2013",
	"Cube",
	"MP3 Gain",
	"Virtual Dub",
	"Cheat Engine",
	"Ultr@ VNC",
	"Cdex",
	"Raidcall",
	"DreaMule",
	"LimeWire",
	"MegaCubo",
	"Ares Galaxy",
	"eMule",
	"Notepad++",
	"Balabolka",
	"BluesTacks",
	"GenyMotion",
	"Skype",
    "FreeRapid Downloader 0.86u1"
};   
	   int[] rs = {
		   R.drawable.amd_ic,
		   R.drawable.excell_ic,
		   R.drawable.qube_ic,
		   R.drawable.gain_ic,
		   R.drawable.dub_ic,
		   R.drawable.cheat_ic,
		   R.drawable.ultra_ic,
		   R.drawable.cdex_ic,
		   R.drawable.raid_ic,
		   R.drawable.drea_ic,
		   R.drawable.lime_ic,
		   R.drawable.mega_ic,
		   R.drawable.ares_ic,
		   R.drawable.emule_ic,
		   R.drawable.npp_ic,
		   R.drawable.bala_ic,
		   R.drawable.blues_ic,
		   R.drawable.geny_ic,
		   R.drawable.skype_ic,
		   R.drawable.free_ic,
	   };
setListAdapter(new ad(this, lt, rs));
   }
	String win20(){
		r = getResources().openRawResource(R.raw.win20);
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
	String win19(){
		r = getResources().openRawResource(R.raw.win19);
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
	String win18(){
		r = getResources().openRawResource(R.raw.win18);
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
	String win17(){
		r = getResources().openRawResource(R.raw.win17);
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
   String win16(){
	   r = getResources().openRawResource(R.raw.win16);
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
	String win15(){
		r = getResources().openRawResource(R.raw.win15);
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
	String win14(){
		r = getResources().openRawResource(R.raw.win14);
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
	String win13(){
		r = getResources().openRawResource(R.raw.win13);
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
	String win12(){
		r = getResources().openRawResource(R.raw.win12);
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
	String win11(){
		r = getResources().openRawResource(R.raw.win11);
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
	String win10(){
		r = getResources().openRawResource(R.raw.win10);
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
	String win9(){
		r = getResources().openRawResource(R.raw.win9);
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
	String win8(){
		r = getResources().openRawResource(R.raw.win8);
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
	String win7(){
		r = getResources().openRawResource(R.raw.win7);
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
	String win6(){
		r = getResources().openRawResource(R.raw.win6);
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
	String win5(){
		r = getResources().openRawResource(R.raw.win5);
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
	String win4(){
		r = getResources().openRawResource(R.raw.win4);
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
	String win3(){
		r = getResources().openRawResource(R.raw.win3);
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
	String win2(){
		r = getResources().openRawResource(R.raw.win2);
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
	String win1(){
		r = getResources().openRawResource(R.raw.win1);
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
   public void onListItemClick(ListView l, View v, int p, long id){
   	Object o = this.getListAdapter().getItem(p);
   	final String lp = o.toString();
	md = MediaPlayer.create(apwin.this, R.raw.click_);
	   md.start();
	   if(lp.toString() == "AMD Catalyst Driver para Windows 8"){
		   AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
		   bd.setTitle(lp);
		   bd.setIcon(R.raw.exe);
		   bd.setMessage(win20());
		   bd.setNeutralButton("Baixar", new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   MediaPlayer md = MediaPlayer.create(apwin.this, R.raw.click_);
					   md.start();
					   a = a.parse("http://www.baixaki.com.br/site/dwnld83584.htm");
					   dl = new Intent(dl.ACTION_VIEW, a);
					   startActivity(dl);
				   }
			   });
		   bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   md = MediaPlayer.create(apwin.this, R.raw.click_);
					   md.start();
					   Toast.makeText(apwin.this, "Download de " + lp + " cancelado!!", Toast.LENGTH_LONG).show();
				   }
			   });
		   bd.setPositiveButton("Screen", new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   md = MediaPlayer.create(apwin.this, R.raw.click_);
					   md.start();
					   LayoutInflater y = getLayoutInflater();
					   View view = y.inflate(R.layout.imw20, null);
					   AlertDialog.Builder bd = new AlertDialog.Builder(apwin.this, R.style.alert);
					   bd.setView(view);
					   bd.create();
					   bd.show();
				   }
			   });
		   bd.create();
		   bd.show();
	   }
	   if(lp.toString() == "Excel 2013"){
		   AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
		   bd.setTitle(lp);
		   bd.setIcon(R.raw.exe);
		   bd.setMessage(win19());
		   bd.setNeutralButton("Baixar", new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   MediaPlayer md = MediaPlayer.create(apwin.this, R.raw.click_);
					   md.start();
					   a = a.parse("http://microsoft-excel.en.softonic.com/download");
					   dl = new Intent(dl.ACTION_VIEW, a);
					   startActivity(dl);
				   }
			   });
		   bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   md = MediaPlayer.create(apwin.this, R.raw.click_);
					   md.start();
					   Toast.makeText(apwin.this, "Download de " + lp + " cancelado!!", Toast.LENGTH_LONG).show();
				   }
			   });
		   bd.setPositiveButton("Screen", new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   md = MediaPlayer.create(apwin.this, R.raw.click_);
					   md.start();
					   LayoutInflater y = getLayoutInflater();
					   View view = y.inflate(R.layout.imw19, null);
					   AlertDialog.Builder bd = new AlertDialog.Builder(apwin.this, R.style.alert);
					   bd.setView(view);
					   bd.create();
					   bd.show();
				   }
			   });
		   bd.create();
		   bd.show();
	   }
	   if(lp.toString() == "Cube"){
		   AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
		   bd.setTitle(lp);
		   bd.setIcon(R.raw.exe);
		   bd.setMessage(win18());
		   bd.setNeutralButton("Baixar", new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   MediaPlayer md = MediaPlayer.create(apwin.this, R.raw.click_);
					   md.start();
					   a = a.parse("http://www.superdownloads.com.br/download/108/cube-windows/after-download-32-bits.html");
					   dl = new Intent(dl.ACTION_VIEW, a);
					   startActivity(dl);
				   }
			   });
		   bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   md = MediaPlayer.create(apwin.this, R.raw.click_);
					   md.start();
					   Toast.makeText(apwin.this, "Download de " + lp + " cancelado!!", Toast.LENGTH_LONG).show();
				   }
			   });
		   bd.setPositiveButton("Screen", new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   md = MediaPlayer.create(apwin.this, R.raw.click_);
					   md.start();
					   LayoutInflater y = getLayoutInflater();
					   View view = y.inflate(R.layout.imw18, null);
					   AlertDialog.Builder bd = new AlertDialog.Builder(apwin.this, R.style.alert);
					   bd.setView(view);
					   bd.create();
					   bd.show();
				   }
			   });
		   bd.create();
		   bd.show();
	   }
	   if(lp.toString() == "FreeRapid Downloader 0.86u1"){
		   AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
		   bd.setTitle(lp);
		   bd.setIcon(R.raw.exe);
		   bd.setMessage(win17());
		   bd.setNeutralButton("Baixar", new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   MediaPlayer md = MediaPlayer.create(apwin.this, R.raw.click_);
					   md.start();
					   a = a.parse("http://www.superdownloads.com.br/download/12/freerapid-downloader/after-download-32-bits.html");
					   dl = new Intent(dl.ACTION_VIEW, a);
					   startActivity(dl);
				   }
			   });
		   bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   md = MediaPlayer.create(apwin.this, R.raw.click_);
					   md.start();
					   Toast.makeText(apwin.this, "Download de " + lp + " cancelado!!", Toast.LENGTH_LONG).show();
				   }
			   });
		   bd.setPositiveButton("Screen", new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   md = MediaPlayer.create(apwin.this, R.raw.click_);
					   md.start();
					   LayoutInflater y = getLayoutInflater();
					   View view = y.inflate(R.layout.imw17, null);
					   AlertDialog.Builder bd = new AlertDialog.Builder(apwin.this, R.style.alert);
					   bd.setView(view);
					   bd.create();
					   bd.show();
				   }
			   });
		   bd.create();
		   bd.show();
	   }
	   if(lp.toString() == "Skype"){
		   AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
		   bd.setTitle(lp);
		   bd.setIcon(R.raw.exe);
		   bd.setMessage(win16());
		   bd.setNeutralButton("Baixar", new DialogInterface.OnClickListener(){
			   public void onClick(DialogInterface d, int vi){
				   MediaPlayer md = MediaPlayer.create(apwin.this, R.raw.click_);
				   md.start();
				   a = a.parse("http://www.google.com.br/url?q=http://m.baixaki.com.br/download/skype.htm&sa=U&ved=0CB8QFjAEahUKEwjyyN-BtffHAhUDipAKHUrcD6k&sig2=cJEF7r_M_ZxtANHlo8nUXw&usg=AFQjCNFAOLdqLhEdnnZIb-zxcC2oG0W9aQ");
				   dl = new Intent(dl.ACTION_VIEW, a);
				   startActivity(dl);
					   }
				   });
		   bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   md = MediaPlayer.create(apwin.this, R.raw.click_);
					   md.start();
					  Toast.makeText(apwin.this, "Download de " + lp + " cancelado!!", Toast.LENGTH_LONG).show();
				   }
			   });
		   bd.setPositiveButton("Screen", new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   md = MediaPlayer.create(apwin.this, R.raw.click_);
					   md.start();
					   LayoutInflater y = getLayoutInflater();
					   View view = y.inflate(R.layout.imw16, null);
					   AlertDialog.Builder bd = new AlertDialog.Builder(apwin.this, R.style.alert);
					   bd.setView(view);
					   bd.create();
					   bd.show();
				   }
			   });
		   bd.create();
		   bd.show();
	   }
	   if(lp.toString() == "GenyMotion"){
		   AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
		   bd.setTitle(lp);
		   bd.setIcon(R.raw.exe);
		   bd.setMessage(win15());
		   bd.setNeutralButton("Baixar", new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   md = MediaPlayer.create(apwin.this, R.raw.click_);
					   md.start();
					   a = a.parse("http://www.google.com.br/url?q=http://m.baixaki.com.br/download/genymotion.htm&sa=U&ved=0CBoQFjAGahUKEwjtuIiYtffHAhVGC5AKHXk4AtI&sig2=JV5HU09OQfUF-WN1NaW8gw&usg=AFQjCNGEofa3lhANx1aKne8wFwbV4E7vrQ");
					   dl = new Intent(dl.ACTION_VIEW, a);
					   startActivity(dl);
				   }
			   });
		   bd.setPositiveButton("Ver Screen", new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   md = MediaPlayer.create(apwin.this, R.raw.click_);
					   md.start();
					   LayoutInflater y = getLayoutInflater();
					   View view = y.inflate(R.layout.imw15, null);
					   AlertDialog.Builder bd = new AlertDialog.Builder(apwin.this, R.style.alert);
					   bd.setView(view);
					   bd.create();
					   bd.show();
				   }
			   });
		   bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   md = MediaPlayer.create(apwin.this, R.raw.click_);
					   md.start();
					   Toast.makeText(apwin.this, "Download de " + lp + " cancelado!!", Toast.LENGTH_LONG).show();
				   }
			   });
		   bd.create();
		   bd.show();
	   }
	   if(lp.toString() == "BluesTacks"){
		   AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
		   bd.setTitle(lp);
		   bd.setIcon(R.raw.exe);
		   bd.setMessage(win14());
		   bd.setNeutralButton("Baixar", new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   md = MediaPlayer.create(apwin.this, R.raw.click_);
					   md.start();
					   a = a.parse("http://www.google.com.br/url?q=http://m.baixaki.com.br/download/bluestacks.htm&sa=U&ved=0CC0QFjALahUKEwipm5Wuu_nHAhVIJB4KHQvCCNI&sig2=bkP7Ecp-Q1BUqPGftQyfJg&usg=AFQjCNHwLtQVGI1CLc5lCArvMY9Ng8itNQ");
					   dl = new Intent(dl.ACTION_VIEW, a);
					   startActivity(dl);
				   }
			   });
		   bd.setPositiveButton("Screen", new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   md = MediaPlayer.create(apwin.this, R.raw.click_);
					   md.start();
					   LayoutInflater y = getLayoutInflater();
					   View view = y.inflate(R.layout.imw14, null);
					   AlertDialog.Builder bd = new AlertDialog.Builder(apwin.this, R.style.alert);
					   bd.setView(view);
					   bd.create();
					   bd.show();
				   }
			   });
		   bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   md = MediaPlayer.create(apwin.this, R.raw.click_);
					   md.start();
					   Toast.makeText(apwin.this, "Download de " + lp + " cancelado!!", Toast.LENGTH_LONG).show();
				   }
			   });
		   bd.create();
		   bd.show();
	   }
	   if(lp.toString() == "Balabolka"){
		   AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
		   bd.setTitle(lp);
		   bd.setIcon(R.raw.exe);
		   bd.setMessage(win13());
		   bd.setNeutralButton("Baixar", new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   md = MediaPlayer.create(apwin.this, R.raw.click_);
					   md.start();
					   a = a.parse("http://www.google.com.br/url?q=http://m.baixaki.com.br/download/balabolka.htm&sa=U&ved=0CA0QFjAAahUKEwit5MqK-vnHAhVGHx4KHcuxBFk&sig2=4f2s7SVKdU3fOesfFeF1Ag&usg=AFQjCNHpWzoFRneQuvq1SRdLczP4WhZEJQ");
					   dl = new Intent(dl.ACTION_VIEW, a);
					   startActivity(dl);
				   }
			   });
		   bd.setPositiveButton("Screen", new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   md = MediaPlayer.create(apwin.this, R.raw.click_);
					   md.start();
					   LayoutInflater y = getLayoutInflater();
					   View view = y.inflate(R.layout.imw13, null);
					   AlertDialog.Builder bd = new AlertDialog.Builder(apwin.this, R.style.alert);
					   bd.setView(view);
					   bd.create();
					   bd.show();
				   }
			   });
		   bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   md = MediaPlayer.create(apwin.this, R.raw.click_);
					   md.start();
					   Toast.makeText(apwin.this, "Download de " + lp + " cancelado!!", Toast.LENGTH_LONG).show();
				   }
			   });
		   bd.create();
		   bd.show();
	   }
	   if(lp.toString() == "Notepad++"){
		   AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
		   bd.setTitle(lp);
		   bd.setIcon(R.raw.exe);
		   bd.setMessage(win12());
		   bd.setNeutralButton("Baixar", new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   md = MediaPlayer.create(apwin.this, R.raw.click_);
					   md.start();
					   a = a.parse("https://www.dropbox.com/s/lf8u6xan5utydh9/npp.6.6.7.zip?dl=0");
					   dl = new Intent(dl.ACTION_VIEW, a);
					   startActivity(dl);
				   }
			   });
		   bd.setPositiveButton("Screen", new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   md = MediaPlayer.create(apwin.this, R.raw.click_);
					   md.start();
					   LayoutInflater y = getLayoutInflater();
					   View view = y.inflate(R.layout.imw12, null);
					   AlertDialog.Builder bd = new AlertDialog.Builder(apwin.this, R.style.alert);
					   bd.setView(view);
					   bd.create();
					   bd.show();
				   }
			   });
		   bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   md = MediaPlayer.create(apwin.this, R.raw.click_);
					   md.start();
					   Toast.makeText(apwin.this, "Download de " + lp + " cancelado!!", Toast.LENGTH_LONG).show();
				   }
			   });
		   bd.create();
		   bd.show();
	   }
	   if(lp.toString() == "eMule"){
		   AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
		   bd.setTitle(lp);
		   bd.setIcon(R.raw.exe);
		   bd.setMessage(win11());
		   bd.setNeutralButton("Baixar", new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   md = MediaPlayer.create(apwin.this, R.raw.click_);
					   md.start();
					   a = a.parse("http://www.superdownloads.com.br/download/139/emule/redir-32-bits.html");
					   dl = new Intent(dl.ACTION_VIEW, a);
					   startActivity(dl);
				   }
			   });
		   bd.setPositiveButton("Screen", new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   md = MediaPlayer.create(apwin.this, R.raw.click_);
					   md.start();
					   LayoutInflater y = getLayoutInflater();
					   View view = y.inflate(R.layout.imw11, null);
					   AlertDialog.Builder bd = new AlertDialog.Builder(apwin.this, R.style.alert);
					   bd.setView(view);
					   bd.create();
					   bd.show();
				   }
			   });
		   bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   md = MediaPlayer.create(apwin.this, R.raw.click_);
					   md.start();
					   Toast.makeText(apwin.this, "Download de " + lp + " cancelado!!", Toast.LENGTH_LONG).show();
				   }
			   });
		   bd.create();
		   bd.show();
	   }
	   if(lp.toString() == "Ares Galaxy"){
		   AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
		   bd.setTitle(lp);
		   bd.setIcon(R.raw.exe);
		   bd.setMessage(win11());
		   bd.setNeutralButton("Baixar", new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   md = MediaPlayer.create(apwin.this, R.raw.click_);
					   md.start();
					   a = a.parse("http://www.superdownloads.com.br/download/190/ares/redir-32-bits.html");
					   dl = new Intent(dl.ACTION_VIEW, a);
					   startActivity(dl);
				   }
			   });
		   bd.setPositiveButton("Screen", new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   md = MediaPlayer.create(apwin.this, R.raw.click_);
					   md.start();
					   LayoutInflater y = getLayoutInflater();
					   View view = y.inflate(R.layout.imw10, null);
					   AlertDialog.Builder bd = new AlertDialog.Builder(apwin.this, R.style.alert);
					   bd.setView(view);
					   bd.create();
					   bd.show();
				   }
			   });
		   bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   md = MediaPlayer.create(apwin.this, R.raw.click_);
					   md.start();
					   Toast.makeText(apwin.this, "Download de " + lp + " cancelado!!", Toast.LENGTH_LONG).show();
				   }
			   });
		   bd.create();
		   bd.show();
	   }
	   if(lp.toString() == "MegaCubo"){
		   AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
		   bd.setTitle(lp);
		   bd.setIcon(R.raw.exe);
		   bd.setMessage(win9());
		   bd.setNeutralButton("Baixar", new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   md = MediaPlayer.create(apwin.this, R.raw.click_);
					   md.start();
					   a = a.parse("http://www.superdownloads.com.br/download/162/megacubo/redir-32-bits.html");
					   dl = new Intent(dl.ACTION_VIEW, a);
					   startActivity(dl);
				   }
			   });
		   bd.setPositiveButton("Screen", new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   md = MediaPlayer.create(apwin.this, R.raw.click_);
					   md.start();
					   LayoutInflater y = getLayoutInflater();
					   View view = y.inflate(R.layout.imw9, null);
					   AlertDialog.Builder bd = new AlertDialog.Builder(apwin.this, R.style.alert);
					   bd.setView(view);
					   bd.create();
					   bd.show();
				   }
			   });
		   bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   md = MediaPlayer.create(apwin.this, R.raw.click_);
					   md.start();
					   Toast.makeText(apwin.this, "Download de " + lp + " cancelado!!", Toast.LENGTH_LONG).show();
				   }
			   });
		   bd.create();
		   bd.show();
	   }
	   if(lp.toString() == "LimeWire"){
		   AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
		   bd.setTitle(lp);
		   bd.setIcon(R.raw.exe);
		   bd.setMessage(win8());
		   bd.setNeutralButton("Baixar", new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   md = MediaPlayer.create(apwin.this, R.raw.click_);
					   md.start();
					   a = a.parse("http://www.superdownloads.com.br/download/51/limewire/redir-32-bits.html");
					   dl = new Intent(dl.ACTION_VIEW, a);
					   startActivity(dl);
				   }
			   });
		   bd.setPositiveButton("Screen", new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   md = MediaPlayer.create(apwin.this, R.raw.click_);
					   md.start();
					   LayoutInflater y = getLayoutInflater();
					   View view = y.inflate(R.layout.imw8, null);
					   AlertDialog.Builder bd = new AlertDialog.Builder(apwin.this, R.style.alert);
					   bd.setView(view);
					   bd.create();
					   bd.show();
				   }
			   });
		   bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   md = MediaPlayer.create(apwin.this, R.raw.click_);
					   md.start();
					   Toast.makeText(apwin.this, "Download de " + lp + " cancelado!!", Toast.LENGTH_LONG).show();
				   }
			   });
		   bd.create();
		   bd.show();
	   }
	   if(lp.toString() == "DreaMule"){
		   AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
		   bd.setTitle(lp);
		   bd.setIcon(R.raw.exe);
		   bd.setMessage(win7());
		   bd.setNeutralButton("Baixar", new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   md = MediaPlayer.create(apwin.this, R.raw.click_);
					   md.start();
					   a = a.parse("http://www.superdownloads.com.br/download/195/dreamule/redir-32-bits.html");
					   dl = new Intent(dl.ACTION_VIEW, a);
					   startActivity(dl);
				   }
			   });
		   bd.setPositiveButton("Screen", new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   md = MediaPlayer.create(apwin.this, R.raw.click_);
					   md.start();
					   LayoutInflater y = getLayoutInflater();
					   View view = y.inflate(R.layout.imw7, null);
					   AlertDialog.Builder bd = new AlertDialog.Builder(apwin.this, R.style.alert);
					   bd.setView(view);
					   bd.create();
					   bd.show();
				   }
			   });
		   bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   md = MediaPlayer.create(apwin.this, R.raw.click_);
					   md.start();
					   Toast.makeText(apwin.this, "Download de " + lp + " cancelado!!", Toast.LENGTH_LONG).show();
				   }
			   });
		   bd.create();
		   bd.show();
	   }
	   if(lp.toString() == "Raidcall"){
		   AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
		   bd.setTitle(lp);
		   bd.setIcon(R.raw.exe);
		   bd.setMessage(win6());
		   bd.setNeutralButton("Baixar", new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   md = MediaPlayer.create(apwin.this, R.raw.click_);
					   md.start();
					   a = a.parse("http://m.baixaki.com.br/download/raidcall.htm");
					   dl = new Intent(dl.ACTION_VIEW, a);
					   startActivity(dl);
				   }
			   });
		   bd.setPositiveButton("Screen", new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   md = MediaPlayer.create(apwin.this, R.raw.click_);
					   md.start();
					   LayoutInflater y = getLayoutInflater();
					   View view = y.inflate(R.layout.imw6, null);
					   AlertDialog.Builder bd = new AlertDialog.Builder(apwin.this, R.style.alert);
					   bd.setView(view);
					   bd.create();
					   bd.show();
				   }
			   });
		   bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   md = MediaPlayer.create(apwin.this, R.raw.click_);
					   md.start();
					   Toast.makeText(apwin.this, "Download de " + lp + " cancelado!!", Toast.LENGTH_LONG).show();
				   }
			   });
		   bd.create();
		   bd.show();
	   }
	   if(lp.toString() == "Cdex"){
		   AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
		   bd.setTitle(lp);
		   bd.setIcon(R.raw.exe);
		   bd.setMessage(win5());
		   bd.setNeutralButton("Baixar", new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   md = MediaPlayer.create(apwin.this, R.raw.click_);
					   md.start();
					   a = a.parse("http://www.superdownloads.com.br/download/156/cdex/redir-32-bits.html");
					   dl = new Intent(dl.ACTION_VIEW, a);
					   startActivity(dl);
				   }
			   });
		   bd.setPositiveButton("Screen", new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   md = MediaPlayer.create(apwin.this, R.raw.click_);
					   md.start();
					   LayoutInflater y = getLayoutInflater();
					   View view = y.inflate(R.layout.imw5, null);
					   AlertDialog.Builder bd = new AlertDialog.Builder(apwin.this, R.style.alert);
					   bd.setView(view);
					   bd.create();
					   bd.show();
				   }
			   });
		   bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   md = MediaPlayer.create(apwin.this, R.raw.click_);
					   md.start();
					   Toast.makeText(apwin.this, "Download de " + lp + " cancelado!!", Toast.LENGTH_LONG).show();
				   }
			   });
		   bd.create();
		   bd.show();
	   }
	   if(lp.toString() == "Ultr@ VNC"){
		   AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
		   bd.setTitle(lp);
		   bd.setIcon(R.raw.exe);
		   bd.setMessage(win4());
		   bd.setNeutralButton("Baixar", new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   md = MediaPlayer.create(apwin.this, R.raw.click_);
					   md.start();
					   a = a.parse("http://www.superdownloads.com.br/download/142/ultrvnc/redir-32-bits.html");
					   dl = new Intent(dl.ACTION_VIEW, a);
					   startActivity(dl);
				   }
			   });
		   bd.setPositiveButton("Screen", new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   md = MediaPlayer.create(apwin.this, R.raw.click_);
					   md.start();
					   LayoutInflater y = getLayoutInflater();
					   View view = y.inflate(R.layout.imw4, null);
					   AlertDialog.Builder bd = new AlertDialog.Builder(apwin.this, R.style.alert);
					   bd.setView(view);
					   bd.create();
					   bd.show();
				   }
			   });
		   bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   md = MediaPlayer.create(apwin.this, R.raw.click_);
					   md.start();
					   Toast.makeText(apwin.this, "Download de " + lp + " cancelado!!", Toast.LENGTH_LONG).show();
				   }
			   });
		   bd.create();
		   bd.show();
	   }
	   if(lp.toString() == "Cheat Engine"){
		   AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
		   bd.setTitle(lp);
		   bd.setIcon(R.raw.exe);
		   bd.setMessage(win3());
		   bd.setNeutralButton("Baixar", new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   md = MediaPlayer.create(apwin.this, R.raw.click_);
					   md.start();
					   a = a.parse("http://www.superdownloads.com.br/download/57/cheat-engine/redir-32-bits.html");
					   dl = new Intent(dl.ACTION_VIEW, a);
					   startActivity(dl);
				   }
			   });
		   bd.setPositiveButton("Screen", new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   md = MediaPlayer.create(apwin.this, R.raw.click_);
					   md.start();
					   LayoutInflater y = getLayoutInflater();
					   View view = y.inflate(R.layout.imw3, null);
					   AlertDialog.Builder bd = new AlertDialog.Builder(apwin.this, R.style.alert);
					   bd.setView(view);
					   bd.create();
					   bd.show();
				   }
			   });
		   bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   md = MediaPlayer.create(apwin.this, R.raw.click_);
					   md.start();
					   Toast.makeText(apwin.this, "Download de " + lp + " cancelado!!", Toast.LENGTH_LONG).show();
				   }
			   });
		   bd.create();
		   bd.show();
	   }
	   if(lp.toString() == "Virtual Dub"){
		   AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
		   bd.setTitle(lp);
		   bd.setIcon(R.raw.exe);
		   bd.setMessage(win2());
		   bd.setNeutralButton("Baixar", new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   md = MediaPlayer.create(apwin.this, R.raw.click_);
					   md.start();
					   a = a.parse("http://www.superdownloads.com.br/download/139/virtualdub/redir-32-bits.html");
					   dl = new Intent(dl.ACTION_VIEW, a);
					   startActivity(dl);
				   }
			   });
		   bd.setPositiveButton("Screen", new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   md = MediaPlayer.create(apwin.this, R.raw.click_);
					   md.start();
					   LayoutInflater y = getLayoutInflater();
					   View view = y.inflate(R.layout.imw2, null);
					   AlertDialog.Builder bd = new AlertDialog.Builder(apwin.this, R.style.alert);
					   bd.setView(view);
					   bd.create();
					   bd.show();
				   }
			   });
		   bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   md = MediaPlayer.create(apwin.this, R.raw.click_);
					   md.start();
					   Toast.makeText(apwin.this, "Download de " + lp + " cancelado!!", Toast.LENGTH_LONG).show();
				   }
			   });
		   bd.create();
		   bd.show();
	   }
	if(lp.toString() == "MP3 Gain"){
		AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
		bd.setTitle(lp);
		bd.setIcon(R.raw.exe);
		bd.setMessage(win1());
		bd.setNeutralButton("Baixar", new DialogInterface.OnClickListener(){
				public void onClick(DialogInterface d, int vi){
					md = MediaPlayer.create(apwin.this, R.raw.click_);
					md.start();
					a = a.parse("http://www.superdownloads.com.br/download/95/mp3gain/redir-32-bits.html");
					dl = new Intent(dl.ACTION_VIEW, a);
					startActivity(dl);
				}
			});
		bd.setPositiveButton("Screen", new DialogInterface.OnClickListener(){
				public void onClick(DialogInterface d, int vi){
					md = MediaPlayer.create(apwin.this, R.raw.click_);
					md.start();
					LayoutInflater y = getLayoutInflater();
					View view = y.inflate(R.layout.imw1, null);
					AlertDialog.Builder bd = new AlertDialog.Builder(apwin.this, R.style.alert);
					bd.setView(view);
					bd.create();
					bd.show();
				}
			});
		bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
				public void onClick(DialogInterface d, int vi){
					md = MediaPlayer.create(apwin.this, R.raw.click_);
					md.start();
					Toast.makeText(apwin.this, "Download de " + lp + " cancelado!!", Toast.LENGTH_LONG).show();
				}
			});
		bd.create();
		bd.show();
		}
   }
   	public void ref(View v){
		MediaPlayer md = MediaPlayer.create(apwin.this, R.raw.click_);
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
