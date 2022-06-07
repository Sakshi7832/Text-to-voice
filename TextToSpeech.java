package TextToAudio;
import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class TextToSpeech 
{

	public static void main(String args[])
	{
		// creating object of the Voice class
		Voice voice;
		
		// Getting voice
		voice = VoiceManager.getInstance().getVoice("kevin16");
		
		if(voice!=null)
		{
			// allocating voice
			voice.allocate();
		}
		try
		{
			//setting the rate of the voice
			voice.setRate(200);
			//setting the pitch of the voice
			voice.setPitch(145);
			//setting the volume of the voice
			voice.setVolume(5);
			//calling speak() method
			System.out.println("Hello Mam");
			voice.speak("Hello Mam");
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
