package inheritance;

public class Electronic {
    private String microelectronic;
    private String nanoelectronic;
    private String optoelectronic;

    public Electronic() {
    }

    public Electronic(String microelectronic, String nanoelectronic, String optoelectronic) {
        this.microelectronic = microelectronic;
        this.nanoelectronic = nanoelectronic;
        this.optoelectronic = optoelectronic;
    }

    public String getMicroelectronic() {
        return microelectronic;
    }

    public void setMicroelectronic(String microelectronic) {
        this.microelectronic = microelectronic;
    }

    public String getNanoelectronic() {
        return nanoelectronic;
    }

    public void setNanoelectronic(String nanoelectronic) {
        this.nanoelectronic = nanoelectronic;
    }

    public String getOptoelectronic() {
        return optoelectronic;
    }

    public void setOptoelectronic(String optoelectronic) {
        this.optoelectronic = optoelectronic;
    }
}
