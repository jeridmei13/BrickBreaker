package BrickBreaker;

import java.awt.Color;
import java.awt.Graphics2D;

/**
 * This creates the bricks height and width as well as the color of the brick.
 *
 * @author Tyler Roux, Last updated 2/23/2020
 */
public class Brick extends StandardGameObject {

    protected Color color;

    /**
     * This method creates the brick and makes the color of the brick with the
     * number it correlates to with the level text.
     *
     * @param _x
     * @param _y
     * @param _val
     */
    public Brick(double _x, double _y, int _val) {
        super(_x, _y, StandardID.Brick);
        this.width = 80;
        this.height = 20;

        switch (_val) {
            case 0:
                return;
            case 1:
                this.color = Color.RED;
                break; //red
            case 2:
                this.color = Color.BLUE;
                break; //blue
            case 3:
                this.color = Color.GREEN;
                break;//green
            case 4:
                this.color = Color.ORANGE;
                break;//yellow
        }
    }

    /**
     * This method keeps the game running with all the components together.
 *
     */
    @Override
    public void tick() {
    }

    /**
     * This method draws the brick onto the canvas.
     *
     * @param brick
     */
    @Override
    public void render(Graphics2D brick) {
        brick.setColor(this.color);
        brick.fillRect((int) _x, (int) _y, (int) width, (int) height);
    }
}