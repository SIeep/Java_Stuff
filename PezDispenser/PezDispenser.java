class PezDispenser {
	public static final int MAX_PEZ = 12;
	// final private String characterName;
	private int pezCount;

	private String characterName = "Yoda";
	public String getCharacterName() {
		return characterName;
	};
	public PezDispenser(String characterName) {
		this.characterName = characterName;
		pezCount = 0;
	};
	public String swapHead(String characterName) {
		String originalCharacterName = this.characterName;
		this.characterName = characterName;
		return originalCharacterName;
	};
	public boolean dispense() {
		boolean wasDispensed = false;
		if (!isEmpty()) {
			pezCount--;
			wasDispensed = true;
		}
		return wasDispensed;
	}

	public void fill() {
		fill(MAX_PEZ);
	};
	public void fill(int pezAmount) {
		pezCount += pezAmount;
	};
	public boolean isEmpty() {
		return pezCount == 0;
	}
}