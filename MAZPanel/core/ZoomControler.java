package core;

import java.awt.event.MouseWheelEvent;
import java.util.concurrent.Semaphore;

import constant.MAZConstant;
import mThread.MThread;
import timer.CoordinatePaintTimer;
import timer.ZoomPercentPaintTimer;

public class ZoomControler{

	// Association
	private Semaphore semaphore; 
	private MoveAndZoom maz; 
	private CoordinatePaintTimer coordinatePaintTimer;
	private ZoomPercentPaintTimer zoomPercentPaintTimer;
	
	// Constructor
	public ZoomControler(Semaphore semaphore, MoveAndZoom maz, CoordinatePaintTimer coordinatePaintTimer, ZoomPercentPaintTimer zoomPercentPaintTimer) {
		this.semaphore=semaphore; this.maz=maz; this.coordinatePaintTimer=coordinatePaintTimer; this.zoomPercentPaintTimer=zoomPercentPaintTimer;
	}

	public void runNewZoomThread (MouseWheelEvent e) {new Thread() {public void run() {zoom(e);}}.start();}
	public void zoom(MouseWheelEvent e) {
		for(int i =0; i<MAZConstant.ZoomTimeAtOneWheel; i++) {
			this.acquire(); this.maz.zoomCamera(e); this.release();
			this.coordinatePaintTimer.reset(); this.zoomPercentPaintTimer.reset();
			MThread.sleep(MAZConstant.WaitTimeBetweenZoom);
		}
	}
	
	// Encapsulation Methods
	public void acquire() {try {this.semaphore.acquire();} catch (InterruptedException e) {e.printStackTrace();}}
	public void release() {this.semaphore.release();}
}
