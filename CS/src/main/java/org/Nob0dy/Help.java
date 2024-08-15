package org.Nob0dy;


public class Help {
    public static byte[] parseHexString(String hexString) {
        String[] hexArray = hexString.split(" ");
        byte[] bytes = new byte[hexArray.length];
        for (int i = 0; i < hexArray.length; i++) {
            bytes[i] = (byte) Integer.parseInt(hexArray[i], 16);
        }
        return bytes;
    }

    public static byte[][] parseHexStrings(String[] hexStrings) {
        byte[][] byteArrays = new byte[hexStrings.length][];

        for (int i = 0; i < hexStrings.length; i++) {
            byteArrays[i] = parseHexString(hexStrings[i]);
        }

        return byteArrays;
    }
}
