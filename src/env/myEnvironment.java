import jade.util.Logger;
import jason.asSyntax.Structure;
import jason.environment.*;

public class myEnvironment extends Environment {

    private final Logger logger = (Logger) Logger.getLogger("project."+myEnvironment.class.getName());

    public void init(String[] args){

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
