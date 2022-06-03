public class ElementEngineObserver implements Observer{

    @Override
    public void update() {
        System.out.print("Gasoline Engine Log/Observer: ");
        switch(ElementEngineStatus.getStatusInt()){
            case 0:
                System.out.println("Engine Running OK");
                break;
            case 1:
                System.out.println("Suggesting Oil Change");
                break;
            case 2:
                System.out.println("Suggesting Spark Plug Checking");
                break;
            case 3:
                System.out.println("Suggesting Battery Power Checking");
                break;
            default:
                //
        }
    }
}