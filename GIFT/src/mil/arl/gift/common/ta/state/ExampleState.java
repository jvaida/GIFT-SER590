package mil.arl.gift.common.ta.state;

public class ExampleState implements TrainingAppState {

    /** just an example class attribute for this game state class */
    private String var;

    /**
     * Class constructor - set attribute(s).
     *
     * @param var just an example class attribute for this game state class
     */
    public ExampleState(String var){

        if(var == null){
            throw new IllegalArgumentException("The var can't be null.");
        }

        this.var = var;
    }

    /**
     * Return the var value.
     *
     * @return String
     */
    public String getVar(){
        return var;
    }

    @Override
    public String toString(){

        StringBuffer sb = new StringBuffer();
        sb.append("[ExampleState: ");
        sb.append("var = ").append(getVar());
        sb.append("]");
        return sb.toString();
    }

}
