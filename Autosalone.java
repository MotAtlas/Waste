import java.util.*;
public class Autosalone{
  protected List<Automobile> salone;
  public Autosalone(){
    salone = new ArrayList<>();
  }
  public void aggiungi(Automobile daAggiungere){
    salone.add(daAggiungere);
  }
  public void rimuovi(Automobile daRimuovere){
    salone.remove(cercaAuto(daRimuovere));

  }
  public void visualizza(){
    for(Automobile iter : salone){
      System.out.println(iter.toString());
    }
  }
  public void sort(){
    Collections.sort(salone, new Comparator<Automobile>() {
        @Override
        public int compare(Automobile auto1, Automobile auto2)
        {

            return  auto1.compareTo(auto2);
        }
    });
  }
  public int cercaAuto(Automobile daCercare){
		for(Automobile iter : salone){
			if(iter.equals(daCercare)){
				return salone.indexOf(iter);
			}
		}
		return 0;
	}
}
