public class Computer {
    private String computerNumber;
    private String lcdModel;
    private int ramSize;
    private int hddSize;
    private boolean hasGPU;
    public Computer(String computerNumber,String lcdModel,int ramSize,int hddSize,boolean hasGPU){
        this.computerNumber=computerNumber;
        this.lcdModel=lcdModel;
        this.ramSize=ramSize;
        this.hddSize=hddSize;
        this.hasGPU=hasGPU;
    }
    public String getComputerNumber() {
        return computerNumber;
    }

    public void setComputerNumber(String computerNumber) {
        this.computerNumber = computerNumber;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
    public Computer clone(){
        return new Computer(this.computerNumber,this.lcdModel,this.ramSize,this.hddSize,this.hasGPU);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
