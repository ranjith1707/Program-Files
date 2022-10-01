package demo;

public enum Brands{
	APPLE{
		public void perfomance() {
			System.out.println("Wonderfull ");
		}
	},DELL,SAMSUNG,ACER,LONOVO{
		public void perfomance() {
			System.out.println("Super");
		}
	};
void perfomance() {
	System.out.println("Very nice");
}
	
}