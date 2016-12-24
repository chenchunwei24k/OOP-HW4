package fcu.iecs.oop.tiida;

public class NissanTiida {
	int num = 1;
	
	public void tiida(){
		
		System.out.println("²Ä"+num+"¦¸©I¥stiida()");
		
		for(int i=0; i<num; i++){
			for(int j=0; j<num; j++){
				System.out.print('*');
			}
			System.out.println();
		}
		num++;
	}
}
