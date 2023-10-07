package inheritance;

import inheritance.Electronic;

public class Sound extends Electronic {
    private String physiology;
    private String psychology;

    public Sound(String microelectronic, String nanoelectronic, String optoelectronic, String physiology, String psychology) {
        super(microelectronic, nanoelectronic, optoelectronic);
        this.physiology = physiology;
        this.psychology = psychology;
    }

    public Sound(String physiology, String psychology) {
        this.physiology = physiology;
        this.psychology = psychology;
    }

    public String getPhysiology() {
        return physiology;
    }

    public void setPhysiology(String physiology) {
        this.physiology = physiology;
    }

    public String getPsychology() {
        return psychology;
    }

    public void setPsychology(String psychology) {
        this.psychology = psychology;
    }
}
