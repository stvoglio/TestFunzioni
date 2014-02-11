package it.stvoglio.testfunzioni;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_main);

		Button bottoneInviaMailSenzaInterazione = (Button) findViewById(R.id.bottoneInviaMailSenzaInterazione);
		bottoneInviaMailSenzaInterazione
				.setOnClickListener(new View.OnClickListener() {

					@Override
					public void onClick(View arg0) {
						MyMail m = new MyMail("stvoglio@gmail.com", "ZK01SKaK");
						m.setFrom("stvoglio@gmail.com");
						String[] toArr = { "stvoglio@tiscali.it",
								"stvoglio@gmail.com" };
						m.setTo(toArr);
						m.setSubject("This is an email sent using my Mail JavaMail wrapper from an Android device.");
						m.setBody("Email body.");

						try {
							if (m.send()) {
								Toast.makeText(MainActivity.this,
										"Email was sent successfully.",
										Toast.LENGTH_LONG).show();
							} else {
								Toast.makeText(MainActivity.this,
										"Email was not sent.",
										Toast.LENGTH_LONG).show();
							}
						} catch (Exception e) {
							Toast.makeText(MainActivity.this, "There was a problem sending the email.", Toast.LENGTH_LONG).show();
							Log.e("MailApp", "Could not send email", e);
						}

					}
				});

	};

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
