public class Main{
	public static void main(String args[]){
		Humano chapisco = new Humano("Chapisco", 21);
				
		for(int i = 0; i <= 10; i++){
			chapisco.dormir(i);
			
			if(i == 10){
				chapisco.end();
			}	
		}
	}
}
