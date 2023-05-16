package ejemplo1;

import static org.junit.Assert.*;
import org.junit.Test;

public class TemperatureConverterTest {

	@Test
	public void FahrenheitToCelsius() {
	    assertEquals(4.44444, TemperatureConverter.fahrenheitToCelsius(40), 0.0001);
	    assertEquals(15.5555, TemperatureConverter.fahrenheitToCelsius(60), 0.0001);
	    assertEquals(26.6666, TemperatureConverter.fahrenheitToCelsius(80), 0.0001);
	}

	@Test
	public void CelsiusToFahrenheit() {
	    assertEquals(23, TemperatureConverter.celsiusToFahrenheit(-5), 0.000001);
	    assertEquals(32, TemperatureConverter.celsiusToFahrenheit(0), 0.000001);
	    assertEquals(59, TemperatureConverter.celsiusToFahrenheit(15), 0.000001);
	}
}
