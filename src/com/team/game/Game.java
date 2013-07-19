package com.team.game;


import java.awt.*;
import javax.swing.JFrame;

public class Game extends Canvas implements Runnable {
	private static final long serialVersionUID = 1L;
	
	public static int width = 300;
	public static int height = width * 9 / 16;
	public static int scale = 3;
	
	private Thread thread;
	private JFrame frame;
	
	public Game(){
		Dimension size = new Dimension(width * scale, height * scale);
		setPreferredSize(size);
	}
	
	public synchronized void start(){
		thread = new Thread(this, "Display");
		thread.start();
	}
	
	public synchronized void stop(){
		try{
			thread.join();
		} catch (InterruptedException e){
			e.printStackTrace();
		}
	}
	
	
	
	
	public void run(){
		
	}
	
}
