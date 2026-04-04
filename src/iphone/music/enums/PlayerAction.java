package iphone.music.enums;

public enum PlayerAction {
	PAUSE {
		
		@Override
		public void execute() {
			System.out.println("A música foi pausada.");
		}
		
	},
	RESUME {

		@Override
		public void execute() {
			System.out.println("A música foi retomada.");
		}
		
	},
	STOP {

		@Override
		public void execute() {
			System.out.println("A música parou.");	
		}
		
	};
	
	public static PlayerAction fromInt(int option) {
	    switch (option) {
	        case 1: return PAUSE;
	        case 2: return RESUME;
	        case 3: return STOP;
	        default: throw new IllegalArgumentException("Opção inválida");
	    }
	}

	public abstract void execute();

}
