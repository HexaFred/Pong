import java.awt.*;

public class Constants {
    public static final int SCREEN_WIDTH = 800;
    public static final int SCREEN_HEIGHT = 600;
    public static final String SCREEN_TITLE = "Pong";

    public static final double PADDLE_WIDTH = 10;
    public static final double PADDLE_HEIGHT = 100;
    public static final Color PADDLE_COLOR = Color.white;
    public static final double BALL_WIDTH = 10;
    public static final double HZ_PADDING = 40;
    public static final double PADDLE_SPEED = 300;
    public static final double PADDLE_START_Y = (Constants.SCREEN_HEIGHT/2.0)-(Constants.PADDLE_HEIGHT/2.0);

    public static final double BALL_VELOCITY_X = 200.0;
    public static final double BALL_VELOCITY_Y = -100.0;

    public static double TOOLBAR_HEIGHT;
    public static double INSETS_BOTTOM;
}
