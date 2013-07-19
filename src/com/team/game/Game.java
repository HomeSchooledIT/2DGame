package com.team.game;

import java.awt.Canvas;

import javax.swing.JFrame;

public class Game extends Canvas implements Runnable {
	public static int width = 300;
	public static int height = width * 9 / 16;
	public static int scale = 3;
	
	private Thread thread;
	private JFrame frame;
	
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
