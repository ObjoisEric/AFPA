package fr.objois.client.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Utils {
	private static Logger LOGGER = LoggerFactory.getLogger(Utils.class);

	public static Boolean verifTelPortable(String telPortable) {

		Boolean verifTelPortableOk = true;
		

		if (telPortable == null) {

			LOGGER.info("le numero de telephone portable est null");
			verifTelPortableOk = false;

		} else if("".equals(telPortable) ){

			LOGGER.info("le numero de telephone portable est vide");
			verifTelPortableOk = false;

		}else if (telPortable.length() != 10) {

			LOGGER.info("le numero de telephone portable n'est pas égale à 10 chiffres");
			verifTelPortableOk = false;

		} else if(!telPortable.startsWith("06")) {
			if(!telPortable.startsWith("07")){
				LOGGER.info("le numero de telephone portable ne commence pas par 06 ou 07");
				verifTelPortableOk = false;
			}
		}



		return verifTelPortableOk;
	}
}
