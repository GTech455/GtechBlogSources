package gtechblog455.blogspot.com.app.gtech_blog_adapter_list;
import android.content.*;
import android.widget.*;
import gtechblog455.blogspot.com.app.R;
import android.view.*;
public class ImAd extends ArrayAdapter<String>
{
	final Context c;
	final String[] lt;
	final int[] rs;
	public ImAd(Context c, String[] lt, int[] rs){
		super(c, R.layout.al, lt);
		this.c = c;
		this.lt = lt;
		this.rs = rs;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent)
	{
		// TODO: Implement this method
		LayoutInflater li = (LayoutInflater) c.getSystemService(c.LAYOUT_INFLATER_SERVICE);
		View r = li.inflate(R.layout.al, parent, false);
		final ImageView im = (ImageView) r.findViewById(R.id.im);
		final TextView tv = (TextView) r.findViewById(R.id.tv);
		im.setImageResource(rs[position]);
		tv.setText(lt[position]);
		return r;
	}
	
}
