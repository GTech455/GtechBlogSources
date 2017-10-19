package controle.estoque.app.adapters;
import android.content.*;
import android.widget.*;
import controle.estoque.app.*;
import java.util.*;
import android.view.*;

public class ListViewAdapter extends ArrayAdapter<String>
{
	Context c;
	List<String> lt;
	
	public ListViewAdapter(Context con, List<String> l){
		super(con, R.layout.list, l);
		lt = l;
		c = con;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent)
	{
		// TODO: Implement this method
		LayoutInflater li = (LayoutInflater) c.getSystemService(c.LAYOUT_INFLATER_SERVICE);
		View r = li.inflate(R.layout.list, parent, false);
		final ImageView im = (ImageView) r.findViewById(R.id.im);
		final TextView tv = (TextView) r.findViewById(R.id.tv);
		Object o = lt.get(position);
		tv.setText(o.toString());
		if(o.toString().startsWith("Caixa")){
			im.setImageResource(R.drawable.caixa_acai);
		}
		if(o.toString().startsWith("Trento")){
			im.setImageResource(R.drawable.trento);
		}
		if(o.toString().startsWith("Balinha")){
			im.setImageResource(R.drawable.balinha);
		}
		if(o.toString().startsWith("Copo") || o.toString().startsWith("Copos")){
			im.setImageResource(R.drawable.caixa_acai);
		}
		if(o.toString().startsWith("Cheetos")){
			im.setImageResource(R.drawable.cheetos);
		}
		if(o.toString().startsWith("Fandangos")){
			im.setImageResource(R.drawable.fandangos);
		}
		if(o.toString().startsWith("Morango")){
			im.setImageResource(R.drawable.morango);
		}
		if(o.toString().startsWith("Manga")){
			im.setImageResource(R.drawable.manga);
		}
		if(o.toString().startsWith("Pacoquita") || o.toString().startsWith("Pacoquinha")){
			im.setImageResource(R.drawable.pacoquita);
		}
		if(o.toString().startsWith("Freegells")){
			im.setImageResource(R.drawable.freegells);
		}
		if(o.toString().startsWith("Tigela")){
			im.setImageResource(R.drawable.tigela);
		}
		if(o.toString().startsWith("Barca")){
			im.setImageResource(R.drawable.barca);
		}
		if(o.toString().startsWith("Ferrero")){
			im.setImageResource(R.drawable.ferrero);
		}
		if(o.toString().startsWith("Sonho")){
			im.setImageResource(R.drawable.sonho_de_valsa);
		}
		if(o.toString().startsWith("Kinder")){
			im.setImageResource(R.drawable.kinder);
		}
		if(o.toString().startsWith("Bis")){
			im.setImageResource(R.drawable.bis);
		}
		if(o.toString().startsWith("Nutella")){
			im.setImageResource(R.drawable.nutella);
		}
		if(o.toString().startsWith("Leite Condensado")){
			im.setImageResource(R.drawable.leite_condensado);
		}
		if(o.toString().startsWith("Leite Ninho")){
			im.setImageResource(R.drawable.ninho);
		}
		if(o.toString().startsWith("Creme")){
			im.setImageResource(R.drawable.creme_leite);
		}
		if(o.toString().startsWith("Granola")){
			im.setImageResource(R.drawable.granola);
		}
		if(o.toString().startsWith("Pingo")){
			im.setImageResource(R.drawable.pingo);
		}
		if(o.toString().startsWith("Farinha")){
			im.setImageResource(R.drawable.farinha);
		}
		return r;
	}
	
}
