package it.unibo.mvc.view;

import it.unibo.mvc.api.DrawNumberController;
import it.unibo.mvc.api.DrawNumberView;
import it.unibo.mvc.api.DrawResult;
import static java.lang.System.out;

public class StandardOutputView implements DrawNumberView {

    @Override
    public void setController(DrawNumberController observer) {
        // no input
        
    }

    @Override
    public void start() {
        // always ok
        
    }

    @Override
    public void result(DrawResult res) {
        out.println(res.getDescription());
        
    }
    
}
