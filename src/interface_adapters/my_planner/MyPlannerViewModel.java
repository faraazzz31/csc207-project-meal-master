package interface_adapters.my_planner;

import interface_adapters.ViewModel;
import org.json.Property;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class MyPlannerViewModel extends ViewModel {
    public final String TITLE_LABEL = "My Planner View";

    private MyPlannerState state = new MyPlannerState();
    private final PropertyChangeSupport support = new PropertyChangeSupport(this);


    public MyPlannerViewModel() {
        super("my planner");
    }

    public MyPlannerState getState() {
        return state;
    }

    public void setState(MyPlannerState state) {
        this.state = state;
    }

    @Override
    public void firePropertyChanged() {
        support.firePropertyChange("state", null, this.state);
    }

    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }
}
