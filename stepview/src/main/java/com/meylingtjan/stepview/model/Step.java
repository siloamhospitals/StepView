package com.meylingtjan.stepview.model;

import androidx.annotation.NonNull;

public class Step {
    /**
     * The state of completion of a step.
     * It has three possible values
     * <ul>
     * <li><b>NOT_COMPLETED</b> - A step that has not been completed by the user</li>
     * <li><b>COMPLETED</b> - A step that has been completed by the user</li>
     * </ul>
     */
    public enum State {
        /**
         * A step that has not been completed.
         */
        NOT_COMPLETED,
        /**
         * A step that has been completed.
         */
        COMPLETED
    }

    private String name;
    private State state;

    /**
     * Returns the name of the Step
     *
     * @return name of the step (String)
     */
    @NonNull
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the Step
     *
     * @param name The name of the Step
     */
    public void setName(@NonNull String name) {
        this.name = name;
    }

    /**
     * Returns the state of completion of the Step
     *
     * @return The state of the Step
     */
    @NonNull
    public State getState() {
        return state;
    }

    /**
     * Sets the state of completion of the Step
     *
     * @param state The new state of the Step
     */
    public void setState(@NonNull State state) {
        this.state = state;
    }

    /**
     * Creates a new Step with the given index.
     * The state of the Step defaults to NOT_COMPLETED
     *
     * @param name The name of the Step to be created
     */
    public Step(@NonNull String name) {
        this(name, State.NOT_COMPLETED);
    }

    /**
     * Creates a new Step with the given name and state.
     *
     * @param name  The name of the Step to be created
     * @param state The state of the Step to be created
     */
    public Step(@NonNull String name, @NonNull State state) {
        this.name = name;
        this.state = state;
    }
}