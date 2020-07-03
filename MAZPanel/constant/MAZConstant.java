package constant;

import java.awt.Color;

public class MAZConstant {

	// MAZ Panel
	public static final Color PanelColor = Color.WHITE;
	public static final int PanelRepaintInterval = 40;
	
	// MAZ Handler
	public static final int CoordinatePaintTime = 1000;
	public static final int ZoomPercentPaintTime = 1000;
	
	// MAZ Core
	public static final int MaxZoomLevel = 5;
	public static final int MinZoomLevel = -10;
	public static final float ZoomFactor = 1.02f;
	public static final int ZoomTimeAtOneWheel = 10;
	public static final int WaitTimeBetweenZoom = 30;
	
	// MAZ Paint
	public static final int LineWidth = 1;
	public static final int LineInterval = 50;
	public static final int LineAlpaLimit = 110;
	public static final int ZoomPercentGranulity = 1;
	public static final int ZoomPercentTextSize = 20;
	public static final int ZoomBlockFixedAlpaAreaValue = 100;
	public static final int ZoomBlockFixedAlpaValue = 220;
	public static final int BlockWidth = 94, Blockheight = 46;
	public static final Color CoordColor = new Color(0, 0, 0);
	public static final Color BackgroundColor = new Color(255, 255, 255);
	public static final Color ZoomBlockColor = new Color(0, 0, 0);
	public static final Color ZoomBlockTextColor = new Color(255, 255, 255);
}
