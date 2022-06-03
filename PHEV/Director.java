public class Director {
    private Builder builder;
    public Director(Builder builder) {
        this.builder = builder;
    }
    public void construct(int engine, int motor, int brake) {
        builder.makeTitle("PHEV_Checkingus_Log");
        builder.makeString("Gasoline Engine Being Checked");
        String[] engineChecker = {"Checking Engine",makeStatusEngine(engine)};
        builder.makeItems(engineChecker);
        builder.makeString("Checked Electric Motor");
        String[] motorChecker = {"Motor Checked",makeStatusMotor(motor)};
        builder.makeItems(motorChecker);
        builder.makeString("Checking Regenerative Brake System");
        String[] brakeChecker = {"Regenerative Brake Checked",makeStatusBrake(brake)};
        builder.makeItems(brakeChecker);
        builder.close();
    }
    private String makeStatusEngine(int engine) {
        switch (engine) {
            //Engine Ok!
            case 0:
                return "Engine OK!";
            //Oil
            case 1:
                return "Suggesting Oil Change";
            //Irregular
            case 2:
                return "Suggesting Spark Plug Checking";
            //Reduced
            case 3:
                return "Suggesting Battery Power Checking";
            default:
                return "Error : Unreachble Code!";
        }
    }
    private String makeStatusMotor(int motor) {
        switch (motor) {
            //Engine Ok!
            case 0:
                return "Motor Running OK";
            //Reduced
            case 1:
                return "Suggesting Motor Battery Power Checking";
            //Irregular
            case 2:
                return "Suggesting Motor Brush Contact";
            //Vibrating
            case 3:
                return "Suggesting Motor Mounting Bolt Checking";
            default:
                return "Error : Unreachble Code!";
        }
    }
    private String makeStatusBrake(int brake) {
        switch (brake) {
            //Engine Ok!
            case 0:
                return "Regen. Brake Working OK";
            //Weak
            case 1:
                return "Suggesting Generator Coil Damage Checking";
            //No
            case 2:
                return "Suggesting Brake Generator Contact Checking";
            //Abnormal
            case 3:
                return "Suggesting Brake and Generator Gear Checking";
            default:
                return "Error : Unreachble Code!";
        }
    }
    
}