import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPProtocol {
	
	CharSequence data;
	Pattern protocol = Pattern.compile("(\\d+).(\\d+).(\\d+).(\\d+)");
	
	public boolean Controlling(Matcher matchdata) {
		
		int durum = 0;
		
		while(matchdata.find()) {
			if(matchdata.group(1).length() <= 3 && matchdata.group(2).length() <= 3 && matchdata.group(3).length() <= 3 && 
					Integer.parseInt(matchdata.group(4)) > 0 && Integer.parseInt(matchdata.group(4)) <= 256
					)
				durum = 1;
			else
				durum = 0;
		}
		
		if(durum == 0)
			return false;
		else
			return true;
		
	}



	public IPProtocol(CharSequence data) {
		this.data = data;
	}
	
	public IPProtocol() {}
	
	
}
