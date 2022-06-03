public interface Observer {
    public void update(VisitorSystemComponentChecking systemComponentChecking);
    public void update(VisitorSoftwareControl softwareControl);
    public void update(VisitorSelfRepairing selfRepairing);
}