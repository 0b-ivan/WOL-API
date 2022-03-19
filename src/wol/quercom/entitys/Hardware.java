package wol.quercom.entitys;

public abstract class Hardware {


    boolean isValidIP(String ip){
        String[] adrssplit = ip.split("\\.");
        if (adrssplit.length != 4) {
            throw new IllegalArgumentException("Invalid MAC address.");
        }
        return true;
    }

    boolean isValidMac(String mac) throws IllegalArgumentException{
        String[] hex = mac.split("(\\:|\\-)");
        if (hex.length != 6) {
            throw new IllegalArgumentException("Invalid MAC address.");
        }
        return true;
    }
}
