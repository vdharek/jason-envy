package src.envy;

import jason.environment.grid.GridWorldModel;
import jason.environment.grid.Location;

import java.util.Map;
import java.util.Random;

//AgentModel class: For modeling an agents (Agents placement, Agent speed, Agent type, Agent position...)
public class AgentModel extends GridWorldModel {
    public static final int COORDINATE = 2;
    //public static final int AGENT = 5;

    public AgentModel(int gridsize, int agents) {
        super(gridsize, gridsize, agents);
        //placeAgent(gridsize, agents);
        //setAgPos(0, new Location(gridsize /2, gridsize /2));

        //int targetX = Math.min(2, gridsize-1);
        //int targetY = Math.min(2, gridsize-1);

        //add(TARGET, targetX, targetY);
        //addWall(10,20,30,20);
    }

    public void setCoordinates(Map<String, String> gridMap) {
        for (String key : gridMap.keySet()) {
            String[] parts = key.split(",");
            int x = Integer.parseInt(parts[0]);
            int y = Integer.parseInt(parts[1]);
            add(COORDINATE, x, y);
            //addWall(x,y,x,y);

        }
    }

    public void addWall(int x1, int y1, int x2, int y2) {
        for(int x = x1; x <= x2; ++x) {
            for(int y = y1; y <= y2; ++y) {
                add(COORDINATE, x, y);
            }
        }
    }

    /*public void placeAgent(int gridSize, int agents) {
        Random rand = new Random();
        for (int i = 0; i < agents; i++) {
            int x = rand.nextInt(gridSize);
            int y = rand.nextInt(gridSize);
            while(getAgPos(i) != null){
                x = rand.nextInt(gridSize);
                y = rand.nextInt(gridSize);
            }
            setAgPos(i, new Location(x, y));
        }
    }*/

    /*public boolean moveTowards(Location dest) {
        Location agentLocation = getAgPos(0);
        if(agentLocation.equals(dest)) {
            return true;
        }

        int dx = Integer.signum(dest.x - agentLocation.x);
        int dy = Integer.signum(dest.y - agentLocation.y);

        Location newLocation = new Location(agentLocation.x + dx, agentLocation.y + dy);
        setAgPos(0, newLocation);
        return false;

    }*/
}
