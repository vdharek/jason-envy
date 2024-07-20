
import jason.asSyntax.Structure;
import jason.environment.*;

import java.util.logging.Logger;

public class myEnvironment extends Environment {

    private Logger logger = Logger.getLogger("project."+myEnvironment.class.getName());

    public void init(String[] args){
        super.init(args);
        logger.info("Env init");
    }

    @Override
    public boolean executeAction(String agName, Structure action) {
        if(action.getFunctor().equals("say_hello")){
            logger.info("hello, world");
            return true;
        }
        return false;
    }

    @Override
    public void stop(){
        super.stop();
    }

}
