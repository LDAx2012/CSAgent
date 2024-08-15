String[] targetStrings = {
	"48 89 5C 24 08 57 48 83 EC 20 48 8B 59 10 48 8B F9 48 8B 49 08 FF 17 33 D2 41 B8 00 80 00 00",
	"4C 8B 53 08 45 8B 0A 45 8B 5A 04 4D 8D 52 08 45 85 C9 75 05 45 85 DB 74 33 45 3B CB 73 E6 49 8B F9 4C 8B 03",
	"48 89 5C 24 08 48 89 6C 24 10 48 89 74 24 18 57 48 83 EC 20 4C 8B 51 08 41 8B F0 48 8B EA 48 8B D9 45 8B 0A 45 8B 5A 04 4D 8D 52 08 45 85 C9",
	"48 8D 4D 97 E8 F8 CB FF FF 4C 8D 9C 24 D0 00 00 00 41 8B C7 49 8B 5B 20 49 8B 73 28 49 8B 7B 30",
	"75 2C 4C 8D 45 AF 48 8D 55 AF 48 8D 4D 27",
	"48 8b ca 48 ff c2 83 e1 03", //83 e1 ??
	};
String[] replacementStrings = {
	"48 89 5C 24 08 57 48 83 EC 20 48 8B F9 48 8B 59 10 48 8B 49 08 FF 17 33 D2 41 B8 00 80 00 00",
	"4C 8B 53 08 45 8B 5A 04 45 8B 0A 4D 8D 52 08 45 85 C9 75 05 45 85 DB 74 33 45 3B CB 73 E6 49 8B F9 4C 8B 03",
	"48 89 74 24 18 48 89 5C 24 08 48 89 6C 24 10 57 48 83 EC 20 4C 8B 51 08 41 8B F0 48 8B EA 48 8B D9 45 8B 0A 45 8B 5A 04 4D 8D 52 08 45 85 C9",
	"48 8D 4D 97 E8 F8 CB FF FF 4C 8D 9C 24 D0 00 00 00 41 8B C7 49 8B 7B 30 49 8B 5B 20 49 8B 73 28",
	"75 2C 4C 8D 45 AF 48 8D 4D 27 48 8D 55 AF",
	"48 8b ca 83 e1 03 48 ff c2",
	};
byte[][] targets = org.Nob0dy.Help.parseHexStrings(targetStrings);
byte[][] replacements = org.Nob0dy.Help.parseHexStrings(replacementStrings);
	
for (int t = 0; t < targets.length; t++) {
	byte[] target = targets[t];
	byte[] replacement = replacements[t];
	for (int i = 0; i <= $_.length - target.length; i++) {
		boolean found = true;
		for (int j = 0; j < target.length; j++) {
			if ($_[i + j] != target[j]) {
				found = false;
				break;
			}
		}
		if (found) {
			System.arraycopy(replacement, 0, $_, i, replacement.length);
			i += replacement.length - 1;
			System.out.println("[*] patch");
		}
	}
}
	
	