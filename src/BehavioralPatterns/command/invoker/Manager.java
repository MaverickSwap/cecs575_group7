package BehavioralPatterns.command.invoker;

//Invoker
public class Manager extends Invoker {

    @Override
    public void invokeCommand() {
        this.getCommand().execute();
    }
	
}