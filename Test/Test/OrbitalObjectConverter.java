package Test;
import EksamensØvelser.model.Planet;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.params.converter.ArgumentConversionException;
import org.junit.jupiter.params.converter.ArgumentConverter;

import java.util.ArrayList;

public class OrbitalObjectConverter implements ArgumentConverter{

    public Planet convert (Object source, ParameterContext context) throws ArgumentConversionException{
        if (source instanceof Integer) {
            int number = (int) source;
            return new Planet("Earth", 24.5, 36.7, 3, 4.6, true, new ArrayList<>());
        }
        throw new ArgumentConversionException (source + "not valid number");
    }
}

