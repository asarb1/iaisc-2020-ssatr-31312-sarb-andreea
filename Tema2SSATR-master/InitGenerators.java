package giotto.functionality.code.hydropower;

import giotto.functionality.code.bool_port;
import giotto.functionality.interfaces.DriverInterface;
import giotto.functionality.table.Parameter;

import java.io.Serializable;

public class InitGenerators implements DriverInterface, Serializable {
    public void run(Parameter parameter) {
        ((bool_port)parameter.getPortVariable(0)).setBoolValue(false);
    }
}
