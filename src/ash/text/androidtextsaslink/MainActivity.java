package ash.text.androidtextsaslink;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.util.Linkify;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		TextView display = (TextView) findViewById(R.id.display);

		String data = ""
				+ "This is a sample of using Linkify to create auto-link to your text entry.\n"
				+ "\n"
				+ "URL: http://supravas.blogspot.in/ \n"
				+ "Email: ashokslsk@gmail.com \n"
				+ "Phone: +919901356 \n"
				+ "\n" + "It's nice, isn't it?";
		if (display != null) {
			display.setText(data);
			Linkify.addLinks(display, Linkify.ALL);
		}
		

	}
}