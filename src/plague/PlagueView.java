package plague;

import mvc.Model;
import simstation.Agent;
import simstation.SimulationView;

import java.awt.*;
/* need to fix the error in plague.agents
public class PlagueView extends SimulationView {
    private PlagueSimulation plague;
    public PlagueView(Model model) {
        super(model);
        plague = (PlagueSimulation) model;
    }

    public void paintComponent(Graphics gc) {
        super.paintComponent(gc);

        for (Agent agent : plague.agents) {
            if (((Host) agent).infected) {
                gc.setColor(Color.RED);
            } else {
                gc.setColor(Color.GREEN);
            }
            gc.fillRect(agent.getXc(),agent.getYc(),10,10);
        }

    }
}
*/