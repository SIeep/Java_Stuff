class PezDispenser {
	public static final int MAX_PEZ = 12;
	private String characterName = "Yoda";
	public String getCharacterName() {
		return characterName;
	};
	public PezDispenser(String characterName) {
		this.characterName = characterName;
	};
	public String swapHead(String characterName) {
		String originalCharacterName = this.characterName;
		this.characterName = characterName;
		return originalCharacterName;
	}
}