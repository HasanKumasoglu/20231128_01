package tr.edu.medipol.yazilimGelistirme;
import org.apache.commons.lang3.StringUtils;

public class Main {

	public static void main(String[] args) {
		String metin = " M		e	di		po				l";
		
		String yeniMetin = StringUtils.deleteWhitespace(metin);
		System.out.println(yeniMetin);
		
	}

}
