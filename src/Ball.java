public class Ball {
    public Rect rect;
    public Rect leftPaddle, rightPaddle;

    private double vy = Constants.BALL_VELOCITY_X;
    private double vx = Constants.BALL_VELOCITY_Y;
    //velocity x, y

    public Ball(Rect rect, Rect leftPaddle, Rect rightPaddle) {
        this.rect = rect;
        this.leftPaddle = leftPaddle;
        this.rightPaddle = rightPaddle;
    }

    public void update(double dt) {
        if (vx < 0) {
            if (this.rect.x <= this.leftPaddle.x + this.leftPaddle.width && this.rect.x + this.rect.width >= this.leftPaddle.x &&
                this.rect.y >= this.leftPaddle.y && this.rect.y <= this.leftPaddle.y + this.leftPaddle.height) {
                this.vx *= -1;
                this.vy *= -1;
            } else if (this.rect.x + this.rect.width < this.leftPaddle.x){
                System.out.println("You lost");
            }
        } else if (vx > 0) {
            if (this.rect.x + this.rect.width >= this.rightPaddle.x && this.rect.x <= this.rightPaddle.x + this.rightPaddle.width &&
                    this.rect.y >= this.rightPaddle.y && this.rect.y <= this.rightPaddle.y + this.rightPaddle.height) {
                this.vx *= -1;
                this.vy *= -1;
            } else if (this.rect.x + this.rect.width > this.rightPaddle.x + this.rightPaddle.width ) {
                System.out.println("Ai has lost a point");
            }
        }

        if (vy > 0) {
            if(this.rect.y + this.rect.height > Constants.SCREEN_HEIGHT) {
                this.vy *= -1;
            }
        } else if (vy < 0) {
            if (this.rect.y < Constants.TOOLBAR_HEIGHT) {
                this.vy *= -1;
            }
        }


        this.rect.x += vx * dt;
        this.rect.y += vy * dt;
    }
}
