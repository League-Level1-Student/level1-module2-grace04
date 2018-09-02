import java.io.IOException;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JOptionPane;

public class MrZee {
	public static void main(String[] args) {
		String num = JOptionPane.showInputDialog("How many times?");
		int x = Integer.parseInt(num);
		for (int i = 0; i<x; i++) {
			Clip clip = null;
			try {
				clip = AudioSystem.getClip();
			} catch (LineUnavailableException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				clip.open(AudioSystem.getAudioInputStream(MrZee.class.getResource("shiny-objects")));
			} catch (LineUnavailableException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (UnsupportedAudioFileException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			clip.start();
		}
	}
}
