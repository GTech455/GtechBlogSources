package gtechblog455.blogspot.com.app;
import android.app.*;
import android.os.*;
import android.view.*;
import android.net.*;
import android.media.*;
import android.support.v7.app.AlertDialog;
import gtechblog455.blogspot.com.app.gtech_blog_adapter_list.ad;
import java.io.*;
import android.content.*;
import android.content.res.*;
import android.widget.*;
import android.text.method.*;
import android.view.View.*;
import android.support.v4.app.*;
public class gpc extends ListActivity{
	Uri a;
	MediaPlayer md;
	Intent dl;
	AssetManager as;
	InputStream r;
	byte[] bf;
	int s;
   public void onCreate(Bundle m) {
      super.onCreate(m);
      setContentView(R.layout.gpc);
	  getActionBar().setDisplayHomeAsUpEnabled(true);
	   getWindow().setBackgroundDrawableResource(R.raw.bg);
      String[] lt = {
		   "ATTACK ON TITAN WINGS OF FREEDOM",
		   "Resident Evil 4",
		   "Surve",
		  "Call of Duty 4: Modern Warfare",
		 "Saint Seiya: Soldiers Soul Completo PC Torrent",
		 "Duke Nukem 3D 20th Anniversary World Tour",
		 "Shadow Warrior 2: Deluxe Edition",
      };
	  int[] rs  = {
		  R.drawable.titan,
		  R.drawable.resident,
		  R.drawable.surve,
		  R.drawable.modern,
		  R.drawable.saint,
		  R.drawable.duke,
		  R.drawable.shadow_warrior
	  };
	   setListAdapter(new ad(this, lt, rs));
   }
	String gpc7(){
		r = getResources().openRawResource(R.raw.gpc_action_7);
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
	String gpc6(){
		r = getResources().openRawResource(R.raw.gpc_action_6);
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
	String gpc5(){
		r = getResources().openRawResource(R.raw.gpc_action_5);
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
	String gpc4(){
		r = getResources().openRawResource(R.raw.gpc_action_4);
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
	String gpc3(){
		r = getResources().openRawResource(R.raw.gpc_action_3);
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
	String gpc2(){
		r = getResources().openRawResource(R.raw.gpc_action_2);
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
	String gpc1(){
		r = getResources().openRawResource(R.raw.gpc_action_1);
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
	   Object o = this.getListAdapter().getItem(p);
	   final String lp = o.toString();
	   md = MediaPlayer.create(gpc.this, R.raw.click_);
	   md.start();
	   if(lp.toString() == "ATTACK ON TITAN WINGS OF FREEDOM"){
		   AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
		   bd.setTitle(lp);
		   bd.setIcon(R.raw.gpc);
		   bd.setMessage(gpc7());
		   bd.setPositiveButton("Baixar", new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   MediaPlayer md = MediaPlayer.create(gpc.this, R.raw.click_);
					   md.start();
					   a = a.parse("http://jogoscompletostorrents.com/games/Attack.on.Titan.Wings.of.Freedom-ALI213.torrent");
					   dl = new Intent(dl.ACTION_VIEW, a);
					   startActivity(dl);
				   }
			   });
		   bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vu){
					   MediaPlayer md = MediaPlayer.create(gpc.this, R.raw.click_);
					   md.start();
					   Toast.makeText(gpc.this, "Instalacao de " + lp + " Cancelada!!", Toast.LENGTH_LONG).show();
				   }
			   });
		   bd.create();
		   bd.show();
	   }
	   if(lp.toString() == "Resident Evil 4"){
		   AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
		   bd.setTitle(lp);
		   bd.setIcon(R.raw.gpc);
		   bd.setMessage(gpc6());
		   bd.setPositiveButton("Baixar", new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   MediaPlayer md = MediaPlayer.create(gpc.this, R.raw.click_);
					   md.start();
					   a = a.parse("http://www.serienemaplay.com/2016/11/resident-evil-4-release-date-revealed.html");
					   dl = new Intent(dl.ACTION_VIEW, a);
					   startActivity(dl);
				   }
			   });
		   bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vu){
					   MediaPlayer md = MediaPlayer.create(gpc.this, R.raw.click_);
					   md.start();
					   Toast.makeText(gpc.this, "Instalacao de " + lp + " Cancelada!!", Toast.LENGTH_LONG).show();
				   }
			   });
		   bd.create();
		   bd.show();
	   }
	   if(lp.toString() == "Surve"){
		   AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
		   bd.setTitle(lp);
		   bd.setIcon(R.raw.gpc);
		   bd.setMessage(gpc5());
		   bd.setPositiveButton("Baixar", new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   MediaPlayer md = MediaPlayer.create(gpc.this, R.raw.click_);
					   md.start();
					   a = a.parse("http://www.gamestorrents.com/download.php?id=13995");
					   dl = new Intent(dl.ACTION_VIEW, a);
					   startActivity(dl);
				   }
			   });
		   bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vu){
					   MediaPlayer md = MediaPlayer.create(gpc.this, R.raw.click_);
					   md.start();
					   Toast.makeText(gpc.this, "Instalacao de " + lp + " Cancelada!!", Toast.LENGTH_LONG).show();
				   }
			   });
		   bd.create();
		   bd.show();
	   }
	   if(lp.toString() == "Call of Duty 4: Modern Warfare"){
		   AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
		   bd.setTitle(lp);
		   bd.setIcon(R.raw.gpc);
		   bd.setMessage(gpc4());
		   bd.setPositiveButton("Baixar", new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   MediaPlayer md = MediaPlayer.create(gpc.this, R.raw.click_);
					   md.start();
					   a = a.parse("ftp://ftp.snt.utwente.nl/pub/games/callofduty4/demo/CoD4MWDemoSetup.exe");
					   dl = new Intent(dl.ACTION_VIEW, a);
					   startActivity(dl);
				   }
			   });
		   bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vu){
					   MediaPlayer md = MediaPlayer.create(gpc.this, R.raw.click_);
					   md.start();
					   Toast.makeText(gpc.this, "Instalacao de " + lp + " Cancelada!!", Toast.LENGTH_LONG).show();
				   }
			   });
		   bd.create();
		   bd.show();
	   }
	   if(lp.toString() == "Saint Seiya: Soldiers Soul Completo PC Torrent"){
		   AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
		   bd.setTitle(lp);
		   bd.setIcon(R.raw.gpc);
		   bd.setMessage(gpc3());
		   bd.setPositiveButton("Baixar", new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   MediaPlayer md = MediaPlayer.create(gpc.this, R.raw.click_);
					   md.start();
					   a = a.parse("http://justgetitfaster.com/mobi?k=edfc4959f0df728bbb1647c4929ac311&q=Saint%20Seiya:%20Soldiers%20Soul%20Completo%20PC%20Torrent");
					   dl = new Intent(dl.ACTION_VIEW, a);
					   startActivity(dl);
				   }
			   });
		   bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vu){
					   MediaPlayer md = MediaPlayer.create(gpc.this, R.raw.click_);
					   md.start();
					   Toast.makeText(gpc.this, "Instalacao de " + lp + " Cancelada!!", Toast.LENGTH_LONG).show();
				   }
			   });
		   bd.create();
		   bd.show();
	   }
	   if(lp.toString() == "Duke Nukem 3D 20th Anniversary World Tour"){
		   AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
		   bd.setTitle(lp);
		   bd.setIcon(R.raw.gpc);
		   bd.setMessage(gpc2());
		   bd.setPositiveButton("Baixar", new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   MediaPlayer md = MediaPlayer.create(gpc.this, R.raw.click_);
					   md.start();
					   a = a.parse("http://justgetitfaster.com/mobi?k=edfc4959f0df728bbb1647c4929ac311&q=Download%20Duke%20Nukem%203D%2020th%20Anniversary%20World%20Tour%20%E2%80%93%20PC%20Torrent");
					   dl = new Intent(dl.ACTION_VIEW, a);
					   startActivity(dl);
				   }
			   });
		   bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vu){
					   MediaPlayer md = MediaPlayer.create(gpc.this, R.raw.click_);
					   md.start();
					   Toast.makeText(gpc.this, "Instalacao de " + lp + " Cancelada!!", Toast.LENGTH_LONG).show();
				   }
			   });
		   bd.create();
		   bd.show();
	   }
	   if(lp.toString() == "Shadow Warrior 2: Deluxe Edition"){
		   AlertDialog.Builder bd = new AlertDialog.Builder(this, R.style.alert);
		   bd.setTitle(lp);
		   bd.setIcon(R.raw.gpc);
		   bd.setMessage(gpc1());
		   bd.setPositiveButton("Baixar", new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vi){
					   MediaPlayer md = MediaPlayer.create(gpc.this, R.raw.click_);
					   md.start();
					   a = a.parse("http://justgetitfaster.com/mobi?k=edfc4959f0df728bbb1647c4929ac311&q=Download%20Shadow%20Warrior%202:%20Deluxe%20Edition%20%E2%80%93%20PC%20Torrent");
					   dl = new Intent(dl.ACTION_VIEW, a);
					   startActivity(dl);
				   }
			   });
		   bd.setNegativeButton("Cancelar", new DialogInterface.OnClickListener(){
				   public void onClick(DialogInterface d, int vu){
					   MediaPlayer md = MediaPlayer.create(gpc.this, R.raw.click_);
					   md.start();
					   Toast.makeText(gpc.this, "Instalacao de " + lp + " Cancelada!!", Toast.LENGTH_LONG).show();
				   }
			   });
		   bd.create();
		   bd.show();
	   }
   }
   public void ref(View v){
	   md = MediaPlayer.create(gpc.this, R.raw.click_);
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
