package tool;

import java.awt.geom.AffineTransform;
import java.awt.geom.Point2D;

public class AffineTool {

	public static Point2D.Double transformPoint(Point2D p1, AffineTransform at)  {
		Point2D.Double p2 = new Point2D.Double();
		try {at.createInverse().transform(p1, p2);}catch (Exception e) {e.printStackTrace();}
		return p2;
	}

	public static Point2D rotatePoint(Point2D target, Point2D center, double angle) {
		AffineTransform at = new AffineTransform();
		at.setToRotation(Math.toRadians(angle), center.getX(), center.getY());
		Point2D.Double resultPoint = new Point2D.Double();
		try {at.transform(target, resultPoint);}catch (Exception e) {e.printStackTrace();}
		return resultPoint;
	}
}

