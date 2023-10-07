public class Computer extends Electronic{
    private String logicalOperation;
    private String digitilElectronic;

    public Computer(String microelectronic, String nanoelectronic, String optoelectronic, String logicalOperation, String digitilElectronic) {
        super(microelectronic, nanoelectronic, optoelectronic);
        this.logicalOperation = logicalOperation;
        this.digitilElectronic = digitilElectronic;
    }

    public String getLogicalOperation() {
        return logicalOperation;
    }

    public void setLogicalOperation(String logicalOperation) {
        this.logicalOperation = logicalOperation;
    }

    public String getDigitilElectronic() {
        return digitilElectronic;
    }

    public void setDigitilElectronic(String digitilElectronic) {
        this.digitilElectronic = digitilElectronic;
    }
}
