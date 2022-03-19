package wol.quercom.entitys;

public class Computer extends Hardware {

    String  name;
    String ipAddr;
    String macAddr;

    public Computer(String name, String ipAddr, String macAddr) {

        this.name = name;
        this.ipAddr = ipAddr;
        this.macAddr = macAddr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIpAddr() {
        return ipAddr;
    }

    public void setIpAddr(String ipAddr) {
        this.isValidIP(ipAddr);
        this.ipAddr = ipAddr;
    }

    public String getMacAddr() {
        return macAddr;
    }

    public void setMacAddr(String macAddr) {
        this.isValidMac(macAddr);
        this.macAddr = macAddr;
    }

    private void validate(String ip, String mac){
        try {
            this.isValidIP(ip);
        }
        catch (Exception e){
            System.out.println("invalid ip");
            e.printStackTrace();
        }
        try {
            this.isValidMac(mac);
        }
        catch (Exception e){
            System.out.println("invalid mac");
            e.printStackTrace();
        }
    }
}
