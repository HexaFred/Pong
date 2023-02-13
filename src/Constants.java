import java.awt.*;

public class Constants {
    public static final int SCREEN_WIDTH = 800;
    public static final int SCREEN_HEIGHT = 600;
    public static final String SCREEN_TITLE = "Pong";

    public static final double PADDLE_WIDTH = 10.0;
    public static final double PADDLE_HEIGHT = 100.0;
    public static final Color PADDLE_COLOR = Color.white;
    public static final double BALL_WIDTH = 10.0;
    public static final double HZ_PADDING = 40.0;
    public static final double PADDLE_SPEED = 300.0;
    public static final double BALL_SPEED = 190.0;
    public static final double PADDLE_START_Y = (Constants.SCREEN_HEIGHT/2.0)-(Constants.PADDLE_HEIGHT/2.0);

    public static final double BALL_VELOCITY_X = 190.0;
    public static final double BALL_VELOCITY_Y = -190.0;

    public static final double MAX_ANGLE = 45.0;

    public static double TOOLBAR_HEIGHT;
    public static double INSETS_BOTTOM;

    public static final int TEXT_X_POSE = 10;
    public static final int TEXT_Y_POSE = 70;
    public static final int TEXT_SIZE = 40;
}
