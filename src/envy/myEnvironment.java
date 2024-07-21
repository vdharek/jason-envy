package src.envy;

import jason.NoValueException;
import jason.asSyntax.Literal;
import jason.asSyntax.NumberTerm;
import jason.asSyntax.Structure;
import jason.environment.*;
import jason.environment.grid.Location;

import java.util.logging.Logger;

public class myEnvironment extends Environment {

    private Logger logger = Logger.getLogger("project."+myEnvironment.class.getName());

    //Our CityGML parser jar...

    private AgentModel agentModel;
    private AgentView agentView;

    public static int GRID_SIZE = 100;
    public static int AGENTS = 10;
    public void init(String[] args){
        //super.init(args);

        if(args.length > 0){
            try{
                GRID_SIZE = Integer.parseInt(args[0]);
            }catch (NumberFormatException e){
                System.err.println("Invalid grid size: "+args[0]);
            }
        }

        agentModel = new AgentModel(GRID_SIZE, AGENTS);
        agentView = new AgentView(agentModel);
        agentModel.setView(agentView);
        logger.info("Env init");
    }

    @Override
    public boolean executeAction(String agName, Structure action) {
        if(action.getFunctor().equals("move_towards")){
            int x = 3;
            try {
                x = (int)((NumberTerm)action.getTerm(0)).solve();
            } catch (NoValueException e) {
                throw new RuntimeException(e);
            }
            int y = 4;
            try {
                y = (int)((NumberTerm)action.getTerm(1)).solve();
            } catch (NoValueException e) {
                throw new RuntimeException(e);
            }
            Location dest = new Location(x, y);
            if(agentModel.moveTowards(dest)){
                addPercept(agName, Literal.parseLiteral("at_dest"));
            }
        }
        return true;
    }

    @Override
    public void stop(){
        super.stop();
    }

}
