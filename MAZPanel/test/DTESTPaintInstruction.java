package test;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import interfaces.IPaintInstruction;
import paint.PaintTool;

public class DTESTPaintInstruction implements IPaintInstruction{

	// Attributes
	private Rectangle2D.Double area = new Rectangle2D.Double(100,100,300,100);
	private String text = "Test Block";
	private Font font = new Font(null, Font.BOLD, 50);
	private Color bgColor = Color.DARK_GRAY;
	
	@Override
	public void paint(Graphics2D g) {
		g.setColor(this.bgColor);
		g.fill(this.area);
		
		g.setColor(Color.WHITE);
		PaintTool.paintText(g, this.text, this.font, this.area);
	}
}
