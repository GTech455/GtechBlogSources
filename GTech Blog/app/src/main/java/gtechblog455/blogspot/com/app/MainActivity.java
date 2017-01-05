package gtechblog455.blogspot.com.app;

import android.app.*;
import android.content.*;
import android.content.res.*;
import android.media.*;
import android.net.*;
import android.os.*;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.view.View;
import android.view.*;
import android.widget.*;
import android.widget.AdapterView.*;
import gtechblog455.blogspot.com.app.gtech_blog_adapter_list.*;
import java.io.*;

import android.app.TaskStackBuilder;

public class MainActivity extends Activity 
{
	FileWriter fw;
	AssetManager as;
	InputStream r;
	int s;
	Intent dl;
	Uri a;
	byte[] bf;
	BufferedWriter bff;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m);
		getWindow().setBackgroundDrawableResource(R.raw.bg);
		String[] lt = {
			"Apps",
			"Cursores",
			"Games",
			"Extras",
			"Assemblers",
		};
		int[] rs = {
			R.raw.apps,
			R.raw.ct,
			R.raw.gm,
			R.raw.apps,
			R.raw.apps
		};
		GridView g = (GridView) findViewById(R.id.grid);
		g.setAdapter(new ImAd(this, lt, rs));
		g.setOnItemClickListener(new OnItemClickListener(){
			public void onItemClick(AdapterView<?> a, View v, int p, long id){
				switch(p){
					case 0:
						MediaPlayer md = MediaPlayer.create(MainActivity.this, R.raw.click_);
						md.start();
						final String[] lt = {
							"Apps - Android",
							"Apps - Windows",
							"Programas Especiais",
							"Programas Especiais - Android"
						};
						ArrayAdapter ad = new ArrayAdapter(MainActivity.this, R.layout.main, R.id.tv, lt);
						AlertDialog.Builder bd = new AlertDialog.Builder(MainActivity.this);
						bd.setSingleChoiceItems(ad, 0, new DialogInterface.OnClickListener(){
								public void onClick(DialogInterface d, int gi){
									if(lt[gi].toString() == "Apps - Android"){
										Intent it = new Intent(MainActivity.this, apa.class);
										startActivity(it);	MediaPlayer md = MediaPlayer.create(MainActivity.this, R.raw.click_);
										md.start();
									}
									if(lt[gi].toString() == "Apps - Windows"){
										MediaPlayer md = MediaPlayer.create(MainActivity.this, R.raw.click_);
										md.start();
										Intent it = new Intent(MainActivity.this, apwin.class);
										startActivity(it);
									}
									if(lt[gi].toString() == "Programas Especiais - Android"){
										MediaPlayer md = MediaPlayer.create(MainActivity.this, R.raw.click_);
										md.start();
										Intent it = new Intent(MainActivity.this, apsa.class);
										startActivity(it);
									}
									if(lt[gi].toString() == "Programas Especiais"){
										MediaPlayer md = MediaPlayer.create(MainActivity.this, R.raw.click_);
										md.start();
										Intent it = new Intent(MainActivity.this, aps.class);
										startActivity(it);
									}
								}
							});
						bd.create();
						bd.show();
						break;
						case 1:
						MediaPlayer md2 = MediaPlayer.create(MainActivity.this, R.raw.click_);
						md2.start();
						final String[] lt2 = {
							"Cursores - Sites/Blog"
						};
						ArrayAdapter ad2 = new ArrayAdapter(MainActivity.this, R.layout.main, R.id.tv, lt2);
						AlertDialog.Builder bd2 = new AlertDialog.Builder(MainActivity.this);
						bd2.setSingleChoiceItems(ad2,0, new DialogInterface.OnClickListener(){
								public void onClick(DialogInterface d, int gi){
									if(lt2[gi].toString() == "Cursores - Sites/Blog"){
										MediaPlayer md = MediaPlayer.create(MainActivity.this, R.raw.click_);
										md.start();
										Intent it = new Intent(MainActivity.this, ct.class);
										startActivity(it);
									}
								}
							});
						bd2.create();
						bd2.show();
							break;
								case 2:
						MediaPlayer md4 = MediaPlayer.create(MainActivity.this, R.raw.click_);
						md4.start();
						final String[] lt4 = {
							"Games - PC",
							"Games - Android"
						};
						ArrayAdapter ad4 = new ArrayAdapter(MainActivity.this, R.layout.main, R.id.tv, lt4);
						AlertDialog.Builder bd4 = new AlertDialog.Builder(MainActivity.this);
						bd4.setSingleChoiceItems(ad4,0, new DialogInterface.OnClickListener(){
								public void onClick(DialogInterface d, int gi){
									if(lt4[gi].toString() == "Games - PC"){
										MediaPlayer md = MediaPlayer.create(MainActivity.this, R.raw.click_);
										md.start();
										final String[] lt = {
											"Jogos de RPG",
											"Jogos de Estratégia",
											"Jogos de Tiro FPS",
											"Jogos de Ação",
											"Jogos de Aventura",
										};
										ArrayAdapter ad = new ArrayAdapter(MainActivity.this, R.layout.main, R.id.tv, lt);
										AlertDialog.Builder bdg = new AlertDialog.Builder(MainActivity.this);
										bdg.setSingleChoiceItems(ad,0, new DialogInterface.OnClickListener(){
												public void onClick(DialogInterface d, int gi){
													if(lt[gi].toString() == "Jogos de RPG"){
														MediaPlayer md = MediaPlayer.create(MainActivity.this, R.raw.click_);
														md.start();
														Intent it = new Intent(MainActivity.this, JogosRPGPC.class);
														startActivity(it);
													}
													if(lt[gi].toString() == "Jogos de Estratégia"){
														MediaPlayer md = MediaPlayer.create(MainActivity.this, R.raw.click_);
														md.start();
														Intent it = new Intent(MainActivity.this, JogosEstrategiaPC.class);
														startActivity(it);
													}
													if(lt[gi].toString() == "Jogos de Tiro FPS"){
														MediaPlayer md = MediaPlayer.create(MainActivity.this, R.raw.click_);
														md.start();
														Intent it = new Intent(MainActivity.this, JogosPCTiroFPS.class);
														startActivity(it);
													}
													if(lt[gi].toString() == "Jogos de Ação"){
														MediaPlayer md = MediaPlayer.create(MainActivity.this, R.raw.click_);
														md.start();
														Intent it = new Intent(MainActivity.this, gpc.class);
														startActivity(it);
													}
													if(lt[gi].toString() == "Jogos de Aventura"){
														MediaPlayer md = MediaPlayer.create(MainActivity.this, R.raw.click_);
														md.start();
														Intent it = new Intent(MainActivity.this, gpc2.class);
														startActivity(it);
													}
												}
											});
										bdg.create();
										bdg.show();
									}
									if(lt4[gi].toString() == "Games - Android"){
										MediaPlayer md = MediaPlayer.create(MainActivity.this, R.raw.click_);
										md.start();
										final String[] lt = {
											"Jogos de Ação",
											"Jogos de RPG",
											"Jogos de Estratégia",
											"Jogos de Cartas",
											"Jogos de Tiro",
											"Jogos de Sinuca",
											"Jogos de Luta",
											"Jogos de aventura",
											"Jogos de correspondencia",
											"Jogos de Corrida",
											"Jogos Arcade",
											"Jogos Esportes",
											"Jogos GTArcade RPG",
											"Jogos Cassino",
										};
										ArrayAdapter ad = new ArrayAdapter(MainActivity.this, R.layout.main, R.id.tv, lt);
										AlertDialog.Builder bd = new AlertDialog.Builder(MainActivity.this);
										bd.setSingleChoiceItems(ad,0, new DialogInterface.OnClickListener(){
												public void onClick(DialogInterface d, int gi){
													if(lt[gi].toString() == "Jogos de Ação"){
														MediaPlayer md = MediaPlayer.create(MainActivity.this, R.raw.click_);
														md.start();
														Intent it = new Intent(MainActivity.this, JogosAcao.class);
														startActivity(it);
													}
													if(lt[gi].toString() == "Jogos de Luta"){
														MediaPlayer md = MediaPlayer.create(MainActivity.this, R.raw.click_);
														md.start();
														Intent it = new Intent(MainActivity.this, JogosLuta.class);
														startActivity(it);
													}
													if(lt[gi].toString() == "Jogos de Sinuca"){
														MediaPlayer md = MediaPlayer.create(MainActivity.this, R.raw.click_);
														md.start();
														Intent it = new Intent(MainActivity.this, JogosSinuca.class);
														startActivity(it);
													}
													if(lt[gi].toString() == "Jogos de RPG"){
														MediaPlayer md = MediaPlayer.create(MainActivity.this, R.raw.click_);
														md.start();
														Intent it = new Intent(MainActivity.this, JogosRPG.class);
														startActivity(it);
													}
													if(lt[gi].toString() == "Jogos de Estratégia"){
														MediaPlayer md = MediaPlayer.create(MainActivity.this, R.raw.click_);
														md.start();
														Intent it = new Intent(MainActivity.this, JogosEstrategia.class);
														startActivity(it);
													}
													if(lt[gi].toString() == "Jogos de Cartas"){
														MediaPlayer md = MediaPlayer.create(MainActivity.this, R.raw.click_);
														md.start();
														Intent it = new Intent(MainActivity.this, JogosCartas.class);
														startActivity(it);
													}
													if(lt[gi].toString() == "Jogos de Tiro"){
														MediaPlayer md = MediaPlayer.create(MainActivity.this, R.raw.click_);
														md.start();
														Intent it = new Intent(MainActivity.this, jogosTiro.class);
														startActivity(it);
													}
													if(lt[gi].toString() == "Jogos de aventura"){
														MediaPlayer md = MediaPlayer.create(MainActivity.this, R.raw.click_);
														md.start();
														Intent it = new Intent(MainActivity.this, gma2.class);
														startActivity(it);
													}
													if(lt[gi].toString() == "Jogos de correspondencia"){
														MediaPlayer md = MediaPlayer.create(MainActivity.this, R.raw.click_);
														md.start();
														Intent it = new Intent(MainActivity.this, gma.class);
														startActivity(it);
													}
													if(lt[gi].toString() == "Jogos de Corrida"){
														MediaPlayer md = MediaPlayer.create(MainActivity.this, R.raw.click_);
														md.start();
														Intent it = new Intent(MainActivity.this, gma4.class);
														startActivity(it);
													}
													if(lt[gi].toString() == "Jogos Arcade"){
														MediaPlayer md = MediaPlayer.create(MainActivity.this, R.raw.click_);
														md.start();
														Intent it = new Intent(MainActivity.this, gma5.class);
														startActivity(it);
													}
													if(lt[gi].toString() == "Jogos Esportes"){
														MediaPlayer md = MediaPlayer.create(MainActivity.this, R.raw.click_);
														md.start();
														Intent it = new Intent(MainActivity.this, gma6.class);
														startActivity(it);
													}
													if(lt[gi].toString() == "Jogos GTArcade RPG"){
														MediaPlayer md = MediaPlayer.create(MainActivity.this, R.raw.click_);
														md.start();
														Intent it = new Intent(MainActivity.this, gma7.class);
														startActivity(it);
													}
													if(lt[gi].toString() == "Jogos Cassino"){
														MediaPlayer md = MediaPlayer.create(MainActivity.this, R.raw.click_);
														md.start();
														Intent it = new Intent(MainActivity.this, gma8.class);
														startActivity(it);
													}
												}
											});
										bd.create();
										bd.show();
									}
								}
							});
						bd4.create();
						bd4.show();
									break;
									case 3:
						MediaPlayer md6 = MediaPlayer.create(MainActivity.this, R.raw.click_);
						md6.start();
						Intent it = new Intent(MainActivity.this, extras.class);
						startActivity(it);
										break;
										case 4:
						MediaPlayer md5 = MediaPlayer.create(MainActivity.this, R.raw.click_);
						md5.start();
						Intent irt = new Intent(MainActivity.this, ass.class);
						startActivity(irt);
											break;
				}
			}
		});
		File f = new File(Environment.getExternalStorageDirectory() + "/GTech");
		f.exists();
		f.mkdir();
		new File(Environment.getExternalStorageDirectory() + "/GTech/Games/games - PC/Jogos de Estratégia").mkdir();
		new File(Environment.getExternalStorageDirectory() + "/GTech//Games/games - PC/Jogos de RPG").mkdir();
		new File(Environment.getExternalStorageDirectory(), "GTech/Extras").mkdir();
		new File(Environment.getExternalStorageDirectory(), "GTech/Extras/contents").mkdir();
		new File(Environment.getExternalStorageDirectory() + "/GTech/Apps - Android").mkdir();
		new File(Environment.getExternalStorageDirectory() + "/GTech/Apps - Android/resources").mkdir();
		new File(Environment.getExternalStorageDirectory() + "/GTech/Apps - Android/resources/contents").mkdir();
		new File(Environment.getExternalStorageDirectory() + "/GTech/Apps - Windows").mkdir();
		new File(Environment.getExternalStorageDirectory() + "/GTech/Programas Especiais").mkdir();
		new File(Environment.getExternalStorageDirectory() + "/GTech/Programas Especiais/resources").mkdir();
		new File(Environment.getExternalStorageDirectory() + "/GTech/Programas Especiais/resources/contents").mkdir();
		new File(Environment.getExternalStorageDirectory() + "/GTech/Programas Especiais/resources/contents/Programas Especiais - Android").mkdir();
		new File(Environment.getExternalStorageDirectory() + "/GTech/Apps - Windows/resources").mkdir();
		new File(Environment.getExternalStorageDirectory() + "/GTech/Apps - Windows/resources/contents").mkdir();
		new File(Environment.getExternalStorageDirectory() + "/GTech/Games").mkdir();
		new File(Environment.getExternalStorageDirectory() + "/GTech/Games/games - PC").mkdir();
		new File(Environment.getExternalStorageDirectory() + "/GTech/Games/games - PC/Games - PC - Tiro FPS").mkdir();
		new File(Environment.getExternalStorageDirectory() + "/GTech/Games/games - PC/Games - PC - Ação").mkdir();
		new File(Environment.getExternalStorageDirectory() + "/GTech/Games/games - PC/Games - PC - Ação/contents").mkdir();
		new File(Environment.getExternalStorageDirectory() + "/GTech/Games/games - PC/Games - PC - Aventura").mkdir();
		new File(Environment.getExternalStorageDirectory() + "/GTech/Games/games - PC/Games - PC - Aventura/contents").mkdir();
		new File(Environment.getExternalStorageDirectory() + "/GTech/Assemblers").mkdir();
	    new File(Environment.getExternalStorageDirectory() + "/GTech/Assemblers/contents").mkdir();
		as = getAssets();
		try{
			r = as.open("gpc_rp_3");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech//Games/games - PC/Jogos de RPG/gpc_rp_3");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("gpc_rp_2");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech//Games/games - PC/Jogos de RPG/gpc_rp_2");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("gpc_rp_1");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech//Games/games - PC/Jogos de RPG/gpc_rp_1");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("gpc_estrategia_1");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Games/games - PC/Jogos de Estratégia/gpc_estrategia_1.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("gpc_tr_1");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/games - PC/Games - PC - Tiro FPS/gpc_tr_1");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("win8");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Extras/contents/Windows_8_description_content");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("win10");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Extras/contents/Windows_10_description_content");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("gpc_ad_1");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Games/games - PC/Games - PC - Aventura/contents/gpc_ad_1.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("gpc_action_7");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Games/Games - PC/Games - PC - Ação/contents/gpc_action_7.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("gpc_action_6");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Games/Games - PC/Games - PC - Ação/contents/gpc_action_6.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("gpc_action_5");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Games/Games - PC/Games - PC - Ação/contents/gpc_action_5.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("gpc_action_4");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Games/Games - PC/Games - PC - Ação/contents/gpc_action_4.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("gpc_action_3");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Games/Games - PC/Games - PC - Ação/contents/gpc_action_3.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("gpc_action_2");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Games/Games - PC/Games - PC - Ação/contents/gpc_action_2.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("gpc_action_1");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Games/Games - PC/Games - PC - Ação/contents/gpc_action_1.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("apsa3");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Programas Especiais/resources/contents/Programas Especiais - Android/apsa3.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("apsa2");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Programas Especiais/resources/contents/Programas Especiais - Android/apsa2.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("apsa1");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Programas Especiais/resources/contents/Programas Especiais - Android/apsa1.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("aps9");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Programas Especiais/resources/contents/aps9.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("aps8");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Programas Especiais/resources/contents/aps8.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("aps7");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Programas Especiais/resources/contents/aps7.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("aps6");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Programas Especiais/resources/contents/aps6.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("aps5");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Programas Especiais/resources/contents/aps5.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("aps4");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Programas Especiais/resources/contents/aps4.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("aps3");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Programas Especiais/resources/contents/aps3.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("aps2");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Programas Especiais/resources/contents/aps2.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("aps1");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Programas Especiais/resources/contents/aps1.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("tda/tda_explorer_pt5");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Tutoriais/Dev - Android/contents/tda_explorer_pt5.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("tda/tda_explorer_pt4");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Tutoriais/Dev - Android/contents/tda_explorer_pt4.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("tda/tda_explorer_pt3");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Tutoriais/Dev - Android/contents/tda_explorer_pt3.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("tda/tda_explorer_pt2");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Tutoriais/Dev - Android/contents/tda_explorer_pt2.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("tda/tda_explorer_pt1");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Tutoriais/Dev - Android/contents/tda_explorer_pt1.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("tda/tda26");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Tutoriais/Dev - Android/contents/tda26.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("tda/tda25");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Tutoriais/Dev - Android/contents/tda25.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("tda/tda24");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Tutoriais/Dev - Android/contents/tda24.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("tda/tda23");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Tutoriais/Dev - Android/contents/tda23.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("tda/tda22");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Tutoriais/Dev - Android/contents/tda22.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("tda/tda21");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Tutoriais/Dev - Android/contents/tda21.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("tda/tda20");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Tutoriais/Dev - Android/contents/tda20.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("tda/tda19");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Tutoriais/Dev - Android/contents/tda19.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("tda/tda18");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Tutoriais/Dev - Android/contents/tda18.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("win20");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Apps - Windows/resources/contents/win20.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("win19");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Apps - Windows/resources/contents/win19.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("win18");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Apps - Windows/resources/contents/win18.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("win17");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Apps - Windows/resources/contents/win17.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("apa56");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Apps - Android/resources/contents/apa56.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("apa55");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Apps - Android/resources/contents/apa55.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("apa54");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Apps - Android/resources/contents/apa54.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("apa53");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Apps - Android/resources/contents/apa53.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("apa53");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Apps - Android/resources/contents/apa53.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("apa52");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Apps - Android/resources/contents/apa52.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("apa51");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Apps - Android/resources/contents/apa51.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("apa50");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Apps - Android/resources/contents/apa50.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("apa49");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Apps - Android/resources/contents/apa49.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("apa48");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Apps - Android/resources/contents/apa48.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("apa47");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Apps - Android/resources/contents/apa47.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("apa46");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Apps - Android/resources/contents/apa46.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("apa45");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Apps - Android/resources/contents/apa45.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("apa44");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Apps - Android/resources/contents/apa44.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("apa43");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Apps - Android/resources/contents/apa43.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("apa42");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Apps - Android/resources/contents/apa42.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("apa39");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Apps - Android/resources/contents/apa39.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("apa38");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Apps - Android/resources/contents/apa38.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("apa37");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Apps - Android/resources/contents/apa37.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("apa36");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Apps - Android/resources/contents/apa36.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("apa35");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Apps - Android/resources/contents/apa35.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("asa/ass7");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Assemblers/contents/ass7.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("asa/ass6");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Assemblers/contents/ass6.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("asa/ass5");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Assemblers/contents/ass5.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("asa/ass4");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Assemblers/contents/ass4.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("asa/ass3");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Assemblers/contents/ass3.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("asa/ass2");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Assemblers/contents/ass2.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("asa/ass1");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Assemblers/contents/ass1.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("tdw/tdw6");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Tutoriais/Dev - Windows/contents/tdw6.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("tdw/tdw5");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Tutoriais/Dev - Windows/contents/tdw5.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("tdw/tdw4");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Tutoriais/Dev - Windows/contents/tdw4.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("tdw/tdw3");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Tutoriais/Dev - Windows/contents/tdw3.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("tdw/tdw2");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Tutoriais/Dev - Windows/contents/tdw2.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("tdw/tdw1");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Tutoriais/Dev - Windows/contents/tdw1.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("tda/tda16");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Tutoriais/Dev - Android/contents/tda16.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("tda/tda15");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Tutoriais/Dev - Android/contents/tda15.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("tda/tda17");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Tutoriais/Dev - Android/contents/tda17.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("tda/tda14");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Tutoriais/Dev - Android/contents/tda14.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("tda/tda13");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Tutoriais/Dev - Android/contents/tda13.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("tda/tda12");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Tutoriais/Dev - Android/contents/tda12.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("tda/tda11");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Tutoriais/Dev - Android/contents/tda11.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("tda/tda10");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Tutoriais/Dev - Android/contents/tda10.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("tda/tda9");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Tutoriais/Dev - Android/contents/tda9.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("tda/tda8");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Tutoriais/Dev - Android/contents/tda8.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("tda/tda7");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Tutoriais/Dev - Android/contents/tda7.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("tda/tda6");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Tutoriais/Dev - Android/contents/tda6.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("tda/tda5");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Tutoriais/Dev - Android/contents/tda5.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("tda/tda4");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Tutoriais/Dev - Android/contents/tda4.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("tda/tda3");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Tutoriais/Dev - Android/contents/tda3.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("tda/tda2");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Tutoriais/Dev - Android/contents/tda2.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("tda/tda1");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Tutoriais/Dev - Android/contents/tda1.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("ta/ta17.txt");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Tutoriais/Tutoriais - Android/contents/ta17.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("ta/ta16.txt");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Tutoriais/Tutoriais - Android/contents/ta16.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("ta/ta15.txt");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Tutoriais/Tutoriais - Android/contents/ta15.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("ta/ta14.txt");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Tutoriais/Tutoriais - Android/contents/ta14.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("ta/ta13.txt");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Tutoriais/Tutoriais - Android/contents/ta13.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("ta/ta12.txt");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Tutoriais/Tutoriais - Android/contents/ta12.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("ta/ta11.txt");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Tutoriais/Tutoriais - Android/contents/ta11.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("ta/ta10.txt");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Tutoriais/Tutoriais - Android/contents/ta10.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("ta/ta9.txt");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Tutoriais/Tutoriais - Android/contents/ta9.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("ta/ta8.txt");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Tutoriais/Tutoriais - Android/contents/ta8.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("ta/ta7.txt");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Tutoriais/Tutoriais - Android/contents/ta7.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("ta/ta6.txt");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Tutoriais/Tutoriais - Android/contents/ta6.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("ta/ta5.txt");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Tutoriais/Tutoriais - Android/contents/ta5.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("ta/ta4.txt");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Tutoriais/Tutoriais - Android/contents/ta4.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("ta/ta3.txt");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Tutoriais/Tutoriais - Android/contents/ta3.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("ta/ta2.txt");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Tutoriais/Tutoriais - Android/contents/ta2.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("ta/ta1.txt");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Tutoriais/Tutoriais - Android/contents/ta1.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("ht/ht10.txt");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Hacking/Tutoriais/contents/ht10.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("ht/ht9.txt");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Hacing/Tutoriais/contents/ht9.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("win16");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Apps - Windows/resources/contents/win16.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("win15");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Apps - Windows/resources/contents/win15.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("win14");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Apps - Windows/resources/contents/win14.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("win13");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Apps - Windows/resources/contents/win13.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("win12");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Apps - Windows/resources/contents/win12.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("win11");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Apps - Windows/resources/contents/win11.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("win10");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Apps - Windows/resources/contents/win10.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("win9");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Apps - Windows/resources/contents/win9.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("win8");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Apps - Windows/resources/contents/win8.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("win7");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Apps - Windows/resources/contents/win7.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("win6");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Apps - Windows/resources/contents/win6.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("win5");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Apps - Windows/resources/contents/win5.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("win4");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Apps - Windows/resources/contents/win4.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("win3");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Apps - Windows/resources/contents/win3.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("win2");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Apps - Windows/resources/contents/win2.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("win1");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Apps - Windows/resources/contents/win1.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("ht/ht3.txt");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Hacking/Tutoriais/contents/ht8.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("ht/ht7.txt");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Hacking/Tutoriais/contents/ht7.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("ht/ht6.txt");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Hacking/Tutoriais/contents/ht6.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("ht/ht5.txt");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Hacking/Tutoriais/contents/ht5.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("ht/ht4.txt");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Hacking/Tutoriais/contents/ht4.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("ht/ht3.txt");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Hacking/Tutoriais/contents/ht3.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("ht/ht2.txt");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Hacking/Tutoriais/contents/ht2.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("ht/ht1.txt");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Hacking/Tutoriais/contents/ht1.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("hst12");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Hacking/Softwares/contents/hst12.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("hst11");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Hacking/Softwares/contents/hst11.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("hst10");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Hacking/Softwares/contents/hst10.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("hst9");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Hacking/Softwares/contents/hst9.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("hst8");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Hacking/Softwares/contents/hst8.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("hst7");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Hacking/Softwares/contents/hst7.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("hst6");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Hacking/Softwares/contents/hst6.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("hst5");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Hacking/Softwares/contents/hst5.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("hst4");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Hacking/Softwares/contents/hst4.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("hst3");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Hacking/Softwares/contents/hst3.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("hst2");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Hacking/Softwares/contents/hst2.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("hst1");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Hacking/Softwares/contents/hst1.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		
		as = getAssets();
		try{
			r = as.open("apa34");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Apps - Android/resources/contents/ap34.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("apa33");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Apps - Android/resources/contents/ap33.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("apa32");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Apps - Android/resources/contents/ap32.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("apa31");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Apps - Android/resources/contents/ap31.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("apa30");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Apps - Android/resources/contents/ap30.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("apa29");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Apps - Android/resources/contents/ap29.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("apa28");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Apps - Android/resources/contents/ap28.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("apa27");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Apps - Android/resources/contents/ap27.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("apa26");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Apps - Android/resources/contents/ap26.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("apa25");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Apps - Android/resources/contents/ap25.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("apa24");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Apps - Android/resources/contents/ap24.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("apa23");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Apps - Android/resources/contents/ap23.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("apa22");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Apps - Android/resources/contents/ap22.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("apa21");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Apps - Android/resources/contents/ap21.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("apa20");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Apps - Android/resources/contents/ap20.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("apa19");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Apps - Android/resources/contents/ap19.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("apa18");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Apps - Android/resources/contents/ap18.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("apa17");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Apps - Android/resources/contents/ap17.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("apa16");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Apps - Android/resources/contents/ap16.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("apa15");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Apps - Android/resources/contents/ap15.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("apa14");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Apps - Android/resources/contents/ap14.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("apa13");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Apps - Android/resources/contents/ap13.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("apa12");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Apps - Android/resources/contents/ap12.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("apa11");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Apps - Android/resources/contents/ap11.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("apa10");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Apps - Android/resources/contents/ap10.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("apa9");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Apps - Android/resources/contents/ap9.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("apa8");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Apps - Android/resources/contents/ap8.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("apa7");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Apps - Android/resources/contents/ap7.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("apa6");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Apps - Android/resources/contents/ap6.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("apa5");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Apps - Android/resources/contents/ap5.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("apa4");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Apps - Android/resources/contents/ap4.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("apa3");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Apps - Android/resources/contents/ap3.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("apa2");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
			try{
				fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Apps - Android/resources/contents/ap2.txt");
				bff = new BufferedWriter(fw);
				bff.write(ap1);
				bff.close();
			} catch(IOException e){
			}
		} catch(IOException e){
		}
		as = getAssets();
		try{
			r = as.open("apa1");
			s = r.available();
			bf = new byte[s];
			r.read(bf);
			r.close();
			String ap1 = new String(bf);
		try{
			fw = new FileWriter(Environment.getExternalStorageDirectory() + "/GTech/Apps - Android/resources/contents/ap1.txt");
			bff = new BufferedWriter(fw);
			bff.write(ap1);
			bff.close();
		} catch(IOException e){
		}
		} catch(IOException e){
		}
    }
	public void apps(View v){
		MediaPlayer md = MediaPlayer.create(MainActivity.this, R.raw.click_);
		md.start();
		final String[] lt = {
				"Apps - Android",
				"Apps - Windows",
				"Programas Especiais",
				"Programas Especiais - Android"
			};
			ArrayAdapter ad = new ArrayAdapter(this, R.layout.main, R.id.tv, lt);
			AlertDialog.Builder bd = new AlertDialog.Builder(this);
			bd.setSingleChoiceItems(ad, 0, new DialogInterface.OnClickListener(){
				public void onClick(DialogInterface d, int gi){
					if(lt[gi].toString() == "Apps - Android"){
					Intent it = new Intent(MainActivity.this, apa.class);
					startActivity(it);	MediaPlayer md = MediaPlayer.create(MainActivity.this, R.raw.click_);
		md.start();
					}
					if(lt[gi].toString() == "Apps - Windows"){
						MediaPlayer md = MediaPlayer.create(MainActivity.this, R.raw.click_);
						md.start();
						Intent it = new Intent(MainActivity.this, apwin.class);
						startActivity(it);
					}
					if(lt[gi].toString() == "Programas Especiais - Android"){
						MediaPlayer md = MediaPlayer.create(MainActivity.this, R.raw.click_);
						md.start();
						Intent it = new Intent(MainActivity.this, apsa.class);
						startActivity(it);
					}
					if(lt[gi].toString() == "Programas Especiais"){
						MediaPlayer md = MediaPlayer.create(MainActivity.this, R.raw.click_);
						md.start();
						Intent it = new Intent(MainActivity.this, aps.class);
						startActivity(it);
					}
				}
			});
			bd.create();
			bd.show();
	}
	
	public void gm(View v){
		MediaPlayer md = MediaPlayer.create(MainActivity.this, R.raw.click_);
		md.start();
		final String[] lt = {
			"Games - PC",
			"Games - Android"
		};
		ArrayAdapter ad = new ArrayAdapter(this, R.layout.main, R.id.tv, lt);
		AlertDialog.Builder bd = new AlertDialog.Builder(this);
		bd.setSingleChoiceItems(ad,0, new DialogInterface.OnClickListener(){
				public void onClick(DialogInterface d, int gi){
					if(lt[gi].toString() == "Games - PC"){
						MediaPlayer md = MediaPlayer.create(MainActivity.this, R.raw.click_);
						md.start();
						final String[] lt = {
							"Jogos de Ação",
							"Jogos de Aventura",
						};
						ArrayAdapter ad = new ArrayAdapter(MainActivity.this, R.layout.main, R.id.tv, lt);
						AlertDialog.Builder bdg = new AlertDialog.Builder(MainActivity.this);
						bdg.setSingleChoiceItems(ad,0, new DialogInterface.OnClickListener(){
								public void onClick(DialogInterface d, int gi){
									if(lt[gi].toString() == "Jogos de Ação"){
										MediaPlayer md = MediaPlayer.create(MainActivity.this, R.raw.click_);
										md.start();
										Intent it = new Intent(MainActivity.this, gpc.class);
										startActivity(it);
									}
									if(lt[gi].toString() == "Jogos de Aventura"){
										MediaPlayer md = MediaPlayer.create(MainActivity.this, R.raw.click_);
										md.start();
										Intent it = new Intent(MainActivity.this, gpc2.class);
										startActivity(it);
									}
								   }
								});
								bdg.create();
								bdg.show();
					}
					if(lt[gi].toString() == "Games - Android"){
						MediaPlayer md = MediaPlayer.create(MainActivity.this, R.raw.click_);
						md.start();
						final String[] lt = {
							"Jogos de aventura",
							"Jogos de correspondencia",
							"Jogos de Corrida",
							"Jogos Arcade",
							"Jogos Esportes",
							"Jogos GTArcade RPG",
							"Jogos Cassino",
						};
						ArrayAdapter ad = new ArrayAdapter(MainActivity.this, R.layout.main, R.id.tv, lt);
						AlertDialog.Builder bd = new AlertDialog.Builder(MainActivity.this);
						bd.setSingleChoiceItems(ad,0, new DialogInterface.OnClickListener(){
								public void onClick(DialogInterface d, int gi){
									if(lt[gi].toString() == "Jogos de aventura"){
										MediaPlayer md = MediaPlayer.create(MainActivity.this, R.raw.click_);
										md.start();
										Intent it = new Intent(MainActivity.this, gma2.class);
										startActivity(it);
									}
									if(lt[gi].toString() == "Jogos de correspondencia"){
										MediaPlayer md = MediaPlayer.create(MainActivity.this, R.raw.click_);
										md.start();
										Intent it = new Intent(MainActivity.this, gma.class);
										startActivity(it);
									}
									if(lt[gi].toString() == "Jogos de Corrida"){
										MediaPlayer md = MediaPlayer.create(MainActivity.this, R.raw.click_);
										md.start();
										Intent it = new Intent(MainActivity.this, gma4.class);
										startActivity(it);
									}
									if(lt[gi].toString() == "Jogos Arcade"){
										MediaPlayer md = MediaPlayer.create(MainActivity.this, R.raw.click_);
										md.start();
										Intent it = new Intent(MainActivity.this, gma5.class);
										startActivity(it);
									}
									if(lt[gi].toString() == "Jogos Esportes"){
										MediaPlayer md = MediaPlayer.create(MainActivity.this, R.raw.click_);
										md.start();
										Intent it = new Intent(MainActivity.this, gma6.class);
										startActivity(it);
									}
									if(lt[gi].toString() == "Jogos GTArcade RPG"){
										MediaPlayer md = MediaPlayer.create(MainActivity.this, R.raw.click_);
										md.start();
										Intent it = new Intent(MainActivity.this, gma7.class);
										startActivity(it);
									}
									if(lt[gi].toString() == "Jogos Cassino"){
										MediaPlayer md = MediaPlayer.create(MainActivity.this, R.raw.click_);
										md.start();
										Intent it = new Intent(MainActivity.this, gma8.class);
										startActivity(it);
									}
								}
							});
						bd.create();
						bd.show();
					}
				}
			});
		bd.create();
		bd.show();
	}
	public void ref(View v){
		MediaPlayer md = MediaPlayer.create(MainActivity.this, R.raw.click_);
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
			
				case R.id.fe:
				Intent fe = new Intent(Intent.ACTION_SEND);
				fe.setType("text/plain");
				fe.putExtra(Intent.EXTRA_EMAIL, new String[]
							{"dthhack@gmail.com"});
				fe.putExtra(Intent.EXTRA_SUBJECT, "Reportar Erros");
				fe.putExtra(Intent.EXTRA_TEXT, "Explique o erro...");
				startActivity(fe);
		}
		return true;
	}
} 
