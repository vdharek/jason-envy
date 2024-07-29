package src.envy;

import jason.environment.grid.GridWorldModel;
import jason.environment.grid.GridWorldView;

import java.awt.*;
import java.util.logging.Logger;

//AgentView class: Frame representation. Model graphical objects in the environment.  (
public class AgentView extends GridWorldView {
    private static final Logger log = Logger.getLogger(AgentView.class.getName());


    //AgentModel agentModel;

    public AgentView(GridWorldModel model) {
        super(model, "Envy-sim", 100);
        setVisible(true);
        repaint();
    }

    /*public void draw(Graphics g, int x, int y, int object){
        switch (object){
            case AgentModel.AGENT:
                drawAgent(g, x, y);
                break;
        }
    }*/

    @Override
    public void draw(Graphics g, int x, int y, int object) {
        switch (object) {
            case AgentModel.COORDINATE:
                //drawCoordinate(g, x, y);
                //drawAgent(g, x, y);
                break;
        }
    }



    @Override
    public void drawObstacle(Graphics g, int x, int y) {

        super.drawObstacle(g, x, y);

    }

    private void drawCoordinate(Graphics g, int x, int y) {
        g.setColor(Color.BLACK);
        //g.fillOval();
        g.drawLine(x * cellSizeH, y * cellSizeH, cellSizeH, cellSizeH);
        //System.out.println("Coordinates on grid: ");
        log.info(x * cellSizeH + "," + y * cellSizeH + "," + cellSizeH + "," + cellSizeH);
    }

    /*private void drawCoordinates(Graphics g, int x, int y){
        Color c = Color.BLACK;
        super.drawObstacle(g,x,y);
    }*/


    /*private void drawAgent(Graphics g, int x, int y) {
        g.setColor(Color.YELLOW);
        g.fillOval(x * cellSizeH, y * cellSizeH, cellSizeH, cellSizeH);
    }*/

    /*@Override
    public void drawAgent(Graphics g, int x, int y, Color c, int id) {
        c = Color.BLACK;
        super.drawAgent(g,x,y,c,id);
        g.setColor(Color.RED);
        super.drawString(g,x,y,defaultFont, "A" + (id + 1) + ": Agent");
    }*/
}
