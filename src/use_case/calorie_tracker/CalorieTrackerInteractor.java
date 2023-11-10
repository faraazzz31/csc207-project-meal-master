package use_case.calorie_tracker;

public class CalorieTrackerInteractor implements CalorieTrackerInputBoundary{
    final CalorieTrackerDataAccessInterface dataAccessInterface;
    final CalorieTrackerOutputBoundary calorieTrackerPresenter;

    public CalorieTrackerInteractor(CalorieTrackerDataAccessInterface dataAccessInterface,
                                    CalorieTrackerOutputBoundary calorieTrackerOutputBoundary) {
        this.dataAccessInterface = dataAccessInterface;
        this.calorieTrackerPresenter = calorieTrackerOutputBoundary;
    }

    @Override
    public void execute(CalorieTrackerInputData calorieTrackerInputData) {
        CalorieTrackerOutputData calorieTrackerOutputData = new CalorieTrackerOutputData(calorieTrackerInputData.getPlanner());
        calorieTrackerPresenter.prepareSuccessView(calorieTrackerOutputData);
    }
}