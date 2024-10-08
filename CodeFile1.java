String[] targetStrings = {
	"25 73 20 61 73 20 25 73 5C 25 73 3A 20 25 64",
	"4D 5A 41 52 55 48 89 E5 48 81 EC",
	"8B 44 24 70 25 FF FF FF 00 3D 41 41 41 00 75 1A 8B 44 24 78 25 FF FF FF 00 3D 42 42 42 00 75 0A",
	"75 18 48 8b 44 24 68 48 8b 4c 24 10 48 89 08 48 8b 44 24 70 8b 4c 24 18 89 08 48 8b 04 24 48 83 c0 28 48 89 04 24 e9 56 ff ff ff",
	"FF C0 89 44 24 04 8B 44 24 38 39 44 24 04 73 7A 8B 44 24 0C 99 81 E2 FF 00 00 00 03 C2 25 FF 00 00 00 2B C2 88 04 24 8B 44 24 04 0F B6 0C 24 48 8B 54 24",
	"48 89 01 0F B7 04 24 66 FF C8 66 89 04 24 48 8B 44 24 38 48 83 C0 04 48 89 44 24 38 48 8B 44 24 50 48 83 C0 02 48 89 44 24 50 E9 0E FE FF FF 48 83 C4 68 C3",
	"4c 8b 03 b8 4f ec c4 4e 41 f7 e1 41 8b c1 c1 ea 02 41 ff c1 6b d2 0d 2b c2 8a 4c 18 18 42 30 0c 07 48 ff c7 45 3b cb 72 d7",
	"8B 44 24 10 89 44 24 04 81 7C 24 04 8E 4E 0E EC 74 36 81 7C 24 04 AA FC 0D 7C 74 2C 81 7C 24 04 54 CA AF 91 74 22 81 7C 24 04 1B C6 46 79 74 18 81 7C 24 04 FC A4 53 07 74 0E 81 7C 24 04 04 49 32 D3 0F 85 26 01 00 00 48 8B 44 24 30 8B 40 1C 48 8B 4C 24 08 48 03 C8 48 8B C1 48 89 44 24 18 48 8B 44 24 50 0F B7 00 48 8B 4C 24 18 48 8D 04 81 48 89 44 24 18 81 7C 24 04 8E 4E 0E EC 75 20 48 8B 44 24 18 8B 00 48 8B 4C 24 08 48 03 C8 48 8B C1 48 8B 4C 24 70 48 89 41 10 E9 C3 00 00 00 81 7C 24 04 AA FC 0D 7C 75 20 48 8B 44 24 18 8B 00 48 8B 4C 24 08 48 03 C8 48 8B C1 48 8B 4C 24 70 48 89 41 08 E9 99 00 00 00 81 7C 24 04 54 CA AF 91 75 1D 48 8B 44 24 18 8B 00 48 8B 4C 24 08 48 03 C8 48 8B C1 48 8B 4C 24 70 48 89 41 20 EB 72 81 7C 24 04 1B C6 46 79 75 1D 48 8B 44 24 18 8B 00 48 8B 4C 24 08 48 03 C8 48 8B C1 48 8B 4C 24 70 48 89 41 28 EB 4B 81 7C 24 04 FC A4 53 07 75 1D 48 8B 44 24 18 8B 00 48 8B 4C 24 08 48 03 C8 48 8B C1 48 8B 4C 24 70 48 89 41 18 EB 24 81 7C 24 04 04 49 32 D3 75 1A",

	};
String[] replacementStrings = {
	"00 00 00 00 00 00 00 00 00 00 00 00 00 00 00",
	"4D 59 41 51 55 48 89 E5 48 81 EC",
	"8B 44 24 78 25 FF FF FF 00 3D 42 42 42 00 75 0A 8B 44 24 70 25 FF FF FF 00 3D 41 41 41 00 75 1A",
	"75 18 48 8b 4c 24 10 48 8b 44 24 68 48 89 08 48 8b 44 24 70 8b 4c 24 18 89 08 48 8b 04 24 48 83 c0 28 48 89 04 24 e9 56 ff ff ff",
	"FF C0 89 44 24 04 8B 44 24 38 39 44 24 04 73 7A 8B 44 24 0C 99 0f b6 d2 90 90 90 03 C2 25 FF 00 00 00 2B C2 88 04 24 8B 44 24 04 0F B6 0C 24 48 8B 54 24",
	"48 89 01 0F B7 04 24 66 FF C8 66 89 04 24 48 8B 44 24 50 48 83 C0 02 48 89 44 24 50 48 8B 44 24 38 48 83 C0 04 48 89 44 24 38 E9 0E FE FF FF 48 83 C4 68 C3",
	"b8 4f ec c4 4e 4c 8b 03 41 f7 e1 41 8b c1 c1 ea 02 41 ff c1 6b d2 0d 2b c2 8a 4c 18 18 42 30 0c 07 48 ff c7 45 3b cb 72 d7",
	"83 44 24 10 01 90 90 90 81 7C 24 10 FD A4 53 07 74 36 81 7C 24 10 8F 4E 0E EC 74 2C 81 7C 24 10 1C C6 46 79 74 22 81 7C 24 10 55 CA AF 91 74 18 81 7C 24 10 AB FC 0D 7C 74 0E 81 7C 24 10 05 49 32 D3 0F 85 26 01 00 00 48 8B 44 24 30 8B 40 1C 48 8B 4C 24 08 48 03 C8 48 8B C1 48 89 44 24 18 48 8B 44 24 50 0F B7 00 48 8B 4C 24 18 48 8D 04 81 48 89 44 24 18 81 7C 24 10 8F 4E 0E EC 75 20 48 8B 44 24 18 8B 00 48 8B 4C 24 08 48 03 C8 48 8B C1 48 8B 4C 24 70 48 89 41 10 E9 C3 00 00 00 81 7C 24 10 AB FC 0D 7C 75 20 48 8B 44 24 18 8B 00 48 8B 4C 24 08 48 03 C8 48 8B C1 48 8B 4C 24 70 48 89 41 08 E9 99 00 00 00 81 7C 24 10 55 CA AF 91 75 1D 48 8B 44 24 18 8B 00 48 8B 4C 24 08 48 03 C8 48 8B C1 48 8B 4C 24 70 48 89 41 20 EB 72 81 7C 24 10 1C C6 46 79 75 1D 48 8B 44 24 18 8B 00 48 8B 4C 24 08 48 03 C8 48 8B C1 48 8B 4C 24 70 48 89 41 28 EB 4B 81 7C 24 10 FD A4 53 07 75 1D 48 8B 44 24 18 8B 00 48 8B 4C 24 08 48 03 C8 48 8B C1 48 8B 4C 24 70 48 89 41 18 EB 24 81 7C 24 10 05 49 32 D3 75 1A",
	
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
	
	