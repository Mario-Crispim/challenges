package challenges.flow;

import flow.ActionException;
import flow.IAction;
import flow.IAdapter;
import flow.IEvent;

public class EmailAdapter implements IAdapter<IAction> {

    public IEvent adapt(IAction action) throws ActionException {
        String value = (String) action.execute();
        return new TextEvent(value);
    }
}