package com.designpatterns;

/**
 * The intent of the Builder design pattern is to separate the construction of a complex object from its representation
 */
public class Builder {

    public static void main(String[] args) {
        PC myPC = PC.PCBuilder.getInstance()
                .setCpu("Ryzen 5600G")
                .setMotherBoard("B450 Wifi AC")
                .setGraphicsCard("3080 Ti")
                .setRamInGB(16)
                .setSmps("CoolerMaster 750 Gold")
                .setCabinet("Antec 510X")
                .build();
        System.out.println(myPC);
    }

}

class PC {
    private final String cpu;
    private final String motherBoard;
    private final int ramInGB;
    private final String graphicsCard;
    private final String cabinet;
    private final String smps;


    public PC(PCBuilder builder) {
        this.cpu = builder.cpu;
        this.motherBoard = builder.motherBoard;
        this.ramInGB = builder.ramInGB;
        this.graphicsCard = builder.graphicsCard;
        this.smps = builder.smps;
        this.cabinet = builder.cabinet;
    }

    static class PCBuilder {
        private String cpu;
        private String motherBoard;
        private int ramInGB;
        private String graphicsCard;
        private String cabinet;
        private String smps;

        private PCBuilder() {
        }

        public static PCBuilder getInstance() {
            return new PCBuilder();
        }

        public PCBuilder setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public PCBuilder setMotherBoard(String motherBoard) {
            this.motherBoard = motherBoard;
            return this;
        }

        public PCBuilder setRamInGB(int ramInGB) {
            this.ramInGB = ramInGB;
            return this;
        }

        public PCBuilder setGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public PCBuilder setCabinet(String cabinet) {
            this.cabinet = cabinet;
            return this;
        }

        public PCBuilder setSmps(String smps) {
            this.smps = smps;
            return this;
        }

        public PC build() {
            return new PC(this);
        }
    }

    @Override
    public String toString() {
        return "PC{" +
                "cpu='" + cpu + '\'' +
                ", motherBoard='" + motherBoard + '\'' +
                ", ramInGB=" + ramInGB +
                ", graphicsCard='" + graphicsCard + '\'' +
                ", cabinet='" + cabinet + '\'' +
                ", smps='" + smps + '\'' +
                '}';
    }
}




