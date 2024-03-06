import java.awt.Color;

public static int astolfoColors(int var2, float bright, float st) {
		  double v1 = Math.ceil(System.currentTimeMillis() + (long) (var2 * 109)) / 5;
		  return Color.getHSBColor((double) ((float) ((v1 %= 360.0) / 360.0)) < 0.5 ? -((float) (v1 / 360.0)) : (float) (v1 / 360.0), st, bright).getRGB();
}