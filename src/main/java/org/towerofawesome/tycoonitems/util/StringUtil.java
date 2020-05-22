package org.towerofawesome.tycoonitems.util;

import net.minecraft.client.resources.I18n;
import net.minecraft.client.resources.Locale;

/**
 * @author Vexatos
 */
public class StringUtil {

	public static String localize(String key) {
		return I18n.format(key).replace("\\n", "\n");
	}

	public static String localizeAndFormat(String key, Object... formatting) {
		return new Locale().formatMessage(key, formatting);
	}

	public static boolean canTranslate(String key) {
		return I18n.hasKey(key);
	}
}
