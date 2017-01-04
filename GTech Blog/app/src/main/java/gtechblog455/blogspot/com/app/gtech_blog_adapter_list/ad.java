package gtechblog455.blogspot.com.app.gtech_blog_adapter_list;
import android.widget.*;
import android.content.*;
import gtechblog455.blogspot.com.app.R;
import android.view.*;
public class ad extends ArrayAdapter<String>{
	final Context c;
	final String[] lt;
	final int[] rs;
	public ad(Context c, String[] lt, int[] rs){
		super(c, R.layout.llt, lt);
		this.c = c;
		this.lt = lt;
		this.rs = rs;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent)
	{
		LayoutInflater li = (LayoutInflater) c.getSystemService(c.LAYOUT_INFLATER_SERVICE);
		View r = li.inflate(R.layout.llt, parent, false);
		final ImageView im = (ImageView) r.findViewById(R.id.im);
		final TextView tv = (TextView) r.findViewById(R.id.tv);
		tv.setText(lt[position]);
		im.setImageResource(rs[position]);
		return r;
	}
}
