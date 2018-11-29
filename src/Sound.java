import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;

import javax.swing.JOptionPane;

public class Sound {
	AudioClip audioClip;
	
	public  void PlayWinSound()
	{
		 try
		 {URL urlForAudio = getClass().getResource("clap.wav");
		
		 audioClip = Applet.newAudioClip(urlForAudio);
		 audioClip.play();
		 }   
		 catch (Exception e)
		 {
			 JOptionPane.showMessageDialog(null, "File Missing!",null, JOptionPane.ERROR_MESSAGE, null );
		 }
		 
		 
	}
	public void  PlayWrongSound(){
		
		try{
			URL urlForAudio=getClass().getResource("wrong.wav");
			audioClip=Applet.newAudioClip(urlForAudio);
			audioClip.play();
			
		}
		catch(Exception e){
		
			JOptionPane.showMessageDialog(null, "File Missing!",null, JOptionPane.ERROR_MESSAGE, null );
		}
	}
	public void start() {
		 if (audioClip  != null){
			 audioClip .loop();
		 }	}
	public void stop() {
		 if (audioClip != null){ audioClip .stop();}
		}
}
