public class Main{
	public static void main(String args[]){
		int n = 9;
		Humano chapisco = new Humano("Chapisco", 21);
				
		for(int i = 0; i < 10; i++){
			chapisco.dormir(i);
			
			if(i == 9){
				chapisco.end();
			}	
		}
	}
}
