public class q3_Computer {
    private String CPU;
    private int RAM;
    private int storage;
    private String GPU;
    private String operatingSystem;

    private q3_Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.GPU = builder.GPU;
        this.operatingSystem = builder.operatingSystem;
    }

    public String getCPU() {
        return CPU;
    }

    public int getRAM() {
        return RAM;
    }

    public int getStorage() {
        return storage;
    }

    public String getGPU() {
        return GPU;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", RAM=" + RAM +
                ", storage=" + storage +
                ", GPU='" + GPU + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' +
                '}';
    }

    public static class Builder {
        private String CPU;
        private int RAM;
        private int storage;
        private String GPU;
        private String operatingSystem;

        public Builder(String CPU, int RAM, int storage) {
            this.CPU = CPU;
            this.RAM = RAM;
            this.storage = storage;
        }

        public Builder GPU(String GPU) {
            this.GPU = GPU;
            return this;
        }

        public Builder operatingSystem(String operatingSystem) {
            this.operatingSystem = operatingSystem;
            return this;
        }

        public q3_Computer build() {
            return new q3_Computer(this);
        }
    }
}