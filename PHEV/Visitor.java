interface Visitor {
	public int getType();
	public void visit(ElementEngine e);
	public void visit(ElementMotor e);
	public void visit(ElementBrake e);
}
