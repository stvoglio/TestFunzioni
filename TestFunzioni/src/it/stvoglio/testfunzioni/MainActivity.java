package it.stvoglio.testfunzioni;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_main);
			
		Button bottoneInviaMailSenzaInterazione = (Button)findViewById(R.id.bottoneInviaMailSenzaInterazione);
		bottoneInviaMailSenzaInterazione.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				// Mail m = new Mail("gmailusername@gmail.com", "password");
				
			}
		});
		
		/*
		 * 
		 * 
		 * 
		 * 
		 * 
		
		  bottoneInviaMailSenzaInterazione.setOnClickListener(new View.OnClickListener() { 
		    public void onClick(View view) { 
		      Mail m = new Mail("gmailusername@gmail.com", "password"); 
		 
		      String[] toArr = {"bla@bla.com", "lala@lala.com"}; 
		      m.setTo(toArr); 
		      m.setFrom("wooo@wooo.com"); 
		      m.setSubject("This is an email sent using my Mail JavaMail wrapper from an Android device."); 
		      m.setBody("Email body."); 
		 
		      try { 
		        m.addAttachment("/sdcard/filelocation"); 
		 
		        if(m.send()) { 
		          Toast.makeText(MailApp.this, "Email was sent successfully.", Toast.LENGTH_LONG).show(); 
		        } else { 
		          Toast.makeText(MailApp.this, "Email was not sent.", Toast.LENGTH_LONG).show(); 
		        } 
		      } catch(Exception e) { 
		        //Toast.makeText(MailApp.this, "There was a problem sending the email.", Toast.LENGTH_LONG).show(); 
		        Log.e("MailApp", "Could not send email", e); 
		      } 
		    } 
		  }); 
*/
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
