package Knack.View;

import javax.swing.JFrame;
import Knack.Controller.KnackController;

public class KnackFrame extends JFrame
{
private KnackController appController;
private KnackPanel appPanel;

public KnackFrame(KnackController appController)
{
	super();
	
	this.appController = appController;
	this.appPanel = Knackpanel(appController);
	
	setupFrame();
}

private void setupFrame()
{
	this.setContentPane(appPanel);
	this.setSize(1000, 500);
	this.setTitle("Knack 2 Baby!");
	this.setResizable(false);
	this.setVisible(true);
	}
}
