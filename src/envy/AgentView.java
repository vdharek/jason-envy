package src.envy;

import jason.environment.grid.GridWorldModel;
import jason.environment.grid.GridWorldView;

import java.awt.*;

public class AgentView extends GridWorldView {

    //AgentModel agentModel;

    public AgentView(GridWorldModel model) {
        super(model, "Envy-sim", 1000);
        setVisible(true);
        repaint();
    }

    public void draw(Graphics g, int x, int y, int object){
        switch (object){
            case AgentModel.AGENT:
                drawAgent(g, x, y);
                break;
        }
    }

    private void drawAgent(Graphics g, int x, int y) {
        g.setColor(Color.YELLOW);
        g.fillOval(x * cellSizeH, y * cellSizeH, cellSizeH, cellSizeH);
    }

    @Override
    public void drawAgent(Graphics g, int x, int y, Color c, int id) {
        c = Color.BLACK;
        super.drawAgent(g,x,y,c,id);
        g.setColor(Color.RED);
        super.drawString(g,x,y,defaultFont, "A" + (id + 1) + ": Agent");
    }
}
