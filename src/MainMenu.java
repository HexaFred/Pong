import javax.swing.JFrame;
import java.awt.*;

public class MainMenu extends JFrame implements Runnable {

    public Graphics2D g2;
    public KL keyListener = new KL();
    public Text startGame, exitGame;

    public MainMenu(){
        this.setSize(Constants.SCREEN_WIDTH,Constants.SCREEN_HEIGHT);
        this.setTitle(Constants.SCREEN_TITLE);
        this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.addKeyListener(keyListener);
        this.startGame = new Text("Start Game", new Font("Times New Roman",Font.PLAIN,40), Constants.SCREEN_WIDTH / 2.0 - 200.0, Constants.SCREEN_HEIGHT  / 2.0);
        this.exitGame = new Text("Exit Game", new Font("Times New Roman",Font.PLAIN,40), Constants.SCREEN_WIDTH / 2.0 - 80.0, Constants.SCREEN_HEIGHT / 2.0 + 60.0);
    }

    public void update(double dt){
        Image dbImage = createImage(getWidth(),getHeight());
        Graphics dbg = dbImage.getGraphics();
        this.draw(dbg);
        g2.drawImage(dbImage,0,0,this);
    }

    public void draw(Graphics g) {
        Graphics2D g2= (Graphics2D) g;
        g2.setColor(Color.BLACK);
        g2.fillRect(0,0,Constants.SCREEN_WIDTH,Constants.SCREEN_HEIGHT);

        startGame.draw(g2);
        exitGame.draw(g2);
    }

    public void run() {
        double lastFrameTime = 0.0;
        while (true){
            double time = Time.getTime();
            double deltaTime = time - lastFrameTime;
            lastFrameTime = time;

            update(deltaTime);
        }
    }
}
