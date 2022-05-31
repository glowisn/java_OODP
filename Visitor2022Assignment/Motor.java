class Motor implements Element {
	public void accept(Visitor v) {
		v.visit(this);
	}

	public String motor() {
		return "Motor";
	}
}
