import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import io.cucumber.java.ParameterType;

public class DateConverter {

	@ParameterType("\\d{2}\\/\\d{2}\\/\\d{4}")
	public Date date(String date) {
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date retorno = format.parse(date);
			return retorno;
		} catch(ParseException e) {
			e.printStackTrace();
			return null;
		}
	}
	
}
